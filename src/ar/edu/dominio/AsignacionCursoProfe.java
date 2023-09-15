package ar.edu.dominio;

import java.util.Collection;
import java.util.HashMap;

public class AsignacionCursoProfe {

	private Integer id;
	private Comision comision;
	private Profesor profesor;
	
	

public AsignacionCursoProfe(Profesor profesor, Comision comision) {
	
	this.comision = comision;
	this.profesor = profesor;
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Comision getCurso() {
		return comision;
	}

	public void setCurso(Comision comision) {
		this.comision = comision;
	}

	public Profesor getAlumnos() {
		return profesor;
	}

	public void setAlumnos(Profesor profesor) {
		this.profesor = profesor;
	}
	
	



//	private HashMap<Curso,Profesor> Asignacion;

}
