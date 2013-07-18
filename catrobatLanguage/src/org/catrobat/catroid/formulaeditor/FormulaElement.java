/**
 *  Catroid: An on-device visual programming system for Android devices
 *  Copyright (C) 2010-2013 The Catrobat Team
 *  (<http://developer.catrobat.org/credits>)
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *  
 *  An additional term exception under section 7 of the GNU Affero
 *  General Public License, version 3, is available at
 *  http://developer.catrobat.org/license_additional_term
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.catroid.formulaeditor;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class FormulaElement implements Serializable {

	private static final long serialVersionUID = 1L;

	public static enum ElementType {
		OPERATOR, FUNCTION, NUMBER, SENSOR, USER_VARIABLE, BRACKET
	}

	public ElementType type = ElementType.NUMBER;
	public String value = "";
	public FormulaElement leftChild = null;
	public FormulaElement rightChild = null;
	
	private transient FormulaElement parent = null;
	
	public boolean equals(FormulaElement arg) {
		return (type.equals(arg.type) &&
				value.equals(arg.value) &&
				((leftChild == null && arg.leftChild == null) ||
						leftChild.equals(arg.leftChild)) &&
				((rightChild == null && arg.rightChild == null) || 
						rightChild.equals(arg.rightChild)) );
	}
	
	public FormulaElement() {
	}
	
	public FormulaElement(ElementType type, String value, FormulaElement parent) {
		this.type = type;
		this.value = value;
		this.parent = parent;
	}

	public FormulaElement(ElementType type, String value, FormulaElement parent, FormulaElement leftChild,
			FormulaElement rightChild) {
		this.type = type;
		this.value = value;
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;

		if (leftChild != null) {
			this.leftChild.parent = this;
		}
		if (rightChild != null) {
			this.rightChild.parent = this;
		}

	}

	public String getValue() {
		return value;
	}

	public List<InternToken> getInternTokenList() {
		List<InternToken> internTokenList = new LinkedList<InternToken>();

		switch (type) {
			case BRACKET:
				internTokenList.add(new InternToken(InternTokenType.BRACKET_OPEN));
				if (rightChild != null) {
					internTokenList.addAll(rightChild.getInternTokenList());
				}
				internTokenList.add(new InternToken(InternTokenType.BRACKET_CLOSE));
				break;
			case OPERATOR:
				if (leftChild != null) {
					internTokenList.addAll(leftChild.getInternTokenList());
				}
				internTokenList.add(new InternToken(InternTokenType.OPERATOR, this.value));
				if (rightChild != null) {
					internTokenList.addAll(rightChild.getInternTokenList());
				}
				break;
			case FUNCTION:
				internTokenList.add(new InternToken(InternTokenType.FUNCTION_NAME, value));
				boolean functionHasParameters = false;
				if (leftChild != null) {
					internTokenList.add(new InternToken(InternTokenType.FUNCTION_PARAMETERS_BRACKET_OPEN));
					functionHasParameters = true;
					internTokenList.addAll(leftChild.getInternTokenList());
				}
				if (rightChild != null) {
					internTokenList.add(new InternToken(InternTokenType.FUNCTION_PARAMETER_DELIMITER));
					internTokenList.addAll(rightChild.getInternTokenList());
				}
				if (functionHasParameters) {
					internTokenList.add(new InternToken(InternTokenType.FUNCTION_PARAMETERS_BRACKET_CLOSE));
				}
				break;
			case USER_VARIABLE:
				internTokenList.add(new InternToken(InternTokenType.USER_VARIABLE, this.value));
				break;
			case NUMBER:
				internTokenList.add(new InternToken(InternTokenType.NUMBER, this.value));
				break;
			case SENSOR:
				internTokenList.add(new InternToken(InternTokenType.SENSOR, this.value));
				break;
		}
		return internTokenList;
	}

	public FormulaElement getRoot() {
		FormulaElement root = this;
		while (root.getParent() != null) {
			root = root.getParent();
		}
		return root;
	}

	public FormulaElement getParent() {
		return parent;
	}

	public void setRightChild(FormulaElement rightChild) {
		this.rightChild = rightChild;
		this.rightChild.parent = this;
	}

	public void setLeftChild(FormulaElement leftChild) {
		this.leftChild = leftChild;
		this.leftChild.parent = this;
	}

	public void replaceElement(FormulaElement current) {
		parent = current.parent;
		leftChild = current.leftChild;
		rightChild = current.rightChild;
		value = current.value;
		type = current.type;

		if (leftChild != null) {
			leftChild.parent = this;
		}
		if (rightChild != null) {
			rightChild.parent = this;
		}
	}

	public void replaceElement(ElementType type, String value) {
		this.value = value;
		this.type = type;
	}

	public void replaceWithSubElement(String operator, FormulaElement rightChild) {

		FormulaElement cloneThis = new FormulaElement(ElementType.OPERATOR, operator, this.getParent(), this,
				rightChild);

		cloneThis.parent.rightChild = cloneThis;
	}

	public boolean isLogicalOperator() {
		if (type == ElementType.OPERATOR) {
			return Operators.getOperatorByValue(value).isLogicalOperator;
		}
		return false;
	}

	public boolean containsElement(ElementType elementType) {
		if (type.equals(elementType)) {
			return true;
		}

		if (leftChild != null && leftChild.containsElement(elementType)) {
			return true;
		}

		if (rightChild != null && rightChild.containsElement(elementType)) {
			return true;
		}
		return false;
	}

	public boolean isSingleNumberFormula() {
		if (type == ElementType.OPERATOR) {
			Operators operator = Operators.getOperatorByValue(value);
			if (operator == Operators.MINUS && leftChild == null) {
				return rightChild.isSingleNumberFormula();
			}
			return false;
		} else if (type == ElementType.NUMBER) {
			return true;
		}
		return false;
	}

	@Override
	public FormulaElement clone() {
		FormulaElement leftChildClone = leftChild == null ? null : leftChild.clone();
		FormulaElement rightChildClone = rightChild == null ? null : rightChild.clone();
		return new FormulaElement(type, new String(value == null ? "" : value), null, leftChildClone, rightChildClone);
	}

	

}
