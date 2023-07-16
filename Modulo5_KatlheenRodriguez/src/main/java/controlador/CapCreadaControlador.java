package controlador;
import modelo.Capacitacion;
import DAO.CapDAOImpl;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cap_Creada
 */
@WebServlet("/Cap_Creada")
public class CapCreadaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CapCreadaControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
  //doGet para desplegar el jsp.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Creamos objeto capacitacion y le asignamos los datos ingresados por el usuario.
				Capacitacion cap = new Capacitacion();
				cap.setNombre(request.getParameter(("nombre")));
				cap.setDetalle(request.getParameter(("detalle")));
				
				//Llamamos al método de creación de registro.		
				CapDAOImpl cap_creada = new CapDAOImpl();
				cap_creada.crear_cap(cap);
				
				getServletContext().getRequestDispatcher("/Views/cap_creada.jsp").forward(request, response);
	}

}
