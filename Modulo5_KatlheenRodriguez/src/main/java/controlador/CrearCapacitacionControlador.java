package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Crear_Capacitacion
 */
@WebServlet("/Crear_Capacitacion")
public class CrearCapacitacionControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacionControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
  //doGet para desplegar el jsp.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//validamos si existe una sesión. En caso de que no sea así se redirecciona al login.	
		HttpSession sesion = request.getSession();
		Object usuario = (String) sesion.getAttribute("usuario");

		if(usuario== null)
		{
			getServletContext().getRequestDispatcher("/Login").forward(request, response);
			return;
		}
		getServletContext().getRequestDispatcher("/Views/crear_capacitacion.jsp").forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
