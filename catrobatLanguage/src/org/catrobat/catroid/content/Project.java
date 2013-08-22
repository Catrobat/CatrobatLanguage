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

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("program")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias("header")
	private XmlHeader xmlHeader;
	@XStreamAlias("objectList")
	private List<Sprite> spriteList;
	@XStreamAlias("variables")
	private UserVariablesContainer userVariables;
	
	private Sprite getSpriteByName(String name) throws Exception {
		for (Sprite item: spriteList) {
			if (item.getName().equals(name))
				return item;
		}
		throw new Exception("Sprite named " + name + "not found.");
	}

	// TODO: complete
	/*public Project(YamlProject project) throws Exception {
		xmlHeader = new XmlHeader();
		spriteList = new ArrayList<Sprite>();
		userVariables = new UserVariablesContainer();
		
		if (project.getHeader() != null)
			xmlHeader = project.getHeader();
		else if (project.getObjects() != null) {
			for (String name : project.getObjects().keySet()) {
				spriteList.add(new Sprite(name, project.getObjects().get(name)));
			}
		}
		if (project.getProjectVariables() != null) {
			userVariables.setProjectVariables(project.getProjectVariables());
		}
		
		if (project.getSpriteVariables()!=null) {
			Map<String, List<UserVariable>> buffer =project.getSpriteVariables();
			for (String item: buffer.keySet()) {
				userVariables.getSpriteVariables().put(getSpriteByName(item), buffer.get(item));
			}
		}
	}*/

	public Project() {
		xmlHeader = new XmlHeader();
		spriteList = new ArrayList<Sprite>();
		userVariables = new UserVariablesContainer();
	}

	
	public XmlHeader getXmlHeader() {
		return xmlHeader;
	}

	public void setXmlHeader(XmlHeader xmlHeader) {
		this.xmlHeader = xmlHeader;
	}

	public List<Sprite> getSpriteList() {
		return spriteList;
	}

	public void setSpriteList(List<Sprite> spriteList) {
		this.spriteList = spriteList;
	}

	public UserVariablesContainer getUserVariables() {
		return userVariables;
	}

	public void setUserVariables(UserVariablesContainer userVariables) {
		this.userVariables = userVariables;
	}

	public boolean equals(Project arg) {
		return (xmlHeader.equals(arg.xmlHeader) && 
				spriteList.equals(arg.spriteList) && 
				userVariables.equals(arg.userVariables));
	}

}
