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
	public String toString() {
		return nombre+": con "+numDosis+" a poner entre "
	+tiempoEntreDosis+" días";
	}
}
