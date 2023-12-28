package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/getdata")
public class GetDataFromForm extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		PrintWriter pw=res.getWriter();
		String name1=req.getParameter("text1");
		pw.println(name1);
		String name2=req.getParameter("text2");
		pw.println(name2);
		String name3=req.getParameter("text3");
		pw.println(name3);
		String name4=req.getParameter("text4");
	    pw.println(name4);
		
		
		
	}

}
