package org.catrobat.catroid.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.catrobat.catroid.common.LookData;
import org.catrobat.catroid.common.SoundInfo;
import org.catrobat.catroid.content.BroadcastScript;
import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.content.Script;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.content.StartScript;
import org.catrobat.catroid.content.WhenScript;
import org.catrobat.catroid.content.XmlHeader;
import org.catrobat.catroid.content.bricks.Brick;
import org.catrobat.catroid.content.bricks.BroadcastBrick;
import org.catrobat.catroid.content.bricks.ComeToFrontBrick;
import org.catrobat.catroid.content.bricks.HideBrick;
import org.catrobat.catroid.formulaeditor.Formula;
import org.catrobat.catroid.formulaeditor.FormulaElement;
import org.catrobat.catroid.formulaeditor.FormulaElement.ElementType;
import org.catrobat.catroid.formulaeditor.UserVariable;
import org.catrobat.catroid.formulaeditor.UserVariablesContainer;
import org.junit.Test;

public class ProjectComparisonTest {

	@Test
	public void projectTest() {
		Project a = new Project();
		Project b = new Project();
		Project c = new Project();

		b.getSpriteList().add(new Sprite());
		c.getSpriteList().add(new Sprite());

		assertTrue(b.equals(c));
		assertFalse(a.equals(b));
		assertFalse(a.equals(c));

		a.getSpriteList().add(new Sprite());
		a.getUserVariables().getProjectVariables().add(new UserVariable());
		c.getUserVariables().getProjectVariables().add(new UserVariable());

		assertTrue(a.equals(c));
		assertFalse(a.equals(b));
		assertFalse(b.equals(c));
	}

	@Test
	public void xmlHeaderTest() {
		XmlHeader a = new XmlHeader();
		XmlHeader b = new XmlHeader();
		XmlHeader c = new XmlHeader();

		a.setApplicationBuildName("test");
		b.setApplicationBuildName("test");
		c.setApplicationBuildNumber(10);

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}

	@Test
	public void spriteTest() {
		Sprite a = new Sprite();
		Sprite b = new Sprite();
		Sprite c = new Sprite();

		a.setName("test");
		b.setName("test");

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));

		c.setName("test");
		b.getLookList().add(new LookData());
		c.getLookList().add(new LookData());
				
		assertTrue(b.equals(c));
		assertFalse(a.equals(b));
		assertFalse(a.equals(c));

		a.getLookList().add(new LookData());
		a.getSoundList().add(new SoundInfo());
		c.getSoundList().add(new SoundInfo());

		assertTrue(a.equals(c));
		assertFalse(a.equals(b));
		assertFalse(b.equals(c));

		b.getSoundList().add(new SoundInfo());
		a.getScriptList().add(new StartScript());
		b.getScriptList().add(new StartScript());
		c.getScriptList().add(new WhenScript());

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}

	@Test
	public void lookDataTest() {
		LookData a = new LookData();
		LookData b = new LookData();
		LookData c = new LookData();

		assertTrue(a.equals(b));
		
		a.setName("test");
		b.setName("test");

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}

	@Test
	public void soundInfoTest() {
		SoundInfo a = new SoundInfo();
		SoundInfo b = new SoundInfo();
		SoundInfo c = new SoundInfo();

		a.setName("test");
		b.setName("test");

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}

	@Test
	public void scriptTest() {
		Script a = new WhenScript();
		Script b = new WhenScript();
		Script c = new BroadcastScript();

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
		
		BroadcastScript aa = new BroadcastScript();
		aa.setReceivedMessage("test");
		
		BroadcastScript bb = new BroadcastScript();
		bb.setReceivedMessage("test");
		
		a = aa;
		b = bb;
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}

	@Test
	public void brickTest() {
		Brick a = new HideBrick();
		Brick b = new HideBrick();
		Brick c = new BroadcastBrick();

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
		
		BroadcastBrick aa = new BroadcastBrick();
		aa.setBroadcastMessage("test");
		
		BroadcastBrick bb = new BroadcastBrick();
		bb.setBroadcastMessage("test");
		
		a = aa;
		b = bb;
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));	
		
		a = new HideBrick();
		b = new ComeToFrontBrick();
		c = new HideBrick();
		
		assertTrue(a.equals(c));
		assertFalse(a.equals(b));
		assertFalse(b.equals(c));
	}
	
	@Test
	public void userVariableContainerTest() {
		UserVariablesContainer a = new UserVariablesContainer();
		UserVariablesContainer b = new UserVariablesContainer();
		UserVariablesContainer c = new UserVariablesContainer();
		
		a.getProjectVariables().add(new UserVariable());
		b.getProjectVariables().add(new UserVariable());
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
		
		c.getProjectVariables().add(new UserVariable());
		a.getSpriteVariables().put(new Sprite(), new ArrayList<UserVariable>());
		c.getSpriteVariables().put(new Sprite(), new ArrayList<UserVariable>());
		Sprite test = new Sprite();
		test.setName("test");
		b.getSpriteVariables().put(new Sprite(), new ArrayList<UserVariable>());
		b.getSpriteVariables().put(test, new ArrayList<UserVariable>());
		
		assertTrue(a.equals(c));
		assertFalse(a.equals(b));
		assertFalse(b.equals(c));	
	}
	
	@Test
	public void userVariableTest() {
		UserVariable a = new UserVariable();
		UserVariable b = new UserVariable();
		UserVariable c = new UserVariable();
		
		a.setName("test");
		b.setName("test");
		c.setName("test2");
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}
	
	@Test
	public void formulaTest() {
		Formula a = new Formula();
		Formula b = new Formula();
		Formula c = new Formula();
		
		a.getFormulaTree().setType(ElementType.NUMBER);
		b.getFormulaTree().setType(ElementType.NUMBER);
		c.getFormulaTree().setType(ElementType.OPERATOR);
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));	
		
		a.getFormulaTree().setLeftChild(new FormulaElement());
		b.getFormulaTree().setLeftChild(new FormulaElement());
		c.getFormulaTree().setRightChild(new FormulaElement());
	
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));	
	}
	
	

}
