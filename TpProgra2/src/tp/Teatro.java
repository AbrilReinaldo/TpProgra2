package tp;

public class Teatro extends Sede{
	protected int asientosPorFila; 
	protected String[] sectores;
	protected int[] capacidad;
	protected int[] porcentajeAdicional;


	public Teatro(String nombre, String direccion,int capacidadMaxima, int asientosPorFila, 
			String[] sectores, int[] capacidad, int[] porcentajeAdicional) {
		super(capacidadMaxima, direccion, nombre, "Teatro");
		this.asientosPorFila = asientosPorFila;
		this.sectores = sectores;
		this.capacidad = capacidad;
		this.porcentajeAdicional = porcentajeAdicional;
	}

	


}


