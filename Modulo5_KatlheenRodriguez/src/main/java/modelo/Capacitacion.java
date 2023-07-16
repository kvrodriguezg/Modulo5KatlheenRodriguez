package modelo;

public class Capacitacion {
	
	private int id_cap;
	private String nombre;
	private String detalle;
	
	//Constructor con parámetros.
	

	//Constructor sin parámetros.
	public Capacitacion() {
		
	}


	public Capacitacion(int id_cap, String nombre, String detalle) {
		super();
		this.id_cap = id_cap;
		this.nombre = nombre;
		this.detalle = detalle;
	}


	//Métodos Get y Set.
	public int getId_cap() {
		return id_cap;
	}

	public void setId_cap(int id_cap) {
		this.id_cap = id_cap;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	@Override
	public String toString() {
		return "Capacitacion [id_cap=" + id_cap + ", nombre=" + nombre + ", detalle=" + detalle + "]";
	}

	
}

	




