package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.IDAO.ICapDAO;
import conexion.Conexion;
import modelo.Capacitacion;

public class CapDAOImpl implements ICapDAO {

	private Connection cn = null;
	
	//Método para crear capacitacion.
	@Override
	public void crear_cap(Capacitacion capa) {
		// TODO Auto-generated method stub
		//Script SQL.
		String sql = "insert into capacitaciones(nombre,detalle) values ('"
				+capa.getNombre() +"','"+capa.getDetalle()+"');";
		
		try {
			cn = Conexion.getConn();
			java.sql.Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

	//Método para listar.
	@Override
	public ArrayList<Capacitacion> listar_cap() {
		// TODO Auto-generated method stub
		//Script SQL.
				String sql = "select id, nombre, detalle from capacitaciones;";
				ArrayList<Capacitacion> lista_cap = new ArrayList<Capacitacion>();
				
				try
				{
					cn = Conexion.getConn();
					Statement stm = cn.createStatement();
					ResultSet rs = stm.executeQuery(sql);
					
					while (rs.next()) {
						lista_cap.add(new Capacitacion (rs.getInt("id"),rs.getString("nombre"),rs.getString("detalle")));
					}
					rs.close();
					stm.close();	
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				return lista_cap;
	}

}
