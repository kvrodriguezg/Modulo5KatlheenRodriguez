package DAO.IDAO;

import java.util.ArrayList;

import modelo.Administrativo;


public interface IAdmDAO {

	public void crear_adm(Administrativo us_adm);
	
	public ArrayList<Administrativo> listar_adm();
	
	public void editar_adm(Administrativo us_adm, int id);
}
