package tp;

public abstract class Sede {
	protected String nombre;
	protected String direccion; 
	protected int capacidadMaxima;
	
 
	int asientosPorFila; 
	int cantidadPuestos; 
	double precioConsumicion; 
	String[] sectores;
	int[] capacidad;
	int[] porcentajeAdicional;
	
	public Sede(String nombre, String direccion, int capacidadMaxima) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidadMaxima = capacidadMaxima;
	}



}
