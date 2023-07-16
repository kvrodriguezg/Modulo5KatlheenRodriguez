package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.IDAO.IUsDAO;
import conexion.Conexion;
import modelo.Usuario;

public class UsDAOImpl implements IUsDAO{

	private Connection cn = null;
	
	@Override
	public ArrayList<Usuario> listar_us() {
		// TODO Auto-generated method stub
		
		String sql = "select id, nombre, tipo, run, f_nac from usuarios;";
		ArrayList<Usuario> lista_us = new ArrayList<Usuario>();
		
		try
		{
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				lista_us.add(new Usuario (rs.getInt("id"),rs.getString("nombre"),rs.getInt("run"),rs.getString("f_nac"),rs.getString("tipo")));
			}
			rs.close();
			stm.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista_us;
	}
	

}
