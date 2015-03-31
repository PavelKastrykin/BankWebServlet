package com.pavel.bank.logic.impl;

import com.pavel.bank.controller.JSPPageName;
import com.pavel.bank.logic.ICommand;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;

public class DoNoSuchCommand  implements ICommand {

    public static Logger logger = Logger.getLogger(DoNoSuchCommand.class);
    @Override
    public String execute(HttpServletRequest request, ServletContext context) {
        logger.info("Error: no command accepted");
        request.setAttribute("errorMessage", "Error: no command accepted");
        return JSPPageName.ERROR_PAGE;
    }

}
