package ar.edu.dominio;

import java.util.Collection;
import java.util.List;

public class Materia {
	private String nombre;
	private Integer id;
	private List<Materia> correlativas;
	
	
	
	public Materia(String nombre, Integer id) {
		this.nombre = nombre;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	

	
	public List<Materia> getCorrelativas() {
		return correlativas;
	}
	public void setCorrelativas(List<Materia> correlativas) {
		this.correlativas = correlativas;
	}
	public void añadirCorrelativa(Materia materia) {
		correlativas.add(materia);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
