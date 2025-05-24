package tp;
import java.util.HashMap;
import java.util.Map;
import tp.Funcion; 


//entonces quedó que un espectáculo tiene una única funcion por fecha 
//y esta puede ser en cualquier sede, incluso repetir sede en distintos días.
public class Espectaculo {
	String nombreEspectaculo;

	HashMap<String, Funcion> funciones;	


	public Espectaculo(String nombreEspectaculo) {
		this.nombreEspectaculo = nombreEspectaculo;
		this.funciones= new HashMap<>();
	}
	
	
	public void agregarFuncion(Funcion f, String fecha) {
		if(!funciones.containsKey(fecha)) {
			funciones.put(fecha, f);
		} else{
		throw new RuntimeException ("Fecha repetida del mismo espectaculo");
	}
}}