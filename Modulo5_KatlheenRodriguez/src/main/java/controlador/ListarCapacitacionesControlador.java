package controlador;

import modelo.Capacitacion;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.CapDAOImpl;


/**
 * Servlet implementation class Listar_Capacitaciones
 */
@WebServlet("/Listar_Capacitaciones")
public class ListarCapacitacionesControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitacionesControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//validamos si existe una sesión. En caso de que no sea así se redirecciona al login.
		HttpSession sesion = request.getSession();
		Object usuario = (String) sesion.getAttribute("usuario");

		if(usuario== null)
		{
			getServletContext().getRequestDispatcher("/Login").forward(request, response);
		}
		else
		{
			//se obtiene la lista de capacitaciones y se envía al jsp.
			
			CapDAOImpl cap = new CapDAOImpl();
			ArrayList<Capacitacion> listaCap = cap.listar_cap();;
			
			request.setAttribute("capacitaciones",listaCap);
			getServletContext().getRequestDispatcher("/Views/listar_capacitaciones.jsp").forward(request, response);
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
