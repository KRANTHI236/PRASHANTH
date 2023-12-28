package com.sessoin;

import java.io.IOException;

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

		Dao.insertData(req);
		HttpSession hs = req.getSession();

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		long num = Long.parseLong(req.getParameter("num"));
		String mail = req.getParameter("mail");
		String pwd = req.getParameter("pwd");

		req.getSession().setAttribute("id", id);
		req.getSession().setAttribute("name", name);
		req.getSession().setAttribute("num", num);
		req.getSession().setAttribute("mail", mail);
		req.getSession().setAttribute("pwd", pwd);

		RequestDispatcher rq = req.getRequestDispatcher("index1.jsp");
		rq.forward(req, resp);

	}

}
