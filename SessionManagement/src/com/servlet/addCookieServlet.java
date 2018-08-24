package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addCookieServlet
 */
@WebServlet("/addCookie")
public class addCookieServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public addCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String name=request.getParameter("myname");
		String msg=name.concat("FromSERVER");
		
		Cookie c=new Cookie("msg1",msg);
		response.addCookie(c);
		
		PrintWriter pw=response.getWriter();
		pw.println("cookie added to client");
	}

}
