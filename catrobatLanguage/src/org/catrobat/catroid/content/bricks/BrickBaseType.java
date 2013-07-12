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

import org.catrobat.catroid.content.Sprite;

public class BrickBaseType implements Brick {
	private static final long serialVersionUID = 1L;
	
	public Sprite sprite;
	
	public boolean equals(Object arg) {
		return (
				((arg instanceof BroadcastBrick) && (this instanceof BroadcastBrick) 
						&& ((BroadcastBrick) this).equals((BroadcastBrick) arg)) ||
				((arg instanceof BroadcastReceiverBrick) && (this instanceof BroadcastReceiverBrick) 
						&& ((BroadcastReceiverBrick) this).equals((BroadcastReceiverBrick) arg)) ||
				((arg instanceof BroadcastWaitBrick) && (this instanceof BroadcastWaitBrick) 
						&& ((BroadcastWaitBrick) this).equals((BroadcastWaitBrick) arg)) ||				
				
				((arg instanceof ChangeBrightnessByNBrick) && (this instanceof ChangeBrightnessByNBrick)
						&& ((ChangeBrightnessByNBrick) this).equals((ChangeBrightnessByNBrick) arg)) ||	
				((arg instanceof ChangeGhostEffectByNBrick) && (this instanceof ChangeGhostEffectByNBrick)
						&& ((ChangeGhostEffectByNBrick) this).equals((ChangeGhostEffectByNBrick) arg)) ||	
				((arg instanceof ChangeSizeByNBrick) && (this instanceof ChangeSizeByNBrick)
						&& ((ChangeSizeByNBrick) this).equals((ChangeSizeByNBrick) arg)) ||
				((arg instanceof ChangeVariableBrick) && (this instanceof ChangeVariableBrick)
						&& ((ChangeVariableBrick) this).equals((ChangeVariableBrick) arg)) ||
				((arg instanceof ChangeVolumeByNBrick) && (this instanceof ChangeVolumeByNBrick)
						&& ((ChangeVolumeByNBrick) this).equals((ChangeVolumeByNBrick) arg)) ||
				((arg instanceof ChangeXByNBrick) && (this instanceof ChangeXByNBrick)
						&& ((ChangeXByNBrick) this).equals((ChangeXByNBrick) arg)) ||
				((arg instanceof ChangeYByNBrick) && (this instanceof ChangeYByNBrick)
						&& ((ChangeYByNBrick) this).equals((ChangeYByNBrick) arg)) ||
				((arg instanceof ClearGraphicEffectBrick) && (this instanceof ClearGraphicEffectBrick)
						&& ((ClearGraphicEffectBrick) this).equals((ClearGraphicEffectBrick) arg)) ||
				((arg instanceof ComeToFrontBrick) && (this instanceof ComeToFrontBrick)
						&& ((ComeToFrontBrick) this).equals((ComeToFrontBrick) arg)) ||
				
				((arg instanceof ForeverBrick) && (this instanceof ForeverBrick)
						&& ((ForeverBrick) this).equals((ForeverBrick) arg)) ||
				
				((arg instanceof GlideToBrick) && (this instanceof GlideToBrick)
						&& ((GlideToBrick) this).equals((GlideToBrick) arg)) ||
				((arg instanceof GoNStepsBackBrick) && (this instanceof GoNStepsBackBrick)
						&& ((GoNStepsBackBrick) this).equals((GoNStepsBackBrick) arg)) ||
				
				((arg instanceof HideBrick) && (this instanceof HideBrick)
						&& ((HideBrick) this).equals((HideBrick) arg)) ||
				
				((arg instanceof IfLogicBeginBrick) && (this instanceof IfLogicBeginBrick)
						&& ((IfLogicBeginBrick) this).equals((IfLogicBeginBrick) arg)) ||
				((arg instanceof IfLogicElseBrick) && (this instanceof IfLogicElseBrick)
						&& ((IfLogicElseBrick) this).equals((IfLogicElseBrick) arg)) ||
				((arg instanceof IfLogicEndBrick) && (this instanceof IfLogicEndBrick)
						&& ((IfLogicEndBrick) this).equals((IfLogicEndBrick) arg)) ||
				((arg instanceof IfOnEdgeBounceBrick) && (this instanceof IfOnEdgeBounceBrick)
						&& ((IfOnEdgeBounceBrick) this).equals((IfOnEdgeBounceBrick) arg)) ||
				
				((arg instanceof LegoNxtMotorActionBrick) && (this instanceof LegoNxtMotorActionBrick)
						&& ((LegoNxtMotorActionBrick) this).equals((LegoNxtMotorActionBrick) arg)) ||
				((arg instanceof LegoNxtMotorStopBrick) && (this instanceof LegoNxtMotorStopBrick)
						&& ((LegoNxtMotorStopBrick) this).equals((LegoNxtMotorStopBrick) arg)) ||
				((arg instanceof LegoNxtMotorTurnAngleBrick) && (this instanceof LegoNxtMotorTurnAngleBrick)
						&& ((LegoNxtMotorTurnAngleBrick) this).equals((LegoNxtMotorTurnAngleBrick) arg)) ||
				((arg instanceof LegoNxtPlayToneBrick) && (this instanceof LegoNxtPlayToneBrick)
						&& ((LegoNxtPlayToneBrick) this).equals((LegoNxtPlayToneBrick) arg)) ||
				
				((arg instanceof LoopEndBrick) && (this instanceof LoopEndBrick)
						&& ((LoopEndBrick) this).equals((LoopEndBrick) arg)) ||
				((arg instanceof LoopEndlessBrick) && (this instanceof LoopEndlessBrick)
						&& ((LoopEndlessBrick) this).equals((LoopEndlessBrick) arg)) ||
				
				((arg instanceof MoveNStepsBrick) && (this instanceof MoveNStepsBrick)
						&& ((MoveNStepsBrick) this).equals((MoveNStepsBrick) arg)) ||
				
				((arg instanceof NextLookBrick) && (this instanceof NextLookBrick)
						&& ((NextLookBrick) this).equals((NextLookBrick) arg)) ||
				((arg instanceof NoteBrick) && (this instanceof NoteBrick)
						&& ((NoteBrick) this).equals((NoteBrick) arg)) ||
				
				((arg instanceof PlaceAtBrick) && (this instanceof PlaceAtBrick)
						&& ((PlaceAtBrick) this).equals((PlaceAtBrick) arg)) ||
				((arg instanceof PlaySoundBrick) && (this instanceof PlaySoundBrick)
						&& ((PlaySoundBrick) this).equals((PlaySoundBrick) arg)) ||
				((arg instanceof PointInDirectionBrick) && (this instanceof PointInDirectionBrick)
						&& ((PointInDirectionBrick) this).equals((PointInDirectionBrick) arg)) ||
				((arg instanceof PointToBrick) && (this instanceof PointToBrick)
						&& ((PointToBrick) this).equals((PointToBrick) arg)) ||
				
				((arg instanceof RepeatBrick) && (this instanceof RepeatBrick)
						&& ((RepeatBrick) this).equals((RepeatBrick) arg)) ||
				
				((arg instanceof SetBrightnessBrick) && (this instanceof SetBrightnessBrick)
						&& ((SetBrightnessBrick) this).equals((SetBrightnessBrick) arg)) ||
				((arg instanceof SetGhostEffectBrick) && (this instanceof SetGhostEffectBrick)
						&& ((SetGhostEffectBrick) this).equals((SetGhostEffectBrick) arg)) ||
				((arg instanceof SetLookBrick) && (this instanceof SetLookBrick)
						&& ((SetLookBrick) this).equals((SetLookBrick) arg)) ||
				((arg instanceof SetSizeToBrick) && (this instanceof SetSizeToBrick)
						&& ((SetSizeToBrick) this).equals((SetSizeToBrick) arg)) ||
				((arg instanceof SetVariableBrick) && (this instanceof SetVariableBrick)
						&& ((SetVariableBrick) this).equals((SetVariableBrick) arg)) ||
				((arg instanceof SetVolumeToBrick) && (this instanceof SetVolumeToBrick)
						&& ((SetVolumeToBrick) this).equals((SetVolumeToBrick) arg)) ||
				((arg instanceof SetXBrick) && (this instanceof SetXBrick)
						&& ((SetXBrick) this).equals((SetXBrick) arg)) ||
				((arg instanceof SetYBrick) && (this instanceof SetYBrick)
						&& ((SetYBrick) this).equals((SetYBrick) arg)) ||
				((arg instanceof ShowBrick) && (this instanceof ShowBrick)
						&& ((ShowBrick) this).equals((ShowBrick) arg)) ||
				((arg instanceof SpeakBrick) && (this instanceof SpeakBrick)
						&& ((SpeakBrick) this).equals((SpeakBrick) arg)) ||
				((arg instanceof StopAllSoundsBrick) && (this instanceof StopAllSoundsBrick)
						&& ((StopAllSoundsBrick) this).equals((StopAllSoundsBrick) arg)) ||
				
				((arg instanceof TurnLeftBrick) && (this instanceof TurnLeftBrick)
						&& ((TurnLeftBrick) this).equals((TurnLeftBrick) arg)) ||
				((arg instanceof TurnRightBrick) && (this instanceof TurnRightBrick)
						&& ((TurnRightBrick) this).equals((TurnRightBrick) arg)) ||
				
				((arg instanceof WaitBrick) && (this instanceof WaitBrick)
						&& ((WaitBrick) this).equals((WaitBrick) arg)) ||
				((arg instanceof WhenBrick) && (this instanceof WhenBrick)
						&& ((WhenBrick) this).equals((WhenBrick) arg)) ||
				((arg instanceof WhenStartedBrick) && (this instanceof WhenStartedBrick)
						&& ((WhenStartedBrick) this).equals((WhenStartedBrick) arg))
				);
	}
}
