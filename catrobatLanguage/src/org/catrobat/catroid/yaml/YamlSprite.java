package org.catrobat.catroid.yaml;

import java.util.ArrayList;
import java.util.List;

import org.catrobat.catroid.common.LookData;
import org.catrobat.catroid.common.SoundInfo;
import org.catrobat.catroid.content.Script;
import org.catrobat.catroid.content.Sprite;

public class YamlSprite {

	private List<Script> scripts;
	private ArrayList<LookData> looks;
	private ArrayList<SoundInfo> sounds;

	YamlSprite(Sprite sprite) {
		scripts = new ArrayList<Script>();
		looks = new ArrayList<LookData>();
		sounds = new ArrayList<SoundInfo>();
		
		if (!sprite.getScriptList().isEmpty())
			scripts = sprite.getScriptList();
		if (!sprite.getLookList().isEmpty())
			looks = sprite.getLookList();
		if (!sprite.getSoundList().isEmpty())
			sounds = sprite.getSoundList();
	}
	
	public YamlSprite() {
		scripts = new ArrayList<Script>();
		looks = new ArrayList<LookData>();
		sounds = new ArrayList<SoundInfo>();
	}
	
	public List<Script> getScripts() {
		return scripts;
	}

	public void setScripts(List<Script> scripts) {
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

	public boolean equals(Object arg0) {

		if (!(arg0 instanceof YamlSprite))
			return false;
		YamlSprite arg = (YamlSprite) arg0;

		return (scripts.equals(arg.scripts)
				&& looks.equals(arg.looks) && 
				sounds.equals(arg.sounds));
	}
}
