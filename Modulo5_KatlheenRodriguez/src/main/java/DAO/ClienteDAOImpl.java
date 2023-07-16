package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.IDAO.IClienteDAO;
import conexion.Conexion;
import modelo.Cliente;



public class ClienteDAOImpl implements IClienteDAO{

	private Connection cn = null;
	public void crear_cliente(Cliente us_cliente) {
		// TODO Auto-generated method stub
		//Script SQL.
		String sql = "insert into usuarios(nombre,run,tipo,f_nac,rut,nombres,apellidos,telefono,afp,"
				+ "sis_salud,direccion,comuna,edad) values ('"
				+us_cliente.getNombre() +"',"
				+us_cliente.getRun()+",'"
				+us_cliente.getTipo()+"','"
				+us_cliente.getFecha_nac()+"',"
				+us_cliente.getRut()+",'"
				+us_cliente.getNombres()+"','"
				+us_cliente.getApellidos()+"',"
				+us_cliente.getTelefono()+",'"
				+us_cliente.getAfp()+"','"
				+us_cliente.getSis_salud()+"','"
				+us_cliente.getDireccion()+"','"
				+us_cliente.getComuna()+"',"
				+us_cliente.getEdad()+");";
	try {
		cn = Conexion.getConn();
		java.sql.Statement stm = cn.createStatement();
		System.out.println("Conexion OK");
		stm.execute(sql);
		stm.close();
		
	} catch (SQLException e){
		e.printStackTrace();
	}
	}
	
	@Override
	public ArrayList<Cliente> listar_cliente() {
		// TODO Auto-generated method stub
		String sql = "select id, nombre, tipo, run, f_nac, rut, nombres, apellidos, telefono, afp, sis_salud,"
				+ "direccion, comuna, edad from usuarios where tipo='Cliente';";
		ArrayList<Cliente> lista_cl = new ArrayList<Cliente>();
		
		try
		{
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			 

			while (rs.next()) {
				lista_cl.add(new Cliente (rs.getInt("id"),rs.getString("nombre"),rs.getInt("run"),rs.getString("f_nac"),rs.getString("tipo"),
						rs.getInt("rut"),rs.getString("nombres"),rs.getString("apellidos"),rs.getInt("telefono"),rs.getString("afp"),
						rs.getString("sis_salud"),rs.getString("direccion"),rs.getString("comuna"),rs.getInt("edad")));
			}
			rs.close();
			stm.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista_cl;
	}

	@Override
	public void editar_cliente(Cliente us_cliente, int id) {
		// TODO Auto-generated method stub
		
		//Script SQL.
		String sql = "update usuarios set nombre = '" +us_cliente.getNombre()
					+"', run =" + us_cliente.getRun()
					+", f_nac = '" + us_cliente.getFecha_nac()
					+"', rut = " + us_cliente.getRut()
					+", nombres = '" + us_cliente.getNombres()
					+"', apellidos = '" + us_cliente.getApellidos()
					+"', telefono = " + us_cliente.getTelefono()
					+", afp = '" + us_cliente.getAfp()
					+"', sis_salud = '" + us_cliente.getSis_salud()
					+"', direccion = '" + us_cliente.getDireccion()
					+"', comuna = '" + us_cliente.getComuna()
					+"', edad = " + us_cliente.getEdad()
					+" where id =" + id + ";";
			try {
				cn = Conexion.getConn();
				java.sql.Statement stm = cn.createStatement();
				System.out.println("Conexion OK");
				stm.execute(sql);
				stm.close();
				
			} catch (SQLException e){
				e.printStackTrace();
			}
		
	}

}
