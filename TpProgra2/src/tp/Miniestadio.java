package tp;

public class Miniestadio extends Sede {
	protected int asientosPorFila;
	protected int cantidadPuestos;
	protected double precioConsumicion; 
	protected String[] sectores; 
	protected int[] capacidad;
	protected int[] porcentajeAdicional;

	
	
	
	
	public Miniestadio(String nombre,String direccion,int capacidadMaxima, int asientosPorFila, int cantidadPuestos, double precioConsumicion,
                       String[] sectores, int[] capacidad,int[] porcentajeAdicional) {
		super(direccion, nombre,capacidadMaxima);
		this.asientosPorFila = asientosPorFila;
		this.cantidadPuestos = cantidadPuestos;
		this.precioConsumicion = precioConsumicion;
		this.sectores = sectores;
		this.capacidad = capacidad;
		this.porcentajeAdicional = porcentajeAdicional;
	}







}



