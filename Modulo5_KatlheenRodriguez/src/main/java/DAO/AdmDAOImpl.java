package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.IDAO.IAdmDAO;
import conexion.Conexion;
import modelo.Administrativo;

public class AdmDAOImpl implements IAdmDAO{

	private Connection cn = null;
	
	
	//Método para crear usuario administrativo.
	@Override
	public void crear_adm(Administrativo us_adm) {
		// TODO Auto-generated method stub
		
		//Script SQL.
		String sql = "insert into usuarios(nombre,run,tipo,f_nac,area,exp_prev) values ('"
						+us_adm.getNombre() +"',"
						+us_adm.getRun()+",'"
						+us_adm.getTipo()+"','"
						+us_adm.getFecha_nac()+"','"
						+us_adm.getArea()+"','"
						+us_adm.getExp_previa()+"');";
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

	//Método para listar.
	@Override
	public ArrayList<Administrativo> listar_adm() {
		// TODO Auto-generated method stub
		String sql = "select id, nombre, tipo, run, f_nac, area, exp_prev from usuarios where tipo='Administrativo';";
		ArrayList<Administrativo> lista_adm = new ArrayList<Administrativo>();
		
		try
		{
			cn = Conexion.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			 

			while (rs.next()) {
				lista_adm.add(new Administrativo (rs.getInt("id"),rs.getString("nombre"),rs.getInt("run"),rs.getString("f_nac"),rs.getString("tipo"),
						rs.getString("area"),rs.getString("exp_prev")));
			}
			rs.close();
			stm.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista_adm;
	}

	//Método para editar.
	@Override
	public void editar_adm(Administrativo us_adm, int id) {
		// TODO Auto-generated method stub
		//Script SQL.
				String sql = "update usuarios set nombre = '" +us_adm.getNombre()
							+"', run =" + us_adm.getRun()
							+", f_nac = '" + us_adm.getFecha_nac()
							+"', area = '" + us_adm.getArea()
							+"', exp_prev = '" + us_adm.getExp_previa()
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
