package com.atuldwivedi.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet({ "/registration", "/registerMe" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nm = request.getParameter("name");
		String un = request.getParameter("userName");
		String p = request.getParameter("pass");
		String mob = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("courses");
		String city = request.getParameter("city");
		String addr = request.getParameter("address");
		
		PrintWriter pw = response.getWriter();
		pw.print("<p>"+nm+"<br>"+un+"<br>"+mob+"</p>");
		
		pw.print(gender);
		pw.print("<br>");
		
		for (int i = 0; i < courses.length; i++) {
			pw.print(courses[i]);
			pw.print("&nbsp;");
		}
		pw.print("<br>");
		
		pw.print(city);
		pw.print("<br>");
		
		pw.print(addr);
		pw.print("<br>");
	}

}
