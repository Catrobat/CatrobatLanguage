package org.catrobat.catroid.yaml;

import java.util.ArrayList;
import java.util.List;

import org.catrobat.catroid.common.LookData;
import org.catrobat.catroid.common.SoundInfo;
import org.catrobat.catroid.content.Script;
import org.catrobat.catroid.content.Sprite;

public class YamlSprite {

	public List<Script> scripts;
	public ArrayList<LookData> looks;
	public ArrayList<SoundInfo> sounds;

	YamlSprite(Sprite sprite) {
		scripts = new ArrayList<Script>();
		looks = new ArrayList<LookData>();
		sounds = new ArrayList<SoundInfo>();
		
		if (!sprite.scriptList.isEmpty())
			scripts = sprite.scriptList;
		if (!sprite.lookList.isEmpty())
			looks = sprite.lookList;
		if (!sprite.soundList.isEmpty())
			sounds = sprite.soundList;
	}
	
	public YamlSprite() {
		scripts = new ArrayList<Script>();
		looks = new ArrayList<LookData>();
		sounds = new ArrayList<SoundInfo>();
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
