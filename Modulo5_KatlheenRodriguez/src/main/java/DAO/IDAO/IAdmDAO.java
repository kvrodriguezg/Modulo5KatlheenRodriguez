package DAO.IDAO;

import java.util.ArrayList;

import modelo.Administrativo;


public interface IAdmDAO {

	//Método para crear.
	public void crear_adm(Administrativo us_adm);
	
	//Método para listar.
	public ArrayList<Administrativo> listar_adm();
	
	//Método para editar.
	public void editar_adm(Administrativo us_adm, int id);
}
