package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.IDAO.IProfDAO;
import conexion.Conexion;
import modelo.Profesional;

public class ProfDAOImpl implements IProfDAO {

	private Connection cn = null;
	@Override
	public void crear_prof(Profesional us_prof) {
		// TODO Auto-generated method stub
		//Script SQL.
		String sql = "insert into usuarios(nombre,run,tipo,f_nac,titulo,f_ingreso) values ('"
						+us_prof.getNombre() +"',"
						+us_prof.getRun()+",'"
						+us_prof.getTipo()+"','"
						+us_prof.getFecha_nac()+"','"
						+us_prof.getTitulo()+"','"
						+us_prof.getFecha_ingreso()+"');";
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
	public ArrayList<Profesional> listar_prof() {
		String sql = "select id, nombre, tipo, run, f_nac, titulo, f_ingreso from usuarios where tipo='Profesional';";
		ArrayList<Profesional> lista_prof = new ArrayList<Profesional>();
		
		try
		{
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			 

			while (rs.next()) {
				lista_prof.add(new Profesional (rs.getInt("id"),rs.getString("nombre"),rs.getInt("run"),rs.getString("f_nac"),rs.getString("tipo"),
						rs.getString("titulo"),rs.getString("f_ingreso")));
			}
			rs.close();
			stm.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista_prof;
	}

	@Override
	public void editar_prof(Profesional us_prof, int id) {
		// TODO Auto-generated method stub
		//Script SQL.
				String sql = "update usuarios set nombre = '" +us_prof.getNombre()
							+"', run =" + us_prof.getRun()
							+", f_nac = '" + us_prof.getFecha_nac()
							+"', titulo = '" + us_prof.getTitulo()
							+"', f_ingreso = '" + us_prof.getFecha_ingreso()
							+"' where id =" + id + ";";
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


