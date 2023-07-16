package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.AdmDAOImpl;
import modelo.Administrativo;

/**
 * Servlet implementation class EditarAdmControlador
 */
@WebServlet("/EditarAdmControlador")
public class EditarAdmControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarAdmControlador() {
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
				Administrativo us_adm = new Administrativo();
				int id = Integer.parseInt(request.getParameter("id"));
				us_adm.setNombre(request.getParameter("nombre"));
				us_adm.setRun(Integer.parseInt(request.getParameter("run")));
				us_adm.setTipo("Administrativo");
				us_adm.setFecha_nac(request.getParameter("fecha_nac"));
				us_adm.setArea(request.getParameter("area"));
				us_adm.setExp_previa(request.getParameter("exp"));
				
				//Llamamos el método para editar el usuario correspondiente.
				AdmDAOImpl adm_creado = new AdmDAOImpl();
				adm_creado.editar_adm(us_adm, id);
				getServletContext().getRequestDispatcher("/Views/us_creado.jsp").forward(request, response);
		
	}

}
