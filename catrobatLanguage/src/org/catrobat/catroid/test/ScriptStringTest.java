package org.catrobat.catroid.test;

import static org.junit.Assert.assertNotNull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.translator.Translator;
import org.junit.Test;
import org.xml.sax.SAXException;

public class ScriptStringTest {
	private void test(File inputXML, File outputTXT) throws IOException {
		assertNotNull("File was not found!", inputXML);

		Project xmlProject = Translator.getInstance().loadProjectFromXML(
				inputXML);

		Writer writer = new BufferedWriter(new FileWriter(outputTXT));
	
		if (!xmlProject.getSpriteList().isEmpty())
			writer.write(xmlProject.getSpriteList().get(0).toString()+"\r\n");
//		for (Sprite item: xmlProject.getSpriteList()) {
//		writer.write(item.toString());
//		}
		writer.close();
	}

	@Test
	public void EmptyProjectTest() throws IOException, SAXException {
		File inputXML = new File("projects/EmptyProject/code.xml");
		File outputTXT = new File("projects/EmptyProject/scripts.txt");
		test(inputXML, outputTXT);
	}

	@Test
	public void OneEmptyObjectProjectTest() throws IOException, SAXException {
		File inputXML = new File("projects/OneEmptyObjectProject/code.xml");
		File outputTXT = new File("projects/OneEmptyObjectProject/scripts.txt");
		test(inputXML, outputTXT);
	}

	@Test
	public void LooksTest() throws IOException, SAXException {
		File inputXML = new File("projects/LooksTest/code.xml");
		File outputTXT = new File("projects/LooksTest/scripts.txt");
		test(inputXML, outputTXT);
	}

	@Test
	public void SoundsTest() throws IOException, SAXException {
		File inputXML = new File("projects/SoundsTest/code.xml");
		File outputTXT = new File("projects/SoundsTest/scripts.txt");
		test(inputXML, outputTXT);
	}

	@Test
	public void DefaultProjectTest() throws IOException, SAXException {

		File inputXML = new File("projects/DefaultProject/code.xml");
		File outputTXT = new File("projects/DefaultProject/scripts.txt");
		test(inputXML, outputTXT);

	}

	@Test
	public void AirFightTest() throws IOException, SAXException {
		File inputXML = new File("projects/Air_fight_0.1/code.xml");
		File outputTXT = new File("projects/Air_fight_0.1/scripts.txt");
		test(inputXML, outputTXT);
	}

	@Test
	public void Lego_NXT_Robot_ControlTest() throws IOException, SAXException {
		File inputXML = new File("projects/Lego_NXT_Robot_Control/code.xml");
		File outputTXT = new File("projects/Lego_NXT_Robot_Control/scripts.txt");
		test(inputXML, outputTXT);
	}

	@Test
	public void SimonSaysTest() throws IOException, SAXException {
		File inputXML = new File("projects/SimonSays/code.xml");
		File outputTXT = new File("projects/SimonSays/scripts.txt");
		test(inputXML, outputTXT);
	}

	@Test
	public void Tic_Tac_Toe_MasterTest() throws IOException, SAXException {
		File inputXML = new File("projects/Tic-Tac-Toe_Master/code.xml");
		File outputTXT = new File("projects/Tic-Tac-Toe_Master/scripts.txt");
		test(inputXML, outputTXT);
	}

	@Test
	public void Whack_A_MoleTest() throws IOException, SAXException {
		File inputXML = new File("projects/Whack_A_Mole/code.xml");
		File outputTXT = new File("projects/Whack_A_Mole/scripts.txt");
		test(inputXML, outputTXT);
	}
}
