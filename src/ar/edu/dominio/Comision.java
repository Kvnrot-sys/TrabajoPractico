package ar.edu.dominio;

public class Comision {
//	Comisión id , Materia, y cicloLectivo, Turno

	private Integer id;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private Nota nota;
	private String turno;
	private Aula aula;

	public Comision(Integer id, Materia materia, CicloLectivo cicloLectivo, String turno) {
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

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
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
		
		Comision comision = (Comision) otro;
		
		if( comision.getAula().equals(this.aula) && comision.getCicloLectivo().equals(this.cicloLectivo) 
				&& comision.getId().equals(this.id)  && comision.getMateria().equals(this.materia) 
				&& comision.getNota().equals(this.nota)  && comision.getTurno().equals(this.turno) ) {
			return true;
		}else {
			return false;
		}
		
	
	}
	
	
	

}
