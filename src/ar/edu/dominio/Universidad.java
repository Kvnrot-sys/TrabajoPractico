package ar.edu.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Universidad {
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	private List<Materia> materias = new ArrayList<Materia>();
	private List<Comision> comisiones = new ArrayList<Comision>();
	private List<Profesor> profesor = new ArrayList<Profesor>();
	
	
	
	private List<CicloLectivo> ciclos = new ArrayList<CicloLectivo>(1);
	
	
	private Collection<AsignacionCursoAlumno> cursoAlumno;
	private Collection<AsignacionCursoProfe> cursoProfe;
	

	public boolean agregarMaterias(Materia materia) {
		boolean agregado = false;
		
		
		if (this.materias.contains(materia.getId())  ) {
			agregado = false;
		} else {
			this.materias.add(materia);
			agregado = true;

		}
		
		return agregado;
		
		
	}

	public boolean agregarAlumno(Alumno alumno) {
		boolean agregado = false;		
		
		
		if (this.alumnos.contains(alumno.getDni())) {
			agregado = false;
		} else {
			this.alumnos.add(alumno);
			agregado = true;
		}
		return agregado;
	}

	public boolean agregarCicloLectivo(CicloLectivo ciclo) {

		boolean agregado = false;
		Date max = null;
		Date min = null;

		// AÑADIR LOS CICLOS A LA LISTA

		if (ciclo.getId() == 1) {
			this.ciclos.add(ciclo);
			max = ciclo.getFechaFinalizacionCicloLectivo();
			min = ciclo.getFechaInicioInscripcion();
		}

		for (CicloLectivo iterador : this.ciclos) {
			
			
			
			
			if (iterador == null) {
				if (ciclo.getFechaInicioCicloLectivo().after(min) && ciclo.getFechaInicioCicloLectivo().after(max)
						&& ciclo.getFechaFinalizacionCicloLectivo().after(ciclo.getFechaInicioInscripcion())) {
					this.ciclos.add(ciclo);
					agregado = true;
				}

			}
		}

		return agregado;

	}

	public boolean agregarComision(Comision comision) {
		
		

		boolean agregada = false;
		if (this.comisiones.contains(comision.getMateria()) && this.comisiones.contains(comision.getCicloLectivo())
				&& this.comisiones.contains(comision.getTurno())) {
			agregada = false;
		} else {
			this.comisiones.add(comision);
			agregada = true;
		}
		return agregada;

	}

	public boolean agregarDocente(Profesor profesor) {

		boolean agregado = false;
		
		
		if (this.profesor.contains(profesor.getDni())) {
			agregado = false;
		} else {
			this.profesor.add(profesor);
			agregado = true;
		}
		return agregado;

	}

	public boolean asignarDocentesAComision(Integer idComision, Integer dniDocente) {

		boolean inscripto = false;

		boolean profeEsta = false;

		boolean comisionEsta = false;

		Profesor profesorAInscribir = null;
		Comision comisionAInscribir = null;
		
		
		

		for (Profesor iterador : this.profesor) {
			if (iterador.getDni().equals(dniDocente)) {
				profesorAInscribir = iterador;
				profeEsta = true;
			}

		}

		for (Comision iterador : this.comisiones) {
			if (iterador.getId().equals(idComision)) {
				comisionAInscribir = iterador;
				comisionEsta = true;
			}
		}
		
		//


		if (profeEsta == true && comisionEsta == true) {
			Integer dni = profesorAInscribir.getDni();
			Integer id = comisionAInscribir.getId();
			
			if(this.cursoProfe.stream().anyMatch(elementos->elementos.getProfesor().getDni().equals(dni))  
					&& this.cursoProfe.stream().anyMatch(elemento->elemento.getId().equals(id))){
				inscripto = false;
				
			}
			else {
				AsignacionCursoProfe asignacion = new AsignacionCursoProfe(profesorAInscribir, comisionAInscribir);
				inscripto = true;
			}

		}

		return inscripto;
	}

	public boolean asignarMateriaCorrelativa(String nombre, Integer id) {

		boolean asignado = false;
		Materia correlativa = new Materia(nombre, id);

		for (Materia iterador : this.materias) {
			if (iterador.getId().equals(correlativa.getId())) {
				iterador.añadirCorrelativa(correlativa);
				asignado = true;
			}

		}

		return asignado;
	}

	public boolean eliminarCorrelativa(Integer idMateria, Integer idCorrelativaAEliminar) {

		boolean eliminado = false;

		for (Materia iterador : this.materias) {
			if (iterador.getId().equals(idMateria)) {
				this.materias.remove(iterador.getCorrelativas().contains(idCorrelativaAEliminar));
				eliminado = true;
			}
		}

		return eliminado;

	}

	public boolean inscribirAlumnoAComision(Integer dni, Integer idComision) {

		boolean inscripto = false;

		boolean alumnoEsta = false;

		boolean comisionEsta = false;

		Alumno alumnoAInscribir = null;
		Comision comisionAInscribir = null;

		for (Alumno iterador : this.alumnos) {
			if (iterador.getDni().equals(dni)) {
				alumnoAInscribir = iterador;
				alumnoEsta = true;
			}

		}

		for (Comision iterador : this.comisiones) {
			if (iterador.getId().equals(idComision)) {
				comisionAInscribir = iterador;
				comisionEsta = true;
			}
		}
		
		// averiguar la notas de las correlativas del alumno
		
		
		
		/*
		 * 
		 * // Verificar que el alumno y la comisión estén dados de alta
		   //No se puede inscribir Alumnos si este no tiene aprobadas todas las correlativas. Se aprueba con 4 o más.
		   //La inscripción no se puede realizar si esta fuera de fecha Inscripción
		   //No se puede inscribir el alumno si excede la cantidad de alumnos permitidos en el aula
		   //No se puede inscribir el Alumno si ya está inscripto a otra comisión el mismo día y Turno
		   //No se puede inscribir a una materia que haya aprobado previamente
		 */

		if (alumnoEsta == true && comisionEsta == true) {
			AsignacionCursoAlumno asignacion = new AsignacionCursoAlumno(alumnoAInscribir, comisionAInscribir);
			this.cursoAlumno.add(asignacion);
			inscripto = true;

		}

		return inscripto;
	}

	public boolean registrarNota(Integer idComision, Integer idAlumno, Nota nota) {

		boolean notaAsignada = false;

		for (AsignacionCursoAlumno iterador : cursoAlumno) {
			if (iterador.getId().equals(idComision) && iterador.getId().equals(idAlumno)) {
				iterador.setNota(nota);
				notaAsignada = true;
			}
		}

		return notaAsignada;

	}

	public Collection<Materia> obtenerListadoMateriasAprobadasParaUnAlumno(Integer idAlumno) {

		Collection<Materia> materiasAprobadas = null;

		for (AsignacionCursoAlumno iterador : this.cursoAlumno) {
			if (iterador.getAlumnos().getId().equals(idAlumno) && iterador.getNota().aprobada() == true  ) {
				
					materiasAprobadas.add(iterador.getComision().getMateria() );
				}
			}
		

		return materiasAprobadas;

	}

//	
// public Collection<Materia> obtenerMateriasQueFaltanCursarParaUnAlumno(Integer idAlumno){
//	 
//	 	Collection<Materia> materias = null;
//	  Collection<Materia> materiasPendientes = null;
//	  
//	  for (AsignacionCursoAlumno comision : this.cursoAlumno) {
//		  if(comision.getAlumnos().getId().equals(idAlumno)) {
//			  materias.add(comision.getComision().getMateria());
//		  }
//	}	  
//	 
//	 
//	  }
//	 

	public Collection<Nota> ObtenerReporteDeNotasDeAlumnosDeCurso(Integer idCurso) {

		List<Nota> reporte = null;

		for (AsignacionCursoAlumno iterador : this.cursoAlumno) {
			if (iterador.getComision().getId().equals(idCurso)) {
				reporte.add(iterador.getNota());
			}

		}

		return reporte;
	}

	public double calcularPromedio(Integer idAlumno) {

		Integer cantidad = 0;

		Integer notas = 0;

		Double promedio = 0.0;

		for (AsignacionCursoAlumno iterador : this.cursoAlumno) {
			if (iterador.getAlumnos().getId().equals(idAlumno)) {
				promedio = iterador.getNota().promedio();
			}

		}
		return promedio;

	}
	
	
	
	public Nota obtenerNota(Integer idAlumno, Integer idMateria) {
		Nota nota = null;
		
		for(AsignacionCursoAlumno buscar : this.cursoAlumno) {
			if(buscar.getAlumnos().getId().equals(idAlumno) && buscar.getComision().getMateria().getId().equals(idMateria)){
				nota = buscar.getNota();
				

			}
		}
		
		
		return nota;
		
		
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public List<Comision> getComisiones() {
		return comisiones;
	}

	public void setComisiones(List<Comision> comisiones) {
		this.comisiones = comisiones;
	}

	public List<Profesor> getProfesor() {
		return profesor;
	}

	public void setProfesor(List<Profesor> profesor) {
		this.profesor = profesor;
	}

	public List<CicloLectivo> getCiclos() {
		return ciclos;
	}

	public void setCiclos(List<CicloLectivo> ciclos) {
		this.ciclos = ciclos;
	}

	public Collection<AsignacionCursoAlumno> getCursoAlumno() {
		return cursoAlumno;
	}

	public void setCursoAlumno(Collection<AsignacionCursoAlumno> cursoAlumno) {
		this.cursoAlumno = cursoAlumno;
	}

	public Collection<AsignacionCursoProfe> getCursoProfe() {
		return cursoProfe;
	}

	public void setCursoProfe(Collection<AsignacionCursoProfe> cursoProfe) {
		this.cursoProfe = cursoProfe;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
