package com.pavel.bank.logic.impl;

import com.pavel.bank.controller.JSPPageName;
import com.pavel.bank.dao.XMLDao;
import com.pavel.bank.dao.XMLDaoException;
import com.pavel.bank.dao.XMLDaoFactory;
import com.pavel.bank.logic.ICommand;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public class DoSaxCommand implements ICommand {

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        XMLDao dao= null;
        try {
            dao = XMLDaoFactory.getInstance().getDAO(XMLDaoFactory.DAOType.SAX);
            List<? extends Object> content = dao.parseXML(request.getParameter("filename"));
            request.setAttribute("content", content);
            page = JSPPageName.PARSER_PAGE;
        }
        catch (Exception e){
            request.setAttribute("errorMessage", e.getMessage());
            page = JSPPageName.ERROR_PAGE;
        }

        return page;
    }
}
