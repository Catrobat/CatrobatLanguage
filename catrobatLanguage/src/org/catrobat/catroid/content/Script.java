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
import java.util.Arrays;

import org.catrobat.catroid.content.bricks.Brick;
import org.catrobat.catroid.content.bricks.IfLogicBeginBrick;
import org.catrobat.catroid.content.bricks.IfLogicElseBrick;
import org.catrobat.catroid.content.bricks.IfLogicEndBrick;
import org.catrobat.catroid.content.bricks.LoopBeginBrick;
import org.catrobat.catroid.content.bricks.LoopEndBrick;

public abstract class Script implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final int INDENTATION = 3;

	private ArrayList<Brick> brickList;
	private Sprite object;

	public Script() {
		brickList = new ArrayList<Brick>();
		object = null;
	}

	public ArrayList<Brick> getBrickList() {
		return brickList;
	}

	public void setBrickList(ArrayList<Brick> brickList) {
		this.brickList = brickList;
	}

	public Sprite getObject() {
		return object;
	}

	public void setObject(Sprite object) {
		this.object = object;
	}

	public boolean equals(Object arg) {
		return ((arg instanceof Script) && 
				brickList.equals(((Script)arg).brickList));
	}

	private boolean hasLeftShift(Brick brick) {
		return (brick instanceof IfLogicEndBrick 
				|| brick instanceof LoopEndBrick);
	}

	private boolean nextHasRightShift(Brick brick) {
		return (brick instanceof IfLogicBeginBrick
				|| brick instanceof IfLogicElseBrick 
				|| brick instanceof LoopBeginBrick);
	}

	private String getIndentation(int layer) {
		char[] bytes = new char[layer * INDENTATION];
		Arrays.fill(bytes, ' ');
		return new String(bytes);
	}

	private String getLine(Brick brick, int layer) {
		return getIndentation(layer) + brick.toString();
	}

	public String toString() {
		StringBuffer returned = new StringBuffer();
		int layer = 1;
		if (brickList != null)
			for (Brick item : brickList) {
				if (hasLeftShift(item))
					layer--;
				returned.append(getLine(item, layer));
				if (nextHasRightShift(item))
					layer++;
			}
		return returned.toString();
	}

}
