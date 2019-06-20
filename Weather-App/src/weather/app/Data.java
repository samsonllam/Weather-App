/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
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
            
        } catch (SAXException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* Save entered location, api key and theme from xml file */
    public static void writeData(String locationToRemember, String apiToRemember, String themeToRemember) throws TransformerException, ParserConfigurationException{
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
                    System.out.println(themeToRemember);
                }
            }
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
        } catch (SAXException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Data() { }
}
