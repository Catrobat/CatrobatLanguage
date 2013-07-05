package org.catrobat.catroid.test.xml;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import junit.framework.TestCase;

import org.xml.sax.SAXException;

public class XMLValidatingTest extends TestCase {

	private static final String XMLSCHEMA_URL = "http://catroidtestserver.ist.tugraz.at/xmlSchema/version-0.3/catrobatXmlSchema.xsd";

	public void testXmlWithSchemaValidator() throws IOException, SAXException {

		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		URL schemaUrl = new URL(XMLSCHEMA_URL);
		Schema schema = factory.newSchema(schemaUrl);

		Validator schemaValidator = schema.newValidator();

		File xmlDirectory = new File("res/catrobat_v0.3_XMLsToValidate/");
		File[] xmlFilesToValidate = xmlDirectory.listFiles();

		File currentXMLFile = null;
		try {
			for (File xmlFile : xmlFilesToValidate) {
				currentXMLFile = xmlFile;
				Source source = new StreamSource(currentXMLFile);
				schemaValidator.validate(source);
			}
		} catch (SAXException ex) {
			ex.printStackTrace();
			assertFalse(currentXMLFile + " is not valid because: " + ex.getMessage(), true);
		}
	}

}
