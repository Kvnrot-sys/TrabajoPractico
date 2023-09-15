package ar.edu.dominio;

import java.util.Date;

public class Profesor {
//	Alumnos Id, nombre , Apellido , Fecha Nacimiento
	private Integer id;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Integer dni;
	
	
	public Profesor(Integer id, String nombre, String apellido, Date fechaNacimiento, Integer dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	} 
	
	
	

}
