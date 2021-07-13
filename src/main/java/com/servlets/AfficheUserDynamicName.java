package com.servlets;

import java.io.IOException;

import com.beans.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AfficheUserDynamicName
 */
@WebServlet("/user")
public class AfficheUserDynamicName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficheUserDynamicName() {
        super();
        System.out.println("Je suis dans le constructeur");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Je suis dans la doGet");
		User alexis = new User("Alexis", "alex@pop.fr", 25);
		String newName = request.getParameter("name");
		alexis.setNom(newName);
		alexis.setEmail(request.getParameter("mail"));
		request.setAttribute("myUser", alexis);
		request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
