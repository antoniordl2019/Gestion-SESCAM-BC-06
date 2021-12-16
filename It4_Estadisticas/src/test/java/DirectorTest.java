import org.junit.Assert;
import Dominio.Director;
import org.junit.Test;

public class DirectorTest {

	@Test
	public void test() {
		Director director = new Director("Florentino", "Patatas Pacheco", "Epidemiólogo");

		String get1 = director.getApellidos();
		String get2 = director.getEspecialidad();
		String get3 = director.getNombre();
		
		director.setApellidos(get1);
		director.setEspecialidad(get2);
		director.setNombre(get3);
		
		String get1_result = "Patatas Pacheco";
		String get2_result = "Epidemiólogo";
		String get3_result = "Florentino";
		
		Assert.assertEquals(get1_result,get1);
		Assert.assertEquals(get2_result,get2);
		Assert.assertEquals(get3_result,get3);
	}

}
