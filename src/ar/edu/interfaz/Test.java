package ar.edu.interfaz;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import ar.edu.dominio.Alumno;
import ar.edu.dominio.AsignacionCursoAlumno;
import ar.edu.dominio.Aula;
import ar.edu.dominio.CicloLectivo;
import ar.edu.dominio.Comision;
import ar.edu.dominio.Materia;
import ar.edu.dominio.Profesor;
import ar.edu.dominio.Universidad;

class Test {

	@org.junit.jupiter.api.Test
	void materiaAgregada() {
		Materia materia = new Materia("PB1", 1);

		Universidad unlam = new Universidad();
		boolean esperado = true;

		assertEquals(esperado, unlam.agregarMaterias(materia));

	}

	void impedirAgregarMateriaConMismoId2Veces() {
		Materia materia = new Materia("PB1", 1);
		Materia materia2 = new Materia("PB1", 1);

		Universidad unlam = new Universidad();

		unlam.agregarMaterias(materia);

		boolean esperado = false;

		assertEquals(esperado, unlam.agregarMaterias(materia2));

	}

	void agregarAlumno() throws ParseException {

		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaInicio = fecha.parse("06-04-2023");
		Date fechaNacimiento = fecha.parse("12-07-2023");

		Universidad unlam = new Universidad();

		Alumno alumno = new Alumno("Kevin", "Rotela", 45285663, fechaNacimiento, fechaInicio);

		boolean esperado = true;

		assertEquals(esperado, unlam.agregarAlumno(alumno));

	}

	void impedirAgregarElAlumnoConElMismoDni() throws ParseException {

		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaInicio = fecha.parse("06-04-2023");
		Date fechaNacimiento = fecha.parse("12-07-2023");

		Universidad unlam = new Universidad();

		Alumno alumno = new Alumno("Kevin", "Rotela", 45285663, fechaNacimiento, fechaInicio);
		Alumno alumno2 = new Alumno("Daniel", "Ledesma", 45285663, fechaNacimiento, fechaInicio);

		unlam.agregarAlumno(alumno);

		boolean esperado = false;

		assertEquals(esperado, unlam.agregarAlumno(alumno2));

	}

	public void agregarCicloLectivo() throws ParseException {
		// No se puede asignar 2 ciclos Lectivo con mismo Id y no se pueden superponer
		// los rangos de fechas entre 2 ciclos distintos

		Universidad unlam = new Universidad();

		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaInicioCicloLectivo = fecha.parse("06-04-2023");
		;
		Date fechaFinalizacionCicloLectivo = fecha.parse("06-07-2023");
		;
		Date fechaInicioInscripcion = fecha.parse("15-07-2023");
		Date fechaFinalizacionInscripcion = fecha.parse("20-07-2023");

		CicloLectivo ciclo = new CicloLectivo(fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);

		boolean esperado = true;

		assertEquals(esperado, unlam.agregarCicloLectivo(ciclo));

	}

	public void impedirAgregarCicloLectivoSuperponiendoRango() throws ParseException {
		// No se puede asignar 2 ciclos Lectivo con mismo Id y no se pueden superponer
		// los rangos de fechas entre 2 ciclos distintos

		Universidad unlam = new Universidad();

		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaInicioCicloLectivo = fecha.parse("06-04-2023");
		;
		Date fechaFinalizacionCicloLectivo = fecha.parse("06-07-2023");
		;
		Date fechaInicioInscripcion = fecha.parse("15-07-2023");
		Date fechaFinalizacionInscripcion = fecha.parse("20-07-2023");

		CicloLectivo ciclo = new CicloLectivo(fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);
		CicloLectivo ciclo2 = new CicloLectivo(fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);

		unlam.agregarCicloLectivo(ciclo);

		boolean esperado = false;

		assertEquals(esperado, unlam.agregarCicloLectivo(ciclo2));

	}

	public void agregarUnSegundoCicloLectivo() throws ParseException {
		// No se puede asignar 2 ciclos Lectivo con mismo Id y no se pueden superponer
		// los rangos de fechas entre 2 ciclos distintos

		Universidad unlam = new Universidad();

		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaInicioCicloLectivo = fecha.parse("06-04-2023");
		;
		Date fechaFinalizacionCicloLectivo = fecha.parse("06-07-2023");
		;
		Date fechaInicioInscripcion = fecha.parse("15-07-2023");
		Date fechaFinalizacionInscripcion = fecha.parse("20-07-2023");

		Date fechaInicioCicloLectivo1 = fecha.parse("12-08-2023");
		;
		Date fechaFinalizacionCicloLectivo1 = fecha.parse("01-12-2023");
		;
		Date fechaInicioInscripcion1 = fecha.parse("20-12-2023");
		Date fechaFinalizacionInscripcion1 = fecha.parse("23-12-2023");

		CicloLectivo ciclo = new CicloLectivo(fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);
		CicloLectivo ciclo2 = new CicloLectivo(fechaInicioCicloLectivo1, fechaFinalizacionCicloLectivo1,
				fechaInicioInscripcion1, fechaFinalizacionInscripcion1);

		unlam.agregarCicloLectivo(ciclo);

		boolean esperado = true;

		assertEquals(esperado, unlam.agregarCicloLectivo(ciclo2));

	}

