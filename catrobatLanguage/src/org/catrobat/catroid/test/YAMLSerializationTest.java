package org.catrobat.catroid.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.translator.Translator;
import org.catrobat.catroid.yaml.YamlProject;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

public class YAMLSerializationTest {
	
	private void test(File inputXML) {
		File outputYAML = new File("code.yml");
		assertNotNull("File was not found!", inputXML);

		Project xmlProject = Translator.getInstance().loadProjectFromXML(
				inputXML);
		
		YamlProject controlProject = new YamlProject(xmlProject);
		
		Translator.getInstance().saveProjectToYAML(controlProject);	
		YamlProject testProject = Translator.getInstance().loadProjectFromYAML(
				outputYAML);
		
		assertTrue(controlProject.equals(testProject));
	}
	
	@Test
	public void EmptyProjectTest() throws IOException, SAXException {
		File inputXML = new File("projects/EmptyProject/code.xml");
		test(inputXML);
	}

	@Test
	public void OneEmptyObjectProjectTest() throws IOException, SAXException {
		File inputXML = new File("projects/OneEmptyObjectProject/code.xml");
		test(inputXML);
	}

	@Test
	public void LooksTest() throws IOException, SAXException {
		File inputXML = new File("projects/LooksTest/code.xml");
		test(inputXML);
	}

	@Test
	public void SoundsTest() throws IOException, SAXException {
		File inputXML = new File("projects/SoundsTest/code.xml");
		test(inputXML);
	}

	@Test
	public void DefaultProjectTest() throws IOException, SAXException {
		
		File inputXML = new File("projects/DefaultProject/code.xml");
		test(inputXML);

	}

	@Test
	public void AirFightTest() throws IOException, SAXException {
		File inputXML = new File("projects/Air_fight_0.1/code.xml");
		test(inputXML);
	}

	@Ignore
	public void Lego_NXT_Robot_ControlTest() throws IOException, SAXException {
		File inputXML = new File("projects/Lego_NXT_Robot_Control/code.xml");
		test(inputXML);
	}

	@Test
	public void SimonSaysTest() throws IOException, SAXException {
		File inputXML = new File("projects/SimonSays/code.xml");
		test(inputXML);
	}

	@Test
	public void Tic_Tac_Toe_MasterTest() throws IOException, SAXException {
		File inputXML = new File("projects/Tic-Tac-Toe_Master/code.xml");
		test(inputXML);
	}

	@Test
	public void Whack_A_MoleTest() throws IOException, SAXException {
		File inputXML = new File("projects/Whack_A_Mole/code.xml");
		test(inputXML);
	}

}
