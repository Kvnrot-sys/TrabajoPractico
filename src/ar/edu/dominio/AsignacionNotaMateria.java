package ar.edu.dominio;

public class AsignacionNotaMateria {
	private Materia materia;
	private Nota nota;
	private Alumno alumno;
	
	
	public AsignacionNotaMateria(Alumno alumno, Materia materia, Nota nota) {
		super();
		this.materia = materia;
		this.nota = nota;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Nota getNota() {
		return nota;
	}
	public void setNota(Nota nota) {
		this.nota = nota;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
	
	

}
