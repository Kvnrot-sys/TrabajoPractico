package ar.edu.dominio;

public class Comision {
//	Comisión id , Materia, y cicloLectivo, Turno

	private Integer id;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private Nota nota;
	private String turno;
	
	
	public Comision(Integer id, Materia materia, CicloLectivo cicloLectivo, String turno,Nota nota) {
		super();
		this.id = id;
		this.materia = materia;
		this.cicloLectivo = cicloLectivo;
		this.turno = turno;
		this.nota = nota;
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public CicloLectivo getCicloLectivo() {
		return cicloLectivo;
	}
	public void setCicloLectivo(CicloLectivo cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}




	public Nota getNota() {
		return nota;
	}




	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	
	
	
	
	

}
