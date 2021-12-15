package Persistencia;

import java.sql.Connection;

/**
 * Clase: Se encarga de acceder a la base de datos
 * Metodos:
 * 		-Constructor
 * 		-getAgente()
 * 		-SQL -> select, insert, update, delete
 * 
 * @author Javier Villar Asensio
 */

public class Agente {

	Agente(){}
	public Agente getAgente() {
		throw new UnsupportedOperationException();
	}
	public void select(String id) {}
	public void update(String id, String up) {}
	public void delete(String id) {}
	public void insert(Object ob) {}
	
}
