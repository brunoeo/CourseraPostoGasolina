package entities;

public class Frentista implements Comparable<Frentista>{

	
	private String name;
	private int cod;
	private Integer pontos;
	
	public Frentista(String name, int cod) {
		super();
		this.name = name;
		this.cod = cod;
		pontos = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getPontos() {
		int i = pontos;
		return i;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	@Override
	public int compareTo(Frentista o) {
		
		return this.pontos.compareTo(o.pontos);
	}
	
}
