package eu.ensup.touchard.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.touchard.domaine.Personne;
import org.touchard.service.PersonneService;

/**
 * Servlet implementation class GestionPersonne
 */
@WebServlet("/GestionPersonne")
public class GestionPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PersonneService service = new PersonneService();
    Personne personne = new Personne(0, "TOUCHARD", "David", null, null, null, null);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionPersonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("message", service.creerPersonne(personne));
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
