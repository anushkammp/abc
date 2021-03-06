package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.EmployeeDAO;
import com.pojos.Employee;

/**
 * Servlet implementation class FindAllEmployeeServlet
 */
@WebServlet("/showAll")
public class FindAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> li=dao.findAllEmployee();
		
		request.setAttribute("employee", li);
		RequestDispatcher dis=request.getRequestDispatcher("show.jsp");
		dis.forward(request, response);
	}

}
