package org.catrobat.catroid.test;

import static org.custommonkey.xmlunit.XMLAssert.assertXMLEqual;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.translator.Translator;
import org.junit.Test;
import org.xml.sax.SAXException;

public class XStreamSerializationTest {

	@Test
	public void EmptyProjectTest() throws IOException, SAXException {
		File xmlProject = new File("projects/EmptyProject/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			 inputString.append(inputStream.readLine());
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getInstance().getXMLStringOfAProject(
				testProject);
		
		assertXMLEqual(inputString.toString(), outputString);	
	}
	
	@Test
	public void AirFightTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Air_fight_0.1/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			 inputString.append(inputStream.readLine());
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getInstance().getXMLStringOfAProject(
				testProject);
		
		assertXMLEqual(inputString.toString(), outputString);	
	}
	
	@Test
	public void BlinkenTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Blinken/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			 inputString.append(inputStream.readLine());
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getInstance().getXMLStringOfAProject(
				testProject);
		
		assertXMLEqual(inputString.toString(), outputString);	
	}
	
	@Test
	public void Lego_NXT_Robot_ControlTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Lego_NXT_Robot_Control/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			 inputString.append(inputStream.readLine());
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getInstance().getXMLStringOfAProject(
				testProject);
		
		assertXMLEqual(inputString.toString(), outputString);	
	}

	@Test
	public void Rate_die_ZahlTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Rate_die_Zahl/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			 inputString.append(inputStream.readLine());
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getInstance().getXMLStringOfAProject(
				testProject);
		
		assertXMLEqual(inputString.toString(), outputString);	
	}

	@Test
	public void SimonSaysTest() throws IOException, SAXException {
		File xmlProject = new File("projects/SimonSays/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			 inputString.append(inputStream.readLine());
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getInstance().getXMLStringOfAProject(
				testProject);
		
		assertXMLEqual(inputString.toString(), outputString);	
	}
	
	@Test
	public void Tic_Tac_Toe_MasterTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Tic-Tac-Toe_Master/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			 inputString.append(inputStream.readLine());
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getInstance().getXMLStringOfAProject(
				testProject);
		
		assertXMLEqual(inputString.toString(), outputString);	
	}
	
	@Test
	public void Whack_A_MoleTest() throws IOException, SAXException {
		File xmlProject = new File("projects/Whack_A_Mole/code.xml");
		assertNotNull("File was not found!", xmlProject);

		@SuppressWarnings("resource")
		BufferedReader inputStream = new BufferedReader(new FileReader(xmlProject));
		StringBuffer inputString = new StringBuffer();
		while (inputStream.ready()) {
			 inputString.append(inputStream.readLine());
		}

		Project testProject = Translator.getInstance().loadProjectFromXML(
				xmlProject);
		String outputString = Translator.getInstance().getXMLStringOfAProject(
				testProject);
		
		assertXMLEqual(inputString.toString(), outputString);	
	}
}
