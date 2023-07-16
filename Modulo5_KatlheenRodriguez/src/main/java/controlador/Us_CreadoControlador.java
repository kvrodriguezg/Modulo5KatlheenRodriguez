package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.*;
import modelo.*;

/**
 * Servlet implementation class Us_Creado
 */
@WebServlet("/Us_Creado")
public class Us_CreadoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Us_CreadoControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		getServletContext().getRequestDispatcher("/Views/us_creado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Creamos variable tipo y le asignamos los datos ingresados.		
				int tipo = (Integer.parseInt(request.getParameter(("tipo"))));
				
				//Llamamos al método de creación de registro según tipo de usuario.
				if(tipo == 1)
				{
					Administrativo us_adm = new Administrativo();
					us_adm.setNombre(request.getParameter("nombre"));
					us_adm.setRun(Integer.parseInt(request.getParameter("run")));
					us_adm.setTipo("Administrativo");
					us_adm.setFecha_nac(request.getParameter("fecha_nac"));
					us_adm.setArea(request.getParameter("area"));
					us_adm.setExp_previa(request.getParameter("exp"));
					
					AdmDAOImpl adm_creado = new AdmDAOImpl();
					adm_creado.crear_adm(us_adm);
					getServletContext().getRequestDispatcher("/Views/us_creado.jsp").forward(request, response);
				}
				else if(tipo==2)
				{	
					
					Cliente us_cliente = new Cliente();
					us_cliente.setNombre(request.getParameter("nombre"));
					us_cliente.setRun(Integer.parseInt(request.getParameter("run")));
					us_cliente.setTipo("Cliente");
					us_cliente.setFecha_nac(request.getParameter("fecha_nac"));
					us_cliente.setRut(Integer.parseInt(request.getParameter("rut")));
					us_cliente.setNombres(request.getParameter("nombres"));
					us_cliente.setApellidos(request.getParameter("apellidos"));
					us_cliente.setTelefono(Integer.parseInt(request.getParameter("telefono")));
					us_cliente.setAfp(request.getParameter("afp"));
					us_cliente.setDireccion(request.getParameter("direccion"));
					us_cliente.setComuna(request.getParameter("comuna"));
					us_cliente.setEdad(Integer.parseInt(request.getParameter("edad")));
					us_cliente.setSis_salud(request.getParameter("sis_salud"));
					
					ClienteDAOImpl cliente_creado = new ClienteDAOImpl();
					cliente_creado.crear_cliente(us_cliente);			
					getServletContext().getRequestDispatcher("/Views/us_creado.jsp").forward(request, response);
				}
				else if(tipo==3)
				{
					
					Profesional us_profesional = new Profesional();
					us_profesional.setNombre(request.getParameter("nombre"));
					us_profesional.setRun(Integer.parseInt(request.getParameter("run")));
					us_profesional.setTipo("Profesional");
					us_profesional.setFecha_nac(request.getParameter("fecha_nac"));
					us_profesional.setTitulo(request.getParameter("titulo"));
					us_profesional.setFecha_ingreso(request.getParameter("f_ingreso"));
					
					ProfDAOImpl prof_creado = new ProfDAOImpl();
					prof_creado.crear_prof(us_profesional);					
					getServletContext().getRequestDispatcher("/Views/us_creado.jsp").forward(request, response);	
				}
	}

}
