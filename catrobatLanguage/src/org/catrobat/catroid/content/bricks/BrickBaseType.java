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
	
	public String toString() {
			if (this instanceof BroadcastBrick) {
				return ((BroadcastBrick) this).toString();
			} else if (this instanceof BroadcastReceiverBrick) {				
				return ((BroadcastReceiverBrick) this).toString(); 
			} else if (this instanceof BroadcastWaitBrick) { 
				return ((BroadcastWaitBrick) this).toString(); 
			} else if (this instanceof ChangeBrightnessByNBrick) {
				return ((ChangeBrightnessByNBrick) this).toString();
			} else if (this instanceof ChangeGhostEffectByNBrick) {
				return ((ChangeGhostEffectByNBrick) this).toString();
			} else if (this instanceof ChangeSizeByNBrick) {
				return ((ChangeSizeByNBrick) this).toString();
			} else if (this instanceof ChangeVariableBrick) {
				return ((ChangeVariableBrick) this).toString();
			} else if (this instanceof ChangeVolumeByNBrick) {
				return ((ChangeVolumeByNBrick) this).toString();
			} else if (this instanceof ChangeXByNBrick) {
				return ((ChangeXByNBrick) this).toString();
			} else if (this instanceof ChangeYByNBrick) {
				return ((ChangeYByNBrick) this).toString();
			} else if (this instanceof ClearGraphicEffectBrick) {
				return ((ClearGraphicEffectBrick) this).toString();
			} else if (this instanceof ComeToFrontBrick) {
				return ((ComeToFrontBrick) this).toString();
			} else if (this instanceof ForeverBrick) {
				return ((ForeverBrick) this).toString();
			} else if (this instanceof GlideToBrick) {
				return ((GlideToBrick) this).toString();
			} else if (this instanceof GoNStepsBackBrick) {
				return ((GoNStepsBackBrick) this).toString();
			} else if (this instanceof HideBrick) {
				return ((HideBrick) this).toString();
			} else if (this instanceof IfLogicBeginBrick) {
				return ((IfLogicBeginBrick) this).toString();
			} else if (this instanceof IfLogicElseBrick) {
				return ((IfLogicElseBrick) this).toString();
			} else if (this instanceof IfLogicEndBrick) {
				return ((IfLogicEndBrick) this).toString(); 
			} else if (this instanceof IfOnEdgeBounceBrick) {
				return ((IfOnEdgeBounceBrick) this).toString(); 
			} else if (this instanceof LegoNxtMotorActionBrick) {
				return ((LegoNxtMotorActionBrick) this).toString(); 
			} else if (this instanceof LegoNxtMotorStopBrick) {
				return ((LegoNxtMotorStopBrick) this).toString();
			} else if (this instanceof LegoNxtMotorTurnAngleBrick) {
				return ((LegoNxtMotorTurnAngleBrick) this).toString();
			} else if (this instanceof LegoNxtPlayToneBrick) {
				return ((LegoNxtPlayToneBrick) this).toString(); 
			} else if (this instanceof LoopEndBrick) {
				return ((LoopEndBrick) this).toString();
			} else if (this instanceof LoopEndlessBrick) {
				return ((LoopEndlessBrick) this).toString();
			} else if (this instanceof MoveNStepsBrick) {
				return ((MoveNStepsBrick) this).toString();
			} else if (this instanceof NextLookBrick) {
				return ((NextLookBrick) this).toString();
			} else if (this instanceof NoteBrick) {
				return ((NoteBrick) this).toString();
			} else if (this instanceof PlaceAtBrick) {
				return ((PlaceAtBrick) this).toString(); 
			} else if (this instanceof PlaySoundBrick) {
				return ((PlaySoundBrick) this).toString();
			} else if (this instanceof PointInDirectionBrick) {
				return ((PointInDirectionBrick) this).toString();
			} else if (this instanceof PointToBrick) {
				return ((PointToBrick) this).toString();
			} else if (this instanceof RepeatBrick) {
				return ((RepeatBrick) this).toString();
			} else if (this instanceof SetBrightnessBrick) {
				return ((SetBrightnessBrick) this).toString();
			} else if (this instanceof SetGhostEffectBrick) {
				return ((SetGhostEffectBrick) this).toString();
			} else if (this instanceof SetLookBrick) {
				return ((SetLookBrick) this).toString();
			} else if (this instanceof SetSizeToBrick) {
				return ((SetSizeToBrick) this).toString();
			} else if (this instanceof SetVariableBrick) {
				return ((SetVariableBrick) this).toString();
			} else if (this instanceof SetVolumeToBrick) {
				return ((SetVolumeToBrick) this).toString();
			} else if (this instanceof SetXBrick) {
				return ((SetXBrick) this).toString();
			} else if (this instanceof SetYBrick) {
				return ((SetYBrick) this).toString();
			} else if (this instanceof ShowBrick) {
				return ((ShowBrick) this).toString();
			} else if (this instanceof SpeakBrick) {
				return ((SpeakBrick) this).toString();
			} else if (this instanceof StopAllSoundsBrick) {
				return ((StopAllSoundsBrick) this).toString();
			} else if (this instanceof TurnLeftBrick) {
				return ((TurnLeftBrick) this).toString();
			} else if (this instanceof TurnRightBrick) {
				return ((TurnRightBrick) this).toString();
			} else if (this instanceof WaitBrick) {
				return ((WaitBrick) this).toString();
			} else if (this instanceof WhenBrick) {
				return ((WhenBrick) this).toString();
			} else if (this instanceof WhenStartedBrick) {
				return ((WhenStartedBrick) this).toString();
			} else {
				return new String();
			}
 	}
}
