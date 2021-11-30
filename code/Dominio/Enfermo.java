package Dominio;
import java.util.*;

public class Enfermo {
	private String nombre;
	private String DNI;
	private int edad;
	private String estado;
	private boolean vulnerable;
	private List<Enfermo> contactos;
	
	public Enfermo (String nombre, String DNI, int edad, String estado, boolean vulnerable, List<Enfermo> contactos){
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
		this.estado = estado;
		this.vulnerable = vulnerable;
		this.contactos = contactos;
	}
	public boolean isVulnerable() {
		return vulnerable;
	}
	public List<Enfermo> getContactos(){
		return contactos;
	}
	public void setContactos(List<Enfermo> contactos) {
		this.contactos = contactos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
	}
	public String toString() {
	return nombre+" con DNI: "+DNI+" y de "+edad+" años. Su estado es: "+estado;
	}
}
