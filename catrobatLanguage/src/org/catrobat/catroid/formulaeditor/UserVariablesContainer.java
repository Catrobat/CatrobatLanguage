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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.catrobat.catroid.content.Sprite;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class UserVariablesContainer implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias("programVariableList")
	private List<UserVariable> projectVariables;
	@XStreamAlias("objectVariableList")
	private Map<Sprite, List<UserVariable>> spriteVariables;

	public UserVariablesContainer() {
		projectVariables = new ArrayList<UserVariable>();
		spriteVariables = new HashMap<Sprite, List<UserVariable>>();
	}

	public List<UserVariable> getProjectVariables() {
		return projectVariables;
	}

	public void setProjectVariables(List<UserVariable> projectVariables) {
		this.projectVariables = projectVariables;
	}

	public Map<Sprite, List<UserVariable>> getSpriteVariables() {
		return spriteVariables;
	}

	public void setSpriteVariables(Map<Sprite, List<UserVariable>> spriteVariables) {
		this.spriteVariables = spriteVariables;
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof UserVariablesContainer))
			return false;
		UserVariablesContainer arg = (UserVariablesContainer) arg0;
		
		return (projectVariables.equals(arg.projectVariables) && 
				spriteVariables.equals(arg.spriteVariables));
	}
}