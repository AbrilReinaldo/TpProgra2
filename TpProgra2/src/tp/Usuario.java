package tp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import tp.Entrada;

public class Usuario  {
	String email;
	String nombre; 
	String apellido;
	String contrasenia;
	
	HashMap<String, Entrada> entradas;

	public Usuario(String email, String nombre, String apellido, String contrasenia) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasenia = contrasenia;
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
     */
	//FALTA TERMINAR......................................................................................................................
	public boolean anularEntrada(IEntrada entrada, String contrasenia) {
		if (entrada == null || contrasenia == null) {throw new RuntimeException ("revisar contrasenia o entrada");}
		if(!validacionContrasenia(contrasenia)) { throw new RuntimeException ("Contrasenia invalida");}
		if(!entradas.containsKey(entrada)) {throw new RuntimeException ("La entrada no pertenece al usuario");}
		//cast
		else{  
			entradas.remove(entrada);
			return true;
		}
	}
	public boolean validacionContrasenia(String c) {
		return c.equals(contrasenia);
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email);
	}
	
	
	
	
	
//	public LinkedList<Entrada> verEntrada() {
//		LinkedList<Entrada> MisEntradas= new LinkedList<>();
//		for(Entrada entrada: Entradas.values()) {
//			MisEntradas.add(entrada);
//		}
		
//		return MisEntradas;		
//	}
	
	
}
