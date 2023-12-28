package com.methods;

import javax.servlet.http.HttpServletRequest;

public class Validate {

	public static String valid(HttpServletRequest req) {

		Dto_Login d = Dao_Login.forLogin(req);

		String out = "";

		if (d == null) {
			return "user doesn't exist";
		} else {
			Long phno = d.getPhno();
			String pwd = d.getPwd();
			if (phno == Long.parseLong(req.getParameter("phno"))) {

				if (pwd.equals(req.getParameter("pwd"))) {

					out = "login Successfull";

				}

				else {
					out = "In correct password ";

				}
			} else {
				out = "user doesn't exit";
			}
		}

		return out;

	}
}
