package com.pavel.bank.dao.impl;

import com.pavel.bank.dao.XMLDao;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

/**
 * Created by Pachon on 25.03.2015.
 */
public class DomXMLDao implements XMLDao {
    private final static DomXMLDao instance = new DomXMLDao();

    public static DomXMLDao getInstance(){return instance;}

    @Override
    public List<? extends Object> parseXML(String resourceName) throws XMLStreamException, SAXException, ParserConfigurationException, IOException {
        return null;
    }
}
