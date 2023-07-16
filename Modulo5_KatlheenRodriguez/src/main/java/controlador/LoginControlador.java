package controlador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class LoginControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/Views/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Validamos que el usuario y contraseña sean iguales a los establecidos. De ser así, se ingresa al sistema 
		//y se crea la sesión. De lo contrario, se mantiene en el login (doGet).
		String usuario_ingresado = request.getParameter("usuario");
		String clave_ingresada = request.getParameter("contrasena");
		String usuario  = "admin";
		String clave = "1234";
		
		if (usuario_ingresado != null && usuario_ingresado.equals(usuario) &&
			clave_ingresada != null && clave_ingresada.equals(clave))
		{
			String usuario1 = "admin";
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuario",usuario1);
			getServletContext().getRequestDispatcher("/Contacto").forward(request, response);
		}
		else
		{
			doGet(request, response);
		}
	}
}
