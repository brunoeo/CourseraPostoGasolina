package entities;

public class Combustivel implements Comparable<Combustivel>{
	
	private String tipo;
	private Integer cont;
	
	public Combustivel(String tipo) {
		super();
		this.tipo = tipo;
		cont = 0;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getCont() {
		return cont;
	}

	public void setCont(Integer cont) {
		this.cont = cont;
	}

	@Override
	public int compareTo(Combustivel o) {
		return this.cont.compareTo(o.getCont());
	}
	
	
	
}
