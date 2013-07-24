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
package org.catrobat.catroid.content.bricks;

import org.catrobat.catroid.formulaeditor.Formula;
import org.catrobat.catroid.formulaeditor.UserVariable;

public class SetVariableBrick extends BrickBaseType {
	private static final long serialVersionUID = 1L;

	private UserVariable userVariable;
	private Formula variableFormula;
	
	public SetVariableBrick() {
		super();
		userVariable = new UserVariable();
		variableFormula = new Formula();
	}

	public UserVariable getUserVariable() {
		return userVariable;
	}

	public void setUserVariable(UserVariable userVariable) {
		this.userVariable = userVariable;
	}

	public Formula getVariableFormula() {
		return variableFormula;
	}

	public void setVariableFormula(Formula variableFormula) {
		this.variableFormula = variableFormula;
	}

	public boolean equals(Object arg) {
		return ((arg instanceof SetVariableBrick) &&
				userVariable.equals(((SetVariableBrick)arg).userVariable) &&
				variableFormula.equals(((SetVariableBrick)arg).variableFormula));
	}
	
	public String toString() {
		return ("set variable \"" + userVariable.getName() + "\" to ("
				+ variableFormula.toString() + ")\r\n");
	}

}
