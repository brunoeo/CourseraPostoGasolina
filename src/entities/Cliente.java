package entities;

public class Cliente {
	
	private String name;
	private String CPF;
	
	public Cliente(String name, String cPF) {
		this.name = name;
		CPF = cPF;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
	
}
