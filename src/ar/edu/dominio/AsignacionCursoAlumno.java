package ar.edu.dominio;

import java.util.Collection;
import java.util.List;

public class AsignacionCursoAlumno {
	private Integer id;
	private Comision comision;
	private Alumno alumnos;
	private Nota nota;
	
	
	public AsignacionCursoAlumno(Alumno alumno, Comision comision) {
		
		this.comision = comision;
		this.alumnos = alumno;
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



	@Override
	public boolean equals(Object otro) {
		
		
		if (this == otro) {
			return true;
		}
		
		if(otro== null) {
			return false;
		}
		
		
		if(otro.getClass() != AsignacionCursoAlumno.class) {
			return false;
		}
		
		AsignacionCursoAlumno asignacion = (AsignacionCursoAlumno) otro;
		
		if(asignacion.getAlumnos().equals(this.alumnos) && asignacion.getComision().equals(this.comision) 
				&& asignacion.getId().equals(this.id) && asignacion.getNota().equals(this.nota)) {
			return true;
		} else {
			return false;
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
