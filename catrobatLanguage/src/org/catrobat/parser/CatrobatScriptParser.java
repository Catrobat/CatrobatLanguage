// Generated from D:\Users\TDiva\Desktop\GSoC-2013\CatrobatLanguage\CatrobatGrammar\CatrobatScript.g4 by ANTLR 4.0
package org.catrobat.parser;
import java.util.HashSet;
         
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
		RULE_nextLookBrik = 31, RULE_noteBrick = 32, RULE_placeAtBrick = 33, RULE_playSoundBrick = 34, 
		RULE_pointInDirectionBrick = 35, RULE_pointToBrick = 36, RULE_repeatBrick = 37, 
		RULE_setBrightnessBrick = 38, RULE_setGhostEffectBrick = 39, RULE_setLookBrick = 40, 
		RULE_setSizeToBrick = 41, RULE_setVariableBrick = 42, RULE_setVolumeToBrick = 43, 
		RULE_setXBrick = 44, RULE_setYBrick = 45, RULE_showBrick = 46, RULE_speakBrick = 47, 
		RULE_stopAllSoundsBrick = 48, RULE_turnLeftBrick = 49, RULE_turnRightBrick = 50, 
		RULE_waitBrick = 51, RULE_action = 52, RULE_formula = 53, RULE_look = 54, 
		RULE_message = 55, RULE_motor = 56, RULE_objectName = 57, RULE_sound = 58, 
		RULE_text = 59, RULE_userVariable = 60, RULE_token = 61;
	public static final String[] ruleNames = {
		"program", "startScript", "whenScript", "broadcastScript", "brickList", 
		"brick", "broadcastBrick", "broadcastWaitBrick", "changeBrightnessByNBrick", 
		"changeGhostEffectByNBrick", "changeSizeByNBrick", "changeVariableBrick", 
		"changeVolumeByNBrick", "changeXByNBrick", "changeYByNBrick", "clearGraficEffectBrick", 
		"comeToFrontBrick", "foreverBrick", "glideToBrick", "goNStepsBackBrick", 
		"hideBrick", "ifLogicBeginBrick", "ifLogicElseBrick", "ifLogicEndBrick", 
		"ifOnEdgeBounceBrick", "legoNXTMotorActionBrick", "legoNxtMotorStopBrick", 
		"legoNxtMotorTurnAngleBrick", "legoNxtPlayToneBrick", "loopEndBrick", 
		"moveNStepsBrick", "nextLookBrik", "noteBrick", "placeAtBrick", "playSoundBrick", 
		"pointInDirectionBrick", "pointToBrick", "repeatBrick", "setBrightnessBrick", 
		"setGhostEffectBrick", "setLookBrick", "setSizeToBrick", "setVariableBrick", 
		"setVolumeToBrick", "setXBrick", "setYBrick", "showBrick", "speakBrick", 
		"stopAllSoundsBrick", "turnLeftBrick", "turnRightBrick", "waitBrick", 
		"action", "formula", "look", "message", "motor", "objectName", "sound", 
		"text", "userVariable", "token"
	};

	@Override
	public String getGrammarFileName() { return "CatrobatScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	HashSet<String> variables = new HashSet<String>();

	public HashSet<String> getVariables() {
	   return variables;}
	 
	public CatrobatScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==28) {
				{
				setState(127);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(124); startScript();
					}
					break;

				case 2:
					{
					setState(125); whenScript();
					}
					break;

				case 3:
					{
					setState(126); broadcastScript();
					}
					break;
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException e) {
			 System.out.println("Recognition exception: "); 
			                               e.printStackTrace();
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartScriptContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132); match(28);
			setState(133); match(41);
			setState(134); match(23);
			}
			setState(136); brickList();
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

	public static class WhenScriptContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138); match(28);
			setState(139); action();
			}
			setState(141); brickList();
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

	public static class BroadcastScriptContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143); match(28);
			setState(144); match(6);
			setState(145); match(38);
			setState(146); message();
			}
			setState(148); brickList();
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

	public static class BrickListContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 15) | (1L << 16) | (1L << 21) | (1L << 22) | (1L << 27) | (1L << 31) | (1L << 33) | (1L << 35) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 46) | (1L << 48) | (1L << 51) | (1L << 55) | (1L << 59) | (1L << 61))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (68 - 65)) | (1L << (73 - 65)) | (1L << (75 - 65)) | (1L << (76 - 65)))) != 0)) {
				{
				{
				setState(150); brick();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BrickContext extends ParserRuleContext {
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
		public NextLookBrikContext nextLookBrik() {
			return getRuleContext(NextLookBrikContext.class,0);
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
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156); broadcastBrick();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); broadcastWaitBrick();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158); changeBrightnessByNBrick();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); changeGhostEffectByNBrick();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160); changeSizeByNBrick();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161); changeVariableBrick();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162); changeVolumeByNBrick();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(163); changeXByNBrick();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164); changeYByNBrick();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(165); clearGraficEffectBrick();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(166); comeToFrontBrick();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(167); foreverBrick();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(168); glideToBrick();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(169); goNStepsBackBrick();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(170); hideBrick();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(171); ifLogicBeginBrick();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(172); ifLogicElseBrick();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(173); ifLogicEndBrick();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(174); ifOnEdgeBounceBrick();
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(175); legoNXTMotorActionBrick();
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(176); legoNxtMotorStopBrick();
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(177); legoNxtMotorTurnAngleBrick();
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(178); legoNxtPlayToneBrick();
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(179); loopEndBrick();
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(180); moveNStepsBrick();
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(181); nextLookBrik();
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(182); noteBrick();
				}
				break;

			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(183); placeAtBrick();
				}
				break;

			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(184); playSoundBrick();
				}
				break;

			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(185); pointInDirectionBrick();
				}
				break;

			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(186); pointToBrick();
				}
				break;

			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(187); repeatBrick();
				}
				break;

			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(188); setBrightnessBrick();
				}
				break;

			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(189); setGhostEffectBrick();
				}
				break;

			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(190); setLookBrick();
				}
				break;

			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(191); setSizeToBrick();
				}
				break;

			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(192); setVariableBrick();
				}
				break;

			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(193); setVolumeToBrick();
				}
				break;

			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(194); setXBrick();
				}
				break;

			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(195); setYBrick();
				}
				break;

			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(196); showBrick();
				}
				break;

			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(197); speakBrick();
				}
				break;

			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(198); stopAllSoundsBrick();
				}
				break;

			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(199); turnLeftBrick();
				}
				break;

			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(200); turnRightBrick();
				}
				break;

			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(201); waitBrick();
				}
				break;
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

	public static class BroadcastBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(27);
			setState(205); message();
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

	public static class BroadcastWaitBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(27);
			setState(208); match(49);
			setState(209); match(48);
			setState(210); message();
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

	public static class ChangeBrightnessByNBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(42);
			setState(213); match(11);
			setState(214); match(7);
			setState(215); formula();
			setState(216); match(12);
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

	public static class ChangeGhostEffectByNBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(42);
			setState(219); match(64);
			setState(220); match(24);
			setState(221); match(7);
			setState(222); formula();
			setState(223); match(12);
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

	public static class ChangeSizeByNBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(42);
			setState(226); match(8);
			setState(227); match(7);
			setState(228); formula();
			setState(229); match(12);
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

	public static class ChangeVariableBrickContext extends ParserRuleContext {
		public UserVariableContext userVariable;
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(42);
			setState(232); match(13);
			setState(233); ((ChangeVariableBrickContext)_localctx).userVariable = userVariable();
			setState(234); match(7);
			setState(235); formula();
			variables.add((((ChangeVariableBrickContext)_localctx).userVariable!=null?_input.getText(((ChangeVariableBrickContext)_localctx).userVariable.start,((ChangeVariableBrickContext)_localctx).userVariable.stop):null));
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

	public static class ChangeVolumeByNBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(42);
			setState(239); match(43);
			setState(240); match(7);
			setState(241); formula();
			setState(242); match(12);
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

	public static class ChangeXByNBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(42);
			setState(245); match(18);
			setState(246); match(7);
			setState(247); formula();
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

	public static class ChangeYByNBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(42);
			setState(250); match(44);
			setState(251); match(7);
			setState(252); formula();
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

	public static class ClearGraficEffectBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(61);
			setState(255); match(74);
			setState(256); match(56);
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

	public static class ComeToFrontBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(66);
			setState(259); match(5);
			setState(260); match(69);
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

	public static class ForeverBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(35);
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

	public static class GlideToBrickContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(16);
			setState(265); formula();
			setState(266); match(17);
			setState(267); match(5);
			setState(268); match(4);
			setState(269); formula();
			setState(271);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(270); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(273); match(3);
			setState(274); formula();
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

	public static class GoNStepsBackBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(55);
			setState(277); match(26);
			setState(278); formula();
			setState(279); match(62);
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

	public static class HideBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(33);
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

	public static class IfLogicBeginBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(39);
			setState(284); formula();
			setState(285); match(58);
			setState(286); match(54);
			setState(287); match(71);
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

	public static class IfLogicElseBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(51);
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

	public static class IfLogicEndBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(75);
			setState(292); match(39);
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

	public static class IfOnEdgeBounceBrickContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(39);
			setState(295); match(14);
			setState(296); match(30);
			setState(298);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(297); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(300); match(45);
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

	public static class LegoNXTMotorActionBrickContext extends ParserRuleContext {
		public List<MotorContext> motor() {
			return getRuleContexts(MotorContext.class);
		}
		public MotorContext motor(int i) {
			return getRuleContext(MotorContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(59);
			setState(303); match(31);
			setState(304); match(53);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305); motor();
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_VARIABLE );
			setState(311);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(310); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(313); match(50);
			setState(314); formula();
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

	public static class LegoNxtMotorStopBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(59);
			setState(317); match(2);
			setState(318); match(53);
			setState(319); motor();
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

	public static class LegoNxtMotorTurnAngleBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(59);
			setState(322); match(15);
			setState(323); match(53);
			setState(324); motor();
			setState(325); match(5);
			setState(326); formula();
			setState(327); match(34);
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

	public static class LegoNxtPlayToneBrickContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(59);
			setState(330); match(72);
			setState(331); match(57);
			setState(333);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(332); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(335); match(63);
			setState(336); formula();
			setState(338);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(337); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(340); match(19);
			setState(341); formula();
			setState(342); match(17);
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

	public static class LoopEndBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(75);
			setState(345); match(37);
			setState(346); match(60);
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

	public static class MoveNStepsBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(31);
			setState(349); formula();
			setState(350); match(20);
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

	public static class NextLookBrikContext extends ParserRuleContext {
		public NextLookBrikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextLookBrik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterNextLookBrik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitNextLookBrik(this);
		}
	}

	public final NextLookBrikContext nextLookBrik() throws RecognitionException {
		NextLookBrikContext _localctx = new NextLookBrikContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nextLookBrik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(10);
			setState(353); match(32);
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

	public static class NoteBrickContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(40);
			setState(356); text();
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

	public static class PlaceAtBrickContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(21);
			setState(359); match(25);
			setState(360); match(4);
			setState(361); formula();
			setState(363);
			_la = _input.LA(1);
			if (_la==FUNCTION_PARAMETER_DELIMITER) {
				{
				setState(362); match(FUNCTION_PARAMETER_DELIMITER);
				}
			}

			setState(365); match(3);
			setState(366); formula();
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

	public static class PlaySoundBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(65);
			setState(369); match(9);
			setState(370); sound();
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

	public static class PointInDirectionBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); match(76);
			setState(373); match(36);
			setState(374); match(29);
			setState(375); formula();
			setState(376); match(34);
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

	public static class PointToBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(76);
			setState(379); match(5);
			setState(380); objectName();
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

	public static class RepeatBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); match(22);
			setState(383); formula();
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

	public static class SetBrightnessBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(46);
			setState(386); match(11);
			setState(387); match(5);
			setState(388); formula();
			setState(389); match(12);
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

	public static class SetGhostEffectBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(46);
			setState(392); match(64);
			setState(393); match(24);
			setState(394); match(5);
			setState(395); formula();
			setState(396); match(12);
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

	public static class SetLookBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); match(73);
			setState(399); match(5);
			setState(400); match(32);
			setState(401); look();
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

	public static class SetSizeToBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); match(46);
			setState(404); match(8);
			setState(405); match(5);
			setState(406); formula();
			setState(407); match(12);
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

	public static class SetVariableBrickContext extends ParserRuleContext {
		public UserVariableContext userVariable;
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(46);
			setState(410); match(13);
			setState(411); ((SetVariableBrickContext)_localctx).userVariable = userVariable();
			setState(412); match(5);
			setState(413); formula();
			variables.add((((SetVariableBrickContext)_localctx).userVariable!=null?_input.getText(((SetVariableBrickContext)_localctx).userVariable.start,((SetVariableBrickContext)_localctx).userVariable.stop):null));
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

	public static class SetVolumeToBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(46);
			setState(417); match(43);
			setState(418); match(5);
			setState(419); formula();
			setState(420); match(12);
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

	public static class SetXBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(46);
			setState(423); match(18);
			setState(424); match(5);
			setState(425); formula();
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

	public static class SetYBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(46);
			setState(428); match(44);
			setState(429); match(5);
			setState(430); formula();
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

	public static class ShowBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); match(67);
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

	public static class SpeakBrickContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(68);
			setState(435); text();
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

	public static class StopAllSoundsBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(2);
			setState(438); match(47);
			setState(439); match(52);
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

	public static class TurnLeftBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); match(15);
			setState(442); match(1);
			setState(443); formula();
			setState(444); match(34);
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

	public static class TurnRightBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(15);
			setState(447); match(70);
			setState(448); formula();
			setState(449); match(34);
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

	public static class WaitBrickContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); match(48);
			setState(452); formula();
			setState(453); match(17);
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

	public static class ActionContext extends ParserRuleContext {
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
			setState(455); match(ACTION);
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
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(CatrobatScriptParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CatrobatScriptParser.BRACKET_OPEN, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(BRACKET_OPEN);
			{
			setState(459); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(458); token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(461); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
			setState(463); match(BRACKET_CLOSE);
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

	public static class LookContext extends ParserRuleContext {
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
			setState(465); match(USER_VARIABLE);
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
		enterRule(_localctx, 110, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); match(USER_VARIABLE);
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
		enterRule(_localctx, 112, RULE_motor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); match(USER_VARIABLE);
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
		enterRule(_localctx, 114, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471); match(USER_VARIABLE);
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
		enterRule(_localctx, 116, RULE_sound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); match(USER_VARIABLE);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode USER_VARIABLE() { return getToken(CatrobatScriptParser.USER_VARIABLE, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CatrobatScriptListener ) ((CatrobatScriptListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(USER_VARIABLE);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); match(USER_VARIABLE);
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

	public static class TokenContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (USER_VARIABLE - 77)) | (1L << (NUMBER - 77)) | (1L << (FUNCTION_NAME - 77)) | (1L << (OPERATOR - 77)) | (1L << (SENSOR - 77)) | (1L << (BRACKET_OPEN - 77)) | (1L << (BRACKET_CLOSE - 77)) | (1L << (FUNCTION_PARAMETER_DELIMITER - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\2\3X\u01e4\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\3\2\3\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00cd\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0112"+
		"\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u012d"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\33\6\33\u0135\n\33\r\33\16\33\u0136\3"+
		"\33\5\33\u013a\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0150\n\36\3\36"+
		"\3\36\3\36\5\36\u0155\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u016e\n#\3#\3#\3#\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\6\67\u01ce\n\67\r\67"+
		"\16\67\u01cf\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\3?\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\3\3OV\u01de\2\u0083\3\2\2\2\4\u0086"+
		"\3\2\2\2\6\u008c\3\2\2\2\b\u0091\3\2\2\2\n\u009b\3\2\2\2\f\u00cc\3\2\2"+
		"\2\16\u00ce\3\2\2\2\20\u00d1\3\2\2\2\22\u00d6\3\2\2\2\24\u00dc\3\2\2\2"+
		"\26\u00e3\3\2\2\2\30\u00e9\3\2\2\2\32\u00f0\3\2\2\2\34\u00f6\3\2\2\2\36"+
		"\u00fb\3\2\2\2 \u0100\3\2\2\2\"\u0104\3\2\2\2$\u0108\3\2\2\2&\u010a\3"+
		"\2\2\2(\u0116\3\2\2\2*\u011b\3\2\2\2,\u011d\3\2\2\2.\u0123\3\2\2\2\60"+
		"\u0125\3\2\2\2\62\u0128\3\2\2\2\64\u0130\3\2\2\2\66\u013e\3\2\2\28\u0143"+
		"\3\2\2\2:\u014b\3\2\2\2<\u015a\3\2\2\2>\u015e\3\2\2\2@\u0162\3\2\2\2B"+
		"\u0165\3\2\2\2D\u0168\3\2\2\2F\u0172\3\2\2\2H\u0176\3\2\2\2J\u017c\3\2"+
		"\2\2L\u0180\3\2\2\2N\u0183\3\2\2\2P\u0189\3\2\2\2R\u0190\3\2\2\2T\u0195"+
		"\3\2\2\2V\u019b\3\2\2\2X\u01a2\3\2\2\2Z\u01a8\3\2\2\2\\\u01ad\3\2\2\2"+
		"^\u01b2\3\2\2\2`\u01b4\3\2\2\2b\u01b7\3\2\2\2d\u01bb\3\2\2\2f\u01c0\3"+
		"\2\2\2h\u01c5\3\2\2\2j\u01c9\3\2\2\2l\u01cb\3\2\2\2n\u01d3\3\2\2\2p\u01d5"+
		"\3\2\2\2r\u01d7\3\2\2\2t\u01d9\3\2\2\2v\u01db\3\2\2\2x\u01dd\3\2\2\2z"+
		"\u01df\3\2\2\2|\u01e1\3\2\2\2~\u0082\5\4\3\2\177\u0082\5\6\4\2\u0080\u0082"+
		"\5\b\5\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\3\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7\36\2\2\u0087\u0088\7+\2\2\u0088\u0089\7\31"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5\n\6\2\u008b\5\3\2\2\2\u008c\u008d"+
		"\7\36\2\2\u008d\u008e\5j\66\2\u008e\u008f\3\2\2\2\u008f\u0090\5\n\6\2"+
		"\u0090\7\3\2\2\2\u0091\u0092\7\36\2\2\u0092\u0093\7\b\2\2\u0093\u0094"+
		"\7(\2\2\u0094\u0095\5p9\2\u0095\u0096\3\2\2\2\u0096\u0097\5\n\6\2\u0097"+
		"\t\3\2\2\2\u0098\u009a\5\f\7\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\13\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00cd\5\16\b\2\u009f\u00cd\5\20\t\2\u00a0\u00cd\5\22\n"+
		"\2\u00a1\u00cd\5\24\13\2\u00a2\u00cd\5\26\f\2\u00a3\u00cd\5\30\r\2\u00a4"+
		"\u00cd\5\32\16\2\u00a5\u00cd\5\34\17\2\u00a6\u00cd\5\36\20\2\u00a7\u00cd"+
		"\5 \21\2\u00a8\u00cd\5\"\22\2\u00a9\u00cd\5$\23\2\u00aa\u00cd\5&\24\2"+
		"\u00ab\u00cd\5(\25\2\u00ac\u00cd\5*\26\2\u00ad\u00cd\5,\27\2\u00ae\u00cd"+
		"\5.\30\2\u00af\u00cd\5\60\31\2\u00b0\u00cd\5\62\32\2\u00b1\u00cd\5\64"+
		"\33\2\u00b2\u00cd\5\66\34\2\u00b3\u00cd\58\35\2\u00b4\u00cd\5:\36\2\u00b5"+
		"\u00cd\5<\37\2\u00b6\u00cd\5> \2\u00b7\u00cd\5@!\2\u00b8\u00cd\5B\"\2"+
		"\u00b9\u00cd\5D#\2\u00ba\u00cd\5F$\2\u00bb\u00cd\5H%\2\u00bc\u00cd\5J"+
		"&\2\u00bd\u00cd\5L\'\2\u00be\u00cd\5N(\2\u00bf\u00cd\5P)\2\u00c0\u00cd"+
		"\5R*\2\u00c1\u00cd\5T+\2\u00c2\u00cd\5V,\2\u00c3\u00cd\5X-\2\u00c4\u00cd"+
		"\5Z.\2\u00c5\u00cd\5\\/\2\u00c6\u00cd\5^\60\2\u00c7\u00cd\5`\61\2\u00c8"+
		"\u00cd\5b\62\2\u00c9\u00cd\5d\63\2\u00ca\u00cd\5f\64\2\u00cb\u00cd\5h"+
		"\65\2\u00cc\u009e\3\2\2\2\u00cc\u009f\3\2\2\2\u00cc\u00a0\3\2\2\2\u00cc"+
		"\u00a1\3\2\2\2\u00cc\u00a2\3\2\2\2\u00cc\u00a3\3\2\2\2\u00cc\u00a4\3\2"+
		"\2\2\u00cc\u00a5\3\2\2\2\u00cc\u00a6\3\2\2\2\u00cc\u00a7\3\2\2\2\u00cc"+
		"\u00a8\3\2\2\2\u00cc\u00a9\3\2\2\2\u00cc\u00aa\3\2\2\2\u00cc\u00ab\3\2"+
		"\2\2\u00cc\u00ac\3\2\2\2\u00cc\u00ad\3\2\2\2\u00cc\u00ae\3\2\2\2\u00cc"+
		"\u00af\3\2\2\2\u00cc\u00b0\3\2\2\2\u00cc\u00b1\3\2\2\2\u00cc\u00b2\3\2"+
		"\2\2\u00cc\u00b3\3\2\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00b5\3\2\2\2\u00cc"+
		"\u00b6\3\2\2\2\u00cc\u00b7\3\2\2\2\u00cc\u00b8\3\2\2\2\u00cc\u00b9\3\2"+
		"\2\2\u00cc\u00ba\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cc\u00bc\3\2\2\2\u00cc"+
		"\u00bd\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc\u00bf\3\2\2\2\u00cc\u00c0\3\2"+
		"\2\2\u00cc\u00c1\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc"+
		"\u00c4\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2"+
		"\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\r\3\2\2\2\u00ce\u00cf\7\35\2\2\u00cf\u00d0\5p9\2"+
		"\u00d0\17\3\2\2\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3\7\63\2\2\u00d3\u00d4"+
		"\7\62\2\2\u00d4\u00d5\5p9\2\u00d5\21\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7"+
		"\u00d8\7\r\2\2\u00d8\u00d9\7\t\2\2\u00d9\u00da\5l\67\2\u00da\u00db\7\16"+
		"\2\2\u00db\23\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\7B\2\2\u00de\u00df"+
		"\7\32\2\2\u00df\u00e0\7\t\2\2\u00e0\u00e1\5l\67\2\u00e1\u00e2\7\16\2\2"+
		"\u00e2\25\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5\7\n\2\2\u00e5\u00e6\7"+
		"\t\2\2\u00e6\u00e7\5l\67\2\u00e7\u00e8\7\16\2\2\u00e8\27\3\2\2\2\u00e9"+
		"\u00ea\7,\2\2\u00ea\u00eb\7\17\2\2\u00eb\u00ec\5z>\2\u00ec\u00ed\7\t\2"+
		"\2\u00ed\u00ee\5l\67\2\u00ee\u00ef\b\r\1\2\u00ef\31\3\2\2\2\u00f0\u00f1"+
		"\7,\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4\5l\67\2\u00f4"+
		"\u00f5\7\16\2\2\u00f5\33\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8\7\24\2"+
		"\2\u00f8\u00f9\7\t\2\2\u00f9\u00fa\5l\67\2\u00fa\35\3\2\2\2\u00fb\u00fc"+
		"\7,\2\2\u00fc\u00fd\7.\2\2\u00fd\u00fe\7\t\2\2\u00fe\u00ff\5l\67\2\u00ff"+
		"\37\3\2\2\2\u0100\u0101\7?\2\2\u0101\u0102\7L\2\2\u0102\u0103\7:\2\2\u0103"+
		"!\3\2\2\2\u0104\u0105\7D\2\2\u0105\u0106\7\7\2\2\u0106\u0107\7G\2\2\u0107"+
		"#\3\2\2\2\u0108\u0109\7%\2\2\u0109%\3\2\2\2\u010a\u010b\7\22\2\2\u010b"+
		"\u010c\5l\67\2\u010c\u010d\7\23\2\2\u010d\u010e\7\7\2\2\u010e\u010f\7"+
		"\6\2\2\u010f\u0111\5l\67\2\u0110\u0112\7V\2\2\u0111\u0110\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\5\2\2\u0114\u0115\5l"+
		"\67\2\u0115\'\3\2\2\2\u0116\u0117\79\2\2\u0117\u0118\7\34\2\2\u0118\u0119"+
		"\5l\67\2\u0119\u011a\7@\2\2\u011a)\3\2\2\2\u011b\u011c\7#\2\2\u011c+\3"+
		"\2\2\2\u011d\u011e\7)\2\2\u011e\u011f\5l\67\2\u011f\u0120\7<\2\2\u0120"+
		"\u0121\78\2\2\u0121\u0122\7I\2\2\u0122-\3\2\2\2\u0123\u0124\7\65\2\2\u0124"+
		"/\3\2\2\2\u0125\u0126\7M\2\2\u0126\u0127\7)\2\2\u0127\61\3\2\2\2\u0128"+
		"\u0129\7)\2\2\u0129\u012a\7\20\2\2\u012a\u012c\7 \2\2\u012b\u012d\7V\2"+
		"\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\7/\2\2\u012f\63\3\2\2\2\u0130\u0131\7=\2\2\u0131\u0132\7!\2\2\u0132\u0134"+
		"\7\67\2\2\u0133\u0135\5r:\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\7V"+
		"\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\7\64\2\2\u013c\u013d\5l\67\2\u013d\65\3\2\2\2\u013e\u013f\7=\2"+
		"\2\u013f\u0140\7\4\2\2\u0140\u0141\7\67\2\2\u0141\u0142\5r:\2\u0142\67"+
		"\3\2\2\2\u0143\u0144\7=\2\2\u0144\u0145\7\21\2\2\u0145\u0146\7\67\2\2"+
		"\u0146\u0147\5r:\2\u0147\u0148\7\7\2\2\u0148\u0149\5l\67\2\u0149\u014a"+
		"\7$\2\2\u014a9\3\2\2\2\u014b\u014c\7=\2\2\u014c\u014d\7J\2\2\u014d\u014f"+
		"\7;\2\2\u014e\u0150\7V\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\7A\2\2\u0152\u0154\5l\67\2\u0153\u0155\7V\2"+
		"\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\7\25\2\2\u0157\u0158\5l\67\2\u0158\u0159\7\23\2\2\u0159;\3\2\2\2\u015a"+
		"\u015b\7M\2\2\u015b\u015c\7\'\2\2\u015c\u015d\7>\2\2\u015d=\3\2\2\2\u015e"+
		"\u015f\7!\2\2\u015f\u0160\5l\67\2\u0160\u0161\7\26\2\2\u0161?\3\2\2\2"+
		"\u0162\u0163\7\f\2\2\u0163\u0164\7\"\2\2\u0164A\3\2\2\2\u0165\u0166\7"+
		"*\2\2\u0166\u0167\5x=\2\u0167C\3\2\2\2\u0168\u0169\7\27\2\2\u0169\u016a"+
		"\7\33\2\2\u016a\u016b\7\6\2\2\u016b\u016d\5l\67\2\u016c\u016e\7V\2\2\u016d"+
		"\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\5"+
		"\2\2\u0170\u0171\5l\67\2\u0171E\3\2\2\2\u0172\u0173\7C\2\2\u0173\u0174"+
		"\7\13\2\2\u0174\u0175\5v<\2\u0175G\3\2\2\2\u0176\u0177\7N\2\2\u0177\u0178"+
		"\7&\2\2\u0178\u0179\7\37\2\2\u0179\u017a\5l\67\2\u017a\u017b\7$\2\2\u017b"+
		"I\3\2\2\2\u017c\u017d\7N\2\2\u017d\u017e\7\7\2\2\u017e\u017f\5t;\2\u017f"+
		"K\3\2\2\2\u0180\u0181\7\30\2\2\u0181\u0182\5l\67\2\u0182M\3\2\2\2\u0183"+
		"\u0184\7\60\2\2\u0184\u0185\7\r\2\2\u0185\u0186\7\7\2\2\u0186\u0187\5"+
		"l\67\2\u0187\u0188\7\16\2\2\u0188O\3\2\2\2\u0189\u018a\7\60\2\2\u018a"+
		"\u018b\7B\2\2\u018b\u018c\7\32\2\2\u018c\u018d\7\7\2\2\u018d\u018e\5l"+
		"\67\2\u018e\u018f\7\16\2\2\u018fQ\3\2\2\2\u0190\u0191\7K\2\2\u0191\u0192"+
		"\7\7\2\2\u0192\u0193\7\"\2\2\u0193\u0194\5n8\2\u0194S\3\2\2\2\u0195\u0196"+
		"\7\60\2\2\u0196\u0197\7\n\2\2\u0197\u0198\7\7\2\2\u0198\u0199\5l\67\2"+
		"\u0199\u019a\7\16\2\2\u019aU\3\2\2\2\u019b\u019c\7\60\2\2\u019c\u019d"+
		"\7\17\2\2\u019d\u019e\5z>\2\u019e\u019f\7\7\2\2\u019f\u01a0\5l\67\2\u01a0"+
		"\u01a1\b,\1\2\u01a1W\3\2\2\2\u01a2\u01a3\7\60\2\2\u01a3\u01a4\7-\2\2\u01a4"+
		"\u01a5\7\7\2\2\u01a5\u01a6\5l\67\2\u01a6\u01a7\7\16\2\2\u01a7Y\3\2\2\2"+
		"\u01a8\u01a9\7\60\2\2\u01a9\u01aa\7\24\2\2\u01aa\u01ab\7\7\2\2\u01ab\u01ac"+
		"\5l\67\2\u01ac[\3\2\2\2\u01ad\u01ae\7\60\2\2\u01ae\u01af\7.\2\2\u01af"+
		"\u01b0\7\7\2\2\u01b0\u01b1\5l\67\2\u01b1]\3\2\2\2\u01b2\u01b3\7E\2\2\u01b3"+
		"_\3\2\2\2\u01b4\u01b5\7F\2\2\u01b5\u01b6\5x=\2\u01b6a\3\2\2\2\u01b7\u01b8"+
		"\7\4\2\2\u01b8\u01b9\7\61\2\2\u01b9\u01ba\7\66\2\2\u01bac\3\2\2\2\u01bb"+
		"\u01bc\7\21\2\2\u01bc\u01bd\7\3\2\2\u01bd\u01be\5l\67\2\u01be\u01bf\7"+
		"$\2\2\u01bfe\3\2\2\2\u01c0\u01c1\7\21\2\2\u01c1\u01c2\7H\2\2\u01c2\u01c3"+
		"\5l\67\2\u01c3\u01c4\7$\2\2\u01c4g\3\2\2\2\u01c5\u01c6\7\62\2\2\u01c6"+
		"\u01c7\5l\67\2\u01c7\u01c8\7\23\2\2\u01c8i\3\2\2\2\u01c9\u01ca\7W\2\2"+
		"\u01cak\3\2\2\2\u01cb\u01cd\7T\2\2\u01cc\u01ce\5|?\2\u01cd\u01cc\3\2\2"+
		"\2\u01ce\u01cf\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\u01d2\7U\2\2\u01d2m\3\2\2\2\u01d3\u01d4\7O\2\2\u01d4o\3"+
		"\2\2\2\u01d5\u01d6\7O\2\2\u01d6q\3\2\2\2\u01d7\u01d8\7O\2\2\u01d8s\3\2"+
		"\2\2\u01d9\u01da\7O\2\2\u01dau\3\2\2\2\u01db\u01dc\7O\2\2\u01dcw\3\2\2"+
		"\2\u01dd\u01de\7O\2\2\u01dey\3\2\2\2\u01df\u01e0\7O\2\2\u01e0{\3\2\2\2"+
		"\u01e1\u01e2\t\2\2\2\u01e2}\3\2\2\2\16\u0081\u0083\u009b\u00cc\u0111\u012c"+
		"\u0136\u0139\u014f\u0154\u016d\u01cf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}