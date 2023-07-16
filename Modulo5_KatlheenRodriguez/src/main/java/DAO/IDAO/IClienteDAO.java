package DAO.IDAO;

import java.util.ArrayList;

import modelo.Cliente;


public interface IClienteDAO {
	
	//Método para crear.
	public void crear_cliente(Cliente us_cliente); 
	
	//Método para listar.
	public ArrayList<Cliente> listar_cliente(); 
	
	//Método para editar.
	public void editar_cliente(Cliente us_cliente, int id);

}
