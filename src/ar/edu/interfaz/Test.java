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
import ar.edu.dominio.Curso;
import ar.edu.dominio.Materia;
import ar.edu.dominio.Universidad;

class Test {

	@org.junit.jupiter.api.Test
	void test() throws ParseException {
		Materia materia = new Materia("Programacion Basica",3000) ;
		
		
		
		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");
		SimpleDateFormat hora = new SimpleDateFormat("hh-mm");
		
		Date fechaInscripcion = fecha.parse("28-03-2023");
		Date fechaInscripcionUltima = fecha.parse("31-03-2023");
		
		
		
		
		Date fechaInicio = fecha.parse("06-04-2023");
		Date fechaFinalizacion = fecha.parse("12-07-2023");
		
		
		
		Date fechaNacimiento = fecha.parse("12-07-2023");
		
		Date horarioCuros = hora.parse("08-00");		

		Aula aula = new Aula(3000,60);
		
		CicloLectivo ciclo = new CicloLectivo(10, fechaInicio, fechaFinalizacion, fechaInscripcion, fechaInscripcionUltima);		
		Comision comision = new Comision(01-5900, materia, ciclo, "Mañana");		
		
		Alumno alumno = new Alumno("Kevin", "Rotela", 1,fechaNacimiento,fechaInicio);
		
		
		
		
		
		Universidad universidad = new Universidad();
		
		universidad.agregarMaterias(materia);
		
		
		
		
		AsignacionCursoAlumno asg = new AsignacionCursoAlumno(alumno, comision);
		
		
		

		// La nota debe estar entre 1 y 10 

		// No se puede asignar Una nota Mayor o igual a 7 si no están todas las correlativas aprobadas (Mayor o igual a 7) 

		//Las notas pueden ser de tipo 1erParc, 2doParc, Rec1Parcial, Rec2Parcial 

		//se pueden asignar hasta 3 tipos de notas  pero no se pueden cargar 2 notas del mismo tipo,  

		 //ejemplo Valido nota de 1erParc, 2doParc, Rec1Parcial, o 2doParc, Rec1Parcial, Rec2Parcial 

		 
		
		
		
		
		
	}

}
