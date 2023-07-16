package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import DAO.UsDAOImpl;
import modelo.Usuario;

/**
 * Servlet implementation class Listado_Usuarios
 */
@WebServlet("/Listado_Usuarios")
public class ListadoUsuariosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoUsuariosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//validamos si existe una sesión. En caso de que no sea así se redirecciona al login.
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
				UsDAOImpl us = new UsDAOImpl();
				ArrayList<Usuario> listaUs = us.listar_us();				
				request.setAttribute("usuarios",listaUs);
				getServletContext().getRequestDispatcher("/Views/listado_Usuarios.jsp").forward(request, response);
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
