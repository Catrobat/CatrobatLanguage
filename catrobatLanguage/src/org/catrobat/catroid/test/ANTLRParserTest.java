package org.catrobat.catroid.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.catrobat.parser.CatrobatScriptLexer;
import org.catrobat.parser.CatrobatScriptParser;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

public class ANTLRParserTest {

	private void test(File inputScript) throws IOException {

		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				inputScript));
		CatrobatScriptLexer lexer = new CatrobatScriptLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CatrobatScriptParser parser = new CatrobatScriptParser(tokens);
		parser.program();
		System.out.println(parser.getVariables().size());
		for (String item : parser.getVariables()) {
			System.out.println(item);
		}

	}
	
	@Test
	public void EmptyProjectTest() throws IOException, SAXException {
		File inputScript = new File("projects/EmptyProject/scripts.txt");
		test(inputScript);
	}

	@Test
	public void OneEmptyObjectProjectTest() throws IOException, SAXException {
		File inputScript = new File("projects/OneEmptyObjectProject/scripts.txt");
		test(inputScript);
	}

	@Test
	public void LooksTest() throws IOException, SAXException {
		File inputScript = new File("projects/LooksTest/scripts.txt");
		test(inputScript);
	}

	@Test
	public void SoundsTest() throws IOException, SAXException {
		File inputScript = new File("projects/SoundsTest/scripts.txt");
		test(inputScript);
	}

	@Test
	public void DefaultProjectTest() throws IOException, SAXException {

		File inputScript = new File("projects/DefaultProject/scripts.txt");
		test(inputScript);

	}

	@Test
	public void AirFightTest() throws IOException, SAXException {
		File inputScript = new File("projects/Air_fight_0.1/scripts.txt");
		test(inputScript);
	}

	@Ignore
	public void Lego_NXT_Robot_ControlTest() throws IOException, SAXException {
		File inputScript = new File("projects/Lego_NXT_Robot_Control/scripts.txt");
		test(inputScript);
	}

	@Test
	public void SimonSaysTest() throws IOException, SAXException {
		File inputScript = new File("projects/SimonSays/scripts.txt");
		test(inputScript);
	}

	@Test
	public void Tic_Tac_Toe_MasterTest() throws IOException, SAXException {
		File inputScript = new File("projects/Tic-Tac-Toe_Master/scripts.txt");
		test(inputScript);
	}

	@Test
	public void Whack_A_MoleTest() throws IOException, SAXException {
		File inputScript = new File("projects/Whack_A_Mole/scripts.txt");
		test(inputScript);
	}
	
	@Test
	public void WrongInput() throws IOException, SAXException {
		File inputScript = new File("projects/Wrong_Input/scripts.txt");
		test(inputScript);
	}
	


}
