// Generated from D:\Users\TDiva\Desktop\GSoC-2013\CatrobatLanguage\CatrobatGrammar\CatrobatScript.g4 by ANTLR 4.0
package org.catrobat.parser;

         import java.util.HashSet;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CatrobatScriptListener extends ParseTreeListener {
	void enterGoNStepsBackBrick(CatrobatScriptParser.GoNStepsBackBrickContext ctx);
	void exitGoNStepsBackBrick(CatrobatScriptParser.GoNStepsBackBrickContext ctx);

	void enterUserVariable(CatrobatScriptParser.UserVariableContext ctx);
	void exitUserVariable(CatrobatScriptParser.UserVariableContext ctx);

	void enterBrickList(CatrobatScriptParser.BrickListContext ctx);
	void exitBrickList(CatrobatScriptParser.BrickListContext ctx);

	void enterChangeBrightnessByNBrick(CatrobatScriptParser.ChangeBrightnessByNBrickContext ctx);
	void exitChangeBrightnessByNBrick(CatrobatScriptParser.ChangeBrightnessByNBrickContext ctx);

	void enterPointInDirectionBrick(CatrobatScriptParser.PointInDirectionBrickContext ctx);
	void exitPointInDirectionBrick(CatrobatScriptParser.PointInDirectionBrickContext ctx);

	void enterNextLookBrik(CatrobatScriptParser.NextLookBrikContext ctx);
	void exitNextLookBrik(CatrobatScriptParser.NextLookBrikContext ctx);

	void enterComeToFrontBrick(CatrobatScriptParser.ComeToFrontBrickContext ctx);
	void exitComeToFrontBrick(CatrobatScriptParser.ComeToFrontBrickContext ctx);

	void enterPointToBrick(CatrobatScriptParser.PointToBrickContext ctx);
	void exitPointToBrick(CatrobatScriptParser.PointToBrickContext ctx);

	void enterLoopEndBrick(CatrobatScriptParser.LoopEndBrickContext ctx);
	void exitLoopEndBrick(CatrobatScriptParser.LoopEndBrickContext ctx);

	void enterWhenScript(CatrobatScriptParser.WhenScriptContext ctx);
	void exitWhenScript(CatrobatScriptParser.WhenScriptContext ctx);

	void enterMoveNStepsBrick(CatrobatScriptParser.MoveNStepsBrickContext ctx);
	void exitMoveNStepsBrick(CatrobatScriptParser.MoveNStepsBrickContext ctx);

	void enterChangeVolumeByNBrick(CatrobatScriptParser.ChangeVolumeByNBrickContext ctx);
	void exitChangeVolumeByNBrick(CatrobatScriptParser.ChangeVolumeByNBrickContext ctx);

	void enterShowBrick(CatrobatScriptParser.ShowBrickContext ctx);
	void exitShowBrick(CatrobatScriptParser.ShowBrickContext ctx);

	void enterAction(CatrobatScriptParser.ActionContext ctx);
	void exitAction(CatrobatScriptParser.ActionContext ctx);

	void enterSetVolumeToBrick(CatrobatScriptParser.SetVolumeToBrickContext ctx);
	void exitSetVolumeToBrick(CatrobatScriptParser.SetVolumeToBrickContext ctx);

	void enterChangeGhostEffectByNBrick(CatrobatScriptParser.ChangeGhostEffectByNBrickContext ctx);
	void exitChangeGhostEffectByNBrick(CatrobatScriptParser.ChangeGhostEffectByNBrickContext ctx);

	void enterSetBrightnessBrick(CatrobatScriptParser.SetBrightnessBrickContext ctx);
	void exitSetBrightnessBrick(CatrobatScriptParser.SetBrightnessBrickContext ctx);

	void enterStopAllSoundsBrick(CatrobatScriptParser.StopAllSoundsBrickContext ctx);
	void exitStopAllSoundsBrick(CatrobatScriptParser.StopAllSoundsBrickContext ctx);

	void enterText(CatrobatScriptParser.TextContext ctx);
	void exitText(CatrobatScriptParser.TextContext ctx);

	void enterSetYBrick(CatrobatScriptParser.SetYBrickContext ctx);
	void exitSetYBrick(CatrobatScriptParser.SetYBrickContext ctx);

	void enterPlaceAtBrick(CatrobatScriptParser.PlaceAtBrickContext ctx);
	void exitPlaceAtBrick(CatrobatScriptParser.PlaceAtBrickContext ctx);

	void enterBroadcastScript(CatrobatScriptParser.BroadcastScriptContext ctx);
	void exitBroadcastScript(CatrobatScriptParser.BroadcastScriptContext ctx);

	void enterBroadcastWaitBrick(CatrobatScriptParser.BroadcastWaitBrickContext ctx);
	void exitBroadcastWaitBrick(CatrobatScriptParser.BroadcastWaitBrickContext ctx);

	void enterSetSizeToBrick(CatrobatScriptParser.SetSizeToBrickContext ctx);
	void exitSetSizeToBrick(CatrobatScriptParser.SetSizeToBrickContext ctx);

	void enterChangeVariableBrick(CatrobatScriptParser.ChangeVariableBrickContext ctx);
	void exitChangeVariableBrick(CatrobatScriptParser.ChangeVariableBrickContext ctx);

	void enterLegoNxtMotorStopBrick(CatrobatScriptParser.LegoNxtMotorStopBrickContext ctx);
	void exitLegoNxtMotorStopBrick(CatrobatScriptParser.LegoNxtMotorStopBrickContext ctx);

	void enterLegoNXTMotorActionBrick(CatrobatScriptParser.LegoNXTMotorActionBrickContext ctx);
	void exitLegoNXTMotorActionBrick(CatrobatScriptParser.LegoNXTMotorActionBrickContext ctx);

	void enterSound(CatrobatScriptParser.SoundContext ctx);
	void exitSound(CatrobatScriptParser.SoundContext ctx);

	void enterProgram(CatrobatScriptParser.ProgramContext ctx);
	void exitProgram(CatrobatScriptParser.ProgramContext ctx);

	void enterSetLookBrick(CatrobatScriptParser.SetLookBrickContext ctx);
	void exitSetLookBrick(CatrobatScriptParser.SetLookBrickContext ctx);

	void enterLegoNxtMotorTurnAngleBrick(CatrobatScriptParser.LegoNxtMotorTurnAngleBrickContext ctx);
	void exitLegoNxtMotorTurnAngleBrick(CatrobatScriptParser.LegoNxtMotorTurnAngleBrickContext ctx);

	void enterHideBrick(CatrobatScriptParser.HideBrickContext ctx);
	void exitHideBrick(CatrobatScriptParser.HideBrickContext ctx);

	void enterRepeatBrick(CatrobatScriptParser.RepeatBrickContext ctx);
	void exitRepeatBrick(CatrobatScriptParser.RepeatBrickContext ctx);

	void enterSpeackBrick(CatrobatScriptParser.SpeackBrickContext ctx);
	void exitSpeackBrick(CatrobatScriptParser.SpeackBrickContext ctx);

	void enterSetXBrick(CatrobatScriptParser.SetXBrickContext ctx);
	void exitSetXBrick(CatrobatScriptParser.SetXBrickContext ctx);

	void enterIfOnEdgeBounceBrick(CatrobatScriptParser.IfOnEdgeBounceBrickContext ctx);
	void exitIfOnEdgeBounceBrick(CatrobatScriptParser.IfOnEdgeBounceBrickContext ctx);

	void enterBrick(CatrobatScriptParser.BrickContext ctx);
	void exitBrick(CatrobatScriptParser.BrickContext ctx);

	void enterPlaySoundBrick(CatrobatScriptParser.PlaySoundBrickContext ctx);
	void exitPlaySoundBrick(CatrobatScriptParser.PlaySoundBrickContext ctx);

	void enterIfLogicElseBrick(CatrobatScriptParser.IfLogicElseBrickContext ctx);
	void exitIfLogicElseBrick(CatrobatScriptParser.IfLogicElseBrickContext ctx);

	void enterIfLogicBeginBrick(CatrobatScriptParser.IfLogicBeginBrickContext ctx);
	void exitIfLogicBeginBrick(CatrobatScriptParser.IfLogicBeginBrickContext ctx);

	void enterSetGhostEffectBrick(CatrobatScriptParser.SetGhostEffectBrickContext ctx);
	void exitSetGhostEffectBrick(CatrobatScriptParser.SetGhostEffectBrickContext ctx);

	void enterToken(CatrobatScriptParser.TokenContext ctx);
	void exitToken(CatrobatScriptParser.TokenContext ctx);

	void enterForeverBrick(CatrobatScriptParser.ForeverBrickContext ctx);
	void exitForeverBrick(CatrobatScriptParser.ForeverBrickContext ctx);

	void enterMotor(CatrobatScriptParser.MotorContext ctx);
	void exitMotor(CatrobatScriptParser.MotorContext ctx);

	void enterChangeYByNBrick(CatrobatScriptParser.ChangeYByNBrickContext ctx);
	void exitChangeYByNBrick(CatrobatScriptParser.ChangeYByNBrickContext ctx);

	void enterChangeXByNBrick(CatrobatScriptParser.ChangeXByNBrickContext ctx);
	void exitChangeXByNBrick(CatrobatScriptParser.ChangeXByNBrickContext ctx);

	void enterGlideToBrick(CatrobatScriptParser.GlideToBrickContext ctx);
	void exitGlideToBrick(CatrobatScriptParser.GlideToBrickContext ctx);

	void enterClearGraficEffectBrick(CatrobatScriptParser.ClearGraficEffectBrickContext ctx);
	void exitClearGraficEffectBrick(CatrobatScriptParser.ClearGraficEffectBrickContext ctx);

	void enterLook(CatrobatScriptParser.LookContext ctx);
	void exitLook(CatrobatScriptParser.LookContext ctx);

	void enterBroadcastBrick(CatrobatScriptParser.BroadcastBrickContext ctx);
	void exitBroadcastBrick(CatrobatScriptParser.BroadcastBrickContext ctx);

	void enterLegoNxtPlayToneBrick(CatrobatScriptParser.LegoNxtPlayToneBrickContext ctx);
	void exitLegoNxtPlayToneBrick(CatrobatScriptParser.LegoNxtPlayToneBrickContext ctx);

	void enterTurnLeftBrick(CatrobatScriptParser.TurnLeftBrickContext ctx);
	void exitTurnLeftBrick(CatrobatScriptParser.TurnLeftBrickContext ctx);

	void enterObjectName(CatrobatScriptParser.ObjectNameContext ctx);
	void exitObjectName(CatrobatScriptParser.ObjectNameContext ctx);

	void enterNoteBrick(CatrobatScriptParser.NoteBrickContext ctx);
	void exitNoteBrick(CatrobatScriptParser.NoteBrickContext ctx);

	void enterWaitBrick(CatrobatScriptParser.WaitBrickContext ctx);
	void exitWaitBrick(CatrobatScriptParser.WaitBrickContext ctx);

	void enterSetVariableBrick(CatrobatScriptParser.SetVariableBrickContext ctx);
	void exitSetVariableBrick(CatrobatScriptParser.SetVariableBrickContext ctx);

	void enterMessage(CatrobatScriptParser.MessageContext ctx);
	void exitMessage(CatrobatScriptParser.MessageContext ctx);

	void enterStartScript(CatrobatScriptParser.StartScriptContext ctx);
	void exitStartScript(CatrobatScriptParser.StartScriptContext ctx);

	void enterChangeSizeByNBrick(CatrobatScriptParser.ChangeSizeByNBrickContext ctx);
	void exitChangeSizeByNBrick(CatrobatScriptParser.ChangeSizeByNBrickContext ctx);

	void enterIfLogicEndBrick(CatrobatScriptParser.IfLogicEndBrickContext ctx);
	void exitIfLogicEndBrick(CatrobatScriptParser.IfLogicEndBrickContext ctx);

	void enterFormula(CatrobatScriptParser.FormulaContext ctx);
	void exitFormula(CatrobatScriptParser.FormulaContext ctx);

	void enterTurnRightBrick(CatrobatScriptParser.TurnRightBrickContext ctx);
	void exitTurnRightBrick(CatrobatScriptParser.TurnRightBrickContext ctx);
}