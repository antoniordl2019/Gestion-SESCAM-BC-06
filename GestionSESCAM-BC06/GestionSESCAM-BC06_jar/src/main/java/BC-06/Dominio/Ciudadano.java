package Dominio;

import java.util.*;

public class Ciudadano {

    private String nombre;
    private String apellidos;
    private String fechaDeNacimiento;
    private String DNI;
    private int nivelDeVulnerabilidad;
    private ArrayList<String>enfermedadesDeRiesgo=new ArrayList<String>();
    private String estado;
    private String telefono;
    private ArrayList<Ciudadano>contactos=new ArrayList<Ciudadano>();
   // private ArrayList<Vacuna>dosisPorVacunaAdministrada=new ArrayList<Vacuna>(); No es necesario  implementarlo en esta iteración.
   
   
    public Ciudadano(String nombre, String apellidos, String fechaDeNacimiento, String dNI, int nivelDeVulnerabilidad,
            ArrayList<String> enfermedadesDeRiesgo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        DNI = dNI;
        this.nivelDeVulnerabilidad = nivelDeVulnerabilidad;
        this.setEnfermedadesDeRiesgo(enfermedadesDeRiesgo);
    }

    public ArrayList<Ciudadano> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Ciudadano> contactos) {
        this.contactos = contactos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<String> getEnfermedadesDeRiesgo() {
        return enfermedadesDeRiesgo;
    }

    public void setEnfermedadesDeRiesgo(ArrayList<String> enfermedadesDeRiesgo) {
        this.enfermedadesDeRiesgo = enfermedadesDeRiesgo;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNivelDeVulnerabilidad() {
        return nivelDeVulnerabilidad;
    }
    public void setNivelDeVulnerabilidad(int nivelDeVulnerabilidad) {
        this.nivelDeVulnerabilidad = nivelDeVulnerabilidad;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        this.DNI = dNI;
    }
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudadano [DNI=" + DNI + ", apellidos=" + apellidos + ", contactos=" + contactos
                + ", enfermedadesDeRiesgo=" + enfermedadesDeRiesgo + ", estado=" + estado + ", fechaDeNacimiento="
                + fechaDeNacimiento + ", nivelDeVulnerabilidad=" + nivelDeVulnerabilidad + ", nombre=" + nombre
                + ", telefono=" + telefono + "]";
    }

   
    
}
