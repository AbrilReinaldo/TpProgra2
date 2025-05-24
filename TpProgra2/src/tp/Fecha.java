package tp;

import java.time.LocalDate;
import java.util.Objects;

//Como hago para comparar las fehcas que son String, alguien lo sabe?
//Con LocalDate.parse para pasarlas a localdate y poder compararlas.
//les recomiendo encapsular esa logica en una clase Fecha.
public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		LocalDate f=LocalDate.now();
		dia= f.getDayOfMonth();
		mes= f.getMonthValue();
		anio= f.getYear();
		
	}
	public Fecha(int dia, int mes, int anio){
		this.dia= dia;
		this.mes= mes;
		this.anio= anio;

	
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return anio == other.anio && dia == other.dia && mes == other.mes;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	

}
