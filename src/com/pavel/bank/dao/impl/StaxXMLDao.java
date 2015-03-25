package com.pavel.bank.dao.impl;

import com.pavel.bank.dao.XMLDao;

/**
 * Created by Pachon on 25.03.2015.
 */
public class StaxXMLDao implements XMLDao {
    private static final StaxXMLDao instance = new StaxXMLDao();

    public static StaxXMLDao getInstance(){return instance;}
}
