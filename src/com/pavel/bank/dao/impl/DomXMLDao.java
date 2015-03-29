package com.pavel.bank.dao.impl;

import com.pavel.bank.dao.XMLDao;
import com.pavel.bank.dao.dom.DOMBankParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public class DomXMLDao implements XMLDao {
    private final static DomXMLDao instance = new DomXMLDao();

    public static DomXMLDao getInstance(){return instance;}

    @Override
    public List<? extends Object> parseXML(String resourceName) throws XMLStreamException, SAXException, ParserConfigurationException, IOException {
        return DOMBankParser.getAccounts(resourceName);
    }
}
