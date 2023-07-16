package DAO.IDAO;

import java.util.ArrayList;

import modelo.Capacitacion;

public interface ICapDAO {
	
	public void crear_cap(Capacitacion capa);
	
	public ArrayList<Capacitacion> listar_cap();

}
