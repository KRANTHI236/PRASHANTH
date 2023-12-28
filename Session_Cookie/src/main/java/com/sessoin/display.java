package com.sessoin;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/display")
public class display extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Dao.insertData(req);
		HttpSession hs = req.getSession();
		List<Dto> l = Fetch_Data.fetch(req);

		req.getSession().setAttribute("li", l);

		RequestDispatcher rd = req.getRequestDispatcher("index1.jsp");
		rd.forward(req, resp);

	}

}
