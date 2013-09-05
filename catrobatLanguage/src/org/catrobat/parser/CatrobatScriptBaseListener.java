// Generated from D:\Users\TDiva\Desktop\GSoC-2013\CatrobatLanguage\CatrobatGrammar\CatrobatScript.g4 by ANTLR 4.0
package org.catrobat.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

import org.catrobat.catroid.common.LookData;
import org.catrobat.catroid.common.SoundInfo;
import org.catrobat.catroid.content.BroadcastScript;
import org.catrobat.catroid.content.Script;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.content.StartScript;
import org.catrobat.catroid.content.WhenScript;
import org.catrobat.catroid.content.bricks.Brick;
import org.catrobat.catroid.content.bricks.BrickBaseType;
import org.catrobat.catroid.content.bricks.BroadcastBrick;
import org.catrobat.catroid.content.bricks.BroadcastWaitBrick;
import org.catrobat.catroid.content.bricks.ChangeBrightnessByNBrick;
import org.catrobat.catroid.content.bricks.ChangeGhostEffectByNBrick;
import org.catrobat.catroid.content.bricks.ChangeSizeByNBrick;
import org.catrobat.catroid.content.bricks.ChangeVariableBrick;
import org.catrobat.catroid.content.bricks.ChangeVolumeByNBrick;
import org.catrobat.catroid.content.bricks.ChangeXByNBrick;
import org.catrobat.catroid.content.bricks.ChangeYByNBrick;
import org.catrobat.catroid.content.bricks.ClearGraphicEffectBrick;
import org.catrobat.catroid.content.bricks.ComeToFrontBrick;
import org.catrobat.catroid.content.bricks.ForeverBrick;
import org.catrobat.catroid.content.bricks.GlideToBrick;
import org.catrobat.catroid.content.bricks.GoNStepsBackBrick;
import org.catrobat.catroid.content.bricks.HideBrick;
import org.catrobat.catroid.content.bricks.IfLogicBeginBrick;
import org.catrobat.catroid.content.bricks.IfLogicElseBrick;
import org.catrobat.catroid.content.bricks.IfLogicEndBrick;
import org.catrobat.catroid.content.bricks.IfOnEdgeBounceBrick;
import org.catrobat.catroid.content.bricks.LegoNxtMotorActionBrick;
import org.catrobat.catroid.content.bricks.LegoNxtMotorStopBrick;
import org.catrobat.catroid.content.bricks.LegoNxtMotorTurnAngleBrick;
import org.catrobat.catroid.content.bricks.LegoNxtPlayToneBrick;
import org.catrobat.catroid.content.bricks.LoopBeginBrick;
import org.catrobat.catroid.content.bricks.LoopEndBrick;
import org.catrobat.catroid.content.bricks.LoopEndlessBrick;
import org.catrobat.catroid.content.bricks.MoveNStepsBrick;
import org.catrobat.catroid.content.bricks.NestingBrick;
import org.catrobat.catroid.content.bricks.NextLookBrick;
import org.catrobat.catroid.content.bricks.NoteBrick;
import org.catrobat.catroid.content.bricks.PlaceAtBrick;
import org.catrobat.catroid.content.bricks.PlaySoundBrick;
import org.catrobat.catroid.content.bricks.PointInDirectionBrick;
import org.catrobat.catroid.content.bricks.PointToBrick;
import org.catrobat.catroid.content.bricks.RepeatBrick;
import org.catrobat.catroid.content.bricks.SetBrightnessBrick;
import org.catrobat.catroid.content.bricks.SetGhostEffectBrick;
import org.catrobat.catroid.content.bricks.SetLookBrick;
import org.catrobat.catroid.content.bricks.SetSizeToBrick;
import org.catrobat.catroid.content.bricks.SetVariableBrick;
import org.catrobat.catroid.content.bricks.SetVolumeToBrick;
import org.catrobat.catroid.content.bricks.SetXBrick;
import org.catrobat.catroid.content.bricks.SetYBrick;
import org.catrobat.catroid.content.bricks.ShowBrick;
import org.catrobat.catroid.content.bricks.SpeakBrick;
import org.catrobat.catroid.content.bricks.StopAllSoundsBrick;
import org.catrobat.catroid.content.bricks.TurnLeftBrick;
import org.catrobat.catroid.content.bricks.TurnRightBrick;
import org.catrobat.catroid.content.bricks.WaitBrick;
import org.catrobat.catroid.formulaeditor.Formula;
import org.catrobat.catroid.formulaeditor.Functions;
import org.catrobat.catroid.formulaeditor.InternFormulaParser;
import org.catrobat.catroid.formulaeditor.InternToken;
import org.catrobat.catroid.formulaeditor.InternTokenType;
import org.catrobat.catroid.formulaeditor.Operators;
import org.catrobat.catroid.formulaeditor.Sensors;
import org.catrobat.catroid.formulaeditor.UserVariable;
         

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class CatrobatScriptBaseListener implements CatrobatScriptListener {
	@Override public void enterGoNStepsBackBrick(CatrobatScriptParser.GoNStepsBackBrickContext ctx) { }
	@Override public void exitGoNStepsBackBrick(CatrobatScriptParser.GoNStepsBackBrickContext ctx) { }

	@Override public void enterUserVariable(CatrobatScriptParser.UserVariableContext ctx) { }
	@Override public void exitUserVariable(CatrobatScriptParser.UserVariableContext ctx) { }

	@Override public void enterBrickList(CatrobatScriptParser.BrickListContext ctx) { }
	@Override public void exitBrickList(CatrobatScriptParser.BrickListContext ctx) { }

	@Override public void enterChangeBrightnessByNBrick(CatrobatScriptParser.ChangeBrightnessByNBrickContext ctx) { }
	@Override public void exitChangeBrightnessByNBrick(CatrobatScriptParser.ChangeBrightnessByNBrickContext ctx) { }

	@Override public void enterPointInDirectionBrick(CatrobatScriptParser.PointInDirectionBrickContext ctx) { }
	@Override public void exitPointInDirectionBrick(CatrobatScriptParser.PointInDirectionBrickContext ctx) { }

	@Override public void enterComeToFrontBrick(CatrobatScriptParser.ComeToFrontBrickContext ctx) { }
	@Override public void exitComeToFrontBrick(CatrobatScriptParser.ComeToFrontBrickContext ctx) { }

	@Override public void enterPointToBrick(CatrobatScriptParser.PointToBrickContext ctx) { }
	@Override public void exitPointToBrick(CatrobatScriptParser.PointToBrickContext ctx) { }

	@Override public void enterLoopEndBrick(CatrobatScriptParser.LoopEndBrickContext ctx) { }
	@Override public void exitLoopEndBrick(CatrobatScriptParser.LoopEndBrickContext ctx) { }

	@Override public void enterWhenScript(CatrobatScriptParser.WhenScriptContext ctx) { }
	@Override public void exitWhenScript(CatrobatScriptParser.WhenScriptContext ctx) { }

	@Override public void enterMoveNStepsBrick(CatrobatScriptParser.MoveNStepsBrickContext ctx) { }
	@Override public void exitMoveNStepsBrick(CatrobatScriptParser.MoveNStepsBrickContext ctx) { }

	@Override public void enterChangeVolumeByNBrick(CatrobatScriptParser.ChangeVolumeByNBrickContext ctx) { }
	@Override public void exitChangeVolumeByNBrick(CatrobatScriptParser.ChangeVolumeByNBrickContext ctx) { }

	@Override public void enterShowBrick(CatrobatScriptParser.ShowBrickContext ctx) { }
	@Override public void exitShowBrick(CatrobatScriptParser.ShowBrickContext ctx) { }

	@Override public void enterAction(CatrobatScriptParser.ActionContext ctx) { }
	@Override public void exitAction(CatrobatScriptParser.ActionContext ctx) { }

	@Override public void enterSetVolumeToBrick(CatrobatScriptParser.SetVolumeToBrickContext ctx) { }
	@Override public void exitSetVolumeToBrick(CatrobatScriptParser.SetVolumeToBrickContext ctx) { }

	@Override public void enterChangeGhostEffectByNBrick(CatrobatScriptParser.ChangeGhostEffectByNBrickContext ctx) { }
	@Override public void exitChangeGhostEffectByNBrick(CatrobatScriptParser.ChangeGhostEffectByNBrickContext ctx) { }

	@Override public void enterSetBrightnessBrick(CatrobatScriptParser.SetBrightnessBrickContext ctx) { }
	@Override public void exitSetBrightnessBrick(CatrobatScriptParser.SetBrightnessBrickContext ctx) { }

	@Override public void enterStopAllSoundsBrick(CatrobatScriptParser.StopAllSoundsBrickContext ctx) { }
	@Override public void exitStopAllSoundsBrick(CatrobatScriptParser.StopAllSoundsBrickContext ctx) { }

	@Override public void enterSetYBrick(CatrobatScriptParser.SetYBrickContext ctx) { }
	@Override public void exitSetYBrick(CatrobatScriptParser.SetYBrickContext ctx) { }

	@Override public void enterNextLookBrick(CatrobatScriptParser.NextLookBrickContext ctx) { }
	@Override public void exitNextLookBrick(CatrobatScriptParser.NextLookBrickContext ctx) { }

	@Override public void enterPlaceAtBrick(CatrobatScriptParser.PlaceAtBrickContext ctx) { }
	@Override public void exitPlaceAtBrick(CatrobatScriptParser.PlaceAtBrickContext ctx) { }

	@Override public void enterBroadcastScript(CatrobatScriptParser.BroadcastScriptContext ctx) { }
	@Override public void exitBroadcastScript(CatrobatScriptParser.BroadcastScriptContext ctx) { }

	@Override public void enterTextField(CatrobatScriptParser.TextFieldContext ctx) { }
	@Override public void exitTextField(CatrobatScriptParser.TextFieldContext ctx) { }

	@Override public void enterBroadcastWaitBrick(CatrobatScriptParser.BroadcastWaitBrickContext ctx) { }
	@Override public void exitBroadcastWaitBrick(CatrobatScriptParser.BroadcastWaitBrickContext ctx) { }

	@Override public void enterSetSizeToBrick(CatrobatScriptParser.SetSizeToBrickContext ctx) { }
	@Override public void exitSetSizeToBrick(CatrobatScriptParser.SetSizeToBrickContext ctx) { }

	@Override public void enterSpeakBrick(CatrobatScriptParser.SpeakBrickContext ctx) { }
	@Override public void exitSpeakBrick(CatrobatScriptParser.SpeakBrickContext ctx) { }

	@Override public void enterChangeVariableBrick(CatrobatScriptParser.ChangeVariableBrickContext ctx) { }
	@Override public void exitChangeVariableBrick(CatrobatScriptParser.ChangeVariableBrickContext ctx) { }

	@Override public void enterLegoNxtMotorStopBrick(CatrobatScriptParser.LegoNxtMotorStopBrickContext ctx) { }
	@Override public void exitLegoNxtMotorStopBrick(CatrobatScriptParser.LegoNxtMotorStopBrickContext ctx) { }

	@Override public void enterLegoNXTMotorActionBrick(CatrobatScriptParser.LegoNXTMotorActionBrickContext ctx) { }
	@Override public void exitLegoNXTMotorActionBrick(CatrobatScriptParser.LegoNXTMotorActionBrickContext ctx) { }

	@Override public void enterSound(CatrobatScriptParser.SoundContext ctx) { }
	@Override public void exitSound(CatrobatScriptParser.SoundContext ctx) { }

	@Override public void enterProgram(CatrobatScriptParser.ProgramContext ctx) { }
	@Override public void exitProgram(CatrobatScriptParser.ProgramContext ctx) { }

	@Override public void enterSetLookBrick(CatrobatScriptParser.SetLookBrickContext ctx) { }
	@Override public void exitSetLookBrick(CatrobatScriptParser.SetLookBrickContext ctx) { }

	@Override public void enterLegoNxtMotorTurnAngleBrick(CatrobatScriptParser.LegoNxtMotorTurnAngleBrickContext ctx) { }
	@Override public void exitLegoNxtMotorTurnAngleBrick(CatrobatScriptParser.LegoNxtMotorTurnAngleBrickContext ctx) { }

	@Override public void enterHideBrick(CatrobatScriptParser.HideBrickContext ctx) { }
	@Override public void exitHideBrick(CatrobatScriptParser.HideBrickContext ctx) { }

	@Override public void enterRepeatBrick(CatrobatScriptParser.RepeatBrickContext ctx) { }
	@Override public void exitRepeatBrick(CatrobatScriptParser.RepeatBrickContext ctx) { }

	@Override public void enterSetXBrick(CatrobatScriptParser.SetXBrickContext ctx) { }
	@Override public void exitSetXBrick(CatrobatScriptParser.SetXBrickContext ctx) { }

	@Override public void enterIfOnEdgeBounceBrick(CatrobatScriptParser.IfOnEdgeBounceBrickContext ctx) { }
	@Override public void exitIfOnEdgeBounceBrick(CatrobatScriptParser.IfOnEdgeBounceBrickContext ctx) { }

	@Override public void enterBrick(CatrobatScriptParser.BrickContext ctx) { }
	@Override public void exitBrick(CatrobatScriptParser.BrickContext ctx) { }

	@Override public void enterPlaySoundBrick(CatrobatScriptParser.PlaySoundBrickContext ctx) { }
	@Override public void exitPlaySoundBrick(CatrobatScriptParser.PlaySoundBrickContext ctx) { }

	@Override public void enterIfLogicElseBrick(CatrobatScriptParser.IfLogicElseBrickContext ctx) { }
	@Override public void exitIfLogicElseBrick(CatrobatScriptParser.IfLogicElseBrickContext ctx) { }

	@Override public void enterIfLogicBeginBrick(CatrobatScriptParser.IfLogicBeginBrickContext ctx) { }
	@Override public void exitIfLogicBeginBrick(CatrobatScriptParser.IfLogicBeginBrickContext ctx) { }

	@Override public void enterSetGhostEffectBrick(CatrobatScriptParser.SetGhostEffectBrickContext ctx) { }
	@Override public void exitSetGhostEffectBrick(CatrobatScriptParser.SetGhostEffectBrickContext ctx) { }

	@Override public void enterToken(CatrobatScriptParser.TokenContext ctx) { }
	@Override public void exitToken(CatrobatScriptParser.TokenContext ctx) { }

	@Override public void enterForeverBrick(CatrobatScriptParser.ForeverBrickContext ctx) { }
	@Override public void exitForeverBrick(CatrobatScriptParser.ForeverBrickContext ctx) { }

	@Override public void enterMotor(CatrobatScriptParser.MotorContext ctx) { }
	@Override public void exitMotor(CatrobatScriptParser.MotorContext ctx) { }

	@Override public void enterChangeYByNBrick(CatrobatScriptParser.ChangeYByNBrickContext ctx) { }
	@Override public void exitChangeYByNBrick(CatrobatScriptParser.ChangeYByNBrickContext ctx) { }

	@Override public void enterChangeXByNBrick(CatrobatScriptParser.ChangeXByNBrickContext ctx) { }
	@Override public void exitChangeXByNBrick(CatrobatScriptParser.ChangeXByNBrickContext ctx) { }

	@Override public void enterGlideToBrick(CatrobatScriptParser.GlideToBrickContext ctx) { }
	@Override public void exitGlideToBrick(CatrobatScriptParser.GlideToBrickContext ctx) { }

	@Override public void enterClearGraficEffectBrick(CatrobatScriptParser.ClearGraficEffectBrickContext ctx) { }
	@Override public void exitClearGraficEffectBrick(CatrobatScriptParser.ClearGraficEffectBrickContext ctx) { }

	@Override public void enterLook(CatrobatScriptParser.LookContext ctx) { }
	@Override public void exitLook(CatrobatScriptParser.LookContext ctx) { }

	@Override public void enterBroadcastBrick(CatrobatScriptParser.BroadcastBrickContext ctx) { }
	@Override public void exitBroadcastBrick(CatrobatScriptParser.BroadcastBrickContext ctx) { }

	@Override public void enterLegoNxtPlayToneBrick(CatrobatScriptParser.LegoNxtPlayToneBrickContext ctx) { }
	@Override public void exitLegoNxtPlayToneBrick(CatrobatScriptParser.LegoNxtPlayToneBrickContext ctx) { }

	@Override public void enterTurnLeftBrick(CatrobatScriptParser.TurnLeftBrickContext ctx) { }
	@Override public void exitTurnLeftBrick(CatrobatScriptParser.TurnLeftBrickContext ctx) { }

	@Override public void enterObjectName(CatrobatScriptParser.ObjectNameContext ctx) { }
	@Override public void exitObjectName(CatrobatScriptParser.ObjectNameContext ctx) { }

	@Override public void enterNoteBrick(CatrobatScriptParser.NoteBrickContext ctx) { }
	@Override public void exitNoteBrick(CatrobatScriptParser.NoteBrickContext ctx) { }

	@Override public void enterWaitBrick(CatrobatScriptParser.WaitBrickContext ctx) { }
	@Override public void exitWaitBrick(CatrobatScriptParser.WaitBrickContext ctx) { }

	@Override public void enterSetVariableBrick(CatrobatScriptParser.SetVariableBrickContext ctx) { }
	@Override public void exitSetVariableBrick(CatrobatScriptParser.SetVariableBrickContext ctx) { }

	@Override public void enterMessage(CatrobatScriptParser.MessageContext ctx) { }
	@Override public void exitMessage(CatrobatScriptParser.MessageContext ctx) { }

	@Override public void enterStartScript(CatrobatScriptParser.StartScriptContext ctx) { }
	@Override public void exitStartScript(CatrobatScriptParser.StartScriptContext ctx) { }

	@Override public void enterChangeSizeByNBrick(CatrobatScriptParser.ChangeSizeByNBrickContext ctx) { }
	@Override public void exitChangeSizeByNBrick(CatrobatScriptParser.ChangeSizeByNBrickContext ctx) { }

	@Override public void enterIfLogicEndBrick(CatrobatScriptParser.IfLogicEndBrickContext ctx) { }
	@Override public void exitIfLogicEndBrick(CatrobatScriptParser.IfLogicEndBrickContext ctx) { }

	@Override public void enterFormula(CatrobatScriptParser.FormulaContext ctx) { }
	@Override public void exitFormula(CatrobatScriptParser.FormulaContext ctx) { }

	@Override public void enterTurnRightBrick(CatrobatScriptParser.TurnRightBrickContext ctx) { }
	@Override public void exitTurnRightBrick(CatrobatScriptParser.TurnRightBrickContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}