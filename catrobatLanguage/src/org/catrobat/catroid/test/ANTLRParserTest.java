package org.catrobat.catroid.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.content.Script;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.translator.Translator;
import org.catrobat.parser.CatrobatScriptLexer;
import org.catrobat.parser.CatrobatScriptParser;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

public class ANTLRParserTest {

	private void test(File inputScript, File inputXML) throws IOException {

		Project controlProject = Translator.getInstance().loadProjectFromXML(
				inputXML);
		List<Script> controlList = new ArrayList<Script>();

		if (!controlProject.getSpriteList().isEmpty())
			for (Script item : controlProject.getSpriteList().get(0)
					.getScriptList()) {
				controlList.add(item);
			}

		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				inputScript));
		CatrobatScriptLexer lexer = new CatrobatScriptLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CatrobatScriptParser parser = new CatrobatScriptParser(tokens);

		List<Sprite> spriteList = new ArrayList<Sprite>();
		Sprite currentSprite = null;
		if (!controlProject.getSpriteList().isEmpty()) {
			spriteList.add(controlProject.getSpriteList().get(0));
			currentSprite = controlProject.getSpriteList().get(0);
		}

		parser.setCurrentSprite(currentSprite);
		parser.setSpriteList(spriteList);

		parser.program();
		List<Script> scriptList = parser.getScriptList();
		
		assertNotNull(scriptList);
		assertEquals(scriptList.size(), controlList.size());
		for (int i=0; i<scriptList.size(); i++) {
			Script script = scriptList.get(i);
			Script control = controlList.get(i);
			for (int j=0; j<script.getBrickList().size(); j++) {
				assertEquals(control.getBrickList().get(j), script.getBrickList().get(j));
			}
		}
		assertEquals(controlList, scriptList);
	}

	@Test
	public void EmptyProjectTest() throws IOException, SAXException {
		File inputScript = new File("projects/EmptyProject/scripts.txt");
		File inputXML = new File("projects/EmptyProject/code.xml");
		test(inputScript, inputXML);
	}

	@Test
	public void OneEmptyObjectProjectTest() throws IOException, SAXException {
		File inputScript = new File(
				"projects/OneEmptyObjectProject/scripts.txt");
		File inputXML = new File("projects/OneEmptyObjectProject/code.xml");
		test(inputScript, inputXML);
	}

	@Test
	public void LooksTest() throws IOException, SAXException {
		File inputScript = new File("projects/LooksTest/scripts.txt");
		File inputXML = new File("projects/LooksTest/code.xml");
		test(inputScript, inputXML);
	}

	@Test
	public void SoundsTest() throws IOException, SAXException {
		File inputScript = new File("projects/SoundsTest/scripts.txt");
		File inputXML = new File("projects/SoundsTest/code.xml");
		test(inputScript, inputXML);
	}

	@Test
	public void DefaultProjectTest() throws IOException, SAXException {

		File inputScript = new File("projects/DefaultProject/scripts.txt");
		File inputXML = new File("projects/DefaultProject/code.xml");
		test(inputScript, inputXML);

	}

	@Test
	public void AirFightTest() throws IOException, SAXException {
		File inputScript = new File("projects/Air_fight_0.1/scripts.txt");
		File inputXML = new File("projects/Air_fight_0.1/code.xml");
		
		test(inputScript, inputXML);
	}

	@Ignore
	public void Lego_NXT_Robot_ControlTest() throws IOException, SAXException {
		File inputScript = new File(
				"projects/Lego_NXT_Robot_Control/scripts.txt");
		File inputXML = new File("projects/Lego_NXT_Robot_Control/code.xml");
		test(inputScript, inputXML);
	}

	@Test
	public void SimonSaysTest() throws IOException, SAXException {
		File inputScript = new File("projects/SimonSays/scripts.txt");
		File inputXML = new File("projects/SimonSays/code.xml");
		test(inputScript, inputXML);
	}

	@Test
	public void Tic_Tac_Toe_MasterTest() throws IOException, SAXException {
		File inputScript = new File("projects/Tic-Tac-Toe_Master/scripts.txt");
		File inputXML = new File("projects/Tic-Tac-Toe_Master/code.xml");
		test(inputScript, inputXML);
	}

	@Test
	public void Whack_A_MoleTest() throws IOException, SAXException {
		File inputScript = new File("projects/Whack_A_Mole/scripts.txt");
		File inputXML = new File("projects/Whack_A_Mole/code.xml");
		test(inputScript, inputXML);
	}

}
