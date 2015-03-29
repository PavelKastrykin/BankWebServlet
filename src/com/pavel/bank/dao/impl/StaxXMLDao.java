package com.pavel.bank.dao.impl;

import com.pavel.bank.dao.XMLDao;
import com.pavel.bank.dao.stax.StAXBankParser;
import com.pavel.bank.entity.Account;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StaxXMLDao implements XMLDao {
    private static final StaxXMLDao instance = new StaxXMLDao();

    public static StaxXMLDao getInstance(){return instance;}

    @Override
    public List<? extends Object> parseXML(String resourseName) throws IOException, XMLStreamException{
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        InputStream inputStream = new FileInputStream(resourseName);
        XMLStreamReader reader = inputFactory.createXMLStreamReader(inputStream);
        List<Account> accounts = StAXBankParser.process(reader);
        reader.close();
        inputStream.close();
        return accounts;
    }
}
