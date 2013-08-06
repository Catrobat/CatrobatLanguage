package org.catrobat.catroid.yaml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.content.XmlHeader;
import org.catrobat.catroid.formulaeditor.UserVariable;
import org.catrobat.catroid.formulaeditor.UserVariablesContainer;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class YamlProject {

	private XmlHeader header;
	private Map<String, YamlSprite> objects;
	private List<UserVariable> projectVariables;
	private Map<String, List<UserVariable>> spriteVariables;

	public YamlProject(Project project) {
		header = new XmlHeader();
		objects = new HashMap<String, YamlSprite>();
		projectVariables = new ArrayList<UserVariable>();
		spriteVariables = new HashMap<String, List<UserVariable>>();
		
		header = project.getXmlHeader();
		objects = new HashMap<String, YamlSprite>();
		if (!project.getSpriteList().isEmpty()) {
			for (Sprite item : project.getSpriteList()) {
				objects.put(item.getName(), new YamlSprite(item));
			}
		}
		projectVariables = project.getUserVariables().getProjectVariables();
		Map<Sprite, List<UserVariable>> buffer =project.getUserVariables().getSpriteVariables();
		for (Sprite item: buffer.keySet()) {
			spriteVariables.put(item.getName(), buffer.get(item));
		}
	}
	
	public YamlProject() {
		header = new XmlHeader();
		objects = new HashMap<String, YamlSprite>();
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
	
	public List<UserVariable> getProjectVariables() {
		return projectVariables;
	}

	public void setProjectVariables(List<UserVariable> projectVariables) {
		this.projectVariables = projectVariables;
	}

	public Map<String, List<UserVariable>> getSpriteVariables() {
		return spriteVariables;
	}

	public void setSpriteVariables(Map<String, List<UserVariable>> spriteVariables) {
		this.spriteVariables = spriteVariables;
	}

	public boolean equals(YamlProject arg) {		
		return (header.equals(arg.header) && 
				objects.equals(arg.objects) &&
				spriteVariables.equals(arg.spriteVariables) &&
				projectVariables.equals(arg.projectVariables));
	}

}
