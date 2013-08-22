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

import org.catrobat.catroid.common.LookData;
import org.catrobat.catroid.common.SoundInfo;

public class Sprite implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private List<Script> scriptList;
	private ArrayList<LookData> lookList;
	private ArrayList<SoundInfo> soundList;

	//TODO: complete
	/*public Sprite(String name, YamlSprite sprite) {
		name = "";
		scriptList = new ArrayList<Script>();
		lookList = new ArrayList<LookData>();
		soundList = new ArrayList<SoundInfo>();
		
		if (!(name == null))
			this.name = name;
		if (!(sprite.getScripts() == null))
			scriptList = sprite.getScripts();
		if (!(sprite.getLooks() == null))
			lookList = sprite.getLooks();
		if (!(sprite.getSounds() == null))
			soundList = sprite.getSounds();
	}
*/
	public Sprite() {
		name = "";
		scriptList = new ArrayList<Script>();
		lookList = new ArrayList<LookData>();
		soundList = new ArrayList<SoundInfo>();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Script> getScriptList() {
		return scriptList;
	}

	public void setScriptList(List<Script> scriptList) {
		this.scriptList = scriptList;
	}

	public ArrayList<LookData> getLookList() {
		return lookList;
	}

	public void setLookList(ArrayList<LookData> lookList) {
		this.lookList = lookList;
	}

	public ArrayList<SoundInfo> getSoundList() {
		return soundList;
	}

	public void setSoundList(ArrayList<SoundInfo> soundList) {
		this.soundList = soundList;
	}

	public boolean equals(Object arg0) {

		if (!(arg0 instanceof Sprite))
			return false;
		Sprite arg = (Sprite) arg0;

		return (name.equals(arg.name) && scriptList.equals(arg.scriptList)
				&& lookList.equals(arg.lookList) && soundList
					.equals(arg.soundList));
	}

	public int hashCode() {
		return name.hashCode();
	}
	
	public String toString() {
		StringBuffer returned = new StringBuffer();
		for (Script item: scriptList) {
			returned.append(item.toString()+"\r\n");
		}
		return returned.toString();
	}

}
