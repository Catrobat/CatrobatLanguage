package org.catrobat.catroid.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.translator.Translator;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

public class XStreamSerializationTest {
	
	private void test(File xmlProject) {
		File outputXML = new File("code.xml");
		assertNotNull("File was not found!", xmlProject);

		Project controlProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		
		Translator.getInstance().saveProjectToXML(controlProject);
		
		Project testProject = Translator.getInstance().loadProjectFromXML(
				outputXML); 
		
		assertTrue(controlProject.equals(testProject));
	}
	
	@Test
	public void EmptyProjectTest() throws IOException, SAXException {
		File xmlProject = new File("projects/EmptyProject/code.xml");
		test(xmlProject);
	}


	@Test
	public void OneEmptyObjectProjectTest() throws IOException, SAXException {
		File xmlProject = new File("projects/OneEmptyObjectProject/code.xml");
		test(xmlProject);
	}

	@Test
	public void LooksTest() throws IOException, SAXException {
		File xmlProject = new File("projects/LooksTest/code.xml");
		test(xmlProject);
	}

	@Test
	public void SoundsTest() throws IOException, SAXException {
		File xmlProject = new File("projects/SoundsTest/code.xml");
		test(xmlProject);
	}

	@Test
	public void DefaultProjectTest() throws IOException, SAXException {
		
		File xmlProject = new File("projects/DefaultProject/code.xml");
		test(xmlProject);

	}

	@Test
	public void AirFightTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Air_fight_0.1/code.xml");
		test(xmlProject);
	}

	@Test
	public void Lego_NXT_Robot_ControlTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Lego_NXT_Robot_Control/code.xml");
		test(xmlProject);
	}

	@Test
	public void SimonSaysTest() throws IOException, SAXException {
		File xmlProject = new File("projects/SimonSays/code.xml");
		test(xmlProject);
	}

	@Test
	public void Tic_Tac_Toe_MasterTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Tic-Tac-Toe_Master/code.xml");
		test(xmlProject);
	}

	@Test
	public void Whack_A_MoleTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Whack_A_Mole/code.xml");
		test(xmlProject);
	}
}