	public void agregarComision() throws ParseException {

		Universidad unlam = new Universidad();
		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaInicioCicloLectivo = fecha.parse("06-04-2023");
		;
		Date fechaFinalizacionCicloLectivo = fecha.parse("06-07-2023");
		;
		Date fechaInicioInscripcion = fecha.parse("15-07-2023");
		Date fechaFinalizacionInscripcion = fecha.parse("20-07-2023");
		CicloLectivo ciclo = new CicloLectivo(fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);

		Materia materia = new Materia("PB1", 1);

		Comision comision = new Comision(1, materia, ciclo, "Mañana");

		unlam.agregarComision(comision);

		boolean esperado = true;

		assertEquals(esperado, unlam.agregarComision(comision));

	}

	public void ImpediragregarComisiones() throws ParseException {

		// No se Pueden generar 2 Comisiones para la misma materia, el mismo
		// cicloLectivo y el mismo turno

		Universidad unlam = new Universidad();
		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaInicioCicloLectivo = fecha.parse("06-04-2023");
		;
		Date fechaFinalizacionCicloLectivo = fecha.parse("06-07-2023");
		;
		Date fechaInicioInscripcion = fecha.parse("15-07-2023");
		Date fechaFinalizacionInscripcion = fecha.parse("20-07-2023");
		CicloLectivo ciclo = new CicloLectivo(fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);

		Materia materia = new Materia("PB1", 1);

		Comision comision = new Comision(1, materia, ciclo, "Mañana");
		Comision comision2 = new Comision(1, materia, ciclo, "Mañana");

		unlam.agregarComision(comision);

		boolean esperado = false;

		assertEquals(esperado, unlam.agregarComision(comision2));

	}

	public void agregarDocente() throws ParseException {

		Universidad unlam = new Universidad();

		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaDeNacimiento = fecha.parse("06-04-2023");

		Profesor profe = new Profesor(1, "Juanma", "Lopez", fechaDeNacimiento, 20202020);

		boolean esperado = true;

		assertEquals(esperado, unlam.agregarDocente(profe));

	}

	public void impedirAgregarDocenteConElMismoDni() throws ParseException {

		Universidad unlam = new Universidad();

		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaDeNacimiento = fecha.parse("06-04-2023");

		Profesor profe = new Profesor(1, "Juanma", "Lopez", fechaDeNacimiento, 20202020);
		Profesor profe2 = new Profesor(2, "Ezequiel", "Pannasiuk", fechaDeNacimiento, 20202020);

		unlam.agregarDocente(profe);

		boolean esperado = false;

		assertEquals(esperado, unlam.agregarDocente(profe2));

	}

	public void asignarDocenteAComision() throws ParseException {

		Universidad unlam = new Universidad();
		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaDeNacimiento = fecha.parse("06-04-2023");
		Date fechaInicioCicloLectivo = fecha.parse("06-04-2023");
		Date fechaFinalizacionCicloLectivo = fecha.parse("06-07-2023");
		Date fechaInicioInscripcion = fecha.parse("15-07-2023");
		Date fechaFinalizacionInscripcion = fecha.parse("20-07-2023");

		CicloLectivo ciclo = new CicloLectivo(fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);

		Profesor profe = new Profesor(1, "Juanma", "Lopez", fechaDeNacimiento, 20202020);

		Materia materia = new Materia("PB1", 1);

		Comision comision = new Comision(1, materia, ciclo, "Mañana");

		boolean esperado = true;

		assertEquals(esperado, unlam.asignarDocentesAComision(comision.getId(), profe.getDni()));

	}
	
	
	
	
	
	public void impedirasignarElMismoDocenteALaMismaComision() throws ParseException {

		Universidad unlam = new Universidad();
		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");

		Date fechaDeNacimiento = fecha.parse("06-04-2023");
		Date fechaInicioCicloLectivo = fecha.parse("06-04-2023");
		Date fechaFinalizacionCicloLectivo = fecha.parse("06-07-2023");
		Date fechaInicioInscripcion = fecha.parse("15-07-2023");
		Date fechaFinalizacionInscripcion = fecha.parse("20-07-2023");

		CicloLectivo ciclo = new CicloLectivo(fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);

		Profesor profe = new Profesor(1, "Juanma", "Lopez", fechaDeNacimiento, 20202020);
		Profesor profe2 = new Profesor(1, "Juanma", "Lopez", fechaDeNacimiento, 20202020);


		Materia materia = new Materia("PB1", 1);

		Comision comision = new Comision(1, materia, ciclo, "Mañana");
		Comision comision2 = new Comision(1, materia, ciclo, "Mañana");
		
		
		unlam.asignarDocentesAComision(comision.getId(), profe.getDni());

		

		boolean esperado = false;

		assertEquals(esperado, unlam.asignarDocentesAComision(comision2.getId(), profe2.getDni() ) );

	}

	// La nota debe estar entre 1 y 10

	// No se puede asignar Una nota Mayor o igual a 7 si no están todas las
	// correlativas aprobadas (Mayor o igual a 7)

	// Las notas pueden ser de tipo 1erParc, 2doParc, Rec1Parcial, Rec2Parcial

	// se pueden asignar hasta 3 tipos de notas pero no se pueden cargar 2 notas del
	// mismo tipo,

	// ejemplo Valido nota de 1erParc, 2doParc, Rec1Parcial, o 2doParc, Rec1Parcial,
	// Rec2Parcial

}
