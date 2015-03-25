package com.pavel.bank.dao.impl;

import com.pavel.bank.dao.XMLDao;

/**
 * Created by Pachon on 25.03.2015.
 */
public class DomXMLDao implements XMLDao {
    private final static DomXMLDao instance = new DomXMLDao();

    public static DomXMLDao getInstance(){return instance;}
}
