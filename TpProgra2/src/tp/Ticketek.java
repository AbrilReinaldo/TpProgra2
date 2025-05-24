package tp;

import java.util.HashMap;
import java.util.List;

import tp.Funcion;
import tp.Entrada;
import tp.Espectaculo;
import tp.Estadio;
import tp.Miniestadio;
import tp.Sede;
import tp.Teatro;
import tp.Usuario;


//Cada clase es responsable de asegurar la integridad de sus datos.
//Teniendo eso en cuenta, las validaciones las debería hacer la clase
//y si pasan datos inválidos en el constructor no se debe crear una instancia de esa clase (lanza excepción)



public class Ticketek implements ITicketek {

	HashMap <String,Usuario> Usuarios = new HashMap<>();
	HashMap <String,Sede> Sedes = new HashMap<>();
	HashMap<String, Espectaculo> Espectaculos = new HashMap<>();
	HashMap<String, Entrada> Entradas = new HashMap<>();
    
	@Override
    public void registrarSede(String nombre, String direccion, int capacidadMaxima) {
		if(Sedes.containsKey(nombre)) {throw new RuntimeException("Estadio ya registrado");}
		Sedes.put(nombre,new Estadio(nombre,direccion,capacidadMaxima));
    }
    

	@Override
	public void registrarSede(String nombre, String direccion, int capacidadMaxima, int asientosPorFila,
			String[] sectores, int[] capacidad, int[] porcentajeAdicional) {
		if(Sedes.containsKey(nombre)) {throw new RuntimeException("Teatro ya registrado");}
		Sedes.put(nombre,new Teatro(nombre,direccion,capacidadMaxima,asientosPorFila,sectores,capacidad,porcentajeAdicional));
		
	}

	@Override
	public void registrarSede(String nombre, String direccion, int capacidadMaxima, int asientosPorFila,
			int cantidadPuestos, double precioConsumicion, String[] sectores, int[] capacidad,
			int[] porcentajeAdicional) {
		if(Sedes.containsKey(nombre)) {throw new RuntimeException("Miniestadio ya registrado");}
		Sedes.put(nombre,new Miniestadio(nombre,direccion, capacidadMaxima, asientosPorFila,
				 cantidadPuestos,  precioConsumicion, sectores,capacidad,porcentajeAdicional));
		
	}


	@Override
	public void registrarUsuario(String email, String nombre, String apellido, String contrasenia) {
		if(Usuarios.containsKey(email)) {throw new RuntimeException("El email ya ha sido usado");}
		Usuarios.put(email,new Usuario(email,nombre,apellido,contrasenia));
    
	}

	@Override
	public void registrarEspectaculo(String nombre) {
    if (Espectaculos.containsKey(nombre)) {
        throw new RuntimeException("El espectáculo ya está registrado");
    }
    Espectaculos.put(nombre, new Espectaculo(nombre)); 
}
	
	@Override
	public void agregarFuncion(String nombreEspectaculo, String fecha, String sede, double precioBase) {
		if(!Espectaculos.containsKey(nombreEspectaculo) && !Sedes.containsKey(sede)) {
			throw new RuntimeException("El espectaculo o la sede no estan registrados"); //////////////////////////////////////////////REVISAR		
		}
		Espectaculos.get(nombreEspectaculo).agregarFuncion(new Funcion(nombreEspectaculo,fecha,sede,precioBase), fecha);
		}
		
    /**
     * 4) Vende una o varias entradas a un usuario para funciones
     * en sedes no numeradas
     * 
     * Devuelve una lista con las entradas vendidas (Ver interfaz IEntrada).
     *  
     * Se debe lanzar una excepcion si:
     *  - Si la sede de la funcion está numerada
     *  - si el usuario no está registrado
     *  - si el espectaculo no está registrado
     *  - si la contraseña no es valida
     *  - etc...
     * 
     * @return
     */
	//vender entrada estadio
	@Override
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			//int cantidadEntradas) {
		//HashMap<String, Entrada> entradasUsuario = new HashMap<>();
		
		//exception
		//return entradasUsuario;

	}
//CODIGO DE NICO................................................................................................................
	@Override
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			String sector, int[] asientos) {
		// TODO Auto-generated method stub
		if(!Espectaculos.containsKey(nombreEspectaculo)) {throw new RuntimeException("El espectaculo no ha sido registrado");}
		if(!Usuarios.containsKey(email)) {throw new RuntimeException("El usuario no ha sido registrado");}
		Usuario u = Usuarios.get(email);
		if (!u.validacionContrasenia(contrasenia)) throw new RuntimeException("Contra invalida");
		
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
    
    /**
     * 8) Cancela una entrada comprada por el usuario. Se debe resolver en O(1)
     * 
     * Al cancelarla, el lugar asignado deberá volver a estar disponible.
     * 
     * Se deben validar los datos y lanzar una excepcion en caso de que 
     * algo sea invalido.
     * 
     * Si los datos son validos pero la fecha de la entrada ya pasó,
     * se debe devolver falso
     * 
     * Ver interfaz IEntrada.
     * 
     * 
     * @param Entrada
     * @param contrasenia
     * @return
     *  
     */
	@Override
	public boolean anularEntrada(IEntrada entrada, String contrasenia) {
	
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
