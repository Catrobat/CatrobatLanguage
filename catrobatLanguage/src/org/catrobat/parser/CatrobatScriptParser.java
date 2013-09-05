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
         
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CatrobatScriptParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__75=1, T__74=2, T__73=3, T__72=4, T__71=5, T__70=6, T__69=7, T__68=8, 
		T__67=9, T__66=10, T__65=11, T__64=12, T__63=13, T__62=14, T__61=15, T__60=16, 
		T__59=17, T__58=18, T__57=19, T__56=20, T__55=21, T__54=22, T__53=23, 
		T__52=24, T__51=25, T__50=26, T__49=27, T__48=28, T__47=29, T__46=30, 
		T__45=31, T__44=32, T__43=33, T__42=34, T__41=35, T__40=36, T__39=37, 
		T__38=38, T__37=39, T__36=40, T__35=41, T__34=42, T__33=43, T__32=44, 
		T__31=45, T__30=46, T__29=47, T__28=48, T__27=49, T__26=50, T__25=51, 
		T__24=52, T__23=53, T__22=54, T__21=55, T__20=56, T__19=57, T__18=58, 
		T__17=59, T__16=60, T__15=61, T__14=62, T__13=63, T__12=64, T__11=65, 
		T__10=66, T__9=67, T__8=68, T__7=69, T__6=70, T__5=71, T__4=72, T__3=73, 
		T__2=74, T__1=75, T__0=76, USER_VARIABLE=77, NUMBER=78, FUNCTION_NAME=79, 
		OPERATOR=80, SENSOR=81, BRACKET_OPEN=82, BRACKET_CLOSE=83, FUNCTION_PARAMETER_DELIMITER=84, 
		ACTION=85, WS=86;
	public static final String[] tokenNames = {
		"<INVALID>", "'left'", "'stop'", "'Y:'", "'X:'", "'to'", "'I'", "'by'", 
		"'size'", "'sound'", "'next'", "'brightness'", "'%'", "'variable'", "'on'", 
		"'turn'", "'glide'", "'seconds'", "'X'", "'duration:'", "'steps'", "'place'", 
		"'repeat'", "'started'", "'effect'", "'at'", "'back'", "'broadcast'", 
		"'when'", "'direction'", "'edge'", "'move'", "'look'", "'hide'", "'degrees'", 
		"'forever'", "'in'", "'of'", "'receive'", "'if'", "'note'", "'program'", 
		"'change'", "'volume'", "'Y'", "'bounce'", "'set'", "'all'", "'wait'", 
		"'and'", "'speed'", "'else'", "'sounds'", "'motor'", "'true'", "'go'", 
		"'effects'", "'tone'", "'is'", "'NXT'", "'loop'", "'clear'", "'layers'", 
		"'frequency:'", "'ghost'", "'start'", "'come'", "'show'", "'speak'", "'front'", 
		"'right'", "'then'", "'play'", "'switch'", "'graphic'", "'end'", "'point'", 
		"USER_VARIABLE", "NUMBER", "FUNCTION_NAME", "OPERATOR", "SENSOR", "'('", 
		"')'", "','", "'Tapped'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_startScript = 1, RULE_whenScript = 2, RULE_broadcastScript = 3, 
		RULE_brickList = 4, RULE_brick = 5, RULE_broadcastBrick = 6, RULE_broadcastWaitBrick = 7, 
		RULE_changeBrightnessByNBrick = 8, RULE_changeGhostEffectByNBrick = 9, 
		RULE_changeSizeByNBrick = 10, RULE_changeVariableBrick = 11, RULE_changeVolumeByNBrick = 12, 
		RULE_changeXByNBrick = 13, RULE_changeYByNBrick = 14, RULE_clearGraficEffectBrick = 15, 
		RULE_comeToFrontBrick = 16, RULE_foreverBrick = 17, RULE_glideToBrick = 18, 
		RULE_goNStepsBackBrick = 19, RULE_hideBrick = 20, RULE_ifLogicBeginBrick = 21, 
		RULE_ifLogicElseBrick = 22, RULE_ifLogicEndBrick = 23, RULE_ifOnEdgeBounceBrick = 24, 
		RULE_legoNXTMotorActionBrick = 25, RULE_legoNxtMotorStopBrick = 26, RULE_legoNxtMotorTurnAngleBrick = 27, 
		RULE_legoNxtPlayToneBrick = 28, RULE_loopEndBrick = 29, RULE_moveNStepsBrick = 30, 
		RULE_nextLookBrick = 31, RULE_noteBrick = 32, RULE_placeAtBrick = 33, 
		RULE_playSoundBrick = 34, RULE_pointInDirectionBrick = 35, RULE_pointToBrick = 36, 
		RULE_repeatBrick = 37, RULE_setBrightnessBrick = 38, RULE_setGhostEffectBrick = 39, 
		RULE_setLookBrick = 40, RULE_setSizeToBrick = 41, RULE_setVariableBrick = 42, 
		RULE_setVolumeToBrick = 43, RULE_setXBrick = 44, RULE_setYBrick = 45, 
		RULE_showBrick = 46, RULE_speakBrick = 47, RULE_stopAllSoundsBrick = 48, 
		RULE_turnLeftBrick = 49, RULE_turnRightBrick = 50, RULE_waitBrick = 51, 
		RULE_action = 52, RULE_formula = 53, RULE_look = 54, RULE_sound = 55, 
		RULE_objectName = 56, RULE_message = 57, RULE_motor = 58, RULE_textField = 59, 
		RULE_userVariable = 60, RULE_token = 61;
	public static final String[] ruleNames = {
		"program", "startScript", "whenScript", "broadcastScript", "brickList", 
		"brick", "broadcastBrick", "broadcastWaitBrick", "changeBrightnessByNBrick", 
		"changeGhostEffectByNBrick", "changeSizeByNBrick", "changeVariableBrick", 
		"changeVolumeByNBrick", "changeXByNBrick", "changeYByNBrick", "clearGraficEffectBrick", 
		"comeToFrontBrick", "foreverBrick", "glideToBrick", "goNStepsBackBrick", 
		"hideBrick", "ifLogicBeginBrick", "ifLogicElseBrick", "ifLogicEndBrick", 
		"ifOnEdgeBounceBrick", "legoNXTMotorActionBrick", "legoNxtMotorStopBrick", 
		"legoNxtMotorTurnAngleBrick", "legoNxtPlayToneBrick", "loopEndBrick", 
		"moveNStepsBrick", "nextLookBrick", "noteBrick", "placeAtBrick", "playSoundBrick", 
		"pointInDirectionBrick", "pointToBrick", "repeatBrick", "setBrightnessBrick", 
		"setGhostEffectBrick", "setLookBrick", "setSizeToBrick", "setVariableBrick", 
		"setVolumeToBrick", "setXBrick", "setYBrick", "showBrick", "speakBrick", 
		"stopAllSoundsBrick", "turnLeftBrick", "turnRightBrick", "waitBrick", 
		"action", "formula", "look", "sound", "objectName", "message", "motor", 
		"textField", "userVariable", "token"
	};

	@Override
	public String getGrammarFileName() { return "CatrobatScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	private Map<String,UserVariable> variables = new HashMap<String,UserVariable>();

	public Map<String,UserVariable> getVariables() {
	   return variables;
	}

	private List<Script> scriptList;

	public List<Script> getScriptList() {
	   return scriptList;
	}

	private Sprite currentSprite;

	// TODO: set current Sprite
	public void setCurrentSprite(Sprite sprite) {
	  currentSprite = sprite;
	}

	private List<Sprite> spriteList;

	// TODO: set SpriteList
	public void setSpriteList(List<Sprite> spriteList) {
	  this.spriteList = spriteList;
	}

	InternFormulaParser formulaParser;

		private void changeBrick(Script script, Brick oldBrick, Brick newBrick) {
			int index = script.getBrickList().indexOf(oldBrick);
			script.getBrickList().remove(oldBrick);
			script.getBrickList().add(index, newBrick);
		}

		private void setAllInnerBricks() {
			for (Script script : scriptList) {
				Stack<Brick> stack = new Stack<Brick>();
				for (int i=0; i<script.getBrickList().size(); i++) {
					Brick item = script.getBrickList().get(i);
					if (item instanceof NestingBrick) {
						if (item instanceof IfLogicEndBrick) {
							if (stack.peek() instanceof IfLogicBeginBrick) {
								// TODO: if - end
								System.out.println("if-end");
							} else if (stack.peek() instanceof IfLogicElseBrick) {
								Brick elseBrick = stack.pop();

								if (!(stack.peek() instanceof IfLogicBeginBrick)) {
									// TODO: exception with nesting
									System.out.println("exception");
								}
								Brick ifBrick = stack.pop();
								setConditionReferences(item, elseBrick, ifBrick);
							}
						} else if (item instanceof LoopEndBrick) {
							if (stack.peek() instanceof LoopBeginBrick) {
								Brick beginBrick = stack.pop();
								if (beginBrick instanceof ForeverBrick) {
									Brick oldItem = item;
									item = new LoopEndlessBrick();
									changeBrick(script, oldItem, item);
								}
								setLoopReferences(item, beginBrick);
							} else {
								// TODO: exception
								System.out.println("exception");
							}
						} else {
							stack.push(item);
						}
					}
				}
				if (!stack.isEmpty()) {
					// TODO: exception
					System.out.println("exeption");
				}
			}
		}

		private void setConditionReferences(Brick item, Brick elseBrick,
				Brick ifBrick) {
			((IfLogicBeginBrick) ifBrick)
					.setIfElseBrick((IfLogicElseBrick) elseBrick);
			((IfLogicBeginBrick) ifBrick)
					.setIfEndBrick((IfLogicEndBrick) item);

			((IfLogicElseBrick) elseBrick)
					.setIfBeginBrick((IfLogicBeginBrick) ifBrick);
			((IfLogicElseBrick) elseBrick)
					.setIfEndBrick((IfLogicEndBrick) item);

			((IfLogicEndBrick) item)
					.setIfBeginBrick((IfLogicBeginBrick) ifBrick);
			((IfLogicEndBrick) item)
					.setIfElseBrick((IfLogicElseBrick) elseBrick);
		}

		private void setLoopReferences(Brick item, Brick beginBrick) {
			((LoopBeginBrick) beginBrick)
					.setLoopEndBrick((LoopEndBrick) item);
			((LoopEndBrick) item)
					.setLoopBeginBrick((LoopBeginBrick) beginBrick);
		}


	public CatrobatScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StartScriptContext startScript;
		public WhenScriptContext whenScript;
		public BroadcastScriptContext broadcastScript;
		public List<StartScriptContext> startScript() {
			return getRuleContexts(StartScriptContext.class);
		}
		public WhenScriptContext whenScript(int i) {
			return getRuleContext(WhenScriptContext.class,i);
		}
		public List<WhenScriptContext> whenScript() {
			return getRuleContexts(WhenScriptContext.class);
		}
		public List<BroadcastScriptContext> broadcastScript() {
			return getRuleContexts(BroadcastScriptContext.class);
		}
		public BroadcastScriptContext broadcastScript(int i) {
			return getRuleContext(BroadcastScriptContext.class,i);
		}
		public StartScriptContext startScript(int i) {
			return getRuleContext(StartScriptContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		scriptList = new ArrayList<Script>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==28) {
				{
				setState(133);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(124); ((ProgramContext)_localctx).startScript = startScript();
					scriptList.add(((ProgramContext)_localctx).startScript.value);
					}
					break;

				case 2:
					{
					setState(127); ((ProgramContext)_localctx).whenScript = whenScript();
					scriptList.add(((ProgramContext)_localctx).whenScript.value);
					}
					break;

				case 3:
					{
					setState(130); ((ProgramContext)_localctx).broadcastScript = broadcastScript();
					scriptList.add(((ProgramContext)_localctx).broadcastScript.value);
					}
					break;
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			 setAllInnerBricks();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartScriptContext extends ParserRuleContext {
		public Script value;
		public BrickListContext brickList;
		public BrickListContext brickList() {
			return getRuleContext(BrickListContext.class,0);
		}
		public StartScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterStartScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitStartScript(this);
		}
	}

	public final StartScriptContext startScript() throws RecognitionException {
		StartScriptContext _localctx = new StartScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startScript);
		StartScript script = new StartScript();
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138); match(28);
			setState(139); match(41);
			setState(140); match(23);
			}
			setState(142); ((StartScriptContext)_localctx).brickList = brickList();
			script.setBrickList(((StartScriptContext)_localctx).brickList.value);
			       script.setObject(currentSprite);
			}
			((StartScriptContext)_localctx).value =  script;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenScriptContext extends ParserRuleContext {
		public Script value;
		public ActionContext action;
		public BrickListContext brickList;
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public BrickListContext brickList() {
			return getRuleContext(BrickListContext.class,0);
		}
		public WhenScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterWhenScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitWhenScript(this);
		}
	}

	public final WhenScriptContext whenScript() throws RecognitionException {
		WhenScriptContext _localctx = new WhenScriptContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whenScript);
		WhenScript script = new WhenScript();
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145); match(28);
			setState(146); ((WhenScriptContext)_localctx).action = action();
			}
			setState(148); ((WhenScriptContext)_localctx).brickList = brickList();
			script.setAction(((WhenScriptContext)_localctx).action.value);
			       script.setBrickList(((WhenScriptContext)_localctx).brickList.value);
			       script.setObject(currentSprite);
			}
			((WhenScriptContext)_localctx).value =  script;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BroadcastScriptContext extends ParserRuleContext {
		public Script value;
		public MessageContext message;
		public BrickListContext brickList;
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public BrickListContext brickList() {
			return getRuleContext(BrickListContext.class,0);
		}
		public BroadcastScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broadcastScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterBroadcastScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitBroadcastScript(this);
		}
	}

	public final BroadcastScriptContext broadcastScript() throws RecognitionException {
		BroadcastScriptContext _localctx = new BroadcastScriptContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_broadcastScript);
		BroadcastScript script = new BroadcastScript();
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151); match(28);
			setState(152); match(6);
			setState(153); match(38);
			setState(154); ((BroadcastScriptContext)_localctx).message = message();
			}
			setState(156); ((BroadcastScriptContext)_localctx).brickList = brickList();
			script.setReceivedMessage(((BroadcastScriptContext)_localctx).message.value);
			       script.setBrickList(((BroadcastScriptContext)_localctx).brickList.value);
			       script.setObject(currentSprite);
			}
			((BroadcastScriptContext)_localctx).value =  script;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrickListContext extends ParserRuleContext {
		public ArrayList<Brick> value;
		public BrickContext brick;
		public BrickContext brick(int i) {
			return getRuleContext(BrickContext.class,i);
		}
		public List<BrickContext> brick() {
			return getRuleContexts(BrickContext.class);
		}
		public BrickListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brickList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterBrickList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitBrickList(this);
		}
	}

	public final BrickListContext brickList() throws RecognitionException {
		BrickListContext _localctx = new BrickListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_brickList);
		 ArrayList<Brick> brickList = new ArrayList<Brick>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 15) | (1L << 16) | (1L << 21) | (1L << 22) | (1L << 27) | (1L << 31) | (1L << 33) | (1L << 35) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 46) | (1L << 48) | (1L << 51) | (1L << 55) | (1L << 59) | (1L << 61))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (68 - 65)) | (1L << (73 - 65)) | (1L << (75 - 65)) | (1L << (76 - 65)))) != 0)) {
				{
				{
				setState(159); ((BrickListContext)_localctx).brick = brick();
				brickList.add(((BrickListContext)_localctx).brick.value);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			((BrickListContext)_localctx).value =  brickList;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public BroadcastBrickContext broadcastBrick;
		public BroadcastWaitBrickContext broadcastWaitBrick;
		public ChangeBrightnessByNBrickContext changeBrightnessByNBrick;
		public ChangeGhostEffectByNBrickContext changeGhostEffectByNBrick;
		public ChangeSizeByNBrickContext changeSizeByNBrick;
		public ChangeVariableBrickContext changeVariableBrick;
		public ChangeVolumeByNBrickContext changeVolumeByNBrick;
		public ChangeXByNBrickContext changeXByNBrick;
		public ChangeYByNBrickContext changeYByNBrick;
		public ClearGraficEffectBrickContext clearGraficEffectBrick;
		public ComeToFrontBrickContext comeToFrontBrick;
		public ForeverBrickContext foreverBrick;
		public GlideToBrickContext glideToBrick;
		public GoNStepsBackBrickContext goNStepsBackBrick;
		public HideBrickContext hideBrick;
		public IfLogicBeginBrickContext ifLogicBeginBrick;
		public IfLogicElseBrickContext ifLogicElseBrick;
		public IfLogicEndBrickContext ifLogicEndBrick;
		public IfOnEdgeBounceBrickContext ifOnEdgeBounceBrick;
		public LegoNXTMotorActionBrickContext legoNXTMotorActionBrick;
		public LegoNxtMotorStopBrickContext legoNxtMotorStopBrick;
		public LegoNxtMotorTurnAngleBrickContext legoNxtMotorTurnAngleBrick;
		public LegoNxtPlayToneBrickContext legoNxtPlayToneBrick;
		public LoopEndBrickContext loopEndBrick;
		public MoveNStepsBrickContext moveNStepsBrick;
		public NextLookBrickContext nextLookBrick;
		public NoteBrickContext noteBrick;
		public PlaceAtBrickContext placeAtBrick;
		public PlaySoundBrickContext playSoundBrick;
		public PointInDirectionBrickContext pointInDirectionBrick;
		public PointToBrickContext pointToBrick;
		public RepeatBrickContext repeatBrick;
		public SetBrightnessBrickContext setBrightnessBrick;
		public SetGhostEffectBrickContext setGhostEffectBrick;
		public SetLookBrickContext setLookBrick;
		public SetSizeToBrickContext setSizeToBrick;
		public SetVariableBrickContext setVariableBrick;
		public SetVolumeToBrickContext setVolumeToBrick;
		public SetXBrickContext setXBrick;
		public SetYBrickContext setYBrick;
		public ShowBrickContext showBrick;
		public SpeakBrickContext speakBrick;
		public StopAllSoundsBrickContext stopAllSoundsBrick;
		public TurnLeftBrickContext turnLeftBrick;
		public TurnRightBrickContext turnRightBrick;
		public WaitBrickContext waitBrick;
		public SetXBrickContext setXBrick() {
			return getRuleContext(SetXBrickContext.class,0);
		}
		public IfOnEdgeBounceBrickContext ifOnEdgeBounceBrick() {
			return getRuleContext(IfOnEdgeBounceBrickContext.class,0);
		}
		public GoNStepsBackBrickContext goNStepsBackBrick() {
			return getRuleContext(GoNStepsBackBrickContext.class,0);
		}
		public ChangeBrightnessByNBrickContext changeBrightnessByNBrick() {
			return getRuleContext(ChangeBrightnessByNBrickContext.class,0);
		}
		public PointInDirectionBrickContext pointInDirectionBrick() {
			return getRuleContext(PointInDirectionBrickContext.class,0);
		}
		public PlaySoundBrickContext playSoundBrick() {
			return getRuleContext(PlaySoundBrickContext.class,0);
		}
		public PointToBrickContext pointToBrick() {
			return getRuleContext(PointToBrickContext.class,0);
		}
		public ComeToFrontBrickContext comeToFrontBrick() {
			return getRuleContext(ComeToFrontBrickContext.class,0);
		}
		public LoopEndBrickContext loopEndBrick() {
			return getRuleContext(LoopEndBrickContext.class,0);
		}
		public IfLogicElseBrickContext ifLogicElseBrick() {
			return getRuleContext(IfLogicElseBrickContext.class,0);
		}
		public SetGhostEffectBrickContext setGhostEffectBrick() {
			return getRuleContext(SetGhostEffectBrickContext.class,0);
		}
		public MoveNStepsBrickContext moveNStepsBrick() {
			return getRuleContext(MoveNStepsBrickContext.class,0);
		}
		public IfLogicBeginBrickContext ifLogicBeginBrick() {
			return getRuleContext(IfLogicBeginBrickContext.class,0);
		}
		public ForeverBrickContext foreverBrick() {
			return getRuleContext(ForeverBrickContext.class,0);
		}
		public ChangeVolumeByNBrickContext changeVolumeByNBrick() {
			return getRuleContext(ChangeVolumeByNBrickContext.class,0);
		}
		public ShowBrickContext showBrick() {
			return getRuleContext(ShowBrickContext.class,0);
		}
		public ChangeYByNBrickContext changeYByNBrick() {
			return getRuleContext(ChangeYByNBrickContext.class,0);
		}
		public SetVolumeToBrickContext setVolumeToBrick() {
			return getRuleContext(SetVolumeToBrickContext.class,0);
		}
		public ChangeXByNBrickContext changeXByNBrick() {
			return getRuleContext(ChangeXByNBrickContext.class,0);
		}
		public GlideToBrickContext glideToBrick() {
			return getRuleContext(GlideToBrickContext.class,0);
		}
		public ChangeGhostEffectByNBrickContext changeGhostEffectByNBrick() {
			return getRuleContext(ChangeGhostEffectByNBrickContext.class,0);
		}
		public SetBrightnessBrickContext setBrightnessBrick() {
			return getRuleContext(SetBrightnessBrickContext.class,0);
		}
		public ClearGraficEffectBrickContext clearGraficEffectBrick() {
			return getRuleContext(ClearGraficEffectBrickContext.class,0);
		}
		public StopAllSoundsBrickContext stopAllSoundsBrick() {
			return getRuleContext(StopAllSoundsBrickContext.class,0);
		}
		public BroadcastBrickContext broadcastBrick() {
			return getRuleContext(BroadcastBrickContext.class,0);
		}
		public LegoNxtPlayToneBrickContext legoNxtPlayToneBrick() {
			return getRuleContext(LegoNxtPlayToneBrickContext.class,0);
		}
		public TurnLeftBrickContext turnLeftBrick() {
			return getRuleContext(TurnLeftBrickContext.class,0);
		}
		public SetYBrickContext setYBrick() {
			return getRuleContext(SetYBrickContext.class,0);
		}
		public NextLookBrickContext nextLookBrick() {
			return getRuleContext(NextLookBrickContext.class,0);
		}
		public PlaceAtBrickContext placeAtBrick() {
			return getRuleContext(PlaceAtBrickContext.class,0);
		}
		public NoteBrickContext noteBrick() {
			return getRuleContext(NoteBrickContext.class,0);
		}
		public BroadcastWaitBrickContext broadcastWaitBrick() {
			return getRuleContext(BroadcastWaitBrickContext.class,0);
		}
		public SpeakBrickContext speakBrick() {
			return getRuleContext(SpeakBrickContext.class,0);
		}
		public SetSizeToBrickContext setSizeToBrick() {
			return getRuleContext(SetSizeToBrickContext.class,0);
		}
		public WaitBrickContext waitBrick() {
			return getRuleContext(WaitBrickContext.class,0);
		}
		public ChangeVariableBrickContext changeVariableBrick() {
			return getRuleContext(ChangeVariableBrickContext.class,0);
		}
		public SetVariableBrickContext setVariableBrick() {
			return getRuleContext(SetVariableBrickContext.class,0);
		}
		public LegoNxtMotorStopBrickContext legoNxtMotorStopBrick() {
			return getRuleContext(LegoNxtMotorStopBrickContext.class,0);
		}
		public ChangeSizeByNBrickContext changeSizeByNBrick() {
			return getRuleContext(ChangeSizeByNBrickContext.class,0);
		}
		public LegoNXTMotorActionBrickContext legoNXTMotorActionBrick() {
			return getRuleContext(LegoNXTMotorActionBrickContext.class,0);
		}
		public IfLogicEndBrickContext ifLogicEndBrick() {
			return getRuleContext(IfLogicEndBrickContext.class,0);
		}
		public SetLookBrickContext setLookBrick() {
			return getRuleContext(SetLookBrickContext.class,0);
		}
		public LegoNxtMotorTurnAngleBrickContext legoNxtMotorTurnAngleBrick() {
			return getRuleContext(LegoNxtMotorTurnAngleBrickContext.class,0);
		}
		public RepeatBrickContext repeatBrick() {
			return getRuleContext(RepeatBrickContext.class,0);
		}
		public HideBrickContext hideBrick() {
			return getRuleContext(HideBrickContext.class,0);
		}
		public TurnRightBrickContext turnRightBrick() {
			return getRuleContext(TurnRightBrickContext.class,0);
		}
		public BrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitBrick(this);
		}
	}

	public final BrickContext brick() throws RecognitionException {
		BrickContext _localctx = new BrickContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_brick);
		try {
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167); ((BrickContext)_localctx).broadcastBrick = broadcastBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).broadcastBrick.value;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); ((BrickContext)_localctx).broadcastWaitBrick = broadcastWaitBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).broadcastWaitBrick.value;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); ((BrickContext)_localctx).changeBrightnessByNBrick = changeBrightnessByNBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).changeBrightnessByNBrick.value;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176); ((BrickContext)_localctx).changeGhostEffectByNBrick = changeGhostEffectByNBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).changeGhostEffectByNBrick.value;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179); ((BrickContext)_localctx).changeSizeByNBrick = changeSizeByNBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).changeSizeByNBrick.value;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182); ((BrickContext)_localctx).changeVariableBrick = changeVariableBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).changeVariableBrick.value;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185); ((BrickContext)_localctx).changeVolumeByNBrick = changeVolumeByNBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).changeVolumeByNBrick.value;
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(188); ((BrickContext)_localctx).changeXByNBrick = changeXByNBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).changeXByNBrick.value;
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(191); ((BrickContext)_localctx).changeYByNBrick = changeYByNBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).changeYByNBrick.value;
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(194); ((BrickContext)_localctx).clearGraficEffectBrick = clearGraficEffectBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).clearGraficEffectBrick.value;
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(197); ((BrickContext)_localctx).comeToFrontBrick = comeToFrontBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).comeToFrontBrick.value;
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(200); ((BrickContext)_localctx).foreverBrick = foreverBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).foreverBrick.value;
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(203); ((BrickContext)_localctx).glideToBrick = glideToBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).glideToBrick.value;
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(206); ((BrickContext)_localctx).goNStepsBackBrick = goNStepsBackBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).goNStepsBackBrick.value;
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(209); ((BrickContext)_localctx).hideBrick = hideBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).hideBrick.value;
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(212); ((BrickContext)_localctx).ifLogicBeginBrick = ifLogicBeginBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).ifLogicBeginBrick.value;
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(215); ((BrickContext)_localctx).ifLogicElseBrick = ifLogicElseBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).ifLogicElseBrick.value;
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(218); ((BrickContext)_localctx).ifLogicEndBrick = ifLogicEndBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).ifLogicEndBrick.value;
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(221); ((BrickContext)_localctx).ifOnEdgeBounceBrick = ifOnEdgeBounceBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).ifOnEdgeBounceBrick.value;
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(224); ((BrickContext)_localctx).legoNXTMotorActionBrick = legoNXTMotorActionBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).legoNXTMotorActionBrick.value;
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(227); ((BrickContext)_localctx).legoNxtMotorStopBrick = legoNxtMotorStopBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).legoNxtMotorStopBrick.value;
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(230); ((BrickContext)_localctx).legoNxtMotorTurnAngleBrick = legoNxtMotorTurnAngleBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).legoNxtMotorTurnAngleBrick.value;
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(233); ((BrickContext)_localctx).legoNxtPlayToneBrick = legoNxtPlayToneBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).legoNxtPlayToneBrick.value;
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(236); ((BrickContext)_localctx).loopEndBrick = loopEndBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).loopEndBrick.value;
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(239); ((BrickContext)_localctx).moveNStepsBrick = moveNStepsBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).moveNStepsBrick.value;
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(242); ((BrickContext)_localctx).nextLookBrick = nextLookBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).nextLookBrick.value;
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(245); ((BrickContext)_localctx).noteBrick = noteBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).noteBrick.value;
				}
				break;

			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(248); ((BrickContext)_localctx).placeAtBrick = placeAtBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).placeAtBrick.value;
				}
				break;

			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(251); ((BrickContext)_localctx).playSoundBrick = playSoundBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).playSoundBrick.value;
				}
				break;

			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(254); ((BrickContext)_localctx).pointInDirectionBrick = pointInDirectionBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).pointInDirectionBrick.value;
				}
				break;

			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(257); ((BrickContext)_localctx).pointToBrick = pointToBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).pointToBrick.value;
				}
				break;

			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(260); ((BrickContext)_localctx).repeatBrick = repeatBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).repeatBrick.value;
				}
				break;

			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(263); ((BrickContext)_localctx).setBrightnessBrick = setBrightnessBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).setBrightnessBrick.value;
				}
				break;

			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(266); ((BrickContext)_localctx).setGhostEffectBrick = setGhostEffectBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).setGhostEffectBrick.value;
				}
				break;

			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(269); ((BrickContext)_localctx).setLookBrick = setLookBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).setLookBrick.value;
				}
				break;

			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(272); ((BrickContext)_localctx).setSizeToBrick = setSizeToBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).setSizeToBrick.value;
				}
				break;

			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(275); ((BrickContext)_localctx).setVariableBrick = setVariableBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).setVariableBrick.value;
				}
				break;

			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(278); ((BrickContext)_localctx).setVolumeToBrick = setVolumeToBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).setVolumeToBrick.value;
				}
				break;

			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(281); ((BrickContext)_localctx).setXBrick = setXBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).setXBrick.value;
				}
				break;

			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(284); ((BrickContext)_localctx).setYBrick = setYBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).setYBrick.value;
				}
				break;

			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(287); ((BrickContext)_localctx).showBrick = showBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).showBrick.value;
				}
				break;

			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(290); ((BrickContext)_localctx).speakBrick = speakBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).speakBrick.value;
				}
				break;

			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(293); ((BrickContext)_localctx).stopAllSoundsBrick = stopAllSoundsBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).stopAllSoundsBrick.value;
				}
				break;

			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(296); ((BrickContext)_localctx).turnLeftBrick = turnLeftBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).turnLeftBrick.value;
				}
				break;

			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(299); ((BrickContext)_localctx).turnRightBrick = turnRightBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).turnRightBrick.value;
				}
				break;

			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(302); ((BrickContext)_localctx).waitBrick = waitBrick();
				((BrickContext)_localctx).value =  ((BrickContext)_localctx).waitBrick.value;
				}
				break;
			}
			 _localctx.value.setSprite(currentSprite);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BroadcastBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public MessageContext message;
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public BroadcastBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broadcastBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterBroadcastBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitBroadcastBrick(this);
		}
	}

	public final BroadcastBrickContext broadcastBrick() throws RecognitionException {
		BroadcastBrickContext _localctx = new BroadcastBrickContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_broadcastBrick);
		 BroadcastBrick brick = new BroadcastBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(27);
			setState(308); ((BroadcastBrickContext)_localctx).message = message();
			brick.setBroadcastMessage(((BroadcastBrickContext)_localctx).message.value);
			}
			 ((BroadcastBrickContext)_localctx).value =  brick; 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BroadcastWaitBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public MessageContext message;
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public BroadcastWaitBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broadcastWaitBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterBroadcastWaitBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitBroadcastWaitBrick(this);
		}
	}

	public final BroadcastWaitBrickContext broadcastWaitBrick() throws RecognitionException {
		BroadcastWaitBrickContext _localctx = new BroadcastWaitBrickContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_broadcastWaitBrick);
		BroadcastWaitBrick brick = new BroadcastWaitBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(27);
			setState(312); match(49);
			setState(313); match(48);
			setState(314); ((BroadcastWaitBrickContext)_localctx).message = message();
			brick.setBroadcastMessage(((BroadcastWaitBrickContext)_localctx).message.value);
			}
			((BroadcastWaitBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeBrightnessByNBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ChangeBrightnessByNBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeBrightnessByNBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterChangeBrightnessByNBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitChangeBrightnessByNBrick(this);
		}
	}

	public final ChangeBrightnessByNBrickContext changeBrightnessByNBrick() throws RecognitionException {
		ChangeBrightnessByNBrickContext _localctx = new ChangeBrightnessByNBrickContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_changeBrightnessByNBrick);
		ChangeBrightnessByNBrick brick = new ChangeBrightnessByNBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); match(42);
			setState(318); match(11);
			setState(319); match(7);
			setState(320); ((ChangeBrightnessByNBrickContext)_localctx).formula = formula();
			setState(321); match(12);
			brick.setChangeBrightness(((ChangeBrightnessByNBrickContext)_localctx).formula.value);
			}
			((ChangeBrightnessByNBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeGhostEffectByNBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ChangeGhostEffectByNBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeGhostEffectByNBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterChangeGhostEffectByNBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitChangeGhostEffectByNBrick(this);
		}
	}

	public final ChangeGhostEffectByNBrickContext changeGhostEffectByNBrick() throws RecognitionException {
		ChangeGhostEffectByNBrickContext _localctx = new ChangeGhostEffectByNBrickContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_changeGhostEffectByNBrick);
		ChangeGhostEffectByNBrick brick = new ChangeGhostEffectByNBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(42);
			setState(325); match(64);
			setState(326); match(24);
			setState(327); match(7);
			setState(328); ((ChangeGhostEffectByNBrickContext)_localctx).formula = formula();
			setState(329); match(12);
			brick.setChangeGhostEffect(((ChangeGhostEffectByNBrickContext)_localctx).formula.value);
			}
			((ChangeGhostEffectByNBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeSizeByNBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ChangeSizeByNBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeSizeByNBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterChangeSizeByNBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitChangeSizeByNBrick(this);
		}
	}

	public final ChangeSizeByNBrickContext changeSizeByNBrick() throws RecognitionException {
		ChangeSizeByNBrickContext _localctx = new ChangeSizeByNBrickContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_changeSizeByNBrick);
		ChangeSizeByNBrick brick = new ChangeSizeByNBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(42);
			setState(333); match(8);
			setState(334); match(7);
			setState(335); ((ChangeSizeByNBrickContext)_localctx).formula = formula();
			setState(336); match(12);
			brick.setSize(((ChangeSizeByNBrickContext)_localctx).formula.value);
			}
			((ChangeSizeByNBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeVariableBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public UserVariableContext userVariable;
		public FormulaContext formula;
		public UserVariableContext userVariable() {
			return getRuleContext(UserVariableContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ChangeVariableBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeVariableBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterChangeVariableBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitChangeVariableBrick(this);
		}
	}

	public final ChangeVariableBrickContext changeVariableBrick() throws RecognitionException {
		ChangeVariableBrickContext _localctx = new ChangeVariableBrickContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_changeVariableBrick);
		ChangeVariableBrick brick = new ChangeVariableBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(42);
			setState(340); match(13);
			setState(341); ((ChangeVariableBrickContext)_localctx).userVariable = userVariable();
			brick.setUserVariable(((ChangeVariableBrickContext)_localctx).userVariable.value);
			setState(343); match(7);
			setState(344); ((ChangeVariableBrickContext)_localctx).formula = formula();
			brick.setVariableFormula(((ChangeVariableBrickContext)_localctx).formula.value);
			}
			((ChangeVariableBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeVolumeByNBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ChangeVolumeByNBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeVolumeByNBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterChangeVolumeByNBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitChangeVolumeByNBrick(this);
		}
	}

	public final ChangeVolumeByNBrickContext changeVolumeByNBrick() throws RecognitionException {
		ChangeVolumeByNBrickContext _localctx = new ChangeVolumeByNBrickContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_changeVolumeByNBrick);
		ChangeVolumeByNBrick brick = new ChangeVolumeByNBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(42);
			setState(348); match(43);
			setState(349); match(7);
			setState(350); ((ChangeVolumeByNBrickContext)_localctx).formula = formula();
			setState(351); match(12);
			brick.setVolume(((ChangeVolumeByNBrickContext)_localctx).formula.value);
			}
			((ChangeVolumeByNBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeXByNBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ChangeXByNBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeXByNBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterChangeXByNBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitChangeXByNBrick(this);
		}
	}

	public final ChangeXByNBrickContext changeXByNBrick() throws RecognitionException {
		ChangeXByNBrickContext _localctx = new ChangeXByNBrickContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_changeXByNBrick);
		ChangeXByNBrick brick = new ChangeXByNBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(42);
			setState(355); match(18);
			setState(356); match(7);
			setState(357); ((ChangeXByNBrickContext)_localctx).formula = formula();
			brick.setxMovement(((ChangeXByNBrickContext)_localctx).formula.value);
			}
			((ChangeXByNBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeYByNBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ChangeYByNBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeYByNBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterChangeYByNBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitChangeYByNBrick(this);
		}
	}

	public final ChangeYByNBrickContext changeYByNBrick() throws RecognitionException {
		ChangeYByNBrickContext _localctx = new ChangeYByNBrickContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_changeYByNBrick);
		ChangeYByNBrick brick = new ChangeYByNBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(42);
			setState(361); match(44);
			setState(362); match(7);
			setState(363); ((ChangeYByNBrickContext)_localctx).formula = formula();
			brick.setyMovement(((ChangeYByNBrickContext)_localctx).formula.value);
			}
			((ChangeYByNBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClearGraficEffectBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public ClearGraficEffectBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearGraficEffectBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterClearGraficEffectBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitClearGraficEffectBrick(this);
		}
	}

	public final ClearGraficEffectBrickContext clearGraficEffectBrick() throws RecognitionException {
		ClearGraficEffectBrickContext _localctx = new ClearGraficEffectBrickContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_clearGraficEffectBrick);
		ClearGraphicEffectBrick brick = new ClearGraphicEffectBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(61);
			setState(367); match(74);
			setState(368); match(56);
			}
			((ClearGraficEffectBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComeToFrontBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public ComeToFrontBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comeToFrontBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterComeToFrontBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitComeToFrontBrick(this);
		}
	}

	public final ComeToFrontBrickContext comeToFrontBrick() throws RecognitionException {
		ComeToFrontBrickContext _localctx = new ComeToFrontBrickContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comeToFrontBrick);
		ComeToFrontBrick brick = new ComeToFrontBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(66);
			setState(371); match(5);
			setState(372); match(69);
			}
			((ComeToFrontBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeverBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public ForeverBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreverBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterForeverBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitForeverBrick(this);
		}
	}

	public final ForeverBrickContext foreverBrick() throws RecognitionException {
		ForeverBrickContext _localctx = new ForeverBrickContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_foreverBrick);
		ForeverBrick brick = new ForeverBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(35);
			}
			((ForeverBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlideToBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext s;
		public FormulaContext x;
		public FormulaContext y;
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public GlideToBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glideToBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterGlideToBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitGlideToBrick(this);
		}
	}

	public final GlideToBrickContext glideToBrick() throws RecognitionException {
		GlideToBrickContext _localctx = new GlideToBrickContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_glideToBrick);
		GlideToBrick brick = new GlideToBrick();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(16);
			setState(377); ((GlideToBrickContext)_localctx).s = formula();
			brick.setDurationInSeconds(((GlideToBrickContext)_localctx).s.value);
			setState(379); match(17);
			setState(380); match(5);
			setState(381); match(4);
			setState(382); ((GlideToBrickContext)_localctx).x = formula();
			brick.setxDestination(((GlideToBrickContext)_localctx).x.value);
			setState(385);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(384); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(387); match(3);
			setState(388); ((GlideToBrickContext)_localctx).y = formula();
			brick.setyDestination(((GlideToBrickContext)_localctx).y.value);
			}
			((GlideToBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoNStepsBackBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public GoNStepsBackBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goNStepsBackBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterGoNStepsBackBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitGoNStepsBackBrick(this);
		}
	}

	public final GoNStepsBackBrickContext goNStepsBackBrick() throws RecognitionException {
		GoNStepsBackBrickContext _localctx = new GoNStepsBackBrickContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_goNStepsBackBrick);
		GoNStepsBackBrick brick = new GoNStepsBackBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(55);
			setState(392); match(26);
			setState(393); ((GoNStepsBackBrickContext)_localctx).formula = formula();
			setState(394); match(62);
			brick.setSteps(((GoNStepsBackBrickContext)_localctx).formula.value);
			}
			((GoNStepsBackBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HideBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public HideBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hideBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterHideBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitHideBrick(this);
		}
	}

	public final HideBrickContext hideBrick() throws RecognitionException {
		HideBrickContext _localctx = new HideBrickContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hideBrick);
		HideBrick brick = new HideBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(33);
			}
			((HideBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLogicBeginBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public IfLogicBeginBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLogicBeginBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterIfLogicBeginBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitIfLogicBeginBrick(this);
		}
	}

	public final IfLogicBeginBrickContext ifLogicBeginBrick() throws RecognitionException {
		IfLogicBeginBrickContext _localctx = new IfLogicBeginBrickContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifLogicBeginBrick);
		IfLogicBeginBrick brick = new IfLogicBeginBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(39);
			setState(400); ((IfLogicBeginBrickContext)_localctx).formula = formula();
			setState(401); match(58);
			setState(402); match(54);
			setState(403); match(71);
			brick.setIfCondition(((IfLogicBeginBrickContext)_localctx).formula.value);
			}
			((IfLogicBeginBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLogicElseBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public IfLogicElseBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLogicElseBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterIfLogicElseBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitIfLogicElseBrick(this);
		}
	}

	public final IfLogicElseBrickContext ifLogicElseBrick() throws RecognitionException {
		IfLogicElseBrickContext _localctx = new IfLogicElseBrickContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifLogicElseBrick);
		IfLogicElseBrick brick = new IfLogicElseBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(51);
			}
			((IfLogicElseBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLogicEndBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public IfLogicEndBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLogicEndBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterIfLogicEndBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitIfLogicEndBrick(this);
		}
	}

	public final IfLogicEndBrickContext ifLogicEndBrick() throws RecognitionException {
		IfLogicEndBrickContext _localctx = new IfLogicEndBrickContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifLogicEndBrick);
		IfLogicEndBrick brick = new IfLogicEndBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); match(75);
			setState(409); match(39);
			}
			((IfLogicEndBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfOnEdgeBounceBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public IfOnEdgeBounceBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifOnEdgeBounceBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterIfOnEdgeBounceBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitIfOnEdgeBounceBrick(this);
		}
	}

	public final IfOnEdgeBounceBrickContext ifOnEdgeBounceBrick() throws RecognitionException {
		IfOnEdgeBounceBrickContext _localctx = new IfOnEdgeBounceBrickContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifOnEdgeBounceBrick);
		IfOnEdgeBounceBrick brick = new IfOnEdgeBounceBrick();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(39);
			setState(412); match(14);
			setState(413); match(30);
			setState(415);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(414); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(417); match(45);
			}
			((IfOnEdgeBounceBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegoNXTMotorActionBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public MotorContext motor;
		public FormulaContext formula;
		public MotorContext motor() {
			return getRuleContext(MotorContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public LegoNXTMotorActionBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legoNXTMotorActionBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterLegoNXTMotorActionBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitLegoNXTMotorActionBrick(this);
		}
	}

	public final LegoNXTMotorActionBrickContext legoNXTMotorActionBrick() throws RecognitionException {
		LegoNXTMotorActionBrickContext _localctx = new LegoNXTMotorActionBrickContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_legoNXTMotorActionBrick);
		LegoNxtMotorActionBrick brick = new LegoNxtMotorActionBrick();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(59);
			setState(420); match(31);
			setState(421); match(53);
			setState(422); ((LegoNXTMotorActionBrickContext)_localctx).motor = motor();
			brick.setMotor(((LegoNXTMotorActionBrickContext)_localctx).motor.value);
			setState(425);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(424); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(427); match(50);
			setState(428); ((LegoNXTMotorActionBrickContext)_localctx).formula = formula();
			brick.setSpeed(((LegoNXTMotorActionBrickContext)_localctx).formula.value);
			}
			((LegoNXTMotorActionBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegoNxtMotorStopBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public MotorContext motor;
		public MotorContext motor() {
			return getRuleContext(MotorContext.class,0);
		}
		public LegoNxtMotorStopBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legoNxtMotorStopBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterLegoNxtMotorStopBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitLegoNxtMotorStopBrick(this);
		}
	}

	public final LegoNxtMotorStopBrickContext legoNxtMotorStopBrick() throws RecognitionException {
		LegoNxtMotorStopBrickContext _localctx = new LegoNxtMotorStopBrickContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_legoNxtMotorStopBrick);
		LegoNxtMotorStopBrick brick = new LegoNxtMotorStopBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); match(59);
			setState(432); match(2);
			setState(433); match(53);
			setState(434); ((LegoNxtMotorStopBrickContext)_localctx).motor = motor();
			brick.setMotor(((LegoNxtMotorStopBrickContext)_localctx).motor.value);
			}
			((LegoNxtMotorStopBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegoNxtMotorTurnAngleBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public MotorContext motor;
		public FormulaContext formula;
		public MotorContext motor() {
			return getRuleContext(MotorContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public LegoNxtMotorTurnAngleBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legoNxtMotorTurnAngleBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterLegoNxtMotorTurnAngleBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitLegoNxtMotorTurnAngleBrick(this);
		}
	}

	public final LegoNxtMotorTurnAngleBrickContext legoNxtMotorTurnAngleBrick() throws RecognitionException {
		LegoNxtMotorTurnAngleBrickContext _localctx = new LegoNxtMotorTurnAngleBrickContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_legoNxtMotorTurnAngleBrick);
		LegoNxtMotorTurnAngleBrick brick = new LegoNxtMotorTurnAngleBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(59);
			setState(438); match(15);
			setState(439); match(53);
			setState(440); ((LegoNxtMotorTurnAngleBrickContext)_localctx).motor = motor();
			brick.setMotor(((LegoNxtMotorTurnAngleBrickContext)_localctx).motor.value);
			setState(442); match(5);
			setState(443); ((LegoNxtMotorTurnAngleBrickContext)_localctx).formula = formula();
			brick.setDegrees(((LegoNxtMotorTurnAngleBrickContext)_localctx).formula.value);
			setState(445); match(34);
			}
			((LegoNxtMotorTurnAngleBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegoNxtPlayToneBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext f;
		public FormulaContext d;
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public LegoNxtPlayToneBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legoNxtPlayToneBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterLegoNxtPlayToneBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitLegoNxtPlayToneBrick(this);
		}
	}

	public final LegoNxtPlayToneBrickContext legoNxtPlayToneBrick() throws RecognitionException {
		LegoNxtPlayToneBrickContext _localctx = new LegoNxtPlayToneBrickContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_legoNxtPlayToneBrick);
		LegoNxtPlayToneBrick brick = new LegoNxtPlayToneBrick();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); match(59);
			setState(448); match(72);
			setState(449); match(57);
			setState(451);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(450); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(453); match(63);
			setState(454); ((LegoNxtPlayToneBrickContext)_localctx).f = formula();
			brick.setFrequency(((LegoNxtPlayToneBrickContext)_localctx).f.value);
			setState(457);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(456); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(459); match(19);
			setState(460); ((LegoNxtPlayToneBrickContext)_localctx).d = formula();
			brick.setDurationInSeconds(((LegoNxtPlayToneBrickContext)_localctx).d.value);
			setState(462); match(17);
			}
			((LegoNxtPlayToneBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopEndBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public LoopEndBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopEndBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterLoopEndBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitLoopEndBrick(this);
		}
	}

	public final LoopEndBrickContext loopEndBrick() throws RecognitionException {
		LoopEndBrickContext _localctx = new LoopEndBrickContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loopEndBrick);
		LoopEndBrick brick = new LoopEndBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(75);
			setState(465); match(37);
			setState(466); match(60);
			}
			((LoopEndBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoveNStepsBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public MoveNStepsBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveNStepsBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterMoveNStepsBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitMoveNStepsBrick(this);
		}
	}

	public final MoveNStepsBrickContext moveNStepsBrick() throws RecognitionException {
		MoveNStepsBrickContext _localctx = new MoveNStepsBrickContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_moveNStepsBrick);
		MoveNStepsBrick brick = new MoveNStepsBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); match(31);
			setState(469); ((MoveNStepsBrickContext)_localctx).formula = formula();
			setState(470); match(20);
			brick.setSteps(((MoveNStepsBrickContext)_localctx).formula.value);
			}
			((MoveNStepsBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NextLookBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public NextLookBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextLookBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterNextLookBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitNextLookBrick(this);
		}
	}

	public final NextLookBrickContext nextLookBrick() throws RecognitionException {
		NextLookBrickContext _localctx = new NextLookBrickContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nextLookBrick);
		NextLookBrick brick = new NextLookBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); match(10);
			setState(474); match(32);
			}
			((NextLookBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public TextFieldContext textField;
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public NoteBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterNoteBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitNoteBrick(this);
		}
	}

	public final NoteBrickContext noteBrick() throws RecognitionException {
		NoteBrickContext _localctx = new NoteBrickContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_noteBrick);
		NoteBrick brick = new NoteBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); match(40);
			setState(477); ((NoteBrickContext)_localctx).textField = textField();
			brick.setNote(((NoteBrickContext)_localctx).textField.value);
			}
			((NoteBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceAtBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext x;
		public FormulaContext y;
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public PlaceAtBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeAtBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterPlaceAtBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitPlaceAtBrick(this);
		}
	}

	public final PlaceAtBrickContext placeAtBrick() throws RecognitionException {
		PlaceAtBrickContext _localctx = new PlaceAtBrickContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_placeAtBrick);
		PlaceAtBrick brick = new PlaceAtBrick();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); match(21);
			setState(481); match(25);
			setState(482); match(4);
			setState(483); ((PlaceAtBrickContext)_localctx).x = formula();
			brick.setxPosition(((PlaceAtBrickContext)_localctx).x.value);
			setState(486);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(485); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(488); match(3);
			setState(489); ((PlaceAtBrickContext)_localctx).y = formula();
			brick.setyPosition(((PlaceAtBrickContext)_localctx).y.value);
			}
			((PlaceAtBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaySoundBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public SoundContext sound;
		public SoundContext sound() {
			return getRuleContext(SoundContext.class,0);
		}
		public PlaySoundBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playSoundBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterPlaySoundBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitPlaySoundBrick(this);
		}
	}

	public final PlaySoundBrickContext playSoundBrick() throws RecognitionException {
		PlaySoundBrickContext _localctx = new PlaySoundBrickContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_playSoundBrick);
		PlaySoundBrick brick = new PlaySoundBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(65);
			setState(493); match(9);
			setState(494); ((PlaySoundBrickContext)_localctx).sound = sound();
			brick.setSound(((PlaySoundBrickContext)_localctx).sound.value);
			}
			((PlaySoundBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointInDirectionBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PointInDirectionBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointInDirectionBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterPointInDirectionBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitPointInDirectionBrick(this);
		}
	}

	public final PointInDirectionBrickContext pointInDirectionBrick() throws RecognitionException {
		PointInDirectionBrickContext _localctx = new PointInDirectionBrickContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pointInDirectionBrick);
		PointInDirectionBrick brick = new PointInDirectionBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); match(76);
			setState(498); match(36);
			setState(499); match(29);
			setState(500); ((PointInDirectionBrickContext)_localctx).formula = formula();
			setState(501); match(34);
			brick.setDegrees(((PointInDirectionBrickContext)_localctx).formula.value);
			}
			((PointInDirectionBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointToBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public ObjectNameContext objectName;
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public PointToBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointToBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterPointToBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitPointToBrick(this);
		}
	}

	public final PointToBrickContext pointToBrick() throws RecognitionException {
		PointToBrickContext _localctx = new PointToBrickContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pointToBrick);
		PointToBrick brick = new PointToBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504); match(76);
			setState(505); match(5);
			setState(506); ((PointToBrickContext)_localctx).objectName = objectName();
			brick.setPointedObject(((PointToBrickContext)_localctx).objectName.value);
			}
			((PointToBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public RepeatBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterRepeatBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitRepeatBrick(this);
		}
	}

	public final RepeatBrickContext repeatBrick() throws RecognitionException {
		RepeatBrickContext _localctx = new RepeatBrickContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_repeatBrick);
		RepeatBrick brick = new RepeatBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); match(22);
			setState(510); ((RepeatBrickContext)_localctx).formula = formula();
			brick.setTimesToRepeat(((RepeatBrickContext)_localctx).formula.value);
			}
			((RepeatBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetBrightnessBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SetBrightnessBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBrightnessBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSetBrightnessBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSetBrightnessBrick(this);
		}
	}

	public final SetBrightnessBrickContext setBrightnessBrick() throws RecognitionException {
		SetBrightnessBrickContext _localctx = new SetBrightnessBrickContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_setBrightnessBrick);
		SetBrightnessBrick brick = new SetBrightnessBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); match(46);
			setState(514); match(11);
			setState(515); match(5);
			setState(516); ((SetBrightnessBrickContext)_localctx).formula = formula();
			setState(517); match(12);
			brick.setBrightness(((SetBrightnessBrickContext)_localctx).formula.value);
			}
			((SetBrightnessBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetGhostEffectBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SetGhostEffectBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setGhostEffectBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSetGhostEffectBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSetGhostEffectBrick(this);
		}
	}

	public final SetGhostEffectBrickContext setGhostEffectBrick() throws RecognitionException {
		SetGhostEffectBrickContext _localctx = new SetGhostEffectBrickContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_setGhostEffectBrick);
		SetGhostEffectBrick brick = new SetGhostEffectBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); match(46);
			setState(521); match(64);
			setState(522); match(24);
			setState(523); match(5);
			setState(524); ((SetGhostEffectBrickContext)_localctx).formula = formula();
			setState(525); match(12);
			brick.setTransparency(((SetGhostEffectBrickContext)_localctx).formula.value);
			}
			((SetGhostEffectBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetLookBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public LookContext look;
		public LookContext look() {
			return getRuleContext(LookContext.class,0);
		}
		public SetLookBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLookBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSetLookBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSetLookBrick(this);
		}
	}

	public final SetLookBrickContext setLookBrick() throws RecognitionException {
		SetLookBrickContext _localctx = new SetLookBrickContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_setLookBrick);
		SetLookBrick brick = new SetLookBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(73);
			setState(529); match(5);
			setState(530); match(32);
			setState(531); ((SetLookBrickContext)_localctx).look = look();
			brick.setLook(((SetLookBrickContext)_localctx).look.value);
			}
			((SetLookBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetSizeToBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SetSizeToBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSizeToBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSetSizeToBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSetSizeToBrick(this);
		}
	}

	public final SetSizeToBrickContext setSizeToBrick() throws RecognitionException {
		SetSizeToBrickContext _localctx = new SetSizeToBrickContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_setSizeToBrick);
		SetSizeToBrick brick = new SetSizeToBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); match(46);
			setState(535); match(8);
			setState(536); match(5);
			setState(537); ((SetSizeToBrickContext)_localctx).formula = formula();
			setState(538); match(12);
			brick.setSize(((SetSizeToBrickContext)_localctx).formula.value);
			}
			((SetSizeToBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetVariableBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public UserVariableContext userVariable;
		public FormulaContext formula;
		public UserVariableContext userVariable() {
			return getRuleContext(UserVariableContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SetVariableBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVariableBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSetVariableBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSetVariableBrick(this);
		}
	}

	public final SetVariableBrickContext setVariableBrick() throws RecognitionException {
		SetVariableBrickContext _localctx = new SetVariableBrickContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_setVariableBrick);
		SetVariableBrick brick = new SetVariableBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); match(46);
			setState(542); match(13);
			setState(543); ((SetVariableBrickContext)_localctx).userVariable = userVariable();
			setState(544); match(5);
			setState(545); ((SetVariableBrickContext)_localctx).formula = formula();
			 brick.setUserVariable(((SetVariableBrickContext)_localctx).userVariable.value);
			        brick.setVariableFormula(((SetVariableBrickContext)_localctx).formula.value);
			}
			((SetVariableBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetVolumeToBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SetVolumeToBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVolumeToBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSetVolumeToBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSetVolumeToBrick(this);
		}
	}

	public final SetVolumeToBrickContext setVolumeToBrick() throws RecognitionException {
		SetVolumeToBrickContext _localctx = new SetVolumeToBrickContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_setVolumeToBrick);
		SetVolumeToBrick brick = new SetVolumeToBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548); match(46);
			setState(549); match(43);
			setState(550); match(5);
			setState(551); ((SetVolumeToBrickContext)_localctx).formula = formula();
			setState(552); match(12);
			brick.setVolume(((SetVolumeToBrickContext)_localctx).formula.value);
			}
			((SetVolumeToBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetXBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SetXBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setXBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSetXBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSetXBrick(this);
		}
	}

	public final SetXBrickContext setXBrick() throws RecognitionException {
		SetXBrickContext _localctx = new SetXBrickContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_setXBrick);
		SetXBrick brick = new SetXBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(46);
			setState(556); match(18);
			setState(557); match(5);
			setState(558); ((SetXBrickContext)_localctx).formula = formula();
			brick.setxPosition(((SetXBrickContext)_localctx).formula.value);
			}
			((SetXBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetYBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public SetYBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setYBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSetYBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSetYBrick(this);
		}
	}

	public final SetYBrickContext setYBrick() throws RecognitionException {
		SetYBrickContext _localctx = new SetYBrickContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_setYBrick);
		SetYBrick brick = new SetYBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); match(46);
			setState(562); match(44);
			setState(563); match(5);
			setState(564); ((SetYBrickContext)_localctx).formula = formula();
			brick.setyPosition(((SetYBrickContext)_localctx).formula.value);
			}
			((SetYBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public ShowBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterShowBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitShowBrick(this);
		}
	}

	public final ShowBrickContext showBrick() throws RecognitionException {
		ShowBrickContext _localctx = new ShowBrickContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_showBrick);
		ShowBrick brick = new ShowBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); match(67);
			}
			((ShowBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpeakBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public TextFieldContext textField;
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public SpeakBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speakBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSpeakBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSpeakBrick(this);
		}
	}

	public final SpeakBrickContext speakBrick() throws RecognitionException {
		SpeakBrickContext _localctx = new SpeakBrickContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_speakBrick);
		 SpeakBrick brick = new SpeakBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); match(68);
			setState(570); ((SpeakBrickContext)_localctx).textField = textField();
			brick.setText(((SpeakBrickContext)_localctx).textField.value);
			}
			((SpeakBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopAllSoundsBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public StopAllSoundsBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopAllSoundsBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterStopAllSoundsBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitStopAllSoundsBrick(this);
		}
	}

	public final StopAllSoundsBrickContext stopAllSoundsBrick() throws RecognitionException {
		StopAllSoundsBrickContext _localctx = new StopAllSoundsBrickContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_stopAllSoundsBrick);
		 StopAllSoundsBrick brick = new StopAllSoundsBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(2);
			setState(574); match(47);
			setState(575); match(52);
			}
			 ((StopAllSoundsBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TurnLeftBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TurnLeftBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnLeftBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterTurnLeftBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitTurnLeftBrick(this);
		}
	}

	public final TurnLeftBrickContext turnLeftBrick() throws RecognitionException {
		TurnLeftBrickContext _localctx = new TurnLeftBrickContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_turnLeftBrick);
		 TurnLeftBrick brick = new TurnLeftBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(15);
			setState(578); match(1);
			setState(579); ((TurnLeftBrickContext)_localctx).formula = formula();
			setState(580); match(34);
			brick.setDegrees(((TurnLeftBrickContext)_localctx).formula.value);
			}
			 ((TurnLeftBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TurnRightBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TurnRightBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnRightBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterTurnRightBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitTurnRightBrick(this);
		}
	}

	public final TurnRightBrickContext turnRightBrick() throws RecognitionException {
		TurnRightBrickContext _localctx = new TurnRightBrickContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_turnRightBrick);
		 TurnRightBrick brick = new TurnRightBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(15);
			setState(584); match(70);
			setState(585); ((TurnRightBrickContext)_localctx).formula = formula();
			setState(586); match(34);
			brick.setDegrees(((TurnRightBrickContext)_localctx).formula.value);
			}
			 ((TurnRightBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaitBrickContext extends ParserRuleContext {
		public BrickBaseType value;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public WaitBrickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitBrick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterWaitBrick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitWaitBrick(this);
		}
	}

	public final WaitBrickContext waitBrick() throws RecognitionException {
		WaitBrickContext _localctx = new WaitBrickContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_waitBrick);
		 WaitBrick brick = new WaitBrick();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589); match(48);
			setState(590); ((WaitBrickContext)_localctx).formula = formula();
			setState(591); match(17);
			brick.setTimeToWaitInSeconds(((WaitBrickContext)_localctx).formula.value);
			}
			 ((WaitBrickContext)_localctx).value =  brick;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public String value;
		public Token ACTION;
		public TerminalNode ACTION() { return getToken(CatrobatScriptParser.ACTION, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594); ((ActionContext)_localctx).ACTION = match(ACTION);
			 ((ActionContext)_localctx).value =  (((ActionContext)_localctx).ACTION!=null?((ActionContext)_localctx).ACTION.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaContext extends ParserRuleContext {
		public Formula value;
		public TokenContext token;
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_formula);
		 
		         List<InternToken> tokenList = new ArrayList<InternToken>();
		      
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(BRACKET_OPEN);
			setState(601); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(598); ((FormulaContext)_localctx).token = token();
					tokenList.add(((FormulaContext)_localctx).token.value);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(603); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(605); match(BRACKET_CLOSE);
			}
			 
			         formulaParser = new InternFormulaParser(tokenList);
			         Formula formulaTree = new Formula();
			         formulaTree.setFormulaTree(formulaParser.parseFormula());
			         ((FormulaContext)_localctx).value =  formulaTree;
			      
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LookContext extends ParserRuleContext {
		public LookData value;
		public Token USER_VARIABLE;
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public LookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterLook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitLook(this);
		}
	}

	public final LookContext look() throws RecognitionException {
		LookContext _localctx = new LookContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_look);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); ((LookContext)_localctx).USER_VARIABLE = match(USER_VARIABLE);
			StringBuffer buf = new StringBuffer((((LookContext)_localctx).USER_VARIABLE!=null?((LookContext)_localctx).USER_VARIABLE.getText():null));
			   String name = buf.substring(1,buf.length()-1).toString();
			   ((LookContext)_localctx).value =  null;
			   // TODO: exception LookData not found
			   for (LookData item: currentSprite.getLookList()) {
			     if (item.getName().equals(name))
			       ((LookContext)_localctx).value =  item;
			   }
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SoundContext extends ParserRuleContext {
		public SoundInfo value;
		public Token USER_VARIABLE;
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public SoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterSound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitSound(this);
		}
	}

	public final SoundContext sound() throws RecognitionException {
		SoundContext _localctx = new SoundContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); ((SoundContext)_localctx).USER_VARIABLE = match(USER_VARIABLE);
			StringBuffer buf = new StringBuffer((((SoundContext)_localctx).USER_VARIABLE!=null?((SoundContext)_localctx).USER_VARIABLE.getText():null));
			   String name = buf.substring(1,buf.length()-1).toString();
			   ((SoundContext)_localctx).value =  null;
			   // TODO: exception SoundInfo not found
			   for (SoundInfo item: currentSprite.getSoundList()) {
			     if (item.getName().equals(name))
			       ((SoundContext)_localctx).value =  item;
			   }
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectNameContext extends ParserRuleContext {
		public Sprite value;
		public Token USER_VARIABLE;
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitObjectName(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); ((ObjectNameContext)_localctx).USER_VARIABLE = match(USER_VARIABLE);
			StringBuffer buf = new StringBuffer((((ObjectNameContext)_localctx).USER_VARIABLE!=null?((ObjectNameContext)_localctx).USER_VARIABLE.getText():null));
			   String name = buf.substring(1,buf.length()-1).toString();
			   ((ObjectNameContext)_localctx).value =  null;
			   // TODO: exception SoundInfo not found
			   for (Sprite item: spriteList) {
			     if (item.getName().equals(name))
			       ((ObjectNameContext)_localctx).value =  item;
			   }
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public String value;
		public Token USER_VARIABLE;
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616); ((MessageContext)_localctx).USER_VARIABLE = match(USER_VARIABLE);
			StringBuffer buf = new StringBuffer((((MessageContext)_localctx).USER_VARIABLE!=null?((MessageContext)_localctx).USER_VARIABLE.getText():null));
			     String name = buf.substring(1,buf.length()-1).toString();
			     ((MessageContext)_localctx).value =  name;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MotorContext extends ParserRuleContext {
		public String value;
		public Token USER_VARIABLE;
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public MotorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_motor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterMotor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitMotor(this);
		}
	}

	public final MotorContext motor() throws RecognitionException {
		MotorContext _localctx = new MotorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_motor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); ((MotorContext)_localctx).USER_VARIABLE = match(USER_VARIABLE);
			StringBuffer buf = new StringBuffer((((MotorContext)_localctx).USER_VARIABLE!=null?((MotorContext)_localctx).USER_VARIABLE.getText():null));
			     String name = buf.substring(1,buf.length()-1).toString();
			     ((MotorContext)_localctx).value =  name;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextFieldContext extends ParserRuleContext {
		public String value;
		public Token USER_VARIABLE;
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public TextFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterTextField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitTextField(this);
		}
	}

	public final TextFieldContext textField() throws RecognitionException {
		TextFieldContext _localctx = new TextFieldContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_textField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); ((TextFieldContext)_localctx).USER_VARIABLE = match(USER_VARIABLE);
			StringBuffer buf = new StringBuffer((((TextFieldContext)_localctx).USER_VARIABLE!=null?((TextFieldContext)_localctx).USER_VARIABLE.getText():null));
			     String name = buf.substring(1,buf.length()-1).toString();
			     ((TextFieldContext)_localctx).value =  name;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserVariableContext extends ParserRuleContext {
		public UserVariable value;
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public UserVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterUserVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitUserVariable(this);
		}
	}

	public final UserVariableContext userVariable() throws RecognitionException {
		UserVariableContext _localctx = new UserVariableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_userVariable);
		 UserVariable var = new UserVariable(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); match(USER_VARIABLE);

			        StringBuffer buf = new StringBuffer(_input.getText(_localctx.start, _input.LT(-1)));
			        String name = buf.substring(1, buf.length()-1).toString();
			        if (variables.containsKey(name)) 
			           var = variables.get(name);
			        else {
			           var.setName(name);
			           variables.put(name, var);
			        }    
			       
			}
			((UserVariableContext)_localctx).value =  var;
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenContext extends ParserRuleContext {
		public InternToken value;
		public TerminalNode SENSOR() { return getToken(CatrobatScriptParser.SENSOR, 0); }
		public TerminalNode FUNCTION_NAME() { return getToken(CatrobatScriptParser.FUNCTION_NAME, 0); }
		public TerminalNode FUNCTION_PARAMETER_DELIMITER() { return getToken(CatrobatScriptParser.FUNCTION_PARAMETER_DELIMITER, 0); }
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public TerminalNode OPERATOR() { return getToken(CatrobatScriptParser.OPERATOR, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CatrobatScriptParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CatrobatScriptParser.BRACKET_OPEN, 0); }
		public TerminalNode NUMBER() { return getToken(CatrobatScriptParser.NUMBER, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_token);
		try {
			setState(644);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(628); match(NUMBER);
				 ((TokenContext)_localctx).value =  new InternToken(InternTokenType.NUMBER,_input.getText(_localctx.start, _input.LT(-1)));
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(630); match(OPERATOR);
				 ((TokenContext)_localctx).value =  new InternToken(InternTokenType.OPERATOR,Operators.getInnerName(_input.getText(_localctx.start, _input.LT(-1))));
				}
				break;
			case SENSOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(632); match(SENSOR);
				 ((TokenContext)_localctx).value =  new InternToken(InternTokenType.SENSOR,Sensors.getInnerName(_input.getText(_localctx.start, _input.LT(-1))));
				}
				break;
			case FUNCTION_NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(634); match(FUNCTION_NAME);
				 ((TokenContext)_localctx).value =  new InternToken(InternTokenType.FUNCTION_NAME,Functions.getInnerName(_input.getText(_localctx.start, _input.LT(-1))));
				}
				break;
			case USER_VARIABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(636); match(USER_VARIABLE);
				UserVariable var = new UserVariable();
				       StringBuffer buf = new StringBuffer(_input.getText(_localctx.start, _input.LT(-1)));
				       String name = buf.substring(1,buf.length()-1).toString(); 
				       if (variables.containsKey(name)) 
				           var = variables.get(name);
				        else {
				           var.setName(name);
				           variables.put(name, var);
				        }    
				       ((TokenContext)_localctx).value =  new InternToken(InternTokenType.USER_VARIABLE,name);
				}
				break;
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(638); match(BRACKET_OPEN);
				 ((TokenContext)_localctx).value =  new InternToken(InternTokenType.BRACKET_OPEN,_input.getText(_localctx.start, _input.LT(-1)));
				}
				break;
			case BRACKET_CLOSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(640); match(BRACKET_CLOSE);
				 ((TokenContext)_localctx).value =  new InternToken(InternTokenType.BRACKET_CLOSE,_input.getText(_localctx.start, _input.LT(-1)));
				}
				break;
			case FUNCTION_PARAMETER_DELIMITER:
				enterOuterAlt(_localctx, 8);
				{
				setState(642); match(FUNCTION_PARAMETER_DELIMITER);
				 ((TokenContext)_localctx).value =  new InternToken(InternTokenType.FUNCTION_PARAMETERS_BRACKET_OPEN,_input.getText(_localctx.start, _input.LT(-1)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3X\u0289\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u0088"+
		"\n\2\f\2\16\2\u008b\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u00a5\n\6\f\6\16"+
		"\6\u00a8\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0134\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u0184\n\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01a2\n\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ac\n\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\5\36\u01c6\n\36\3\36\3\36\3\36\3\36\5\36\u01cc"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u01e9\n#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\6\67\u025c\n\67\r\67\16\67"+
		"\u025d\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3"+
		"=\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0287\n"+
		"?\3?\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\2\u0289\2\u0089\3\2\2\2\4\u008c\3"+
		"\2\2\2\6\u0093\3\2\2\2\b\u0099\3\2\2\2\n\u00a6\3\2\2\2\f\u0133\3\2\2\2"+
		"\16\u0135\3\2\2\2\20\u0139\3\2\2\2\22\u013f\3\2\2\2\24\u0146\3\2\2\2\26"+
		"\u014e\3\2\2\2\30\u0155\3\2\2\2\32\u015d\3\2\2\2\34\u0164\3\2\2\2\36\u016a"+
		"\3\2\2\2 \u0170\3\2\2\2\"\u0174\3\2\2\2$\u0178\3\2\2\2&\u017a\3\2\2\2"+
		"(\u0189\3\2\2\2*\u018f\3\2\2\2,\u0191\3\2\2\2.\u0198\3\2\2\2\60\u019a"+
		"\3\2\2\2\62\u019d\3\2\2\2\64\u01a5\3\2\2\2\66\u01b1\3\2\2\28\u01b7\3\2"+
		"\2\2:\u01c1\3\2\2\2<\u01d2\3\2\2\2>\u01d6\3\2\2\2@\u01db\3\2\2\2B\u01de"+
		"\3\2\2\2D\u01e2\3\2\2\2F\u01ee\3\2\2\2H\u01f3\3\2\2\2J\u01fa\3\2\2\2L"+
		"\u01ff\3\2\2\2N\u0203\3\2\2\2P\u020a\3\2\2\2R\u0212\3\2\2\2T\u0218\3\2"+
		"\2\2V\u021f\3\2\2\2X\u0226\3\2\2\2Z\u022d\3\2\2\2\\\u0233\3\2\2\2^\u0239"+
		"\3\2\2\2`\u023b\3\2\2\2b\u023f\3\2\2\2d\u0243\3\2\2\2f\u0249\3\2\2\2h"+
		"\u024f\3\2\2\2j\u0254\3\2\2\2l\u0257\3\2\2\2n\u0261\3\2\2\2p\u0264\3\2"+
		"\2\2r\u0267\3\2\2\2t\u026a\3\2\2\2v\u026d\3\2\2\2x\u0270\3\2\2\2z\u0273"+
		"\3\2\2\2|\u0286\3\2\2\2~\177\5\4\3\2\177\u0080\b\2\1\2\u0080\u0088\3\2"+
		"\2\2\u0081\u0082\5\6\4\2\u0082\u0083\b\2\1\2\u0083\u0088\3\2\2\2\u0084"+
		"\u0085\5\b\5\2\u0085\u0086\b\2\1\2\u0086\u0088\3\2\2\2\u0087~\3\2\2\2"+
		"\u0087\u0081\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\3\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\36\2\2\u008d\u008e\7+\2\2\u008e\u008f\7\31\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0091\5\n\6\2\u0091\u0092\b\3\1\2\u0092\5\3\2\2\2\u0093\u0094"+
		"\7\36\2\2\u0094\u0095\5j\66\2\u0095\u0096\3\2\2\2\u0096\u0097\5\n\6\2"+
		"\u0097\u0098\b\4\1\2\u0098\7\3\2\2\2\u0099\u009a\7\36\2\2\u009a\u009b"+
		"\7\b\2\2\u009b\u009c\7(\2\2\u009c\u009d\5t;\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\5\n\6\2\u009f\u00a0\b\5\1\2\u00a0\t\3\2\2\2\u00a1\u00a2\5\f\7\2"+
		"\u00a2\u00a3\b\6\1\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\13\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\5\16\b\2\u00aa\u00ab\b\7\1\2\u00ab\u0134\3"+
		"\2\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\b\7\1\2\u00ae\u0134\3\2\2\2\u00af"+
		"\u00b0\5\22\n\2\u00b0\u00b1\b\7\1\2\u00b1\u0134\3\2\2\2\u00b2\u00b3\5"+
		"\24\13\2\u00b3\u00b4\b\7\1\2\u00b4\u0134\3\2\2\2\u00b5\u00b6\5\26\f\2"+
		"\u00b6\u00b7\b\7\1\2\u00b7\u0134\3\2\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba"+
		"\b\7\1\2\u00ba\u0134\3\2\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00bd\b\7\1\2"+
		"\u00bd\u0134\3\2\2\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\b\7\1\2\u00c0\u0134"+
		"\3\2\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\b\7\1\2\u00c3\u0134\3\2\2\2"+
		"\u00c4\u00c5\5 \21\2\u00c5\u00c6\b\7\1\2\u00c6\u0134\3\2\2\2\u00c7\u00c8"+
		"\5\"\22\2\u00c8\u00c9\b\7\1\2\u00c9\u0134\3\2\2\2\u00ca\u00cb\5$\23\2"+
		"\u00cb\u00cc\b\7\1\2\u00cc\u0134\3\2\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf"+
		"\b\7\1\2\u00cf\u0134\3\2\2\2\u00d0\u00d1\5(\25\2\u00d1\u00d2\b\7\1\2\u00d2"+
		"\u0134\3\2\2\2\u00d3\u00d4\5*\26\2\u00d4\u00d5\b\7\1\2\u00d5\u0134\3\2"+
		"\2\2\u00d6\u00d7\5,\27\2\u00d7\u00d8\b\7\1\2\u00d8\u0134\3\2\2\2\u00d9"+
		"\u00da\5.\30\2\u00da\u00db\b\7\1\2\u00db\u0134\3\2\2\2\u00dc\u00dd\5\60"+
		"\31\2\u00dd\u00de\b\7\1\2\u00de\u0134\3\2\2\2\u00df\u00e0\5\62\32\2\u00e0"+
		"\u00e1\b\7\1\2\u00e1\u0134\3\2\2\2\u00e2\u00e3\5\64\33\2\u00e3\u00e4\b"+
		"\7\1\2\u00e4\u0134\3\2\2\2\u00e5\u00e6\5\66\34\2\u00e6\u00e7\b\7\1\2\u00e7"+
		"\u0134\3\2\2\2\u00e8\u00e9\58\35\2\u00e9\u00ea\b\7\1\2\u00ea\u0134\3\2"+
		"\2\2\u00eb\u00ec\5:\36\2\u00ec\u00ed\b\7\1\2\u00ed\u0134\3\2\2\2\u00ee"+
		"\u00ef\5<\37\2\u00ef\u00f0\b\7\1\2\u00f0\u0134\3\2\2\2\u00f1\u00f2\5>"+
		" \2\u00f2\u00f3\b\7\1\2\u00f3\u0134\3\2\2\2\u00f4\u00f5\5@!\2\u00f5\u00f6"+
		"\b\7\1\2\u00f6\u0134\3\2\2\2\u00f7\u00f8\5B\"\2\u00f8\u00f9\b\7\1\2\u00f9"+
		"\u0134\3\2\2\2\u00fa\u00fb\5D#\2\u00fb\u00fc\b\7\1\2\u00fc\u0134\3\2\2"+
		"\2\u00fd\u00fe\5F$\2\u00fe\u00ff\b\7\1\2\u00ff\u0134\3\2\2\2\u0100\u0101"+
		"\5H%\2\u0101\u0102\b\7\1\2\u0102\u0134\3\2\2\2\u0103\u0104\5J&\2\u0104"+
		"\u0105\b\7\1\2\u0105\u0134\3\2\2\2\u0106\u0107\5L\'\2\u0107\u0108\b\7"+
		"\1\2\u0108\u0134\3\2\2\2\u0109\u010a\5N(\2\u010a\u010b\b\7\1\2\u010b\u0134"+
		"\3\2\2\2\u010c\u010d\5P)\2\u010d\u010e\b\7\1\2\u010e\u0134\3\2\2\2\u010f"+
		"\u0110\5R*\2\u0110\u0111\b\7\1\2\u0111\u0134\3\2\2\2\u0112\u0113\5T+\2"+
		"\u0113\u0114\b\7\1\2\u0114\u0134\3\2\2\2\u0115\u0116\5V,\2\u0116\u0117"+
		"\b\7\1\2\u0117\u0134\3\2\2\2\u0118\u0119\5X-\2\u0119\u011a\b\7\1\2\u011a"+
		"\u0134\3\2\2\2\u011b\u011c\5Z.\2\u011c\u011d\b\7\1\2\u011d\u0134\3\2\2"+
		"\2\u011e\u011f\5\\/\2\u011f\u0120\b\7\1\2\u0120\u0134\3\2\2\2\u0121\u0122"+
		"\5^\60\2\u0122\u0123\b\7\1\2\u0123\u0134\3\2\2\2\u0124\u0125\5`\61\2\u0125"+
		"\u0126\b\7\1\2\u0126\u0134\3\2\2\2\u0127\u0128\5b\62\2\u0128\u0129\b\7"+
		"\1\2\u0129\u0134\3\2\2\2\u012a\u012b\5d\63\2\u012b\u012c\b\7\1\2\u012c"+
		"\u0134\3\2\2\2\u012d\u012e\5f\64\2\u012e\u012f\b\7\1\2\u012f\u0134\3\2"+
		"\2\2\u0130\u0131\5h\65\2\u0131\u0132\b\7\1\2\u0132\u0134\3\2\2\2\u0133"+
		"\u00a9\3\2\2\2\u0133\u00ac\3\2\2\2\u0133\u00af\3\2\2\2\u0133\u00b2\3\2"+
		"\2\2\u0133\u00b5\3\2\2\2\u0133\u00b8\3\2\2\2\u0133\u00bb\3\2\2\2\u0133"+
		"\u00be\3\2\2\2\u0133\u00c1\3\2\2\2\u0133\u00c4\3\2\2\2\u0133\u00c7\3\2"+
		"\2\2\u0133\u00ca\3\2\2\2\u0133\u00cd\3\2\2\2\u0133\u00d0\3\2\2\2\u0133"+
		"\u00d3\3\2\2\2\u0133\u00d6\3\2\2\2\u0133\u00d9\3\2\2\2\u0133\u00dc\3\2"+
		"\2\2\u0133\u00df\3\2\2\2\u0133\u00e2\3\2\2\2\u0133\u00e5\3\2\2\2\u0133"+
		"\u00e8\3\2\2\2\u0133\u00eb\3\2\2\2\u0133\u00ee\3\2\2\2\u0133\u00f1\3\2"+
		"\2\2\u0133\u00f4\3\2\2\2\u0133\u00f7\3\2\2\2\u0133\u00fa\3\2\2\2\u0133"+
		"\u00fd\3\2\2\2\u0133\u0100\3\2\2\2\u0133\u0103\3\2\2\2\u0133\u0106\3\2"+
		"\2\2\u0133\u0109\3\2\2\2\u0133\u010c\3\2\2\2\u0133\u010f\3\2\2\2\u0133"+
		"\u0112\3\2\2\2\u0133\u0115\3\2\2\2\u0133\u0118\3\2\2\2\u0133\u011b\3\2"+
		"\2\2\u0133\u011e\3\2\2\2\u0133\u0121\3\2\2\2\u0133\u0124\3\2\2\2\u0133"+
		"\u0127\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0130\3\2"+
		"\2\2\u0134\r\3\2\2\2\u0135\u0136\7\35\2\2\u0136\u0137\5t;\2\u0137\u0138"+
		"\b\b\1\2\u0138\17\3\2\2\2\u0139\u013a\7\35\2\2\u013a\u013b\7\63\2\2\u013b"+
		"\u013c\7\62\2\2\u013c\u013d\5t;\2\u013d\u013e\b\t\1\2\u013e\21\3\2\2\2"+
		"\u013f\u0140\7,\2\2\u0140\u0141\7\r\2\2\u0141\u0142\7\t\2\2\u0142\u0143"+
		"\5l\67\2\u0143\u0144\7\16\2\2\u0144\u0145\b\n\1\2\u0145\23\3\2\2\2\u0146"+
		"\u0147\7,\2\2\u0147\u0148\7B\2\2\u0148\u0149\7\32\2\2\u0149\u014a\7\t"+
		"\2\2\u014a\u014b\5l\67\2\u014b\u014c\7\16\2\2\u014c\u014d\b\13\1\2\u014d"+
		"\25\3\2\2\2\u014e\u014f\7,\2\2\u014f\u0150\7\n\2\2\u0150\u0151\7\t\2\2"+
		"\u0151\u0152\5l\67\2\u0152\u0153\7\16\2\2\u0153\u0154\b\f\1\2\u0154\27"+
		"\3\2\2\2\u0155\u0156\7,\2\2\u0156\u0157\7\17\2\2\u0157\u0158\5z>\2\u0158"+
		"\u0159\b\r\1\2\u0159\u015a\7\t\2\2\u015a\u015b\5l\67\2\u015b\u015c\b\r"+
		"\1\2\u015c\31\3\2\2\2\u015d\u015e\7,\2\2\u015e\u015f\7-\2\2\u015f\u0160"+
		"\7\t\2\2\u0160\u0161\5l\67\2\u0161\u0162\7\16\2\2\u0162\u0163\b\16\1\2"+
		"\u0163\33\3\2\2\2\u0164\u0165\7,\2\2\u0165\u0166\7\24\2\2\u0166\u0167"+
		"\7\t\2\2\u0167\u0168\5l\67\2\u0168\u0169\b\17\1\2\u0169\35\3\2\2\2\u016a"+
		"\u016b\7,\2\2\u016b\u016c\7.\2\2\u016c\u016d\7\t\2\2\u016d\u016e\5l\67"+
		"\2\u016e\u016f\b\20\1\2\u016f\37\3\2\2\2\u0170\u0171\7?\2\2\u0171\u0172"+
		"\7L\2\2\u0172\u0173\7:\2\2\u0173!\3\2\2\2\u0174\u0175\7D\2\2\u0175\u0176"+
		"\7\7\2\2\u0176\u0177\7G\2\2\u0177#\3\2\2\2\u0178\u0179\7%\2\2\u0179%\3"+
		"\2\2\2\u017a\u017b\7\22\2\2\u017b\u017c\5l\67\2\u017c\u017d\b\24\1\2\u017d"+
		"\u017e\7\23\2\2\u017e\u017f\7\7\2\2\u017f\u0180\7\6\2\2\u0180\u0181\5"+
		"l\67\2\u0181\u0183\b\24\1\2\u0182\u0184\7V\2\2\u0183\u0182\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7\5\2\2\u0186\u0187\5l"+
		"\67\2\u0187\u0188\b\24\1\2\u0188\'\3\2\2\2\u0189\u018a\79\2\2\u018a\u018b"+
		"\7\34\2\2\u018b\u018c\5l\67\2\u018c\u018d\7@\2\2\u018d\u018e\b\25\1\2"+
		"\u018e)\3\2\2\2\u018f\u0190\7#\2\2\u0190+\3\2\2\2\u0191\u0192\7)\2\2\u0192"+
		"\u0193\5l\67\2\u0193\u0194\7<\2\2\u0194\u0195\78\2\2\u0195\u0196\7I\2"+
		"\2\u0196\u0197\b\27\1\2\u0197-\3\2\2\2\u0198\u0199\7\65\2\2\u0199/\3\2"+
		"\2\2\u019a\u019b\7M\2\2\u019b\u019c\7)\2\2\u019c\61\3\2\2\2\u019d\u019e"+
		"\7)\2\2\u019e\u019f\7\20\2\2\u019f\u01a1\7 \2\2\u01a0\u01a2\7V\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7/"+
		"\2\2\u01a4\63\3\2\2\2\u01a5\u01a6\7=\2\2\u01a6\u01a7\7!\2\2\u01a7\u01a8"+
		"\7\67\2\2\u01a8\u01a9\5v<\2\u01a9\u01ab\b\33\1\2\u01aa\u01ac\7V\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\64"+
		"\2\2\u01ae\u01af\5l\67\2\u01af\u01b0\b\33\1\2\u01b0\65\3\2\2\2\u01b1\u01b2"+
		"\7=\2\2\u01b2\u01b3\7\4\2\2\u01b3\u01b4\7\67\2\2\u01b4\u01b5\5v<\2\u01b5"+
		"\u01b6\b\34\1\2\u01b6\67\3\2\2\2\u01b7\u01b8\7=\2\2\u01b8\u01b9\7\21\2"+
		"\2\u01b9\u01ba\7\67\2\2\u01ba\u01bb\5v<\2\u01bb\u01bc\b\35\1\2\u01bc\u01bd"+
		"\7\7\2\2\u01bd\u01be\5l\67\2\u01be\u01bf\b\35\1\2\u01bf\u01c0\7$\2\2\u01c0"+
		"9\3\2\2\2\u01c1\u01c2\7=\2\2\u01c2\u01c3\7J\2\2\u01c3\u01c5\7;\2\2\u01c4"+
		"\u01c6\7V\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c8\7A\2\2\u01c8\u01c9\5l\67\2\u01c9\u01cb\b\36\1\2\u01ca"+
		"\u01cc\7V\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01ce\7\25\2\2\u01ce\u01cf\5l\67\2\u01cf\u01d0\b\36\1\2\u01d0"+
		"\u01d1\7\23\2\2\u01d1;\3\2\2\2\u01d2\u01d3\7M\2\2\u01d3\u01d4\7\'\2\2"+
		"\u01d4\u01d5\7>\2\2\u01d5=\3\2\2\2\u01d6\u01d7\7!\2\2\u01d7\u01d8\5l\67"+
		"\2\u01d8\u01d9\7\26\2\2\u01d9\u01da\b \1\2\u01da?\3\2\2\2\u01db\u01dc"+
		"\7\f\2\2\u01dc\u01dd\7\"\2\2\u01ddA\3\2\2\2\u01de\u01df\7*\2\2\u01df\u01e0"+
		"\5x=\2\u01e0\u01e1\b\"\1\2\u01e1C\3\2\2\2\u01e2\u01e3\7\27\2\2\u01e3\u01e4"+
		"\7\33\2\2\u01e4\u01e5\7\6\2\2\u01e5\u01e6\5l\67\2\u01e6\u01e8\b#\1\2\u01e7"+
		"\u01e9\7V\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\7\5\2\2\u01eb\u01ec\5l\67\2\u01ec\u01ed\b#\1\2\u01ed"+
		"E\3\2\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\7\13\2\2\u01f0\u01f1\5p9\2\u01f1"+
		"\u01f2\b$\1\2\u01f2G\3\2\2\2\u01f3\u01f4\7N\2\2\u01f4\u01f5\7&\2\2\u01f5"+
		"\u01f6\7\37\2\2\u01f6\u01f7\5l\67\2\u01f7\u01f8\7$\2\2\u01f8\u01f9\b%"+
		"\1\2\u01f9I\3\2\2\2\u01fa\u01fb\7N\2\2\u01fb\u01fc\7\7\2\2\u01fc\u01fd"+
		"\5r:\2\u01fd\u01fe\b&\1\2\u01feK\3\2\2\2\u01ff\u0200\7\30\2\2\u0200\u0201"+
		"\5l\67\2\u0201\u0202\b\'\1\2\u0202M\3\2\2\2\u0203\u0204\7\60\2\2\u0204"+
		"\u0205\7\r\2\2\u0205\u0206\7\7\2\2\u0206\u0207\5l\67\2\u0207\u0208\7\16"+
		"\2\2\u0208\u0209\b(\1\2\u0209O\3\2\2\2\u020a\u020b\7\60\2\2\u020b\u020c"+
		"\7B\2\2\u020c\u020d\7\32\2\2\u020d\u020e\7\7\2\2\u020e\u020f\5l\67\2\u020f"+
		"\u0210\7\16\2\2\u0210\u0211\b)\1\2\u0211Q\3\2\2\2\u0212\u0213\7K\2\2\u0213"+
		"\u0214\7\7\2\2\u0214\u0215\7\"\2\2\u0215\u0216\5n8\2\u0216\u0217\b*\1"+
		"\2\u0217S\3\2\2\2\u0218\u0219\7\60\2\2\u0219\u021a\7\n\2\2\u021a\u021b"+
		"\7\7\2\2\u021b\u021c\5l\67\2\u021c\u021d\7\16\2\2\u021d\u021e\b+\1\2\u021e"+
		"U\3\2\2\2\u021f\u0220\7\60\2\2\u0220\u0221\7\17\2\2\u0221\u0222\5z>\2"+
		"\u0222\u0223\7\7\2\2\u0223\u0224\5l\67\2\u0224\u0225\b,\1\2\u0225W\3\2"+
		"\2\2\u0226\u0227\7\60\2\2\u0227\u0228\7-\2\2\u0228\u0229\7\7\2\2\u0229"+
		"\u022a\5l\67\2\u022a\u022b\7\16\2\2\u022b\u022c\b-\1\2\u022cY\3\2\2\2"+
		"\u022d\u022e\7\60\2\2\u022e\u022f\7\24\2\2\u022f\u0230\7\7\2\2\u0230\u0231"+
		"\5l\67\2\u0231\u0232\b.\1\2\u0232[\3\2\2\2\u0233\u0234\7\60\2\2\u0234"+
		"\u0235\7.\2\2\u0235\u0236\7\7\2\2\u0236\u0237\5l\67\2\u0237\u0238\b/\1"+
		"\2\u0238]\3\2\2\2\u0239\u023a\7E\2\2\u023a_\3\2\2\2\u023b\u023c\7F\2\2"+
		"\u023c\u023d\5x=\2\u023d\u023e\b\61\1\2\u023ea\3\2\2\2\u023f\u0240\7\4"+
		"\2\2\u0240\u0241\7\61\2\2\u0241\u0242\7\66\2\2\u0242c\3\2\2\2\u0243\u0244"+
		"\7\21\2\2\u0244\u0245\7\3\2\2\u0245\u0246\5l\67\2\u0246\u0247\7$\2\2\u0247"+
		"\u0248\b\63\1\2\u0248e\3\2\2\2\u0249\u024a\7\21\2\2\u024a\u024b\7H\2\2"+
		"\u024b\u024c\5l\67\2\u024c\u024d\7$\2\2\u024d\u024e\b\64\1\2\u024eg\3"+
		"\2\2\2\u024f\u0250\7\62\2\2\u0250\u0251\5l\67\2\u0251\u0252\7\23\2\2\u0252"+
		"\u0253\b\65\1\2\u0253i\3\2\2\2\u0254\u0255\7W\2\2\u0255\u0256\b\66\1\2"+
		"\u0256k\3\2\2\2\u0257\u025b\7T\2\2\u0258\u0259\5|?\2\u0259\u025a\b\67"+
		"\1\2\u025a\u025c\3\2\2\2\u025b\u0258\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7U"+
		"\2\2\u0260m\3\2\2\2\u0261\u0262\7O\2\2\u0262\u0263\b8\1\2\u0263o\3\2\2"+
		"\2\u0264\u0265\7O\2\2\u0265\u0266\b9\1\2\u0266q\3\2\2\2\u0267\u0268\7"+
		"O\2\2\u0268\u0269\b:\1\2\u0269s\3\2\2\2\u026a\u026b\7O\2\2\u026b\u026c"+
		"\b;\1\2\u026cu\3\2\2\2\u026d\u026e\7O\2\2\u026e\u026f\b<\1\2\u026fw\3"+
		"\2\2\2\u0270\u0271\7O\2\2\u0271\u0272\b=\1\2\u0272y\3\2\2\2\u0273\u0274"+
		"\7O\2\2\u0274\u0275\b>\1\2\u0275{\3\2\2\2\u0276\u0277\7P\2\2\u0277\u0287"+
		"\b?\1\2\u0278\u0279\7R\2\2\u0279\u0287\b?\1\2\u027a\u027b\7S\2\2\u027b"+
		"\u0287\b?\1\2\u027c\u027d\7Q\2\2\u027d\u0287\b?\1\2\u027e\u027f\7O\2\2"+
		"\u027f\u0287\b?\1\2\u0280\u0281\7T\2\2\u0281\u0287\b?\1\2\u0282\u0283"+
		"\7U\2\2\u0283\u0287\b?\1\2\u0284\u0285\7V\2\2\u0285\u0287\b?\1\2\u0286"+
		"\u0276\3\2\2\2\u0286\u0278\3\2\2\2\u0286\u027a\3\2\2\2\u0286\u027c\3\2"+
		"\2\2\u0286\u027e\3\2\2\2\u0286\u0280\3\2\2\2\u0286\u0282\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0287}\3\2\2\2\16\u0087\u0089\u00a6\u0133\u0183\u01a1\u01ab"+
		"\u01c5\u01cb\u01e8\u025d\u0286";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}