package ar.edu.dominio;

import java.util.List;

public class Nota {
	Integer generador = 1;
	private Integer id = 0;
	private Integer p1;
	private Integer p2;
	private Integer r1;
	private Integer r2;
	private Integer eFinal;
	private List<Materia> aprobadas;

	public Nota() {
		id+=generador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Materia> getAprobadas() {
		return aprobadas;
	}

	public void setAprobadas(List<Materia> aprobadas) {
		this.aprobadas = aprobadas;
	}

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		
		if(p1>=1 && p1<=10) {
			this.p1 = p1;
		}
		
	}

	public Integer getP2() {
		return p2;
	}

	public void setP2(Integer p2) {
		if(p2>=1 && p2<=10) {
			this.p2 = p2;
		}
	}

	public Integer getR1() {
		return r1;
	}

	public void setR1(Integer r1) {

		if(p1>=1 && p1<=10) {
			this.p1 = r1;
		}
	}

	public Integer getR2() {
		return r2;
	}

	public void setR2(Integer r2) {
		this.p2 = r2;
	}

	public Integer geteFinal() {
		return eFinal;
	}

	public void seteFinal(Integer eFinal) {
		this.eFinal = eFinal;
	}
	
	
	
	public Double promedio() {
		
		Double promedio = (double) ((p1+p2)/2);
		
		return promedio;
	}
	
	
	
	public boolean aprobada() {
		boolean estaAprobada = false;
		if(promedio()>=4) {
			estaAprobada = true;
		}
		
		return estaAprobada;
	}
	
	
	
	
	

	@Override
	public boolean equals(Object otro) {

		if (this == otro) {
			return true;
		}

		if (otro == null) {
			return false;
		}

		if (otro.getClass() != Nota.class) {
			return false;
		}

		Nota nota = (Nota) otro;

		if (nota.getId().equals(this.id) && nota.getP1().equals(this.p1) &&
				nota.getP2().equals(this.p2) && nota.getR1().equals(this.r1) 
				&& nota.getR2().equals(this.r2)) {
			return true;
		} else {
			return false;
		}

	}

}
