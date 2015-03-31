package com.pavel.bank.logic;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public interface ICommand {
    public String execute(HttpServletRequest request, ServletContext context);
}
