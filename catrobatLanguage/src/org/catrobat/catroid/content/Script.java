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

import org.catrobat.catroid.content.bricks.Brick;
import org.catrobat.catroid.content.bricks.IfLogicBeginBrick;
import org.catrobat.catroid.content.bricks.IfLogicElseBrick;
import org.catrobat.catroid.content.bricks.IfLogicEndBrick;
import org.catrobat.catroid.content.bricks.LoopBeginBrick;
import org.catrobat.catroid.content.bricks.LoopEndBrick;

public abstract class Script implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public ArrayList<Brick> brickList = new ArrayList<Brick>();
	public Sprite object;
	
	public boolean equals(Object arg0) {
		
		if (!(arg0 instanceof Script))
			return false;
		Script arg = (Script) arg0;
		
		return (((arg instanceof StartScript) && (this instanceof StartScript) 
						&& ((StartScript) this).equals((StartScript) arg)) ||
				((arg instanceof WhenScript) && (this instanceof WhenScript) 
						&& ((WhenScript) this).equals((WhenScript) arg)) ||
				((arg instanceof BroadcastScript) && (this instanceof BroadcastScript)
						&& ((BroadcastScript) this).equals((BroadcastScript) arg)) &&
				brickList.equals(arg.brickList));
	}
	
	private boolean hasLeftShift(Brick brick) {
		if (brick instanceof IfLogicEndBrick ||
			brick instanceof LoopEndBrick)
			return true;
		else
			return false;
	}
	
	private boolean nextHasRightShift(Brick brick) {
		if (brick instanceof IfLogicBeginBrick ||
			brick instanceof IfLogicElseBrick ||
			brick instanceof LoopBeginBrick)
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuffer returned = new StringBuffer();
		StringBuffer indentation = new StringBuffer("   ");
		for (Brick item: brickList) {
			if (hasLeftShift(item))
				indentation.delete(0, 3);
			returned.append(indentation);
			returned.append(item.toString());
			if (nextHasRightShift(item))
				indentation.append("   ");
		}
		return returned.toString();
	}

}
