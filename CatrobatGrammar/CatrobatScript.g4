grammar CatrobatScript;

options {language = Java;}

@header {
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
         }

@members { 
private Map<String,UserVariable> variables = new HashMap<String,UserVariable>();

public List<UserVariable> getVariables() {
   return new ArrayList<UserVariable>(variables.values());
}

private Map<String, UserVariable> programVariables;

public void setProgramVariables(List<UserVariable> list) {
   programVariables = new HashMap<String, UserVariable>();                                                          
   for (UserVariable item: list) {
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

}
program 
@init {scriptList = new ArrayList<Script>();}
@after { setAllInnerBricks();}
    : (startScript {scriptList.add($startScript.value);} | 
       whenScript {scriptList.add($whenScript.value);} |  
       broadcastScript {scriptList.add($broadcastScript.value);})* ;

startScript returns [Script value]
@init {StartScript script = new StartScript();}
@after {$value = script;}
    : ('when' 'program' 'started') brickList
      {script.setBrickList($brickList.value);
       script.setObject(currentSprite);};

whenScript returns [Script value]
@init {WhenScript script = new WhenScript();}
@after {$value = script;}
    : ('when' action) brickList
      {script.setAction($action.value);
       script.setBrickList($brickList.value);
       script.setObject(currentSprite);};


broadcastScript returns [Script value]
@init {BroadcastScript script = new BroadcastScript();}
@after {$value = script;}
    : ('when' 'I' 'receive' message) brickList
      {script.setReceivedMessage($message.value);
       script.setBrickList($brickList.value);
       script.setObject(currentSprite);};


brickList returns [ArrayList<Brick> value]
@init { ArrayList<Brick> brickList = new ArrayList<Brick>();}
@after {$value = brickList;}
    : (brick {brickList.add($brick.value);})*;

brick returns [BrickBaseType value]
@after { $value.setSprite(currentSprite);}
     : broadcastBrick {$value = $broadcastBrick.value;} | 
       broadcastWaitBrick {$value = $broadcastWaitBrick.value;} | 
       changeBrightnessByNBrick {$value = $changeBrightnessByNBrick.value;} |  
       changeGhostEffectByNBrick {$value = $changeGhostEffectByNBrick.value;} |  
       changeSizeByNBrick {$value = $changeSizeByNBrick.value;} | 
       changeVariableBrick {$value = $changeVariableBrick.value;} | 
       changeVolumeByNBrick {$value = $changeVolumeByNBrick.value;} |  
       changeXByNBrick {$value = $changeXByNBrick.value;} |  
       changeYByNBrick {$value = $changeYByNBrick.value;} |  
       clearGraficEffectBrick {$value = $clearGraficEffectBrick.value;} | 
       comeToFrontBrick {$value = $comeToFrontBrick.value;} |  
       foreverBrick {$value = $foreverBrick.value;} |  
       glideToBrick {$value = $glideToBrick.value;} |  
       goNStepsBackBrick {$value = $goNStepsBackBrick.value;} |  
       hideBrick {$value = $hideBrick.value;} |  
       ifLogicBeginBrick {$value = $ifLogicBeginBrick.value;} |  
       ifLogicElseBrick {$value = $ifLogicElseBrick.value;} |  
       ifLogicEndBrick {$value = $ifLogicEndBrick.value;} |  
       ifOnEdgeBounceBrick {$value = $ifOnEdgeBounceBrick.value;} |  
       legoNXTMotorActionBrick {$value = $legoNXTMotorActionBrick.value;} | 
       legoNxtMotorStopBrick {$value = $legoNxtMotorStopBrick.value;} |  
       legoNxtMotorTurnAngleBrick {$value = $legoNxtMotorTurnAngleBrick.value;} |  
       legoNxtPlayToneBrick {$value = $legoNxtPlayToneBrick.value;} |  
       loopEndBrick {$value = $loopEndBrick.value;} |  
       moveNStepsBrick {$value = $moveNStepsBrick.value;} | 
       nextLookBrick {$value = $nextLookBrick.value;} | 
       noteBrick {$value = $noteBrick.value;} |  
       placeAtBrick {$value = $placeAtBrick.value;} |  
       playSoundBrick {$value = $playSoundBrick.value;} |  
       pointInDirectionBrick {$value = $pointInDirectionBrick.value;} |  
       pointToBrick {$value = $pointToBrick.value;} |  
       repeatBrick {$value = $repeatBrick.value;} |  
       setBrightnessBrick {$value = $setBrightnessBrick.value;} |  
       setGhostEffectBrick {$value = $setGhostEffectBrick.value;} |  
       setLookBrick {$value = $setLookBrick.value;} |  
       setSizeToBrick {$value = $setSizeToBrick.value;} | 
       setVariableBrick {$value = $setVariableBrick.value;} | 
       setVolumeToBrick {$value = $setVolumeToBrick.value;} |  
       setXBrick {$value = $setXBrick.value;} | 
       setYBrick {$value = $setYBrick.value;} | 
       showBrick {$value = $showBrick.value;} | 
       speakBrick {$value = $speakBrick.value;} | 
       stopAllSoundsBrick {$value = $stopAllSoundsBrick.value;} | 
       turnLeftBrick {$value = $turnLeftBrick.value;} |  
       turnRightBrick {$value = $turnRightBrick.value;} | 
       waitBrick {$value = $waitBrick.value;};


broadcastBrick returns [BrickBaseType value]
@init { BroadcastBrick brick = new BroadcastBrick();}
@after { $value = brick; }
    : 'broadcast' message 
       {brick.setBroadcastMessage($message.value);} ;

broadcastWaitBrick returns [BrickBaseType value]
@init {BroadcastWaitBrick brick = new BroadcastWaitBrick();}
@after {$value = brick;}
    : 'broadcast' 'and' 'wait' message
      {brick.setBroadcastMessage($message.value);};

changeBrightnessByNBrick returns [BrickBaseType value]
@init {ChangeBrightnessByNBrick brick = new ChangeBrightnessByNBrick();}
@after {$value = brick;}
    : 'change' 'brightness' 'by' formula '%'
      {brick.setChangeBrightness($formula.value);};

changeGhostEffectByNBrick returns [BrickBaseType value]
@init {ChangeGhostEffectByNBrick brick = new ChangeGhostEffectByNBrick();}
@after {$value = brick;}
    : 'change' 'ghost' 'effect' 'by' formula '%'
      {brick.setChangeGhostEffect($formula.value);};

changeSizeByNBrick returns [BrickBaseType value]
@init {ChangeSizeByNBrick brick = new ChangeSizeByNBrick();}
@after {$value = brick;}
    : 'change' 'size' 'by' formula '%'
      {brick.setSize($formula.value);};

changeVariableBrick returns [BrickBaseType value]
@init {ChangeVariableBrick brick = new ChangeVariableBrick();}
@after {$value = brick;}
    : 'change' 'variable' userVariable
      {brick.setUserVariable($userVariable.value);}
      'by' formula 
      {brick.setVariableFormula($formula.value);};
                     

changeVolumeByNBrick returns [BrickBaseType value]
@init {ChangeVolumeByNBrick brick = new ChangeVolumeByNBrick();}
@after {$value = brick;}
    : 'change' 'volume' 'by' formula '%'
      {brick.setVolume($formula.value);};

changeXByNBrick returns [BrickBaseType value]
@init {ChangeXByNBrick brick = new ChangeXByNBrick();}
@after {$value = brick;}
    : 'change' 'X' 'by' formula
      {brick.setxMovement($formula.value);};

changeYByNBrick returns [BrickBaseType value]
@init {ChangeYByNBrick brick = new ChangeYByNBrick();}
@after {$value = brick;}
    : 'change' 'Y' 'by' formula
      {brick.setyMovement($formula.value);};

clearGraficEffectBrick returns [BrickBaseType value]
@init {ClearGraphicEffectBrick brick = new ClearGraphicEffectBrick();}
@after {$value = brick;}
    : 'clear' 'graphic' 'effects';

comeToFrontBrick returns [BrickBaseType value]
@init {ComeToFrontBrick brick = new ComeToFrontBrick();}
@after {$value = brick;}
    : 'come' 'to' 'front';

foreverBrick returns [BrickBaseType value]
@init {ForeverBrick brick = new ForeverBrick();}
@after {$value = brick;}
: 'forever';

glideToBrick returns [BrickBaseType value]
@init {GlideToBrick brick = new GlideToBrick();}
@after {$value = brick;}
    : 'glide' s=formula 
      {brick.setDurationInSeconds($s.value);}
      'seconds' 'to' 'X:' x=formula
      {brick.setxDestination($x.value);}
      ','? 'Y:' y=formula
      {brick.setyDestination($y.value);};

goNStepsBackBrick returns [BrickBaseType value]
@init {GoNStepsBackBrick brick = new GoNStepsBackBrick();}
@after {$value = brick;}
    : 'go' 'back' formula  'layers'
      {brick.setSteps($formula.value);};

hideBrick returns [BrickBaseType value]
@init {HideBrick brick = new HideBrick();}
@after {$value = brick;}
    : 'hide';

ifLogicBeginBrick returns [BrickBaseType value]
@init {IfLogicBeginBrick brick = new IfLogicBeginBrick();}
@after {$value = brick;}
    : 'if' formula 'is' 'true' 'then'
      {brick.setIfCondition($formula.value);};

ifLogicElseBrick returns [BrickBaseType value]
@init {IfLogicElseBrick brick = new IfLogicElseBrick();}
@after {$value = brick;}
    : 'else';

ifLogicEndBrick returns [BrickBaseType value]
@init {IfLogicEndBrick brick = new IfLogicEndBrick();}
@after {$value = brick;}
    : 'end' 'if';

ifOnEdgeBounceBrick returns [BrickBaseType value]
@init {IfOnEdgeBounceBrick brick = new IfOnEdgeBounceBrick();}
@after {$value = brick;}
    : 'if' 'on' 'edge' ','? 'bounce';

legoNXTMotorActionBrick returns [BrickBaseType value]
@init {LegoNxtMotorActionBrick brick = new LegoNxtMotorActionBrick();}
@after {$value = brick;}
    : 'NXT' 'move' 'motor' motor
      {brick.setMotor($motor.value);}
      ','? 'speed' formula
      {brick.setSpeed($formula.value);};

legoNxtMotorStopBrick returns [BrickBaseType value]
@init {LegoNxtMotorStopBrick brick = new LegoNxtMotorStopBrick();}
@after {$value = brick;}
    : 'NXT' 'stop' 'motor' motor
      {brick.setMotor($motor.value);};

legoNxtMotorTurnAngleBrick returns [BrickBaseType value]
@init {LegoNxtMotorTurnAngleBrick brick = new LegoNxtMotorTurnAngleBrick();}
@after {$value = brick;}
    : 'NXT' 'turn' 'motor' motor 
      {brick.setMotor($motor.value);}
      'to' formula 
      {brick.setDegrees($formula.value);}
      'degrees';

legoNxtPlayToneBrick returns [BrickBaseType value]
@init {LegoNxtPlayToneBrick brick = new LegoNxtPlayToneBrick();}
@after {$value = brick;}
    : 'NXT' 'play' 'tone' ','? 'frequency:' f=formula 
      {brick.setFrequency($f.value);}
      ','? 'duration:' d=formula 
      {brick.setDurationInSeconds($d.value);}
      'seconds';

loopEndBrick returns [BrickBaseType value]
@init {LoopEndBrick brick = new LoopEndBrick();}
@after {$value = brick;}
    : 'end' 'of' 'loop';

moveNStepsBrick returns [BrickBaseType value]
@init {MoveNStepsBrick brick = new MoveNStepsBrick();}
@after {$value = brick;}
    : 'move' formula 'steps'
      {brick.setSteps($formula.value);};

nextLookBrick returns [BrickBaseType value]
@init {NextLookBrick brick = new NextLookBrick();}
@after {$value = brick;}
    : 'next' 'look';


noteBrick returns [BrickBaseType value]
@init {NoteBrick brick = new NoteBrick();}
@after {$value = brick;}
    : 'note' textField
      {brick.setNote($textField.value);};

placeAtBrick returns [BrickBaseType value]
@init {PlaceAtBrick brick = new PlaceAtBrick();}
@after {$value = brick;}
    : 'place' 'at' 'X:' x=formula
      {brick.setxPosition($x.value);}
      ','? 'Y:' y=formula
      {brick.setyPosition($y.value);};

playSoundBrick returns [BrickBaseType value]
@init {PlaySoundBrick brick = new PlaySoundBrick();}
@after {$value = brick;}
    : 'start' 'sound' sound
      {brick.setSound($sound.value);};

pointInDirectionBrick returns [BrickBaseType value]
@init {PointInDirectionBrick brick = new PointInDirectionBrick();}
@after {$value = brick;}
    : 'point' 'in' 'direction' formula 'degrees'
      {brick.setDegrees($formula.value);};

pointToBrick returns [BrickBaseType value]
@init {PointToBrick brick = new PointToBrick();}
@after {$value = brick;}
    : 'point' 'to' objectName
      {brick.setPointedObject($objectName.value);};

repeatBrick returns [BrickBaseType value]
@init {RepeatBrick brick = new RepeatBrick();}
@after {$value = brick;}
    : 'repeat' formula
      {brick.setTimesToRepeat($formula.value);};

setBrightnessBrick returns [BrickBaseType value]
@init {SetBrightnessBrick brick = new SetBrightnessBrick();}
@after {$value = brick;}
    : 'set' 'brightness' 'to' formula '%'
      {brick.setBrightness($formula.value);};

setGhostEffectBrick returns [BrickBaseType value]
@init {SetGhostEffectBrick brick = new SetGhostEffectBrick();}
@after {$value = brick;}
    : 'set' 'ghost' 'effect' 'to' formula '%'
      {brick.setTransparency($formula.value);};

setLookBrick returns [BrickBaseType value]
@init {SetLookBrick brick = new SetLookBrick();}
@after {$value = brick;}
    : 'switch' 'to' 'look' look
      {brick.setLook($look.value);};

setSizeToBrick returns [BrickBaseType value]
@init {SetSizeToBrick brick = new SetSizeToBrick();}
@after {$value = brick;}
    : 'set' 'size' 'to' formula '%'
      {brick.setSize($formula.value);};

setVariableBrick returns [BrickBaseType value]
@init {SetVariableBrick brick = new SetVariableBrick();}
@after {$value = brick;}
    : 'set' 'variable' userVariable 'to' formula 
      { brick.setUserVariable($userVariable.value);
        brick.setVariableFormula($formula.value);};

setVolumeToBrick returns [BrickBaseType value]
@init {SetVolumeToBrick brick = new SetVolumeToBrick();}
@after {$value = brick;}
    : 'set' 'volume' 'to' formula '%'
      {brick.setVolume($formula.value);};

setXBrick returns [BrickBaseType value]
@init {SetXBrick brick = new SetXBrick();}
@after {$value = brick;}
    : 'set' 'X' 'to' formula 
      {brick.setxPosition($formula.value);};

setYBrick returns [BrickBaseType value]
@init {SetYBrick brick = new SetYBrick();}
@after {$value = brick;}
    : 'set' 'Y' 'to' formula 
      {brick.setyPosition($formula.value);};


showBrick returns [BrickBaseType value]
@init {ShowBrick brick = new ShowBrick();}
@after {$value = brick;}
    : 'show';

speakBrick returns [BrickBaseType value]
@init { SpeakBrick brick = new SpeakBrick();}
@after {$value = brick;} 
    : 'speak' textField
      {brick.setText($textField.value);};

stopAllSoundsBrick returns [BrickBaseType value]
@init { StopAllSoundsBrick brick = new StopAllSoundsBrick();}
@after { $value = brick;}
    : 'stop' 'all' 'sounds'; 

turnLeftBrick returns [BrickBaseType value]
@init { TurnLeftBrick brick = new TurnLeftBrick();}
@after { $value = brick;}
    : 'turn' 'left' formula 'degrees'
      {brick.setDegrees($formula.value);};

turnRightBrick returns [BrickBaseType value]
@init { TurnRightBrick brick = new TurnRightBrick();}
@after { $value = brick;}
    : 'turn' 'right' formula 'degrees'
      {brick.setDegrees($formula.value);};

waitBrick returns [BrickBaseType value]
@init { WaitBrick brick = new WaitBrick();}
@after { $value = brick;}
    : 'wait' formula 'seconds'
      {brick.setTimeToWaitInSeconds($formula.value);};


action returns [String value] 
    : ACTION { $value = $ACTION.text;};

formula returns [Formula value]
@init { 
         List<InternToken> tokenList = new ArrayList<InternToken>();
      }
@after{ 
         InternFormulaParser formulaParser = new InternFormulaParser(tokenList);
         Formula formulaTree = new Formula();
         formulaTree.setFormulaTree(formulaParser.parseFormula());
         $value = formulaTree;
      }
    : '(' (token {tokenList.add($token.value);} )+ ')';

look returns [LookData value]: USER_VARIABLE 
  {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
   String name = buf.substring(1,buf.length()-1).toString();
   $value = null;
   // TODO: exception LookData not found
   for (LookData item: currentSprite.getLookList()) {
     if (item.getName().equals(name))
       $value = item;
   }
  };

sound returns [SoundInfo value]: USER_VARIABLE 
  {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
   String name = buf.substring(1,buf.length()-1).toString();
   $value = null;
   // TODO: exception SoundInfo not found
   for (SoundInfo item: currentSprite.getSoundList()) {
     if (item.getName().equals(name))
       $value = item;
   }
  };

objectName returns [Sprite value]: USER_VARIABLE
  {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
   String name = buf.substring(1,buf.length()-1).toString();
   $value = null;
   // TODO: exception SoundInfo not found
   for (Sprite item: spriteList) {
     if (item.getName().equals(name))
       $value = item;
   }
  };

message returns[String value]: USER_VARIABLE 
    {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
     String name = buf.substring(1,buf.length()-1).toString();
     $value = name;};
motor returns [String value]: USER_VARIABLE 
    {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
     String name = buf.substring(1,buf.length()-1).toString();
     $value = name;};
textField returns[String value]: USER_VARIABLE
    {StringBuffer buf = new StringBuffer($USER_VARIABLE.text);
     String name = buf.substring(1,buf.length()-1).toString();
     $value = name;};

userVariable returns [UserVariable value]
@init { UserVariable var = new UserVariable(); }
@after {$value = var;}
    :USER_VARIABLE {
        StringBuffer buf = new StringBuffer($text);
        String name = buf.substring(1, buf.length()-1).toString();
        if (variables.containsKey(name)) 
           var = variables.get(name);
        else {
           var.setName(name);
           variables.put(name, var);
        }    
       };

token returns [InternToken value]
    : NUMBER 
      { $value = new InternToken(InternTokenType.NUMBER,$text);}|
      OPERATOR 
      { $value = new InternToken(InternTokenType.OPERATOR,Operators.getInnerName($text));}|
      SENSOR 
      { $value = new InternToken(InternTokenType.SENSOR,Sensors.getInnerName($text));}|
      FUNCTION_NAME 
      { $value = new InternToken(InternTokenType.FUNCTION_NAME,Functions.getInnerName($text));}|
      USER_VARIABLE 
      {UserVariable var = new UserVariable();
       StringBuffer buf = new StringBuffer($text);
       String name = buf.substring(1,buf.length()-1).toString(); 
       if (variables.containsKey(name)) 
           var = variables.get(name);
        else {
           var.setName(name);
           variables.put(name, var);
        }    
       $value = new InternToken(InternTokenType.USER_VARIABLE,name);}|
      BRACKET_OPEN 
      { $value = new InternToken(InternTokenType.BRACKET_OPEN,$text);}|
      BRACKET_CLOSE 
      { $value = new InternToken(InternTokenType.BRACKET_CLOSE,$text);}| 
      FUNCTION_PARAMETER_DELIMITER 
      { $value = new InternToken(InternTokenType.FUNCTION_PARAMETER_DELIMITER,$text);};           

USER_VARIABLE: '"' STRING '"';
NUMBER: (DIGIT)+('.' DIGIT+)?;
FUNCTION_NAME: ('sin' | 'cos' | 'tan' | 'ln' | 'log' | 'sqrt' | 'rand' | 'round' | 
           'abs' | 'pi' | 'mod' | 'arcsin' | 'arccos' | 'arctan' | 'exp' | 
           'max' | 'min' | 'TRUE' | 'FALSE');   
OPERATOR: ('AND' | 'OR' | '=' | '!=' | '<=' | '>=' | '<' | '>' | 
          '+' | '-' | '*' | '/' | '%' | '^' | 'NOT');
SENSOR: ('x_acceleration' | 'y_acceleration' | 'z_acceleration' |
         'compass_direction' | 'x_inclination' | 'y_inclination' |
         'object_x' | 'object_y' | 
         'object_ghosteffect' | 'object_brightness' | 'object_size' |
         'object_rotation' | 'object_layer');
BRACKET_OPEN: '(';
BRACKET_CLOSE: ')';
FUNCTION_PARAMETER_DELIMITER: ',';

ACTION: 'Tapped';

WS : ('\t' | '\r'? '\n' | ' ') {skip();} ;

fragment STRING: (DIGIT | LETTER | SYMBOL | OPERATOR_SYMBOL | ' ')+;
fragment OPERATOR_SYMBOL: '=' | '<' | '>' |'+' | '-' | '*' | '/' | '%' | '^';
fragment ADDITIONAL_SYMBOL: '"';
fragment SYMBOL: ('!' | '@' | '#' | '$' | '_' | '\'' | ';' | '~' | '?' | '&' |
                  '[' | ']' | '{' | '}' | ':' | ',' | '(' | ')' | '\'');
fragment DIGIT: ('0'..'9');
fragment LETTER: ('a'..'z') | ('A'..'Z');


