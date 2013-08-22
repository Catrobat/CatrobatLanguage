package org.catrobat.catroid.yaml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.content.XmlHeader;
import org.catrobat.catroid.formulaeditor.UserVariable;

public class YamlProject {

	private XmlHeader header;
	private Map<String, YamlSprite> objects;
	private List<String> projectVariables;

	public YamlProject(Project project) {
		header = new XmlHeader();
		objects = new HashMap<String, YamlSprite>();
		projectVariables = new ArrayList<String>();
		
		header = project.getXmlHeader();
		objects = new HashMap<String, YamlSprite>();
		if (project.getSpriteList()!=null) {
			for (Sprite item : project.getSpriteList()) {
				objects.put(item.getName(), new YamlSprite(item, project.getUserVariables().getSpriteVariables().get(item)));
			}
		}
		
		if (project.getUserVariables().getProjectVariables()!=null) {
			for (UserVariable item : project.getUserVariables().getProjectVariables()) {
				projectVariables.add(item.getName());
			}
		}
	}
	
	public YamlProject() {
		header = new XmlHeader();
		objects = new HashMap<String, YamlSprite>();
		projectVariables = new ArrayList<String>();
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
	
	public List<String> getProjectVariables() {
		return projectVariables;
	}

	public void setProjectVariables(List<String> projectVariables) {
		this.projectVariables = projectVariables;
	}
	
	public boolean equals(YamlProject arg) {
		return (header.equals(arg.header) && 
				objects.equals(arg.objects) &&
				projectVariables.equals(arg.projectVariables));
	}

}
