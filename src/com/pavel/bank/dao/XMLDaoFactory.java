package com.pavel.bank.dao;

/**
 * Created by Admin on 25.03.15.
 */
public class XMLDaoFactory {
    XMLDaoFactory instance = new XMLDaoFactory();
    public XMLDaoFactory getInstance(){
        return instance;
    }

    public XMLDao getDAO(DAOType type){
        XMLDao dao;
        switch (type){
            case SAX:
                break;
            case STAX:
                break;
            case DOM:
                break;
            default:
                break;

        }
    }

    private enum DAOType{
        SAX, STAX, DOM
    }
}
