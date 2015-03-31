package com.pavel.bank.controller;

import com.pavel.bank.logic.CommandHelper;
import com.pavel.bank.logic.ICommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ParserController extends HttpServlet {

    public ParserController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String commandName = request.getParameter("parserType");
        ICommand command = CommandHelper.getInstance().getCommand(commandName);
        String page = null;
        page = command.execute(request, getServletContext());


        RequestDispatcher dispatcher = request.getRequestDispatcher(page);

        if (dispatcher != null){
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
