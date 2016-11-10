package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;

import model.Pays;
import test.TestHibernate;

/**
 * Servlet implementation class Hibernate
 */
@WebServlet("/hibernate")
public class Hibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String SERVER = "localhost", 
			BD = "dbexo", 
			LOGIN = "root", 
			PASSWORD = "admin", 
			VUES = "/vues/hibernate/";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Hibernate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		TestHibernate hiber;
		String maVue = VUES + "Index.jsp";
		try{
			hiber = new TestHibernate();
			if(action == null){
				System.out.println("ACTION IS NULL");
			}
			else if(action.equals("connexion")){

			}
			else if(action.equals("insertion")){
				Pays monPays = new Pays();
				monPays.setCode("GR2");
				monPays.setNom("Allemagne");
				monPays.setLangue("Allemand");
				hiber.insertPays(monPays);
				maVue = VUES + "/Insertion.jsp";
				
			}
			else if(action.equals("displayFilms")){
				request.setAttribute("films", hiber.getAllFilms());
				maVue = VUES + "displayFilms.jsp";
			}
			else if(action.equals("displayFilms2")){
				request.setAttribute("films", hiber.getAllFilms());
				maVue = VUES + "displayFilms2.jsp";
			}
		}
		catch(Exception e){
			System.out.println("ça merde! --------------------------------------\n" + e.toString());
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
