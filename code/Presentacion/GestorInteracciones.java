package Presentacion;
import Dominio.Enfermo;
import java.util.*;
/**
 * Clase: Gestiona la interaccion del usuario con la app
 * Metodos: 
 * 		-iniciarSesion()
 * 		-CDU1()
 * @author javier
 *
 */

public class GestorInteracciones {
	static Scanner ENTRADA = new Scanner(System.in);
	static List<Enfermo> LISTA = new ArrayList<Enfermo>();
	static Enfermo MARIA = new Enfermo("Maria", "00000000A", 28, "Sano", false, null);
	static Enfermo JUAN = new Enfermo("Juan", "11111111B", 54, "Enfermo", true, null);
	static Enfermo ABIGAIL = new Enfermo("Abigail", "22222222C", 19, "Sano en cuarentena", false, null);
	
	public static void main (String[] args) {
		List<Enfermo> pacientes = new ArrayList<Enfermo>();
		inicializarLista(pacientes);
		
	}
	public static void imprimirPacientes(List<Enfermo> pacientes) {
		Iterator<Enfermo> it = pacientes.iterator();
		int nEnfermos = 1;
		while(it.hasNext()) {
			System.out.println(nEnfermos+": "+it.next().getNombre());
			nEnfermos++;
		}
	}
	public static void imprimirEstados() {
		System.out.println("1: Sano");
		System.out.println("2: Enfermos");
		System.out.println("3: Sano en cuarentena");
		System.out.println("4: Enfermo en cuarentena");
	}
	public static void inicializarLista(List<Enfermo> pacientes) {
		LISTA.add(MARIA);
		LISTA.add(JUAN);
		ABIGAIL.setContactos(LISTA);
		LISTA.clear();
		LISTA.add(JUAN);
		LISTA.add(ABIGAIL);
		MARIA.setContactos(LISTA);
		LISTA.clear();
		LISTA.add(MARIA);
		LISTA.add(ABIGAIL);
		JUAN.setContactos(LISTA);
		LISTA.clear();
		
		pacientes.add(MARIA);
		pacientes.add(JUAN);
		pacientes.add(ABIGAIL);
	}

	public void iniciarSesion() {}
	public void ActualizarEstadoPaciente(List<Enfermo> pacientes) {
		System.out.println("Introduzca qué paciente desea actualizar");
		imprimirPacientes(pacientes);
		int eleccion = eleccion();
		while (eleccion < 1 || eleccion > pacientes.size()) {
			System.out.println("Por favor introduzca una opción válida");
			eleccion = eleccion();
		}
		Enfermo pacienteElegido = pacientes.get(eleccion+1);
		System.out.println("Introduzca qué estado desea actualizar");
		imprimirEstados();
		eleccion = eleccion();
		while (eleccion < 1 || eleccion > 4) {
			System.out.println("Por favor introduzca una opción válida");
			eleccion = eleccion();
		}
		if(eleccion == 1) {
			pacienteElegido.setEstado("Sano");
		}
		else if(eleccion == 2) {
			pacienteElegido.setEstado("Enfermo");
		}
		else if(eleccion == 3) {
			pacienteElegido.setEstado("Sano en cuarentena");
		}
		else {
			pacienteElegido.setEstado("Enfermo en cuarentena");
		}
		if (eleccion == 2 || eleccion == 4) {
			System.out.println("Al estar enfermo se muestra los contactos de esta persona");
			Iterator<Enfermo> it = pacienteElegido.getContactos().iterator();
			while(it.hasNext())
				System.out.println(it.next().getNombre());
		}
	}
	public int eleccion() {
		int eleccion;
		try {
			eleccion = ENTRADA.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Introduzca un número válido");
			eleccion = eleccion();
		}
		return eleccion;
	}
	public void calendarioVacunacion(List<Enfermo> pacientes, int aprovisionamiento) {
		System.out.println("**VACUNACION POR TURNOS POR AVISO DE EPIDEMIA**");
		int turno = 1;
		for(Enfermo enfermo: pacientes) {
			if(enfermo.isVulnerable()) {
				if(aprovisionamiento==0) {
					turno = esperarAprovisionamiento(turno);
				}
				System.out.println(enfermo.getNombre()+" tiene prioridad para vacunarse "
						+ "en el turno: "+turno+" y recibirá la siguiente dosis 60 días después");
				turno++;
			}
		}
		for (Enfermo enfermo: pacientes) {
			if (!enfermo.isVulnerable()) {
				if(aprovisionamiento==0) {
					turno = esperarAprovisionamiento(turno);
				}
				System.out.println(enfermo.getNombre()+" tiene que vacunarse en el turno"+turno
						+" y recibirá la siguiente dosis 60 días después");
			}
		}
	}
	public static int esperarAprovisionamiento(int turno) {
		//Simula la espera en turnos hasta aprovisionamiento
		turno += 5;
		return turno;
	}
}
