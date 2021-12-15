package Presentacion;
import Dominio.Ciudadano;
import Dominio.Hospital;
import Dominio.Vacuna;
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
	
	public static void main (String[] args) {
		
		//Inicializamos varias instancias de objetos para simular la base de datos
		
		 ArrayList<String> enfermedades = new ArrayList<String>();
		enfermedades.add("diabetes");
		ArrayList<Ciudadano> LISTA = new ArrayList<Ciudadano>();
		Ciudadano MARIA = new Ciudadano("Maria","García Parra","111222333", "00000000A","25/6/1994", 1, null, null, null, "Sano",1);
		Ciudadano JUAN = new Ciudadano("Juan","Martín Pérez","444555666", "11111111B","16/4/1974", 2, enfermedades, null, null, "Sano en cuarentena",1);
		enfermedades.add("cardiopatía");
		Ciudadano PEDRO = new Ciudadano("Pedro", "Fernández Soria", "777888999", "22222222C", "6/8/1954", 4, enfermedades, null, null, "Enfermo en cuarentena",1);
		
		Vacuna vacuna1 = new Vacuna(3, 6, "Pfizer", null, 60);
		Vacuna vacuna2 = new Vacuna(2, 6, "Moderna", null, 60);
		Vacuna vacuna3 = new Vacuna(4, 6, "AstraZeneca", null, 45);
		Stack<Vacuna> pila = new Stack<Vacuna>();
		pila.add(vacuna3);
		pila.add(vacuna2);
		pila.add(vacuna1);

		
		inicializarLista(LISTA, MARIA, JUAN, PEDRO);
		Hospital hospital = new Hospital(27, pila, LISTA);
		
	}
	public static void imprimirPacientes(List<Ciudadano> pacientes) {
		Iterator<Ciudadano> it = pacientes.iterator();
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
	public static void inicializarLista(ArrayList<Ciudadano> LISTA, Ciudadano MARIA, Ciudadano JUAN, Ciudadano PEDRO) {
		LISTA.add(MARIA);
		LISTA.add(JUAN);
		PEDRO.setContactos(LISTA);
		LISTA.clear();
		LISTA.add(JUAN);
		LISTA.add(PEDRO);
		MARIA.setContactos(LISTA);
		LISTA.clear();
		LISTA.add(MARIA);
		LISTA.add(PEDRO);
		JUAN.setContactos(LISTA);
		LISTA.clear();
		
		LISTA.add(MARIA);
		LISTA.add(JUAN);
		LISTA.add(PEDRO);
	}
	public void ActualizarEstadoPaciente(List<Ciudadano> pacientes) {
		System.out.println("Introduzca qué paciente desea actualizar");
		imprimirPacientes(pacientes);
		int eleccion = eleccion();
		while (eleccion < 1 || eleccion > pacientes.size()) {
			System.out.println("Por favor introduzca una opción válida");
			eleccion = eleccion();
		}
		Ciudadano pacienteElegido = pacientes.get(eleccion+1);
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
			Iterator<Ciudadano> it = pacienteElegido.getContactos().iterator();
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
	
}