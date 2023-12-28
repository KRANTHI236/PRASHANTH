package CONTROLLER;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductDao;
import DTO.ProductDto;

@WebServlet("/delete")
public class DeleteProduct extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		ProductDao productDao = new ProductDao();
		boolean result = productDao.deleteProduct(id);

		if (result) {
			List<ProductDto> pd = productDao.getAllProducts();
			req.setAttribute("product", pd);

			RequestDispatcher rd = req.getRequestDispatcher("DisplayProductDetails.jsp");
			rd.forward(req, resp);
		}

	}

}
