package Dominio;

import java.util.ArrayList;

public class Laboratorio {
	private ArrayList<Vacuna> vacunas;
	private int idLaboratorio;
	
	Laboratorio(ArrayList<Vacuna> vacunas, int idLaboratorio){
		this.vacunas = vacunas;
		this.idLaboratorio = idLaboratorio;
	}
	public ArrayList<Vacuna> getVacunas(){
		return vacunas;
	}
	public int getIdLaboratorio() {
		return idLaboratorio;
	}
	
	public String toString() {
		return "El laboratorio "+idLaboratorio+" tiene "
				+vacunas.size()+" vacunas";
	}
}
