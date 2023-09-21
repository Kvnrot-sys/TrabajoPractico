package ar.edu.dominio;

import java.util.Collection;
import java.util.Date;

public class Alumno {

	static int generador = 1;

	private Integer id;
	private String nombre;
	private String apellido;
	private Integer dni;
	private Date fechaDeNacimiento;
	private Date fechaIngreso;

	public Alumno(String nombre, String apellido, Integer dni, Date fechaDeNacimiento, Date fechaInicio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaIngreso = fechaInicio;
		this.id = generador++;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
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

	public Integer getId() {
		return dni;
	}

	public void setId(Integer id) {
		this.dni = id;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public boolean equals(Object otro) {
		// TODO Auto-generated method stub

		if (this == otro) {
			return true;
		}
		if (otro == null) {
			return false;
		}

		if (otro.getClass() != Alumno.class) {
			return false;
		}

		Alumno alumno = (Alumno) otro;

		if (alumno.getApellido().equals(this.apellido) && alumno.getNombre().equals(this.nombre)
				&& alumno.getId().equals(this.id) && alumno.getFechaIngreso().equals(this.fechaIngreso)
				&& alumno.getFechaDeNacimiento().equals(this.fechaDeNacimiento) 
				&& alumno.getDni().equals(this.dni)) {
			return true;
		} else {
			return false;
		}

	}

}

//	Alumnos Id, nombre , Apellido , Fecha Nacimiento, fechaIngreso
