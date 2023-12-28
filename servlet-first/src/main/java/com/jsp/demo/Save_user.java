package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savedata")
public class Save_user extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		int id=Integer.parseInt(req.getParameter("id"));
		
		String str=req.getParameter("text");
		
		int id1=Integer.parseInt(req.getParameter("id1"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first?user=root&password=root");
			
			PreparedStatement ps=c.prepareStatement("insert into user values(?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2, str);
			ps.setInt(3, id1);
			
			ps.executeUpdate();
			
			c.close();
			
			PrintWriter pw=resp.getWriter();	
			
			pw.println(str+"data saved");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}


