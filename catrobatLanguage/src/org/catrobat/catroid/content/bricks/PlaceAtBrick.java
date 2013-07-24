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
package org.catrobat.catroid.content.bricks;

import org.catrobat.catroid.formulaeditor.Formula;

public class PlaceAtBrick extends BrickBaseType {
	private static final long serialVersionUID = 1L;

	private Formula xPosition;
	private Formula yPosition;
	
	public PlaceAtBrick() {
		super();
		xPosition = new Formula();
		yPosition = new Formula();
	}

	public Formula getxPosition() {
		return xPosition;
	}

	public void setxPosition(Formula xPosition) {
		this.xPosition = xPosition;
	}

	public Formula getyPosition() {
		return yPosition;
	}

	public void setyPosition(Formula yPosition) {
		this.yPosition = yPosition;
	}

	public boolean equals(Object arg) {
		return ((arg instanceof PlaceAtBrick) &&
				xPosition.equals(((PlaceAtBrick)arg).xPosition) &&
				yPosition.equals(((PlaceAtBrick)arg).yPosition));
	}
	
	public String toString() {
		return ("place at X: (" + xPosition.toString() + "), Y: (" + yPosition.toString() + ")\r\n");
	}
}
