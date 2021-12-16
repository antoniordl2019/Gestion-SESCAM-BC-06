package Dominio;

public class Estadisticas {
	int nEnfermedades;
	int nPersonas;
	String estado;
	int nEnfCatalogadas;
	int nCampañas;
	
	public Estadisticas(int nEnfermedades, int nPersonas, String estado, int nEnfCatalogadas, int nCampañas) {
		this.nEnfermedades = nEnfermedades;
		this.nPersonas = nPersonas;
		this.estado = estado;
		this.nEnfCatalogadas = nEnfCatalogadas;
		this.nCampañas = nCampañas;
	}
	public int getNEnfermedades() {
		return this.nEnfermedades;
	}
	public void setNEnfermedades(int nEnfermedades) {
		this.nEnfermedades = nEnfermedades;
	}
	public int getNPersonas () {
		return this.nPersonas;
	}
	public void setNPersonas(int nPersonas) {
		this.nPersonas = nPersonas;
	}
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getNEnfCatalogadas() {
		return this.nEnfCatalogadas;
	}
	public void setNEnfCatalogadas(int nEnfCatalogadas) {
		this.nEnfCatalogadas = nEnfCatalogadas;
	}
	public int getNCampañas() {
		return this.nCampañas;
	}
	public void setNCampañas(int nCampañas) {
		this.nCampañas = nCampañas;
	}
	public String informarEvolucion() {
		return "En este momento hay "+nPersonas+" "+estado;
	}
	public String realizarEstadisticas(Director director) {
		return director.getApellidos()+" "+director.getNombre()+": En el estado de "+estado+
				" hay "+nPersonas+" con "+nEnfCatalogadas+" distintas enfermedades registradas.";
	}
	public void indicarRelaciones() {
		throw new UnsupportedOperationException();
	}
	public void realizarPrevisionContagios() {
		throw new UnsupportedOperationException();
	}
	
}

