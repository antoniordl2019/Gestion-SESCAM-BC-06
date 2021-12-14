package Dominio;

import java.util.*;

public class Enfermedad {
	
	private int id;
	private String nombre;
	private ArrayList<String> sintomas=new ArrayList<String>();
	private String temporalidad;
	private ArrayList<String> medicinas=new ArrayList<String>();
	private boolean confinamiento;
	private ArrayList<Vacuna> vacunas=new ArrayList<Vacuna>();
	private ArrayList<Campaña> campañas=new ArrayList<Campaña>();
	
	public Enfermedad(int id, String nombre, ArrayList<String> sintomas, String temporalidad,
			ArrayList<String> medicinas, boolean confinamiento, ArrayList<Vacuna> vacunas,
			ArrayList<Campaña> campañas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sintomas = sintomas;
		this.temporalidad = temporalidad;
		this.medicinas = medicinas;
		this.confinamiento = confinamiento;
		this.vacunas = vacunas;
		this.campañas = campañas;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getSintomas() {
		return sintomas;
	}

	public String getTemporalidad() {
		return temporalidad;
	}

	public ArrayList<String> getMedicinas() {
		return medicinas;
	}

	public boolean isConfinamiento() {
		return confinamiento;
	}

	public ArrayList<Vacuna> getVacunas() {
		return vacunas;
	}

	public ArrayList<Campaña> getCampañas() {
		return campañas;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSintomas(ArrayList<String> sintomas) {
		this.sintomas = sintomas;
	}

	public void setTemporalidad(String temporalidad) {
		this.temporalidad = temporalidad;
	}

	public void setMedicinas(ArrayList<String> medicinas) {
		this.medicinas = medicinas;
	}

	public void setConfinamiento(boolean confinamiento) {
		this.confinamiento = confinamiento;
	}

	public void setVacunas(ArrayList<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	public void setCampañas(ArrayList<Campaña> campañas) {
		this.campañas = campañas;
	}

	@Override
	public String toString() {
		return "Enfermedad [id=" + id + ", nombre=" + nombre + ", sintomas=" + sintomas + ", temporalidad="
				+ temporalidad + ", medicinas=" + medicinas + ", confinamiento=" + confinamiento + ", vacunas="
				+ vacunas + ", campañas=" + campañas + "]";
	}
	
	

}
