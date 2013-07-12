package org.catrobat.catroid.test;

import static org.custommonkey.xmlunit.XMLAssert.assertXMLEqual;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.translator.Translator;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

public class XStreamSerializationTest {

	@Test
	public void EmptyProjectTest() throws IOException, SAXException {
		File xmlProject = new File("projects/EmptyProject/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(
				xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			inputString.append(inputStream.readLine() + "\n");
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getXMLHeader().concat(
				Translator.getInstance().getXMLStringOfAProject(testProject));

		assertXMLEqual(inputString.toString(), outputString);
	}

	@Test
	public void OneEmptyObjectProjectTest() throws IOException, SAXException {
		File xmlProject = new File("projects/OneEmptyObjectProject/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(
				xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			inputString.append(inputStream.readLine() + "\n");
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getXMLHeader().concat(
				Translator.getInstance().getXMLStringOfAProject(testProject));

		assertXMLEqual(inputString.toString(), outputString);
	}

	@Test
	public void LooksTest() throws IOException, SAXException {
		File xmlProject = new File("projects/LooksTest/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(
				xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			inputString.append(inputStream.readLine() + "\n");
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getXMLHeader().concat(
				Translator.getInstance().getXMLStringOfAProject(testProject));

		assertXMLEqual(inputString.toString(), outputString);
	}

	@Test
	public void SoundsTest() throws IOException, SAXException {
		File xmlProject = new File("projects/SoundsTest/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(
				xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			inputString.append(inputStream.readLine() + "\n");
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getXMLHeader().concat(
				Translator.getInstance().getXMLStringOfAProject(testProject));

		assertXMLEqual(inputString.toString(), outputString);
	}

	@Test
	public void DefaultProjectTest() throws IOException, SAXException {
		
		File xmlProject = new File("projects/DefaultProject/code.xml");
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
	public void AirFightTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Air_fight_0.1/code.xml");
		File outputXML = new File("code.xml");
		assertNotNull("File was not found!", xmlProject);

		Project controlProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		
		Translator.getInstance().saveProjectToXML(controlProject);
		
		Project testProject = Translator.getInstance().loadProjectFromXML(
				outputXML); 
		
		assertTrue(controlProject.equals(testProject));
	}

	@Ignore
	public void Lego_NXT_Robot_ControlTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Lego_NXT_Robot_Control/code.xml");
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
	public void SimonSaysTest() throws IOException, SAXException {
		File xmlProject = new File("projects/SimonSays/code.xml");
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
	public void Tic_Tac_Toe_MasterTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Tic-Tac-Toe_Master/code.xml");
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
	public void Whack_A_MoleTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Whack_A_Mole/code.xml");
		File outputXML = new File("code.xml");
		assertNotNull("File was not found!", xmlProject);

		Project controlProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		
		Translator.getInstance().saveProjectToXML(controlProject);
		
		Project testProject = Translator.getInstance().loadProjectFromXML(
				outputXML); 
		
		assertTrue(controlProject.equals(testProject));
	}
}
