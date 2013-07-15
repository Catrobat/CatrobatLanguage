package org.catrobat.catroid.yaml;

import java.util.HashMap;
import java.util.Map;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.content.XmlHeader;
import org.catrobat.catroid.formulaeditor.UserVariablesContainer;

public class YamlProject {

	public XmlHeader header;
	public Map<String, YamlSprite> objects;
	public UserVariablesContainer variables;

	public YamlProject(Project project) {
		header = new XmlHeader();
		objects = new HashMap<String, YamlSprite>();
		variables = new UserVariablesContainer();
		
		header = project.xmlHeader;
		objects = new HashMap<String, YamlSprite>();
		if (!project.spriteList.isEmpty()) {
			for (Sprite item : project.spriteList) {
				objects.put(item.name, new YamlSprite(item));
			}
		}
		variables = project.userVariables;
	}
	
	public YamlProject() {
		header = new XmlHeader();
		objects = new HashMap<String, YamlSprite>();
		variables = new UserVariablesContainer();
	}
	
	public boolean equals(YamlProject arg) {
		return (header.equals(arg.header) && 
				objects.equals(arg.objects) && 
				variables.equals(arg.variables));
	}

}
