package entities;

import java.util.ArrayList;
import java.util.List;

public class Bomba {
	
	private List<Combustivel> combustiveis = new ArrayList<>();
	private int cod;
	
	public Bomba(int cod) {
		this.cod = cod;
	}

	public List<Combustivel> getCombustiveis() {
		return combustiveis;
	}

	public void addCombustiveis(Combustivel combustivel) {
		
		combustiveis.add(combustivel);
		
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	
	
}
