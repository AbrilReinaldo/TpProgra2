package tp;

import java.util.HashMap;
import java.util.LinkedList;

public class Usuario  {
	String mail, nombre,apellido,contrasenia;
	HashMap <String, Entrada> Entradas = new HashMap<>();
	public Usuario(String mail, String nombre, String apellido, String contrasenia) {
		super();
		this.mail = mail;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasenia = contrasenia;
		this.Entradas= new HashMap<>(); 
	}
	
	public LinkedList<Entrada> verEntrada() {
		LinkedList<Entrada> MisEntradas= new LinkedList<>();
		for(Entrada entrada: Entradas.values()) {
			MisEntradas.add(entrada);
		}
		
		return MisEntradas;		
	}
	
	
	

}
