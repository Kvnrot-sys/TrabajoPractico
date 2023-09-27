package ar.edu.dominio;

import java.util.Collection;
import java.util.List;

public class AsignacionCursoAlumno {
	private static Integer id = 0;
	private Comision comision;
	private Alumno alumnos;
	private Nota nota;

	Integer generador = 1;

	public AsignacionCursoAlumno(Alumno alumno, Comision comision) {

		this.comision = comision;
		this.alumnos = alumno;
		id += generador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Comision getComision() {
		return comision;
	}

	public void setCurso(Comision comision) {
		this.comision = comision;
	}

	public Alumno getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno alumnos) {
		this.alumnos = alumnos;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}


	

}
