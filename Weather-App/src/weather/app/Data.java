/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import static weather.app.WeatherApp.*;

/**
 *
 * @author Kamil
 */
public class Data {

    /* Get location, api key and theme from xml file */
    public static void getData() throws ParserConfigurationException, TransformerException {
        try {
            System.out.print("--> Importing XML file data. ");
            String filepath = "data/config.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            Node users = doc.getElementsByTagName("user").item(0);

            NodeList list = users.getChildNodes();

            for (int i = 0; i < list.getLength(); i++) {

                Node node = list.item(i);

                if ("location".equals(node.getNodeName())) {
                    location = node.getTextContent();
                }

                if ("api".equals(node.getNodeName())) {
                    api = node.getTextContent();
                }

                if ("color".equals(node.getNodeName())) {
                    theme = node.getTextContent();
                    ThemeColor tc = new ThemeColor(theme);
                }
            }
            System.out.println("--> IMPORTED! ");
        } catch (SAXException ex) {

        } catch (IOException ex) {

        }
    }

    /* Save entered location, api key and theme from xml file */
    public static void writeData(String locationToRemember, String apiToRemember, String themeToRemember) throws TransformerException, ParserConfigurationException {
        try {
            String filepath = "data/config.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            Node users = doc.getElementsByTagName("user").item(0);

            NodeList list = users.getChildNodes();

            for (int i = 0; i < list.getLength(); i++) {

                Node node = list.item(i);

                if ("location".equals(node.getNodeName())) {
                    node.setTextContent(locationToRemember);
                }

                if ("api".equals(node.getNodeName())) {
                    node.setTextContent(apiToRemember);
                }

                if ("color".equals(node.getNodeName())) {
                    node.setTextContent(themeToRemember);
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
        } catch (SAXException | IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void checkForXMLFile() throws IOException, ParserConfigurationException, TransformerException {
        try {
            String filepath = "data/config.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);
        } catch (SAXException | ParserConfigurationException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            System.out.print("--> XML file not found! ");
            createXMLFile();
        }
    }

    private static void createXMLFile() throws ParserConfigurationException, TransformerConfigurationException, TransformerException {
        
        System.out.print("--> Creating new XML file. ");
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("users");
        doc.appendChild(rootElement);

        Element user = doc.createElement("user");
        rootElement.appendChild(user);

        Attr attr = doc.createAttribute("id");
        attr.setValue("0");
        user.setAttributeNode(attr);

        Element location = doc.createElement("location");
        location.appendChild(doc.createTextNode("Poland"));
        user.appendChild(location);

        Element api = doc.createElement("api");
        api.appendChild(doc.createTextNode("3c3f9bbe0fc53397db130c66d0e813ea"));
        user.appendChild(api);

        Element color = doc.createElement("color");
        color.appendChild(doc.createTextNode("lightblue"));
        user.appendChild(color);

        // create folder 
        File dir = new File("data");
        dir.mkdir();

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("data/config.xml"));

        transformer.transform(source, result);
        System.out.println("--> CREATED!");
        WeatherUI wUI = new WeatherUI();
        wUI.setVisible(true);
    }

    public Data() {
    }
}
