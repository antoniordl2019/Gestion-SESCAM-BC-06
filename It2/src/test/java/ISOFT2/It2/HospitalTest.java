package ISOFT2.It2;



import Dominio.Ciudadano;
import Dominio.Hospital;
import Dominio.Vacuna;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class HospitalTest {
	
	ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();
	Hospital hospital;
	Stack<Vacuna> vacunas = new Stack<Vacuna>();
	
	

	@Test
	public void testRealizarCalendario() {
		
		ciudadanos.add(new Ciudadano("Maria","García Parra","111222333", "00000000A","25/6/1994", 2, null, null, null, "Sano",1));
		ciudadanos.add(new Ciudadano("Juan","Martín Pérez","444555666", "11111111B","16/4/1974", 1, null, null, null, "Sano en cuarentena",1));
		ciudadanos.add(new Ciudadano("Pedro", "Fernández Soria", "777888999", "22222222C", "6/8/1954", 4, null, null, null, "Enfermo en cuarentena",1));
		
		Vacuna vacuna1 = new Vacuna(3, 6, "Pfizer", null, 60);
		Vacuna vacuna2 = new Vacuna(2, 6, "Moderna", null, 60);
		Vacuna vacuna3 = new Vacuna(4, 6, "AstraZeneca", null, 45);
		
		vacunas.add(vacuna3);
		vacunas.add(vacuna2);
		vacunas.add(vacuna1);
		
		
		hospital=new Hospital(1,vacunas,ciudadanos);
		
		String resultado =hospital.realizarCalendario();
		
		String resultadoEsperado="**CALENDARIO VACUNACIÓN POR AVISO DE PANDEMIA**\nDía 1:\nturno 1:Martín Pérez Juan"
				+ " recibe la vacuna Pfizer y la siguiente dosis en 60 días.\nturno 2:García Parra Maria recibe la vacuna "
				+ "Moderna y la siguiente dosis en 60 días.\nturno 3:Fernández Soria Pedro recibe la vacuna AstraZeneca y "
				+ "la siguiente dosis en 45 días.\n";
		
		Assert.assertEquals(resultadoEsperado,resultado);
	}

}
