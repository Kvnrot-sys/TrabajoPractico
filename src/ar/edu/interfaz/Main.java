package ar.edu.interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ar.edu.dominio.Alumno;
import ar.edu.dominio.Aula;
import ar.edu.dominio.Materia;
import ar.edu.dominio.Profesor;
import ar.edu.dominio.Universidad;

import ar.edu.dominio.Nota;


public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		//CREAMOS LA UNIVERSIDAD;
		
		
		Universidad unlam = new Universidad();
		
		//CREAMOS AL ALUMNO;
		SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");
		Date fechaInicio = fecha.parse("06-04-2023");

		Date fechaNacimiento = fecha.parse("12-07-2023");
		
		Alumno alumno = new Alumno("Kevin", "Rotela", 45285663, fechaNacimiento, fechaInicio);
		
		
		//CREAMOS LA MATERIA
		
		Materia materia = new Materia("PB1", 1);
		
		
		//CREAMOS AL PROFESOR
		
		Profesor profesor = new Profesor(1, "Juan", "Fioch", fechaNacimiento, 23456332);
		
		//AGREGAMOS LA MATERIA A LA FACULTAD
		
		
		Nota nota = new Nota();
		
		nota.setP1(10);
		nota.setP2(8);
		nota.promedio();
		
		
		
		
		unlam.agregarDocente(profesor);
		
		
		unlam.asignarMateriaCorrelativa("PB2", 1);
		
		System.out.println(unlam.agregarMaterias(materia));
		
		Aula aula = new Aula(1, 21);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
