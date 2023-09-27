package ar.edu.interfaz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ar.edu.dominio.Universidad;
import ar.edu.dominio.Materia;

class TestAsignarYEliminarCorrelativa {

	@Test
	void AsignarMateriaCorrelativa() {
		Universidad unlam = new Universidad();

		Materia materia = new Materia("PB1", 01);
		Materia materia1 = new Materia("PB2", 02);

		unlam.agregarMaterias(materia);
		unlam.agregarMaterias(materia1);

		boolean esperado = true;

		assertEquals(esperado, unlam.asignarMateriaCorrelativa(02, 01) );

	}
	
	@Test
	void ImpedirAsignarMismaMateriaComoCorrelativa() {
		Universidad unlam = new Universidad();

		Materia materia = new Materia("PB1", 01);
		Materia materia1 = new Materia("PB2", 01);

		unlam.agregarMaterias(materia);
		unlam.agregarMaterias(materia1);

		boolean esperado = false;

		assertEquals(esperado, unlam.asignarMateriaCorrelativa(01, 01));

	}
	@Test
	void EliminarCorrelativa() {
		Universidad unlam = new Universidad();

		Materia materia = new Materia("PB1", 01);
		Materia materia1 = new Materia("PB2", 02);

		unlam.agregarMaterias(materia);
		unlam.agregarMaterias(materia1);
		
		unlam.asignarMateriaCorrelativa(materia1.getId(), materia.getId());
		
		

		boolean esperado = true;

		assertEquals(esperado,unlam.eliminarCorrelativa(materia1.getId(), materia.getId()));

	}
	
	

}
