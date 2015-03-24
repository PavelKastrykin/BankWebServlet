package com.pavel.bank.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ParserController extends HttpServlet {

    private static final String PARSER_TYPE = "parserType";
    private static final String SAX_TYPE = "SAX";
    private static final String STAX_TYPE = "StAX";
    public static final String ERROR_PAGE = "error.jsp";

    public ParserController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parameter = request.getParameter(PARSER_TYPE);
        String page = null;
        if (parameter.equals(SAX_TYPE)){

        }
        else if (parameter.equals(STAX_TYPE)){

        } else {
            page = ERROR_PAGE;
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);

        if (dispatcher != null){
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
