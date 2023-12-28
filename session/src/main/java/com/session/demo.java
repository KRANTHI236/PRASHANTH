package com.session;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@javax.servlet.annotation.WebServlet("/demo")
public class demo extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Mainclass.insert(req);

		HttpSession s = req.getSession();
		List<Dto> l = Fetch_Data.fetch(req);
		req.getSession().setAttribute("li", l);
		RequestDispatcher r = req.getRequestDispatcher("demo.jsp");
		r.forward(req, resp);

	}
}
