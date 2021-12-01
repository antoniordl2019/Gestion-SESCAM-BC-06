package Dominio;

import java.util.ArrayList;

public class Ciudadano {
	private String nombre;
	private String apellidos;
	private String telefono;
	private String DNI;
	private String fechaNacimiento;
	private int nivelVulnerabilidad;//1-4
	private ArrayList<String> enfermedadesDeRiesgo;
	private ArrayList<Vacuna> dosis;
	private ArrayList<Ciudadano> contactos;
	private String estado;
	
	public Ciudadano (String nombre, String apellidos, String telefono, 
			String DNI, String fechaNacimiento, int nivelVulnerabilidad,
			ArrayList<String> enfermedadesDeRiesgo, ArrayList<Vacuna> dosis, 
			ArrayList<Ciudadano> contactos, String estado){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.DNI = DNI;
		this.fechaNacimiento = fechaNacimiento;
		this.nivelVulnerabilidad = nivelVulnerabilidad;
		this.enfermedadesDeRiesgo = enfermedadesDeRiesgo;
		this.dosis = dosis;
		this.contactos = contactos;
		this.estado = estado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidso() {
		return apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getDNI() {
		return DNI;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getNivelVulnerabilidad() {
		return nivelVulnerabilidad;
	}
	public ArrayList<String> getEnfermedadesDeRiesgo(){
		return enfermedadesDeRiesgo;
	}
	public ArrayList<Vacuna> getDosis(){
		return dosis;
	}
	public ArrayList<Ciudadano> getContactos(){
		return contactos;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setContactos(ArrayList<Ciudadano> contactos) {
		this.contactos = contactos;
	}
	public String toString() {
		return "Paciente: "+nombre+" "+apellidos+", con DNI:"
				+DNI+", y un nivel de vulnerabilidad"+nivelVulnerabilidad;
	}
}
