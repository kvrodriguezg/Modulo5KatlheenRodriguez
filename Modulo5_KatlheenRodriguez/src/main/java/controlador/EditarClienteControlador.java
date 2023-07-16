package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClienteDAOImpl;
import modelo.Cliente;


/**
 * Servlet implementation class EditarClienteControlador
 */
@WebServlet("/EditarClienteControlador")
public class EditarClienteControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarClienteControlador() {
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
		Cliente us_cliente = new Cliente();
		int id = Integer.parseInt(request.getParameter("id"));
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
		cliente_creado.editar_cliente(us_cliente, id);
		getServletContext().getRequestDispatcher("/Views/us_creado.jsp").forward(request, response);
	}

}
