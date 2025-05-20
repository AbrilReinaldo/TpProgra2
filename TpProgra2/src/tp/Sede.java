package tp;

public abstract class Sede {
	protected int capacidadMaxima;
	protected String direccion;
	protected String nombre;
	protected String tipo;
	public Sede(int capacidadMaxima, String direccion, String nombre, String tipo) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.direccion = direccion;
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	

}
