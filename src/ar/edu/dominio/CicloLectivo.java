package ar.edu.dominio;

import java.util.Date;

public class CicloLectivo {
//	CicloLectivo . Id, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo, fechaInicioInscripcion,
//	fechaFinalizacionInscripcion
	
	Integer generador = 1;
	private static Integer id = 0;
	private Date fechaInicioCicloLectivo;
	private Date fechaFinalizacionCicloLectivo;
	private Date fechaInicioInscripcion;
	private Date fechaFinalizacionInscripcion;
	
	public CicloLectivo(Date fechaInicioCicloLectivo, Date fechaFinalizacionCicloLectivo,
			Date fechaInicioInscripcion, Date fechaFinalizacionInscripcion) {
		id+=generador;
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
		this.fechaInicioInscripcion = fechaInicioInscripcion;
		this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFechaInicioCicloLectivo() {
		return fechaInicioCicloLectivo;
	}
	public void setFechaInicioCicloLectivo(Date fechaInicioCicloLectivo) {
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
	}
	public Date getFechaFinalizacionCicloLectivo() {
		return fechaFinalizacionCicloLectivo;
	}
	public void setFechaFinalizacionCicloLectivo(Date fechaFinalizacionCicloLectivo) {
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
	}
	public Date getFechaInicioInscripcion() {
		return fechaInicioInscripcion;
	}
	public void setFechaInicioInscripcion(Date fechaInicioInscripcion) {
		this.fechaInicioInscripcion = fechaInicioInscripcion;
	}
	public Date getFechaFinalizacionInscripcion() {
		return fechaFinalizacionInscripcion;
	}
	public void setFechaFinalizacionInscripcion(Date fechaFinalizacionInscripcion) {
		this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
	}
	
	
	@Override
	public boolean equals(Object otro) {
		
		if(this == otro) {
			return true;
		}
		
		if(otro == null) {
			return false;
		}
		
		if(otro.getClass() != CicloLectivo.class) {
			return false;
		}
		
		CicloLectivo ciclo = (CicloLectivo) otro;
		
		if(ciclo.getFechaFinalizacionCicloLectivo().equals(this.fechaFinalizacionCicloLectivo) 
				&& ciclo.getFechaFinalizacionInscripcion().equals(this.fechaFinalizacionInscripcion) 
				&& ciclo.getFechaInicioCicloLectivo().equals(this.fechaInicioCicloLectivo) 
				&& ciclo.getFechaInicioInscripcion().equals(this.getFechaInicioInscripcion())) {
			return true;
		}else {
			return false;
		}
		
	
	}
	
	
	

}
