package controlador;
import modelo.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Contacto_Env
 */
@WebServlet("/Contacto_Env")
public class ContactoEnvControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactoEnvControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Creamos objeto contacto y le asignamos los atributos según lo ingresado.
		Contacto cont = new Contacto();
		cont.setNombre(request.getParameter(("nombre")));
		cont.setEmail(request.getParameter(("email")));
		cont.setTelefono(Integer.parseInt(request.getParameter(("telefono"))));
		cont.setMensaje(request.getParameter(("mensaje")));
		
		//Llamamos al método para mostrar el contacto en consola.
		ContactoImpl cont_creado = new ContactoImpl();
		cont_creado.Ingreso_Contacto(cont);
		
		getServletContext().getRequestDispatcher("/Views/contacto_env.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
