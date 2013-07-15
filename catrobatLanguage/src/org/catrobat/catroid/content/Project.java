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
package org.catrobat.catroid.content;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.catrobat.catroid.formulaeditor.UserVariablesContainer;
import org.catrobat.catroid.yaml.YamlProject;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("program")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias("header")
	public XmlHeader xmlHeader;
	@XStreamAlias("objectList")
	public List<Sprite> spriteList;
	@XStreamAlias("variables")
	public UserVariablesContainer userVariables;

	public Project(YamlProject project) {
		xmlHeader = new XmlHeader();
		spriteList = new ArrayList<Sprite>();
		userVariables = new UserVariablesContainer();
		
		if (project.header != null)
			xmlHeader = project.header;
		else if (project.objects != null) {
			for (String name : project.objects.keySet()) {
				spriteList.add(new Sprite(name, project.objects.get(name)));
			}
		}
		if (project.variables != null)
			userVariables = project.variables;
	}

	public Project() {
		xmlHeader = new XmlHeader();
		spriteList = new ArrayList<Sprite>();
		userVariables = new UserVariablesContainer();
	}

	public boolean equals(Project arg) {
		return (xmlHeader.equals(arg.xmlHeader) && 
				spriteList.equals(arg.spriteList) && 
				userVariables.equals(arg.userVariables));
	}

}
