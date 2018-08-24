package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.LoginDAO;
import com.connection.MyConnection;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/check")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		
		//READING PARAMETER
		String name,password;
		name=request.getParameter("username");
		password=request.getParameter("password");
		
		LoginDAO logdao=new LoginDAO();
				
		//OUTPUT
		response.setContentType("text/html");
		
		System.out.println(logdao.checkLogin(name, password));
		if(logdao.checkLogin(name, password))
		{
//			out.println("HELLO FROM THE OTHER WORLD.............");
			RequestDispatcher req=request.getRequestDispatcher("success.jsp");
			req.forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "CREDENTIALS NOT MATCHING");
			RequestDispatcher req=request.getRequestDispatcher("login.jsp");
			req.forward(request, response);
		}
			
	}


}
