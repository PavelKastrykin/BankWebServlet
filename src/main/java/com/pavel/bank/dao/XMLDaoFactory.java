package com.pavel.bank.dao;

import com.pavel.bank.dao.impl.DomXMLDao;
import com.pavel.bank.dao.impl.SaxXMLDao;
import com.pavel.bank.dao.impl.StaxXMLDao;

public class XMLDaoFactory {
    public static final XMLDaoFactory instance = new XMLDaoFactory();
    public static XMLDaoFactory getInstance(){
        return instance;
    }

    public XMLDao getDAO(DAOType type) throws XMLDaoException{
        XMLDao dao;
        switch (type){
            case SAX:
                return SaxXMLDao.getInstance();
            case STAX:
                return StaxXMLDao.getInstance();
            case DOM:
                return DomXMLDao.getInstance();
            default:
                throw new XMLDaoException("DAO not found");
        }
    }

    public enum DAOType{
        SAX, STAX, DOM
    }
}
