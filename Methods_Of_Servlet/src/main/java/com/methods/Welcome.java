package com.methods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("login").endsWith("login")) {
			request.getRequestDispatcher("login.jsp").forward(request, response);

		} else if (request.getParameter("login").endsWith("signin")) {
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}

	}

}
