package org.catrobat.catroid;

import java.util.List;
import java.util.Map;

public class ObjectPresentation {
	public String name;
	public Map<String, String> looks;
	public Map<String, String> sounds;
	public String code;
	public List<String> variableList;

	public ObjectPresentation() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getLooks() {
		return looks;
	}

	public void setLooks(Map<String, String> looks) {
		this.looks = looks;
	}

	public Map<String, String> getSounds() {
		return sounds;
	}

	public void setSounds(Map<String, String> sounds) {
		this.sounds = sounds;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<String> getVariableList() {
		return variableList;
	}

	public void setVariableList(List<String> variableList) {
		this.variableList = variableList;
	}
}