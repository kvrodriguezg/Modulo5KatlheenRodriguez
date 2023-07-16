package DAO.IDAO;

import java.util.ArrayList;

import modelo.Cliente;


public interface IClienteDAO {
	
	public void crear_cliente(Cliente us_cliente); 
	
	public ArrayList<Cliente> listar_cliente(); 
	
	public void editar_cliente(Cliente us_cliente, int id);

}
