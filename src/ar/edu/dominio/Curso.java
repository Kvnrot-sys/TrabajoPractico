package ar.edu.dominio;

import java.util.Collection;
import java.util.Date;

public class Curso {
	private Integer codigo;
	private Materia materia;
	private Date horario;
	private CicloLectivo cicloLectivo;
	private Aula aula;
	
	
	
	
	
	
	public Curso(Integer codigo, Materia materia, Date horario, CicloLectivo cicloLectivo, Aula aula) {
		super();
		this.codigo = codigo;
		this.materia = materia;
		this.horario = horario;
		this.cicloLectivo = cicloLectivo;
		this.aula = aula;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	public CicloLectivo getCicloLectivo() {
		return cicloLectivo;
	}
	public void setCicloLectivo(CicloLectivo cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}
	public Aula getAula() {
		return aula;
	}
	public void setAula(Aula aula) {
		this.aula = aula;
	}
	
	
	
	
	

}
