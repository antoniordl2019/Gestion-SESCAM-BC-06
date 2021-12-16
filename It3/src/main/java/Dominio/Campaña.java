package Dominio;

public class Campaña {
	
	private double coste;
	private String temporalidad;
	private double efectividad;
	
	public Campaña(double coste, String temporalidad, double efectividad) {
		super();
		this.coste = coste;
		this.temporalidad = temporalidad;
		this.efectividad = efectividad;
	}

	public double getCoste() {
		return coste;
	}

	public String getTemporalidad() {
		return temporalidad;
	}

	public double getEfectividad() {
		return efectividad;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public void setTemporalidad(String temporalidad) {
		this.temporalidad = temporalidad;
	}

	public void setEfectividad(double efectividad) {
		this.efectividad = efectividad;
	}

	@Override
	public String toString() {
		return "Campaña [coste=" + coste + ", temporalidad=" + temporalidad + ", efectividad=" + efectividad + "]";
	}
	
	
	

}
