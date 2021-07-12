package com.servlets.exercices;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/recup")
public class Recup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Recup() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = "anis@pop.fr";
		String password = "bbvfevcsdvhsd1";
		request.setAttribute("adresse", email);
		request.setAttribute("motDePasse", password);
		
		boolean firstCharMaj = 
		Character.isUpperCase(password.charAt(0)) ? true : false;
		request.setAttribute("firstCharMaj", firstCharMaj);
		
		String[] tab = {"Alexis" , "Jeremy" , "Cathy"};
		
		request.setAttribute("tabStagiaires", tab);
		
		request.getRequestDispatcher("WEB-INF/recup.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
