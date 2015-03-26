package com.pavel.bank.logic.impl;

import com.pavel.bank.controller.JSPPageName;
import com.pavel.bank.logic.ICommand;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Admin on 26.03.15.
 */
public class DoNoSuchCommand  implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("errorMessage", "Error: no command accepted");
        return JSPPageName.ERROR_PAGE;
    }

}
