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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.catrobat.catroid.formulaeditor.UserVariable;
import org.catrobat.catroid.formulaeditor.UserVariablesContainer;
import org.catrobat.catroid.yaml.YamlProject;
import org.catrobat.parser.CatrobatScriptLexer;
import org.catrobat.parser.CatrobatScriptParser;

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

	@SuppressWarnings("unused")
	private Sprite getSpriteByName(String name) throws Exception {
		for (Sprite item : spriteList) {
			if (item.getName().equals(name))
				return item;
		}
		throw new Exception("Sprite named " + name + "not found.");
	}

	public Project(YamlProject project) throws Exception {
		xmlHeader = new XmlHeader();
		spriteList = new ArrayList<Sprite>();
		userVariables = new UserVariablesContainer();

		if (project.getHeader() != null)
			xmlHeader = project.getHeader();
		if (project.getObjects() != null) {
			for (String name : project.getObjects().keySet()) {
				spriteList
						.add(new Sprite(name, project.getObjects().get(name)));
			}
		}
		if (project.getProjectVariables() != null) {
			userVariables.setProjectVariables(project.getProjectVariables());
		}
		Map<Sprite, List<UserVariable>> spriteVariables = new HashMap<Sprite, List<UserVariable>>();

		for (int i = 0; i < spriteList.size(); i++) {
			Sprite sprite = spriteList.get(i);

			ANTLRInputStream input = new ANTLRInputStream(project.getObjects()
					.get(sprite.getName()).getScripts());
			CatrobatScriptLexer lexer = new CatrobatScriptLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CatrobatScriptParser parser = new CatrobatScriptParser(tokens);

			parser.setSpriteList(spriteList);
			parser.setCurrentSprite(sprite);
			parser.setProgramVariables(userVariables.getProjectVariables());
			parser.setVariables(project.getObjects().get(sprite.getName()).getVariables());

			parser.program();

			sprite.setScriptList(parser.getScriptList());
			spriteVariables.put(sprite, parser.getVariables());

		}

		userVariables.setSpriteVariables(spriteVariables);

	}

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
		return (xmlHeader.equals(arg.xmlHeader)
				&& spriteList.containsAll(arg.spriteList)
				&& arg.spriteList.containsAll(spriteList) && userVariables
					.equals(arg.userVariables));
	}
}
