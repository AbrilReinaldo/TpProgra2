package tp;

import tp.Funcion;

public class Entrada implements IEntrada  {
	String nombreEspectaculo;
	String fecha;
	//Usuario usuario;
	int cantidadEntradas;
	String codigo;
	String sector;
    int fila;
    int asiento;
    Funcion funcion;
    
    
    
 public Entrada(String nombreEspectaculo, String fecha, int cantidadEntradas, String codigo, String sector,
			int fila, int asiento, Funcion funcion) {
		super();
		this.nombreEspectaculo = nombreEspectaculo;
		this.fecha = fecha;
		this.cantidadEntradas = cantidadEntradas;
		this.codigo = codigo;
		this.sector = sector;
		this.fila = fila;
		this.asiento = asiento;
		this.funcion = funcion;
	}


 
@Override
public double precio() {

	
	
	return 0;
}
/**
 * Si la entrada es para estadio, la ubicacion será "CAMPO". 
 * sino, será "{SECTOR} f:{NRO FILA} a:{NRO ASIENTO}" 
 * 
 * Por ejemplo:
 *  - CAMPO
 *  - Platea Común f:3 a:31
 * @return
 
Platea VIP: Incrementa 70% sobre el precio base.
● Platea común: Incrementa el 40% sobre el precio base.
● Platea baja (1er piso): Incrementa el 50% sobre el precio base.
● Platea alta (2do piso): No realiza incremento sobre el precio base.

*/
@Override
public String ubicacion() {
	// TODO Auto-generated method stub
	return null;
}



public void liberarLugar() {
	// TODO Auto-generated method stub
	
}

}
