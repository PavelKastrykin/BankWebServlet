package com.pavel.bank.logic.impl;

import com.pavel.bank.controller.JSPPageName;
import com.pavel.bank.dao.XMLDao;
import com.pavel.bank.dao.XMLDaoFactory;
import com.pavel.bank.logic.ICommand;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import org.apache.log4j.Logger;

public class DoSaxCommand implements ICommand {

    public static final Logger logger = Logger.getLogger(DoSaxCommand.class);
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
            logger.info(e.getMessage());
            request.setAttribute("errorMessage", e.getMessage());
            page = JSPPageName.ERROR_PAGE;
        }

        return page;
    }
}
