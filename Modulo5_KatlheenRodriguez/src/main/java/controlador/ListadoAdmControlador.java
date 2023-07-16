package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.AdmDAOImpl;
import modelo.Administrativo;


/**
 * Servlet implementation class ListadoAdmControlador
 */
@WebServlet("/ListadoAdmControlador")
public class ListadoAdmControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoAdmControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		Object usuario = (String) sesion.getAttribute("usuario");

		//Validamos si existe una sesión, si no es así redirige al login.
		if(usuario== null)
		{
			getServletContext().getRequestDispatcher("/Login").forward(request, response);
		}
		else
		{
			//Se envía lista de usuarios al jsp.
			AdmDAOImpl us = new AdmDAOImpl();
			ArrayList<Administrativo> listaUs = us.listar_adm();			
			request.setAttribute("adm",listaUs);
			getServletContext().getRequestDispatcher("/Views/listado_Adm.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
