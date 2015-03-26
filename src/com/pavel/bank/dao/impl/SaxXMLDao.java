package com.pavel.bank.dao.impl;

import com.pavel.bank.dao.XMLDao;
import com.pavel.bank.dao.sax.SAXBankParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class SaxXMLDao implements XMLDao{
    private static final SaxXMLDao instance = new SaxXMLDao();

    public static SaxXMLDao getInstance(){return instance;}

    @Override
    public List<? extends Object> parseXML(String resourseName) throws SAXException, ParserConfigurationException, IOException{
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAXBankParser handler = SAXBankParser.getInstance();
        parser.parse(new File(resourseName), handler);
        return handler.getAccounts();
    }
}
