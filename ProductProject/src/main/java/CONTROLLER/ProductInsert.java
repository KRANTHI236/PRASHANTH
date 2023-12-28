package CONTROLLER;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductDao;
import DTO.ProductDto;

@WebServlet("/product")
public class ProductInsert extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String productName = req.getParameter("name");
		String productDecscription = req.getParameter("description");
		double productPrice = Double.parseDouble(req.getParameter("price"));

		ProductDto productDto = new ProductDto();

		productDto.setProductName(productName);
		productDto.setProductDescription(productDecscription);
		productDto.setProductPrice(productPrice);

		ProductDao productDao = new ProductDao();
		ProductDto productDto2 = productDao.insertProduct(productDto);

		if (productDto2 != null) {

//			req.setAttribute("message", "inserted product name is:" + " " + productDto.getProductName());

			List<ProductDto> productDto1 = productDao.getAllProducts();
			req.setAttribute("product", productDto1);

			RequestDispatcher rd = req.getRequestDispatcher("DisplayProductDetails.jsp");
			rd.forward(req, resp);

		} else {
//			PrintWriter pw = resp.getWriter();
//			pw.println("enter the proper details");

			RequestDispatcher rd1 = req.getRequestDispatcher("Product.jsp");
			rd1.forward(req, resp);

		}

	}

}
