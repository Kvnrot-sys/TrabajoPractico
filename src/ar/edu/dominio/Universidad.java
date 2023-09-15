package ar.edu.dominio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Universidad {
	private List<Alumno> alumnos;
	private Collection<Materia> materias;
	private List<Comision> comisiones;
	private List<Profesor> profesor;
	
	private List<AsignacionCursoAlumno> cursoAlumno;
	private List<AsignacionCursoProfe> cursoProfe;

	
		
	
	public String agregarMaterias(Materia materia) {
		String mensaje = "";
		if(this.materias.contains(materia.getId())){
			mensaje = "Esta materia ya esta agregada";
		}
		else {
			this.materias.add(materia);
			mensaje = "Materia agregada exitosamente";
			
		}
		return mensaje;
	}
	
	
	public String agregarAlumno(Alumno alumno) {
		String mensaje = "";
		if(this.alumnos.contains(alumno.getId())){
			mensaje = "Esta alumno ya esta agregado";
		}
		else {
			this.alumnos.add(alumno);
			mensaje = "Alumno agregado exitosamente";
			
		}
		return mensaje;
	}
	
	
	
	
	
	public String agregarCurso(Comision comision) {
		
		String mensaje = "";
		if(this.comisiones.contains(comision.getId())) {
			mensaje = "Este curso ya ha sido agregado";
		}
		else {
			this.comisiones.add(comision);
			mensaje = "Curso agregado exitosamente";
		}
		return mensaje;
	
	}
	
	
	public String agregarDocente(Profesor profesor) {
		
		
		
		String mensaje = "";
		if(this.profesor.contains(profesor.getId())) {
			mensaje = "Este profesor ya ha sido agregado";
		}
		else {
			this.profesor.add(profesor);
			mensaje = "Curso agregado exitosamente";
		}
		return mensaje;
	
	}
	
	public boolean asignarMateriaCorrelativa(String nombre, Integer id) {
		
		
		boolean asignado = false;
		Materia correlativa = new Materia(nombre,id);
		
		for (Materia iterador : this.materias) {
			if(iterador.getId().equals(correlativa.getId())  ){
				iterador.añadirCorrelativa(correlativa);
				asignado = true;	
			}
			
		}
		
		return asignado;
	}
	
	
	public boolean eliminarCorrelativa(Integer codigo, Integer codigoCorrelativa) {
		
		boolean eliminado = false;
		
		
		
		for(Materia iterador : this.materias) {
			if(iterador.getId().equals(codigo) && iterador.getCorrelativas().contains(codigoCorrelativa)){
				iterador.getCorrelativas().remove(iterador.getCorrelativas().contains(codigoCorrelativa));
				
				eliminado = true;
				
			}
		}
		
		return eliminado;
		
		
	}
		

	public boolean inscribirAlumnoACurso(Integer dni,Integer idComision) {
		
		boolean inscripto = false;
		
		boolean alumnoEsta = false;
		
		boolean comisionEsta = false;
		
		Alumno alumnoAInscribir = null;
		Comision comisionAInscribir = null;
		
		for(Alumno iterador: this.alumnos) {
			if(iterador.getId().equals(dni)) {
				alumnoAInscribir = iterador;
				alumnoEsta = true;
			}
			
		}
		
		for(Comision iterador : this.comisiones) {
			if(iterador.getId().equals(idComision)) {
				comisionAInscribir = iterador;
				comisionEsta = true;
			}
		}
		
		
		if(alumnoEsta==true && comisionEsta==true) {
			AsignacionCursoAlumno asignacion = new AsignacionCursoAlumno(alumnoAInscribir, comisionAInscribir);
			
			cursoAlumno.add(asignacion);
			inscripto = true;
			
		}
		
		return inscripto;
	}
	
	
	
	
	
	
	
	public boolean registrarNota(Integer idCurso, Integer idAlumno, Nota nota) {
		
		AsignacionCursoAlumno asignacion = null;
		boolean notaAsignada = false;
		
		for(AsignacionCursoAlumno iterador : cursoAlumno) {
			if(iterador.getId().equals(idCurso) && iterador.getId().equals(idAlumno)) {
				iterador.setNota(nota);
				notaAsignada = true;
			}
		}
		
		return notaAsignada;
				
	}
	
	
	
public boolean inscribirProfesorACurso(Integer idComision,Integer dniDocente) {
		
		boolean inscripto = false;
		
		boolean profeEsta = false;
		
		boolean comisionEsta = false;
		
		Profesor profesorAInscribir = null;
		Comision comisionAInscribir = null;
		
		for(Profesor iterador: this.profesor) {
			if(iterador.getDni().equals(dniDocente)) {
				profesorAInscribir = iterador;
				profeEsta = true;
			}
			
		}
		
		for(Comision iterador : this.comisiones) {
			if(iterador.getId().equals(idComision)) {
				comisionAInscribir = iterador;
				comisionEsta = true;
			}
		}
		
		
		if(profeEsta==true && comisionEsta==true) {
			AsignacionCursoProfe asignacion = new AsignacionCursoProfe(profesorAInscribir, comisionAInscribir);
			
			cursoProfe.add(asignacion);
			inscripto = true;
			
		}
		
		return inscripto;
}
	




 public Collection<Materia> obtenerListadoMateriasAprobadasParaUnAlumno(Integer idAlumno) {
	 
	 List<Materia> materiasAprobadas = null;
	
	for(AsignacionCursoAlumno iterador : this.cursoAlumno) {
		if(iterador.getAlumnos().getId().equals(idAlumno)) {
			if(iterador.getComision().getNota().getValor() >=4  ) {
				materiasAprobadas.add(iterador.getComision().getMateria() );
			}
		}
	}
	
	
	return materiasAprobadas;	
	
}
 
 
 public Collection<Materia> obtenerMateriasQueFaltanCursarParaUnAlumno(Integer idAlumno){
	 
	 
	 List<Materia> materiasPendientes = null;
	 
	
	 
	 
 }
 
 
 
 public Collection<AsignacionCursoAlumno> ObtenerReporteDeNotasDeAlumnosDeCurso(Integer idCurso){
	 
	 List<AsignacionCursoAlumno> reporte = null;
	 
	 for(AsignacionCursoAlumno iterador : this.cursoAlumno) {
		 if(iterador.getComision().getId().equals(idCurso)) {
			 reporte.add(iterador);
		 }
		 
	 }
	 
	 return reporte;
 }
	
	
	
	
	
	
	
	
	
	
}
