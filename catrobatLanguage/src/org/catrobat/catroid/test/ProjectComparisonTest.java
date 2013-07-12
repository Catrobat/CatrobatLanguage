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

		a.xmlHeader.applicationBuildName = "test";
		b.xmlHeader.applicationBuildName = "test";

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));

		c.xmlHeader.applicationBuildName = "test";
		b.spriteList.add(new Sprite());
		c.spriteList.add(new Sprite());

		assertTrue(b.equals(c));
		assertFalse(a.equals(b));
		assertFalse(a.equals(c));

		a.spriteList.add(new Sprite());
		a.userVariables.projectVariables.add(new UserVariable());
		c.userVariables.projectVariables.add(new UserVariable());

		assertTrue(a.equals(c));
		assertFalse(a.equals(b));
		assertFalse(b.equals(c));
	}

	@Test
	public void xmlHeaderTest() {
		XmlHeader a = new XmlHeader();
		XmlHeader b = new XmlHeader();
		XmlHeader c = new XmlHeader();

		a.applicationBuildName = "test";
		b.applicationBuildName = "test";
		c.applicationBuildNumber = 10;

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}

	@Test
	public void spriteTest() {
		Sprite a = new Sprite();
		Sprite b = new Sprite();
		Sprite c = new Sprite();

		a.name = "test";
		b.name = "test";

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));

		c.name = "test";
		b.lookList.add(new LookData());
		c.lookList.add(new LookData());
				
		assertTrue(b.equals(c));
		assertFalse(a.equals(b));
		assertFalse(a.equals(c));

		a.lookList.add(new LookData());
		a.soundList.add(new SoundInfo());
		c.soundList.add(new SoundInfo());

		assertTrue(a.equals(c));
		assertFalse(a.equals(b));
		assertFalse(b.equals(c));

		b.soundList.add(new SoundInfo());
		a.scriptList.add(new StartScript());
		b.scriptList.add(new StartScript());
		c.scriptList.add(new WhenScript());

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
		
		a.name = "test";
		b.name = "test";

		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}

	@Test
	public void soundInfoTest() {
		SoundInfo a = new SoundInfo();
		SoundInfo b = new SoundInfo();
		SoundInfo c = new SoundInfo();

		a.name = "test";
		b.name = "test";

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
		aa.receivedMessage = "test";
		
		BroadcastScript bb = new BroadcastScript();
		bb.receivedMessage = "test";
		
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
		aa.broadcastMessage = "test";
		
		BroadcastBrick bb = new BroadcastBrick();
		bb.broadcastMessage = "test";
		
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
		
		a.projectVariables.add(new UserVariable());
		b.projectVariables.add(new UserVariable());
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
		
		c.projectVariables.add(new UserVariable());
		a.spriteVariables.put(new Sprite(), new ArrayList<UserVariable>());
		c.spriteVariables.put(new Sprite(), new ArrayList<UserVariable>());
		Sprite test = new Sprite();
		test.name = "test";
		b.spriteVariables.put(new Sprite(), new ArrayList<UserVariable>());
		b.spriteVariables.put(test, new ArrayList<UserVariable>());
		
		assertTrue(a.equals(c));
		assertFalse(a.equals(b));
		assertFalse(b.equals(c));	
	}
	
	@Test
	public void userVariableTest() {
		UserVariable a = new UserVariable();
		UserVariable b = new UserVariable();
		UserVariable c = new UserVariable();
		
		a.name = "test";
		b.name = "test";
		c.name = "test2";
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));
	}
	
	@Test
	public void formulaTest() {
		Formula a = new Formula();
		Formula b = new Formula();
		Formula c = new Formula();
		
		a.formulaTree.type = ElementType.NUMBER;
		b.formulaTree.type = ElementType.NUMBER;
		c.formulaTree.type = ElementType.OPERATOR;
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));	
		
		a.formulaTree.leftChild = new FormulaElement();
		b.formulaTree.leftChild = new FormulaElement();
		c.formulaTree.rightChild = new FormulaElement();
	
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
		assertFalse(b.equals(c));	
	}
	
	

}
