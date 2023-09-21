package ar.edu.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Materia {
	private String nombre;
	private Integer id;
	private ArrayList<Materia> correlativas = new ArrayList<Materia>();
	private Nota notas;
	
	
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
	
	
	public ArrayList<Materia> getCorrelativas() {
		return correlativas;
	}
	public void setCorrelativas(ArrayList<Materia> correlativas) {
		this.correlativas = correlativas;
	}
	public void añadirCorrelativa(Materia materia) {
		correlativas.add(materia);
	}
	
	
	

	
	
	
	
	
	
	public Nota getNotas() {
		return notas;
	}
	public void setNotas(Nota notas) {
		this.notas = notas;
	}
	
	
	
	
	
	
	@Override
	public boolean equals(Object otro) {
		
		if(this == otro) {
			return true;
		}
		
		if(otro == null) {
			return false;
		}
		
		if(otro.getClass() != Aula.class) {
			return false;
		}
		
		Materia materia = (Materia) otro;
		
		if(materia.getId().equals(this.id) && materia.getNombre().equals(this.nombre) 
				&& materia.getCorrelativas().equals(this.correlativas)) {
			return true;
		}else {
			return false;
		}
		
	
	}
	
	
	
	
	
	
	
	

}
