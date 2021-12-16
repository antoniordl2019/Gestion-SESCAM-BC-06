package Dominio;

public class Vacuna {
	
	private int idVacuna;
	private int numDosis;
	private String nombre;
	private String fechaUltDosis;
	private int tiempoEntreDosis;
	
	public Vacuna(int idVacuna, int numDosis, String nombre,
			String fechaUltDosis, int tiempoEntreDosis){
		
		this.idVacuna = idVacuna;
		this.numDosis = numDosis;
		this.nombre = nombre;
		this.fechaUltDosis = fechaUltDosis;
		this.tiempoEntreDosis = tiempoEntreDosis;
	}
	
	
	public int getIdVacuna() {
		return idVacuna;
	}



	public int getNumDosis() {
		return numDosis;
	}


	public String getNombre() {
		return nombre;
	}


	public String getFechaUltDosis() {
		return fechaUltDosis;
	}



	public int getTiempoEntreDosis() {
		return tiempoEntreDosis;
	}



	public void setIdVacuna(int idVacuna) {
		this.idVacuna = idVacuna;
	}


	public void setNumDosis(int numDosis) {
		this.numDosis = numDosis;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setFechaUltDosis(String fechaUltDosis) {
		this.fechaUltDosis = fechaUltDosis;
	}


	public void setTiempoEntreDosis(int tiempoEntreDosis) {
		this.tiempoEntreDosis = tiempoEntreDosis;
	}


	@Override
	public String toString() {
		return "Vacuna [idVacuna=" + idVacuna + ", numDosis=" + numDosis + ", nombre=" + nombre + ", fechaUltDosis="
				+ fechaUltDosis + ", tiempoEntreDosis=" + tiempoEntreDosis + "]";
	}


	
	
}
