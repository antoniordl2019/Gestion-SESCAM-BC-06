package Dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Hospital {
	private int idHospital;
	private Stack<Vacuna> vacunasDisponibles;
	private ArrayList<Ciudadano> ciudadanos;
	
	public Hospital (int idHospital, Stack<Vacuna> vacunasDisponibles,
			ArrayList<Ciudadano> ciudadanos){
		this.idHospital = idHospital;
		this.vacunasDisponibles = vacunasDisponibles;
		this.ciudadanos = ciudadanos;
	}
	public int getIdHospital() {
		return idHospital;
	}
	public Stack<Vacuna> getVacunasDisponibles(){
		return vacunasDisponibles;
	}
	public ArrayList<Ciudadano> getCiudadanos(){
		return ciudadanos;
	}
	public String realizarCalendario() {
		int turno = 0;//simulamos que cada día solo se podrá vacunar a 6 personas
		int dia = 1;
		Ciudadano ciudadano;
		Vacuna vacuna;
		if (preveerVacunas(this.ciudadanos) < this.vacunasDisponibles.size()) {
			pedirVacunas(0, 0);//Simula pedir vacunas
		}
		String calendario = "**CALENDARIO VACUNACIÓN POR AVISO DE PANDEMIA**\nDía "+dia+":\n";
		for(int i = 1; i < 5; i++) {
			Iterator<Ciudadano> it = ciudadanos.iterator();
			while(it.hasNext()) {
				ciudadano = it.next();
				if (ciudadano.getNivelVulnerabilidad() == i) {
					vacuna = vacunasDisponibles.pop();
					calendario += "turno "+(turno+1)+":"+ciudadano.getApellidso()+" "
					+ciudadano.getNombre()+" recibe la vacuna "+vacuna.getNombre()+
					" y la siguiente dosis en "+vacuna.getTiempoEntreDosis()+" días.\n";
				}
				turno++;
				if (turno == 6) {
					turno = 0;
					dia++;
					calendario += "\nDía "+dia+":\n";
				}
			}
		}
		return calendario;
	}
	public void pedirVacunas(int numVacunas, int idLaboratorio) {
		//Simula encargar vacunas
	}
	public int preveerVacunas(ArrayList<Ciudadano> ciudadanos) {
		return ciudadanos.size()*2;
	}
}
