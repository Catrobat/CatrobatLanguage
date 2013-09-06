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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class CatrobatScriptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__75 = 1, T__74 = 2, T__73 = 3, T__72 = 4,
			T__71 = 5, T__70 = 6, T__69 = 7, T__68 = 8, T__67 = 9, T__66 = 10,
			T__65 = 11, T__64 = 12, T__63 = 13, T__62 = 14, T__61 = 15,
			T__60 = 16, T__59 = 17, T__58 = 18, T__57 = 19, T__56 = 20,
			T__55 = 21, T__54 = 22, T__53 = 23, T__52 = 24, T__51 = 25,
			T__50 = 26, T__49 = 27, T__48 = 28, T__47 = 29, T__46 = 30,
			T__45 = 31, T__44 = 32, T__43 = 33, T__42 = 34, T__41 = 35,
			T__40 = 36, T__39 = 37, T__38 = 38, T__37 = 39, T__36 = 40,
			T__35 = 41, T__34 = 42, T__33 = 43, T__32 = 44, T__31 = 45,
			T__30 = 46, T__29 = 47, T__28 = 48, T__27 = 49, T__26 = 50,
			T__25 = 51, T__24 = 52, T__23 = 53, T__22 = 54, T__21 = 55,
			T__20 = 56, T__19 = 57, T__18 = 58, T__17 = 59, T__16 = 60,
			T__15 = 61, T__14 = 62, T__13 = 63, T__12 = 64, T__11 = 65,
			T__10 = 66, T__9 = 67, T__8 = 68, T__7 = 69, T__6 = 70, T__5 = 71,
			T__4 = 72, T__3 = 73, T__2 = 74, T__1 = 75, T__0 = 76,
			USER_VARIABLE = 77, NUMBER = 78, FUNCTION_NAME = 79, OPERATOR = 80,
			SENSOR = 81, BRACKET_OPEN = 82, BRACKET_CLOSE = 83,
			FUNCTION_PARAMETER_DELIMITER = 84, ACTION = 85, WS = 86;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "'left'",
			"'stop'", "'Y:'", "'X:'", "'to'", "'I'", "'by'", "'size'",
			"'sound'", "'next'", "'brightness'", "'%'", "'variable'", "'on'",
			"'turn'", "'glide'", "'seconds'", "'X'", "'duration:'", "'steps'",
			"'place'", "'repeat'", "'started'", "'effect'", "'at'", "'back'",
			"'broadcast'", "'when'", "'direction'", "'edge'", "'move'",
			"'look'", "'hide'", "'degrees'", "'forever'", "'in'", "'of'",
			"'receive'", "'if'", "'note'", "'program'", "'change'", "'volume'",
			"'Y'", "'bounce'", "'set'", "'all'", "'wait'", "'and'", "'speed'",
			"'else'", "'sounds'", "'motor'", "'true'", "'go'", "'effects'",
			"'tone'", "'is'", "'NXT'", "'loop'", "'clear'", "'layers'",
			"'frequency:'", "'ghost'", "'start'", "'come'", "'show'",
			"'speak'", "'front'", "'right'", "'then'", "'play'", "'switch'",
			"'graphic'", "'end'", "'point'", "USER_VARIABLE", "NUMBER",
			"FUNCTION_NAME", "OPERATOR", "SENSOR", "'('", "')'", "','",
			"'Tapped'", "WS" };
	public static final String[] ruleNames = { "T__75", "T__74", "T__73",
			"T__72", "T__71", "T__70", "T__69", "T__68", "T__67", "T__66",
			"T__65", "T__64", "T__63", "T__62", "T__61", "T__60", "T__59",
			"T__58", "T__57", "T__56", "T__55", "T__54", "T__53", "T__52",
			"T__51", "T__50", "T__49", "T__48", "T__47", "T__46", "T__45",
			"T__44", "T__43", "T__42", "T__41", "T__40", "T__39", "T__38",
			"T__37", "T__36", "T__35", "T__34", "T__33", "T__32", "T__31",
			"T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24",
			"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17",
			"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10",
			"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2",
			"T__1", "T__0", "USER_VARIABLE", "NUMBER", "FUNCTION_NAME",
			"OPERATOR", "SENSOR", "BRACKET_OPEN", "BRACKET_CLOSE",
			"FUNCTION_PARAMETER_DELIMITER", "ACTION", "WS", "STRING",
			"OPERATOR_SYMBOL", "ADDITIONAL_SYMBOL", "SYMBOL", "DIGIT", "LETTER" };

	private Map<String, UserVariable> variables = new HashMap<String, UserVariable>();

	public List<UserVariable> getVariables() {
		return new ArrayList<UserVariable>(variables.values());
	}

	private Map<String, UserVariable> programVariables;

	public void setProgramVariables(List<UserVariable> list) {
		programVariables = new HashMap<String, UserVariable>();
		for (UserVariable item : list) {
			programVariables.put(item.getName(), item);
		}
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

	private void changeBrick(Script script, Brick oldBrick, Brick newBrick) {
		int index = script.getBrickList().indexOf(oldBrick);
		script.getBrickList().remove(oldBrick);
		script.getBrickList().add(index, newBrick);
	}

	private void setAllInnerBricks() {
		for (Script script : scriptList) {
			Stack<Brick> stack = new Stack<Brick>();
			for (int i = 0; i < script.getBrickList().size(); i++) {
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
		((IfLogicBeginBrick) ifBrick).setIfEndBrick((IfLogicEndBrick) item);

		((IfLogicElseBrick) elseBrick)
				.setIfBeginBrick((IfLogicBeginBrick) ifBrick);
		((IfLogicElseBrick) elseBrick).setIfEndBrick((IfLogicEndBrick) item);

		((IfLogicEndBrick) item).setIfBeginBrick((IfLogicBeginBrick) ifBrick);
		((IfLogicEndBrick) item).setIfElseBrick((IfLogicElseBrick) elseBrick);
	}

	private void setLoopReferences(Brick item, Brick beginBrick) {
		((LoopBeginBrick) beginBrick).setLoopEndBrick((LoopEndBrick) item);
		((LoopEndBrick) item).setLoopBeginBrick((LoopBeginBrick) beginBrick);
	}

	public CatrobatScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "CatrobatScript.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 85:
			WS_action((RuleContext) _localctx, actionIndex);
			break;
		}
	}

	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN = "\2\4X\u03ab\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"
			+ "\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"
			+ "\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"
			+ "\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"
			+ "\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"
			+ "(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"
			+ "\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"
			+ ":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"
			+ "E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"
			+ "Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t"
			+ "\\\4]\t]\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"
			+ "\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"
			+ "\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"
			+ "\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"
			+ "\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"
			+ "\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"
			+ "\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"
			+ "\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"
			+ "\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33"
			+ "\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"
			+ "\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"
			+ "\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"
			+ "\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3"
			+ "&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*"
			+ "\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3."
			+ "\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"
			+ "\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"
			+ "\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"
			+ "\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\39\39\39\39\3:\3:"
			+ "\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?"
			+ "\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B"
			+ "\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F"
			+ "\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J"
			+ "\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N"
			+ "\3N\3N\3N\3O\6O\u026a\nO\rO\16O\u026b\3O\3O\6O\u0270\nO\rO\16O\u0271\5"
			+ "O\u0274\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"
			+ "P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"
			+ "P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"
			+ "P\3P\3P\3P\3P\3P\5P\u02bd\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"
			+ "Q\3Q\3Q\5Q\u02cf\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"
			+ "R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"
			+ "R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"
			+ "R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"
			+ "R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"
			+ "R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"
			+ "R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"
			+ "R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u037f\n"
			+ "R\3S\3S\3T\3T\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\5W\u0390\nW\3W\3W\5W\u0394"
			+ "\nW\3W\3W\3X\3X\3X\3X\3X\6X\u039d\nX\rX\16X\u039e\3Y\3Y\3Z\3Z\3[\3[\3"
			+ "\\\3\\\3]\5]\u03aa\n]\2^\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"
			+ "\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1"
			+ "%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\1"
			+ "9\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1"
			+ "Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s"
			+ ";\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\1\u0085D\1\u0087E\1\u0089"
			+ "F\1\u008bG\1\u008dH\1\u008fI\1\u0091J\1\u0093K\1\u0095L\1\u0097M\1\u0099"
			+ "N\1\u009bO\1\u009dP\1\u009fQ\1\u00a1R\1\u00a3S\1\u00a5T\1\u00a7U\1\u00a9"
			+ "V\1\u00abW\1\u00adX\2\u00af\2\1\u00b1\2\1\u00b3\2\1\u00b5\2\1\u00b7\2"
			+ "\1\u00b9\2\1\3\2\6\t\'\',-//\61\61>>@@``\b\'\',-//\61\61>@``\r##%&(+."
			+ ".<=AB]]__aa}}\177\u0080\4C\\c|\u03d4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"
			+ "\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"
			+ "\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"
			+ "\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"
			+ "\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"
			+ "\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"
			+ "\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"
			+ "\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["
			+ "\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"
			+ "\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"
			+ "\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"
			+ "\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"
			+ "\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"
			+ "\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"
			+ "\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"
			+ "\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"
			+ "\3\2\2\2\3\u00bb\3\2\2\2\5\u00c0\3\2\2\2\7\u00c5\3\2\2\2\t\u00c8\3\2\2"
			+ "\2\13\u00cb\3\2\2\2\r\u00ce\3\2\2\2\17\u00d0\3\2\2\2\21\u00d3\3\2\2\2"
			+ "\23\u00d8\3\2\2\2\25\u00de\3\2\2\2\27\u00e3\3\2\2\2\31\u00ee\3\2\2\2\33"
			+ "\u00f0\3\2\2\2\35\u00f9\3\2\2\2\37\u00fc\3\2\2\2!\u0101\3\2\2\2#\u0107"
			+ "\3\2\2\2%\u010f\3\2\2\2\'\u0111\3\2\2\2)\u011b\3\2\2\2+\u0121\3\2\2\2"
			+ "-\u0127\3\2\2\2/\u012e\3\2\2\2\61\u0136\3\2\2\2\63\u013d\3\2\2\2\65\u0140"
			+ "\3\2\2\2\67\u0145\3\2\2\29\u014f\3\2\2\2;\u0154\3\2\2\2=\u015e\3\2\2\2"
			+ "?\u0163\3\2\2\2A\u0168\3\2\2\2C\u016d\3\2\2\2E\u0172\3\2\2\2G\u017a\3"
			+ "\2\2\2I\u0182\3\2\2\2K\u0185\3\2\2\2M\u0188\3\2\2\2O\u0190\3\2\2\2Q\u0193"
			+ "\3\2\2\2S\u0198\3\2\2\2U\u01a0\3\2\2\2W\u01a7\3\2\2\2Y\u01ae\3\2\2\2["
			+ "\u01b0\3\2\2\2]\u01b7\3\2\2\2_\u01bb\3\2\2\2a\u01bf\3\2\2\2c\u01c4\3\2"
			+ "\2\2e\u01c8\3\2\2\2g\u01ce\3\2\2\2i\u01d3\3\2\2\2k\u01da\3\2\2\2m\u01e0"
			+ "\3\2\2\2o\u01e5\3\2\2\2q\u01e8\3\2\2\2s\u01f0\3\2\2\2u\u01f5\3\2\2\2w"
			+ "\u01f8\3\2\2\2y\u01fc\3\2\2\2{\u0201\3\2\2\2}\u0207\3\2\2\2\177\u020e"
			+ "\3\2\2\2\u0081\u0219\3\2\2\2\u0083\u021f\3\2\2\2\u0085\u0225\3\2\2\2\u0087"
			+ "\u022a\3\2\2\2\u0089\u022f\3\2\2\2\u008b\u0235\3\2\2\2\u008d\u023b\3\2"
			+ "\2\2\u008f\u0241\3\2\2\2\u0091\u0246\3\2\2\2\u0093\u024b\3\2\2\2\u0095"
			+ "\u0252\3\2\2\2\u0097\u025a\3\2\2\2\u0099\u025e\3\2\2\2\u009b\u0264\3\2"
			+ "\2\2\u009d\u0269\3\2\2\2\u009f\u02bc\3\2\2\2\u00a1\u02ce\3\2\2\2\u00a3"
			+ "\u037e\3\2\2\2\u00a5\u0380\3\2\2\2\u00a7\u0382\3\2\2\2\u00a9\u0384\3\2"
			+ "\2\2\u00ab\u0386\3\2\2\2\u00ad\u0393\3\2\2\2\u00af\u039c\3\2\2\2\u00b1"
			+ "\u03a0\3\2\2\2\u00b3\u03a2\3\2\2\2\u00b5\u03a4\3\2\2\2\u00b7\u03a6\3\2"
			+ "\2\2\u00b9\u03a9\3\2\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"
			+ "\7h\2\2\u00be\u00bf\7v\2\2\u00bf\4\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2"
			+ "\7v\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7r\2\2\u00c4\6\3\2\2\2\u00c5\u00c6"
			+ "\7[\2\2\u00c6\u00c7\7<\2\2\u00c7\b\3\2\2\2\u00c8\u00c9\7Z\2\2\u00c9\u00ca"
			+ "\7<\2\2\u00ca\n\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7q\2\2\u00cd\f"
			+ "\3\2\2\2\u00ce\u00cf\7K\2\2\u00cf\16\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1"
			+ "\u00d2\7{\2\2\u00d2\20\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7k\2\2\u00d5"
			+ "\u00d6\7|\2\2\u00d6\u00d7\7g\2\2\u00d7\22\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9"
			+ "\u00da\7q\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7f\2\2"
			+ "\u00dd\24\3\2\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7"
			+ "z\2\2\u00e1\u00e2\7v\2\2\u00e2\26\3\2\2\2\u00e3\u00e4\7d\2\2\u00e4\u00e5"
			+ "\7t\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7i\2\2\u00e7\u00e8\7j\2\2\u00e8"
			+ "\u00e9\7v\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7u\2\2"
			+ "\u00ec\u00ed\7u\2\2\u00ed\30\3\2\2\2\u00ee\u00ef\7\'\2\2\u00ef\32\3\2"
			+ "\2\2\u00f0\u00f1\7x\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4"
			+ "\7k\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7d\2\2\u00f6\u00f7\7n\2\2\u00f7"
			+ "\u00f8\7g\2\2\u00f8\34\3\2\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7p\2\2\u00fb"
			+ "\36\3\2\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7t\2\2\u00ff"
			+ "\u0100\7p\2\2\u0100 \3\2\2\2\u0101\u0102\7i\2\2\u0102\u0103\7n\2\2\u0103"
			+ "\u0104\7k\2\2\u0104\u0105\7f\2\2\u0105\u0106\7g\2\2\u0106\"\3\2\2\2\u0107"
			+ "\u0108\7u\2\2\u0108\u0109\7g\2\2\u0109\u010a\7e\2\2\u010a\u010b\7q\2\2"
			+ "\u010b\u010c\7p\2\2\u010c\u010d\7f\2\2\u010d\u010e\7u\2\2\u010e$\3\2\2"
			+ "\2\u010f\u0110\7Z\2\2\u0110&\3\2\2\2\u0111\u0112\7f\2\2\u0112\u0113\7"
			+ "w\2\2\u0113\u0114\7t\2\2\u0114\u0115\7c\2\2\u0115\u0116\7v\2\2\u0116\u0117"
			+ "\7k\2\2\u0117\u0118\7q\2\2\u0118\u0119\7p\2\2\u0119\u011a\7<\2\2\u011a"
			+ "(\3\2\2\2\u011b\u011c\7u\2\2\u011c\u011d\7v\2\2\u011d\u011e\7g\2\2\u011e"
			+ "\u011f\7r\2\2\u011f\u0120\7u\2\2\u0120*\3\2\2\2\u0121\u0122\7r\2\2\u0122"
			+ "\u0123\7n\2\2\u0123\u0124\7c\2\2\u0124\u0125\7e\2\2\u0125\u0126\7g\2\2"
			+ "\u0126,\3\2\2\2\u0127\u0128\7t\2\2\u0128\u0129\7g\2\2\u0129\u012a\7r\2"
			+ "\2\u012a\u012b\7g\2\2\u012b\u012c\7c\2\2\u012c\u012d\7v\2\2\u012d.\3\2"
			+ "\2\2\u012e\u012f\7u\2\2\u012f\u0130\7v\2\2\u0130\u0131\7c\2\2\u0131\u0132"
			+ "\7t\2\2\u0132\u0133\7v\2\2\u0133\u0134\7g\2\2\u0134\u0135\7f\2\2\u0135"
			+ "\60\3\2\2\2\u0136\u0137\7g\2\2\u0137\u0138\7h\2\2\u0138\u0139\7h\2\2\u0139"
			+ "\u013a\7g\2\2\u013a\u013b\7e\2\2\u013b\u013c\7v\2\2\u013c\62\3\2\2\2\u013d"
			+ "\u013e\7c\2\2\u013e\u013f\7v\2\2\u013f\64\3\2\2\2\u0140\u0141\7d\2\2\u0141"
			+ "\u0142\7c\2\2\u0142\u0143\7e\2\2\u0143\u0144\7m\2\2\u0144\66\3\2\2\2\u0145"
			+ "\u0146\7d\2\2\u0146\u0147\7t\2\2\u0147\u0148\7q\2\2\u0148\u0149\7c\2\2"
			+ "\u0149\u014a\7f\2\2\u014a\u014b\7e\2\2\u014b\u014c\7c\2\2\u014c\u014d"
			+ "\7u\2\2\u014d\u014e\7v\2\2\u014e8\3\2\2\2\u014f\u0150\7y\2\2\u0150\u0151"
			+ "\7j\2\2\u0151\u0152\7g\2\2\u0152\u0153\7p\2\2\u0153:\3\2\2\2\u0154\u0155"
			+ "\7f\2\2\u0155\u0156\7k\2\2\u0156\u0157\7t\2\2\u0157\u0158\7g\2\2\u0158"
			+ "\u0159\7e\2\2\u0159\u015a\7v\2\2\u015a\u015b\7k\2\2\u015b\u015c\7q\2\2"
			+ "\u015c\u015d\7p\2\2\u015d<\3\2\2\2\u015e\u015f\7g\2\2\u015f\u0160\7f\2"
			+ "\2\u0160\u0161\7i\2\2\u0161\u0162\7g\2\2\u0162>\3\2\2\2\u0163\u0164\7"
			+ "o\2\2\u0164\u0165\7q\2\2\u0165\u0166\7x\2\2\u0166\u0167\7g\2\2\u0167@"
			+ "\3\2\2\2\u0168\u0169\7n\2\2\u0169\u016a\7q\2\2\u016a\u016b\7q\2\2\u016b"
			+ "\u016c\7m\2\2\u016cB\3\2\2\2\u016d\u016e\7j\2\2\u016e\u016f\7k\2\2\u016f"
			+ "\u0170\7f\2\2\u0170\u0171\7g\2\2\u0171D\3\2\2\2\u0172\u0173\7f\2\2\u0173"
			+ "\u0174\7g\2\2\u0174\u0175\7i\2\2\u0175\u0176\7t\2\2\u0176\u0177\7g\2\2"
			+ "\u0177\u0178\7g\2\2\u0178\u0179\7u\2\2\u0179F\3\2\2\2\u017a\u017b\7h\2"
			+ "\2\u017b\u017c\7q\2\2\u017c\u017d\7t\2\2\u017d\u017e\7g\2\2\u017e\u017f"
			+ "\7x\2\2\u017f\u0180\7g\2\2\u0180\u0181\7t\2\2\u0181H\3\2\2\2\u0182\u0183"
			+ "\7k\2\2\u0183\u0184\7p\2\2\u0184J\3\2\2\2\u0185\u0186\7q\2\2\u0186\u0187"
			+ "\7h\2\2\u0187L\3\2\2\2\u0188\u0189\7t\2\2\u0189\u018a\7g\2\2\u018a\u018b"
			+ "\7e\2\2\u018b\u018c\7g\2\2\u018c\u018d\7k\2\2\u018d\u018e\7x\2\2\u018e"
			+ "\u018f\7g\2\2\u018fN\3\2\2\2\u0190\u0191\7k\2\2\u0191\u0192\7h\2\2\u0192"
			+ "P\3\2\2\2\u0193\u0194\7p\2\2\u0194\u0195\7q\2\2\u0195\u0196\7v\2\2\u0196"
			+ "\u0197\7g\2\2\u0197R\3\2\2\2\u0198\u0199\7r\2\2\u0199\u019a\7t\2\2\u019a"
			+ "\u019b\7q\2\2\u019b\u019c\7i\2\2\u019c\u019d\7t\2\2\u019d\u019e\7c\2\2"
			+ "\u019e\u019f\7o\2\2\u019fT\3\2\2\2\u01a0\u01a1\7e\2\2\u01a1\u01a2\7j\2"
			+ "\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7i\2\2\u01a5\u01a6"
			+ "\7g\2\2\u01a6V\3\2\2\2\u01a7\u01a8\7x\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa"
			+ "\7n\2\2\u01aa\u01ab\7w\2\2\u01ab\u01ac\7o\2\2\u01ac\u01ad\7g\2\2\u01ad"
			+ "X\3\2\2\2\u01ae\u01af\7[\2\2\u01afZ\3\2\2\2\u01b0\u01b1\7d\2\2\u01b1\u01b2"
			+ "\7q\2\2\u01b2\u01b3\7w\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5\7e\2\2\u01b5"
			+ "\u01b6\7g\2\2\u01b6\\\3\2\2\2\u01b7\u01b8\7u\2\2\u01b8\u01b9\7g\2\2\u01b9"
			+ "\u01ba\7v\2\2\u01ba^\3\2\2\2\u01bb\u01bc\7c\2\2\u01bc\u01bd\7n\2\2\u01bd"
			+ "\u01be\7n\2\2\u01be`\3\2\2\2\u01bf\u01c0\7y\2\2\u01c0\u01c1\7c\2\2\u01c1"
			+ "\u01c2\7k\2\2\u01c2\u01c3\7v\2\2\u01c3b\3\2\2\2\u01c4\u01c5\7c\2\2\u01c5"
			+ "\u01c6\7p\2\2\u01c6\u01c7\7f\2\2\u01c7d\3\2\2\2\u01c8\u01c9\7u\2\2\u01c9"
			+ "\u01ca\7r\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7f\2\2"
			+ "\u01cdf\3\2\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7n\2\2\u01d0\u01d1\7u\2"
			+ "\2\u01d1\u01d2\7g\2\2\u01d2h\3\2\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5\7"
			+ "q\2\2\u01d5\u01d6\7w\2\2\u01d6\u01d7\7p\2\2\u01d7\u01d8\7f\2\2\u01d8\u01d9"
			+ "\7u\2\2\u01d9j\3\2\2\2\u01da\u01db\7o\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd"
			+ "\7v\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7t\2\2\u01dfl\3\2\2\2\u01e0\u01e1"
			+ "\7v\2\2\u01e1\u01e2\7t\2\2\u01e2\u01e3\7w\2\2\u01e3\u01e4\7g\2\2\u01e4"
			+ "n\3\2\2\2\u01e5\u01e6\7i\2\2\u01e6\u01e7\7q\2\2\u01e7p\3\2\2\2\u01e8\u01e9"
			+ "\7g\2\2\u01e9\u01ea\7h\2\2\u01ea\u01eb\7h\2\2\u01eb\u01ec\7g\2\2\u01ec"
			+ "\u01ed\7e\2\2\u01ed\u01ee\7v\2\2\u01ee\u01ef\7u\2\2\u01efr\3\2\2\2\u01f0"
			+ "\u01f1\7v\2\2\u01f1\u01f2\7q\2\2\u01f2\u01f3\7p\2\2\u01f3\u01f4\7g\2\2"
			+ "\u01f4t\3\2\2\2\u01f5\u01f6\7k\2\2\u01f6\u01f7\7u\2\2\u01f7v\3\2\2\2\u01f8"
			+ "\u01f9\7P\2\2\u01f9\u01fa\7Z\2\2\u01fa\u01fb\7V\2\2\u01fbx\3\2\2\2\u01fc"
			+ "\u01fd\7n\2\2\u01fd\u01fe\7q\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200\7r\2\2"
			+ "\u0200z\3\2\2\2\u0201\u0202\7e\2\2\u0202\u0203\7n\2\2\u0203\u0204\7g\2"
			+ "\2\u0204\u0205\7c\2\2\u0205\u0206\7t\2\2\u0206|\3\2\2\2\u0207\u0208\7"
			+ "n\2\2\u0208\u0209\7c\2\2\u0209\u020a\7{\2\2\u020a\u020b\7g\2\2\u020b\u020c"
			+ "\7t\2\2\u020c\u020d\7u\2\2\u020d~\3\2\2\2\u020e\u020f\7h\2\2\u020f\u0210"
			+ "\7t\2\2\u0210\u0211\7g\2\2\u0211\u0212\7s\2\2\u0212\u0213\7w\2\2\u0213"
			+ "\u0214\7g\2\2\u0214\u0215\7p\2\2\u0215\u0216\7e\2\2\u0216\u0217\7{\2\2"
			+ "\u0217\u0218\7<\2\2\u0218\u0080\3\2\2\2\u0219\u021a\7i\2\2\u021a\u021b"
			+ "\7j\2\2\u021b\u021c\7q\2\2\u021c\u021d\7u\2\2\u021d\u021e\7v\2\2\u021e"
			+ "\u0082\3\2\2\2\u021f\u0220\7u\2\2\u0220\u0221\7v\2\2\u0221\u0222\7c\2"
			+ "\2\u0222\u0223\7t\2\2\u0223\u0224\7v\2\2\u0224\u0084\3\2\2\2\u0225\u0226"
			+ "\7e\2\2\u0226\u0227\7q\2\2\u0227\u0228\7o\2\2\u0228\u0229\7g\2\2\u0229"
			+ "\u0086\3\2\2\2\u022a\u022b\7u\2\2\u022b\u022c\7j\2\2\u022c\u022d\7q\2"
			+ "\2\u022d\u022e\7y\2\2\u022e\u0088\3\2\2\2\u022f\u0230\7u\2\2\u0230\u0231"
			+ "\7r\2\2\u0231\u0232\7g\2\2\u0232\u0233\7c\2\2\u0233\u0234\7m\2\2\u0234"
			+ "\u008a\3\2\2\2\u0235\u0236\7h\2\2\u0236\u0237\7t\2\2\u0237\u0238\7q\2"
			+ "\2\u0238\u0239\7p\2\2\u0239\u023a\7v\2\2\u023a\u008c\3\2\2\2\u023b\u023c"
			+ "\7t\2\2\u023c\u023d\7k\2\2\u023d\u023e\7i\2\2\u023e\u023f\7j\2\2\u023f"
			+ "\u0240\7v\2\2\u0240\u008e\3\2\2\2\u0241\u0242\7v\2\2\u0242\u0243\7j\2"
			+ "\2\u0243\u0244\7g\2\2\u0244\u0245\7p\2\2\u0245\u0090\3\2\2\2\u0246\u0247"
			+ "\7r\2\2\u0247\u0248\7n\2\2\u0248\u0249\7c\2\2\u0249\u024a\7{\2\2\u024a"
			+ "\u0092\3\2\2\2\u024b\u024c\7u\2\2\u024c\u024d\7y\2\2\u024d\u024e\7k\2"
			+ "\2\u024e\u024f\7v\2\2\u024f\u0250\7e\2\2\u0250\u0251\7j\2\2\u0251\u0094"
			+ "\3\2\2\2\u0252\u0253\7i\2\2\u0253\u0254\7t\2\2\u0254\u0255\7c\2\2\u0255"
			+ "\u0256\7r\2\2\u0256\u0257\7j\2\2\u0257\u0258\7k\2\2\u0258\u0259\7e\2\2"
			+ "\u0259\u0096\3\2\2\2\u025a\u025b\7g\2\2\u025b\u025c\7p\2\2\u025c\u025d"
			+ "\7f\2\2\u025d\u0098\3\2\2\2\u025e\u025f\7r\2\2\u025f\u0260\7q\2\2\u0260"
			+ "\u0261\7k\2\2\u0261\u0262\7p\2\2\u0262\u0263\7v\2\2\u0263\u009a\3\2\2"
			+ "\2\u0264\u0265\7$\2\2\u0265\u0266\5\u00afX\2\u0266\u0267\7$\2\2\u0267"
			+ "\u009c\3\2\2\2\u0268\u026a\5\u00b7\\\2\u0269\u0268\3\2\2\2\u026a\u026b"
			+ "\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0273\3\2\2\2\u026d"
			+ "\u026f\7\60\2\2\u026e\u0270\5\u00b7\\\2\u026f\u026e\3\2\2\2\u0270\u0271"
			+ "\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273"
			+ "\u026d\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u009e\3\2\2\2\u0275\u0276\7u"
			+ "\2\2\u0276\u0277\7k\2\2\u0277\u02bd\7p\2\2\u0278\u0279\7e\2\2\u0279\u027a"
			+ "\7q\2\2\u027a\u02bd\7u\2\2\u027b\u027c\7v\2\2\u027c\u027d\7c\2\2\u027d"
			+ "\u02bd\7p\2\2\u027e\u027f\7n\2\2\u027f\u02bd\7p\2\2\u0280\u0281\7n\2\2"
			+ "\u0281\u0282\7q\2\2\u0282\u02bd\7i\2\2\u0283\u0284\7u\2\2\u0284\u0285"
			+ "\7s\2\2\u0285\u0286\7t\2\2\u0286\u02bd\7v\2\2\u0287\u0288\7t\2\2\u0288"
			+ "\u0289\7c\2\2\u0289\u028a\7p\2\2\u028a\u02bd\7f\2\2\u028b\u028c\7t\2\2"
			+ "\u028c\u028d\7q\2\2\u028d\u028e\7w\2\2\u028e\u028f\7p\2\2\u028f\u02bd"
			+ "\7f\2\2\u0290\u0291\7c\2\2\u0291\u0292\7d\2\2\u0292\u02bd\7u\2\2\u0293"
			+ "\u0294\7r\2\2\u0294\u02bd\7k\2\2\u0295\u0296\7o\2\2\u0296\u0297\7q\2\2"
			+ "\u0297\u02bd\7f\2\2\u0298\u0299\7c\2\2\u0299\u029a\7t\2\2\u029a\u029b"
			+ "\7e\2\2\u029b\u029c\7u\2\2\u029c\u029d\7k\2\2\u029d\u02bd\7p\2\2\u029e"
			+ "\u029f\7c\2\2\u029f\u02a0\7t\2\2\u02a0\u02a1\7e\2\2\u02a1\u02a2\7e\2\2"
			+ "\u02a2\u02a3\7q\2\2\u02a3\u02bd\7u\2\2\u02a4\u02a5\7c\2\2\u02a5\u02a6"
			+ "\7t\2\2\u02a6\u02a7\7e\2\2\u02a7\u02a8\7v\2\2\u02a8\u02a9\7c\2\2\u02a9"
			+ "\u02bd\7p\2\2\u02aa\u02ab\7g\2\2\u02ab\u02ac\7z\2\2\u02ac\u02bd\7r\2\2"
			+ "\u02ad\u02ae\7o\2\2\u02ae\u02af\7c\2\2\u02af\u02bd\7z\2\2\u02b0\u02b1"
			+ "\7o\2\2\u02b1\u02b2\7k\2\2\u02b2\u02bd\7p\2\2\u02b3\u02b4\7V\2\2\u02b4"
			+ "\u02b5\7T\2\2\u02b5\u02b6\7W\2\2\u02b6\u02bd\7G\2\2\u02b7\u02b8\7H\2\2"
			+ "\u02b8\u02b9\7C\2\2\u02b9\u02ba\7N\2\2\u02ba\u02bb\7U\2\2\u02bb\u02bd"
			+ "\7G\2\2\u02bc\u0275\3\2\2\2\u02bc\u0278\3\2\2\2\u02bc\u027b\3\2\2\2\u02bc"
			+ "\u027e\3\2\2\2\u02bc\u0280\3\2\2\2\u02bc\u0283\3\2\2\2\u02bc\u0287\3\2"
			+ "\2\2\u02bc\u028b\3\2\2\2\u02bc\u0290\3\2\2\2\u02bc\u0293\3\2\2\2\u02bc"
			+ "\u0295\3\2\2\2\u02bc\u0298\3\2\2\2\u02bc\u029e\3\2\2\2\u02bc\u02a4\3\2"
			+ "\2\2\u02bc\u02aa\3\2\2\2\u02bc\u02ad\3\2\2\2\u02bc\u02b0\3\2\2\2\u02bc"
			+ "\u02b3\3\2\2\2\u02bc\u02b7\3\2\2\2\u02bd\u00a0\3\2\2\2\u02be\u02bf\7C"
			+ "\2\2\u02bf\u02c0\7P\2\2\u02c0\u02cf\7F\2\2\u02c1\u02c2\7Q\2\2\u02c2\u02cf"
			+ "\7T\2\2\u02c3\u02cf\7?\2\2\u02c4\u02c5\7#\2\2\u02c5\u02cf\7?\2\2\u02c6"
			+ "\u02c7\7>\2\2\u02c7\u02cf\7?\2\2\u02c8\u02c9\7@\2\2\u02c9\u02cf\7?\2\2"
			+ "\u02ca\u02cf\t\2\2\2\u02cb\u02cc\7P\2\2\u02cc\u02cd\7Q\2\2\u02cd\u02cf"
			+ "\7V\2\2\u02ce\u02be\3\2\2\2\u02ce\u02c1\3\2\2\2\u02ce\u02c3\3\2\2\2\u02ce"
			+ "\u02c4\3\2\2\2\u02ce\u02c6\3\2\2\2\u02ce\u02c8\3\2\2\2\u02ce\u02ca\3\2"
			+ "\2\2\u02ce\u02cb\3\2\2\2\u02cf\u00a2\3\2\2\2\u02d0\u02d1\7z\2\2\u02d1"
			+ "\u02d2\7a\2\2\u02d2\u02d3\7c\2\2\u02d3\u02d4\7e\2\2\u02d4\u02d5\7e\2\2"
			+ "\u02d5\u02d6\7g\2\2\u02d6\u02d7\7n\2\2\u02d7\u02d8\7g\2\2\u02d8\u02d9"
			+ "\7t\2\2\u02d9\u02da\7c\2\2\u02da\u02db\7v\2\2\u02db\u02dc\7k\2\2\u02dc"
			+ "\u02dd\7q\2\2\u02dd\u037f\7p\2\2\u02de\u02df\7{\2\2\u02df\u02e0\7a\2\2"
			+ "\u02e0\u02e1\7c\2\2\u02e1\u02e2\7e\2\2\u02e2\u02e3\7e\2\2\u02e3\u02e4"
			+ "\7g\2\2\u02e4\u02e5\7n\2\2\u02e5\u02e6\7g\2\2\u02e6\u02e7\7t\2\2\u02e7"
			+ "\u02e8\7c\2\2\u02e8\u02e9\7v\2\2\u02e9\u02ea\7k\2\2\u02ea\u02eb\7q\2\2"
			+ "\u02eb\u037f\7p\2\2\u02ec\u02ed\7|\2\2\u02ed\u02ee\7a\2\2\u02ee\u02ef"
			+ "\7c\2\2\u02ef\u02f0\7e\2\2\u02f0\u02f1\7e\2\2\u02f1\u02f2\7g\2\2\u02f2"
			+ "\u02f3\7n\2\2\u02f3\u02f4\7g\2\2\u02f4\u02f5\7t\2\2\u02f5\u02f6\7c\2\2"
			+ "\u02f6\u02f7\7v\2\2\u02f7\u02f8\7k\2\2\u02f8\u02f9\7q\2\2\u02f9\u037f"
			+ "\7p\2\2\u02fa\u02fb\7e\2\2\u02fb\u02fc\7q\2\2\u02fc\u02fd\7o\2\2\u02fd"
			+ "\u02fe\7r\2\2\u02fe\u02ff\7c\2\2\u02ff\u0300\7u\2\2\u0300\u0301\7u\2\2"
			+ "\u0301\u0302\7a\2\2\u0302\u0303\7f\2\2\u0303\u0304\7k\2\2\u0304\u0305"
			+ "\7t\2\2\u0305\u0306\7g\2\2\u0306\u0307\7e\2\2\u0307\u0308\7v\2\2\u0308"
			+ "\u0309\7k\2\2\u0309\u030a\7q\2\2\u030a\u037f\7p\2\2\u030b\u030c\7z\2\2"
			+ "\u030c\u030d\7a\2\2\u030d\u030e\7k\2\2\u030e\u030f\7p\2\2\u030f\u0310"
			+ "\7e\2\2\u0310\u0311\7n\2\2\u0311\u0312\7k\2\2\u0312\u0313\7p\2\2\u0313"
			+ "\u0314\7c\2\2\u0314\u0315\7v\2\2\u0315\u0316\7k\2\2\u0316\u0317\7q\2\2"
			+ "\u0317\u037f\7p\2\2\u0318\u0319\7{\2\2\u0319\u031a\7a\2\2\u031a\u031b"
			+ "\7k\2\2\u031b\u031c\7p\2\2\u031c\u031d\7e\2\2\u031d\u031e\7n\2\2\u031e"
			+ "\u031f\7k\2\2\u031f\u0320\7p\2\2\u0320\u0321\7c\2\2\u0321\u0322\7v\2\2"
			+ "\u0322\u0323\7k\2\2\u0323\u0324\7q\2\2\u0324\u037f\7p\2\2\u0325\u0326"
			+ "\7q\2\2\u0326\u0327\7d\2\2\u0327\u0328\7l\2\2\u0328\u0329\7g\2\2\u0329"
			+ "\u032a\7e\2\2\u032a\u032b\7v\2\2\u032b\u032c\7a\2\2\u032c\u037f\7z\2\2"
			+ "\u032d\u032e\7q\2\2\u032e\u032f\7d\2\2\u032f\u0330\7l\2\2\u0330\u0331"
			+ "\7g\2\2\u0331\u0332\7e\2\2\u0332\u0333\7v\2\2\u0333\u0334\7a\2\2\u0334"
			+ "\u037f\7{\2\2\u0335\u0336\7q\2\2\u0336\u0337\7d\2\2\u0337\u0338\7l\2\2"
			+ "\u0338\u0339\7g\2\2\u0339\u033a\7e\2\2\u033a\u033b\7v\2\2\u033b\u033c"
			+ "\7a\2\2\u033c\u033d\7i\2\2\u033d\u033e\7j\2\2\u033e\u033f\7q\2\2\u033f"
			+ "\u0340\7u\2\2\u0340\u0341\7v\2\2\u0341\u0342\7g\2\2\u0342\u0343\7h\2\2"
			+ "\u0343\u0344\7h\2\2\u0344\u0345\7g\2\2\u0345\u0346\7e\2\2\u0346\u037f"
			+ "\7v\2\2\u0347\u0348\7q\2\2\u0348\u0349\7d\2\2\u0349\u034a\7l\2\2\u034a"
			+ "\u034b\7g\2\2\u034b\u034c\7e\2\2\u034c\u034d\7v\2\2\u034d\u034e\7a\2\2"
			+ "\u034e\u034f\7d\2\2\u034f\u0350\7t\2\2\u0350\u0351\7k\2\2\u0351\u0352"
			+ "\7i\2\2\u0352\u0353\7j\2\2\u0353\u0354\7v\2\2\u0354\u0355\7p\2\2\u0355"
			+ "\u0356\7g\2\2\u0356\u0357\7u\2\2\u0357\u037f\7u\2\2\u0358\u0359\7q\2\2"
			+ "\u0359\u035a\7d\2\2\u035a\u035b\7l\2\2\u035b\u035c\7g\2\2\u035c\u035d"
			+ "\7e\2\2\u035d\u035e\7v\2\2\u035e\u035f\7a\2\2\u035f\u0360\7u\2\2\u0360"
			+ "\u0361\7k\2\2\u0361\u0362\7|\2\2\u0362\u037f\7g\2\2\u0363\u0364\7q\2\2"
			+ "\u0364\u0365\7d\2\2\u0365\u0366\7l\2\2\u0366\u0367\7g\2\2\u0367\u0368"
			+ "\7e\2\2\u0368\u0369\7v\2\2\u0369\u036a\7a\2\2\u036a\u036b\7t\2\2\u036b"
			+ "\u036c\7q\2\2\u036c\u036d\7v\2\2\u036d\u036e\7c\2\2\u036e\u036f\7v\2\2"
			+ "\u036f\u0370\7k\2\2\u0370\u0371\7q\2\2\u0371\u037f\7p\2\2\u0372\u0373"
			+ "\7q\2\2\u0373\u0374\7d\2\2\u0374\u0375\7l\2\2\u0375\u0376\7g\2\2\u0376"
			+ "\u0377\7e\2\2\u0377\u0378\7v\2\2\u0378\u0379\7a\2\2\u0379\u037a\7n\2\2"
			+ "\u037a\u037b\7c\2\2\u037b\u037c\7{\2\2\u037c\u037d\7g\2\2\u037d\u037f"
			+ "\7t\2\2\u037e\u02d0\3\2\2\2\u037e\u02de\3\2\2\2\u037e\u02ec\3\2\2\2\u037e"
			+ "\u02fa\3\2\2\2\u037e\u030b\3\2\2\2\u037e\u0318\3\2\2\2\u037e\u0325\3\2"
			+ "\2\2\u037e\u032d\3\2\2\2\u037e\u0335\3\2\2\2\u037e\u0347\3\2\2\2\u037e"
			+ "\u0358\3\2\2\2\u037e\u0363\3\2\2\2\u037e\u0372\3\2\2\2\u037f\u00a4\3\2"
			+ "\2\2\u0380\u0381\7*\2\2\u0381\u00a6\3\2\2\2\u0382\u0383\7+\2\2\u0383\u00a8"
			+ "\3\2\2\2\u0384\u0385\7.\2\2\u0385\u00aa\3\2\2\2\u0386\u0387\7V\2\2\u0387"
			+ "\u0388\7c\2\2\u0388\u0389\7r\2\2\u0389\u038a\7r\2\2\u038a\u038b\7g\2\2"
			+ "\u038b\u038c\7f\2\2\u038c\u00ac\3\2\2\2\u038d\u0394\7\13\2\2\u038e\u0390"
			+ "\7\17\2\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2"
			+ "\u0391\u0394\7\f\2\2\u0392\u0394\7\"\2\2\u0393\u038d\3\2\2\2\u0393\u038f"
			+ "\3\2\2\2\u0393\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\bW\2\2\u0396"
			+ "\u00ae\3\2\2\2\u0397\u039d\5\u00b7\\\2\u0398\u039d\5\u00b9]\2\u0399\u039d"
			+ "\5\u00b5[\2\u039a\u039d\5\u00b1Y\2\u039b\u039d\7\"\2\2\u039c\u0397\3\2"
			+ "\2\2\u039c\u0398\3\2\2\2\u039c\u0399\3\2\2\2\u039c\u039a\3\2\2\2\u039c"
			+ "\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2"
			+ "\2\2\u039f\u00b0\3\2\2\2\u03a0\u03a1\t\3\2\2\u03a1\u00b2\3\2\2\2\u03a2"
			+ "\u03a3\7$\2\2\u03a3\u00b4\3\2\2\2\u03a4\u03a5\t\4\2\2\u03a5\u00b6\3\2"
			+ "\2\2\u03a6\u03a7\4\62;\2\u03a7\u00b8\3\2\2\2\u03a8\u03aa\t\5\2\2\u03a9"
			+ "\u03a8\3\2\2\2\u03aa\u00ba\3\2\2\2\16\2\u026b\u0271\u0273\u02bc\u02ce"
			+ "\u037e\u038f\u0393\u039c\u039e\u03a9";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}