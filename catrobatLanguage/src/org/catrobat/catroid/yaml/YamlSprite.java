package org.catrobat.catroid.yaml;

import java.util.ArrayList;
import java.util.List;

import org.catrobat.catroid.common.LookData;
import org.catrobat.catroid.common.SoundInfo;
import org.catrobat.catroid.content.Script;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.formulaeditor.UserVariable;

public class YamlSprite {

	private String scripts;
	private ArrayList<LookData> looks;
	private ArrayList<SoundInfo> sounds;
	private List<String> variables;

	YamlSprite(Sprite sprite, List<UserVariable> spriteVariables) {
		looks = new ArrayList<LookData>();
		sounds = new ArrayList<SoundInfo>();
		StringBuffer buffer = new StringBuffer();
		variables = new ArrayList<String>();

		if (!sprite.getScriptList().isEmpty())
			for (Script item : sprite.getScriptList()) {
				buffer.append(item.toString() + "\r\n");
			}
		scripts = buffer.toString();
		if (!sprite.getLookList().isEmpty())
			looks = sprite.getLookList();
		if (!sprite.getSoundList().isEmpty())
			sounds = sprite.getSoundList();
		if (spriteVariables != null) {
			for (UserVariable item : spriteVariables) {
				variables.add(item.getName());
			}
		}
	}

	public YamlSprite() {
		looks = new ArrayList<LookData>();
		sounds = new ArrayList<SoundInfo>();
		scripts = new String();
		variables = new ArrayList<String>();
	}

	public String getScripts() {
		return scripts;
	}

	public void setScripts(String scripts) {
		this.scripts = scripts;
	}

	public ArrayList<LookData> getLooks() {
		return looks;
	}

	public void setLooks(ArrayList<LookData> looks) {
		this.looks = looks;
	}

	public ArrayList<SoundInfo> getSounds() {
		return sounds;
	}

	public void setSounds(ArrayList<SoundInfo> sounds) {
		this.sounds = sounds;
	}

	public List<String> getVariables() {
		return variables;
	}

	public void setVariables(List<String> variables) {
		this.variables = variables;
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof YamlSprite))
			return false;
		YamlSprite arg = (YamlSprite) arg0;

		return (scripts.equals((String)arg.scripts) && looks.equals(arg.looks) && sounds
				.equals(arg.sounds));
	}
}
