package tp;

import java.util.HashMap;
import java.util.List;

public class Ticketek implements ITicketek {
	HashMap <String,Usuario> Usuarios = new HashMap<>();
	HashMap <String,Espectaculo> Espectaculos = new HashMap<>();
	HashMap <String,Sede> Sedes = new HashMap<>();
	
    
	@Override
	public void registrarSede(String nombre, String direccion, int capacidadMaxima) {
		if(Sedes.containsKey(nombre)) {
			throw new RuntimeException("El estadio ya esta registrado");
		}
		Sedes.put(nombre, new Estadio(nombre,direccion,capacidadMaxima));
	}
    /**
     * 1) Registra las sedes con asientos y sin puestos de venta, teatros.
     * Estos reciben la informacion de los sectores como parámetros.
     * 
     * Si el nombre ya está registrado, se debe lanzar una excepcion.
     * Si algun dato no es aceptable, se debe lanzar una excepcion.

     */
	@Override
	public void registrarSede(String nombre, String direccion, int capacidadMaxima, int asientosPorFila, String[] sectores, int[] capacidad, int[] porcentajeAdicional) {
		if(Sedes.containsKey(nombre)) {
			throw new RuntimeException("El teatro ya esta registrado");
		}
		Sedes.put(nombre, new Teatro(nombre,direccion,capacidadMaxima,asientosPorFila,sectores,capacidad,porcentajeAdicional));

	}

	@Override
	public void registrarSede(String nombre, String direccion, int capacidadMaxima, int asientosPorFila,
			int cantidadPuestos, double precioConsumicion, String[] sectores, int[] capacidad,
			int[] porcentajeAdicional) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarUsuario(String email, String nombre, String apellido, String contrasenia) {
		// TODO Auto-generated method stub
		if(Usuarios.containsKey(email)) {
			throw new RuntimeException("El teatro ya esta registrado");
		}
		Usuarios.put(email, new Usuario( email,nombre,apellido,contrasenia));

	}



	@Override
	public void registrarEspectaculo(String nombre) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarFuncion(String nombreEspectaculo, String fecha, String sede, double precioBase) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			int cantidadEntradas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			String sector, int[] asientos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listarFunciones(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarEntradasEspectaculo(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarEntradasFuturas(String email, String contrasenia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarTodasLasEntradasDelUsuario(String email, String contrasenia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean anularEntrada(IEntrada entrada, String contrasenia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IEntrada cambiarEntrada(IEntrada entrada, String contrasenia, String fecha, String sector, int asiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntrada cambiarEntrada(IEntrada entrada, String contrasenia, String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double costoEntrada(String nombreEspectaculo, String fecha) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double costoEntrada(String nombreEspectaculo, String fecha, String sector) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalRecaudado(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalRecaudadoPorSede(String nombreEspectaculo, String nombreSede) {
		// TODO Auto-generated method stub
		return 0;
	}

}
