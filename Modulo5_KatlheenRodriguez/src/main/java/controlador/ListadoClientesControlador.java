package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ClienteDAOImpl;
import modelo.Cliente;
/**
 * Servlet implementation class ListadoClientesControlador
 */
@WebServlet("/ListadoClientesControlador")
public class ListadoClientesControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoClientesControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Validamos si existe una sesión, si no es así redirige al login.
		HttpSession sesion = request.getSession();
		Object usuario = (String) sesion.getAttribute("usuario");

		if(usuario== null)
		{
			getServletContext().getRequestDispatcher("/Login").forward(request, response);
		}
		else
		{
			//Se envía lista de usuarios al jsp.
			ClienteDAOImpl us = new ClienteDAOImpl();
			ArrayList<Cliente> listaUs = us.listar_cliente();
			
			request.setAttribute("clientes",listaUs);
			getServletContext().getRequestDispatcher("/Views/listado_Clientes.jsp").forward(request, response);
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
