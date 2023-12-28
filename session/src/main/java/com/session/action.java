package com.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/action")
public class action extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("action").equals("Update"))

		{
			req.getSession().setAttribute("id", req.getParameter("id"));
			req.getSession().setAttribute("name", req.getParameter("name"));
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		} else if (req.getParameter("action").equals("Delete")) {
			display.Delete(req);

			req.getRequestDispatcher("demo.jsp").forward(req, resp);
		}
	}
}
