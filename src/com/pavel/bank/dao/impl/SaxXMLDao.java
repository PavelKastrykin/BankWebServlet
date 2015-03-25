package com.pavel.bank.dao.impl;

import com.pavel.bank.dao.XMLDao;
import com.pavel.bank.dao.sax.SAXBankParser;

import java.util.List;

/**
 * Created by Admin on 25.03.15.
 */
public class SaxXMLDao implements XMLDao{
    private static final SaxXMLDao instance = new SaxXMLDao();

    public SaxXMLDao getInstance(){return instance;}

    @Override
    public List<Object> parse(String resourseName){
        return SAXBankParser.getInstance().
    }

}
