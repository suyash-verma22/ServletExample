package com.firstPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 * Servlet implementation class App
 */
@WebServlet("/App")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public App() {
        // TODO Auto-generated constructor stub
    }
    /*
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
    	PrintWriter out = response.getWriter();
    	out.print("<h1>Hello, from service method</h1>");
    }
    */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	out.print("<h1>Hello, from doGet method</h1>");
    	String first_name = request.getParameter("fname");
    	out.print("<h2>Welcome, " + first_name + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
    	out.print("<h1>Hello, from doPost method</h1>");
    	String first_name = request.getParameter("fname");
    	out.print("<h2>Welcome, " + first_name + "</h2>");
	}

}
