package ar.edu.dominio;

import java.util.Collection;

public class Aula {
//	Aula id, Cantidad De Alumnos

	private Integer id;
	private Integer cantidad;
	public Aula(Integer id, Integer alumnos) {
		super();
		this.id = id;
		this.cantidad = alumnos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAlumnos() {
		return cantidad;
	}
	public void setAlumnos(Integer alumnos) {
		this.cantidad = alumnos;
	}
	
	

}
