package Dominio;

import java.util.ArrayList;

public class Laboratorio {
	
	private ArrayList<Vacuna> vacunas;
	private int idLaboratorio;
	
	Laboratorio(ArrayList<Vacuna> vacunas, int idLaboratorio){
		this.vacunas = vacunas;
		this.idLaboratorio = idLaboratorio;
	}

	public ArrayList<Vacuna> getVacunas() {
		return vacunas;
	}

	public int getIdLaboratorio() {
		return idLaboratorio;
	}

	public void setVacunas(ArrayList<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}

	@Override
	public String toString() {
		return "Laboratorio [vacunas=" + vacunas + ", idLaboratorio=" + idLaboratorio + "]";
	}
	

}
