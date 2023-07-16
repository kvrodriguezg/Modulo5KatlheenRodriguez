package DAO.IDAO;

import java.util.ArrayList;

import modelo.Capacitacion;

public interface ICapDAO {
	
	//Método para crear.
	public void crear_cap(Capacitacion capa);
	
	//Método para listar.
	public ArrayList<Capacitacion> listar_cap();

}
