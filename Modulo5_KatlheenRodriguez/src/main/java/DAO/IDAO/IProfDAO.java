package DAO.IDAO;

import java.util.ArrayList;

import modelo.Profesional;

public interface IProfDAO {

	public void crear_prof(Profesional us_prof);
	
	public ArrayList<Profesional> listar_prof();
	
	public void editar_prof(Profesional us_prof, int id);
}
