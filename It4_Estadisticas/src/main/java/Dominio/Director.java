package Dominio;

public class Director {
	String nombre;
	String apellidos;
	String especialidad;
	
	public Director(String nombre, String apellidos, String especialidad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
