import org.junit.Assert;
import Dominio.Estadisticas;
import Dominio.Director; 
import org.junit.Test;

public class EstadisticasTest {

	@Test
	public void test() {
		Estadisticas estadisticas = new Estadisticas(3, 20, "Enfermo en cuarentena", 5, 0);
		Director director = new Director("Florentino", "Patatas Pacheco", "Epidemiólogo");
		
		String get1 = estadisticas.getEstado();
		int get2 = estadisticas.getNCampañas();
		int get3 = estadisticas.getNEnfCatalogadas();
		int get4 = estadisticas.getNPersonas();
		int get5 = estadisticas.getNEnfermedades();
		
		estadisticas.setEstado(get1);
		estadisticas.setNCampañas(get2);
		estadisticas.setNEnfCatalogadas(get3);
		estadisticas.setNPersonas(get4);
		estadisticas.setNEnfermedades(get5);
		
		String return1 = estadisticas.informarEvolucion();
		String return2 = estadisticas.realizarEstadisticas(director);
		
		String get1_result = "Enfermo en cuarentena";
		int get2_result = 0;
		int get3_result = 5;
		int get4_result = 20;
		int get5_result = 3;
		String return1_result = "En este momento hay 20 Enfermo en cuarentena";
		String return2_result = director.getApellidos()+" "+director.getNombre()+": En el estado de"
				+ " Enfermo en cuarentena hay 20 con 5 distintas enfermedades registradas.";
		
		Assert.assertEquals(get1_result,get1);
		Assert.assertEquals(get2_result,get2);
		Assert.assertEquals(get3_result,get3);
		Assert.assertEquals(get4_result,get4);
		Assert.assertEquals(get5_result,get5);
		Assert.assertEquals(return1_result,return1);
		Assert.assertEquals(return2_result,return2);

	}

}
