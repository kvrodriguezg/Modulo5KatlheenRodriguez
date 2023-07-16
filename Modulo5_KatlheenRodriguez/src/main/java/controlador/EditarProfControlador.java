package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProfDAOImpl;
import modelo.Profesional;

/**
 * Servlet implementation class EditarProfControlador
 */
@WebServlet("/EditarProfControlador")
public class EditarProfControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProfControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Creamos objeto y le asignamos sus atributos según lo ingresado en formulario.
		Profesional us_prof = new Profesional();
		int id = Integer.parseInt(request.getParameter("id"));
		us_prof.setNombre(request.getParameter("nombre"));
		us_prof.setRun(Integer.parseInt(request.getParameter("run")));
		us_prof.setTipo("Administrativo");
		us_prof.setFecha_nac(request.getParameter("fecha_nac"));
		us_prof.setTitulo(request.getParameter("titulo"));
		us_prof.setFecha_ingreso(request.getParameter("f_ingreso"));
		
		//Llamamos al método para editar el usuario.
		ProfDAOImpl prof_creado = new ProfDAOImpl();
		prof_creado.editar_prof(us_prof, id);
		getServletContext().getRequestDispatcher("/Views/us_creado.jsp").forward(request, response);
	}

}
