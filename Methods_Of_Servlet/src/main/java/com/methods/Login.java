package com.methods;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String val = Validate.valid(request);
		PrintWriter pw = response.getWriter();

		if (val.equals("login Successfull")) {

			Dto_Login d = Dao_Login.forLogin(request);
			pw.println("login Successfull");
			pw.println("Details:----");
			pw.println("phno     :" + d.getPhno());
			pw.println("pwd      :" + d.getPwd());

		} else {
			pw.println(val);

		}
	}

}
