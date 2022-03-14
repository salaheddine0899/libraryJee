package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.bo.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Servlet implementation class AddCart
 */
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Cart cart;
       
	@Override
	public void init() throws ServletException {
		cart=new Cart();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String[] titles=request.getParameterValues("book");
        ArrayList<Book> books=new ArrayList<Book>();
        for(String title:titles) {
        	books.add(new Book(title));
        }
        cart.setBooks(books);
        HttpSession session=request.getSession(true);
        session.setAttribute("cart", cart);
        request.getRequestDispatcher("cart.jsp").forward(request, response);
	}

}
