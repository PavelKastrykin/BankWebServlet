package com.pavel.bank.dao;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

/**
 * Created by Admin on 25.03.15.
 */
public interface XMLDao {
    List<? extends Object> parseXML(String resourceName) throws XMLStreamException, SAXException, ParserConfigurationException, IOException;
}
