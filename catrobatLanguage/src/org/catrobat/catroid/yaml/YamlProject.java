package org.catrobat.catroid.yaml;

import java.util.HashMap;
import java.util.Map;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.content.XmlHeader;
import org.catrobat.catroid.formulaeditor.UserVariablesContainer;

public class YamlProject {

	private XmlHeader header;
	private Map<String, YamlSprite> objects;
	private UserVariablesContainer variables;

	public YamlProject(Project project) {
		header = new XmlHeader();
		objects = new HashMap<String, YamlSprite>();
		variables = new UserVariablesContainer();
		
		header = project.getXmlHeader();
		objects = new HashMap<String, YamlSprite>();
		if (!project.getSpriteList().isEmpty()) {
			for (Sprite item : project.getSpriteList()) {
				objects.put(item.getName(), new YamlSprite(item));
			}
		}
		variables = project.getUserVariables();
	}
	
	public YamlProject() {
		header = new XmlHeader();
		objects = new HashMap<String, YamlSprite>();
		variables = new UserVariablesContainer();
	}
	
	public XmlHeader getHeader() {
		return header;
	}

	public void setHeader(XmlHeader header) {
		this.header = header;
	}

	public Map<String, YamlSprite> getObjects() {
		return objects;
	}

	public void setObjects(Map<String, YamlSprite> objects) {
		this.objects = objects;
	}

	public UserVariablesContainer getVariables() {
		return variables;
	}

	public void setVariables(UserVariablesContainer variables) {
		this.variables = variables;
	}
	
	public boolean equals(YamlProject arg) {		
		return (header.equals(arg.header) && 
				objects.equals(arg.objects) && 
				variables.equals(arg.variables));
	}

}
