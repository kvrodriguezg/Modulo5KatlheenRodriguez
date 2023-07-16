package DAO.IDAO;

import java.util.ArrayList;

import modelo.Profesional;

public interface IProfDAO {

	//Método para crear.
	public void crear_prof(Profesional us_prof);
	
	//Método para listar.
	public ArrayList<Profesional> listar_prof();
	
	//Método para editar.
	public void editar_prof(Profesional us_prof, int id);
}
