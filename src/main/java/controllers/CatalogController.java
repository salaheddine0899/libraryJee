package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bo.Book;
import model.bo.*;

import java.io.IOException;
import java.util.*;

/**
 * Servlet implementation class CatalogController
 */
public class CatalogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Collection<Book> books;
    /**
     * @see HttpServlet#HttpServlet()
     */
   @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		books=new ArrayList<Book>();
		books.add(new Book("Harry Potter"));
		books.add(new Book("The lord of the rings"));
		books.add(new Book("game of Thrones"));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("books", books);
		request.getRequestDispatcher("catalog.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
