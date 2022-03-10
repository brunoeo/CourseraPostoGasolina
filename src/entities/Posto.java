package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Posto {
	
	private List<Frentista> frentistas = new ArrayList<>();
	private List<Bomba> bombas = new ArrayList<>();
	
	public void addFrentista(Frentista frentista) {
		frentistas.add(frentista);
	}
	
	public void addBomba(Bomba bomba) {
		bombas.add(bomba);
	}
	
	public void abastecer (Cliente cliente, int codBomba, String tipoCombustivel, int codFrentista) {
		for (Bomba b : bombas) {
			if (codBomba == b.getCod()) {
				for(Combustivel c : b.getCombustiveis()) {
					if (tipoCombustivel == c.getTipo()) {
						int cont = c.getCont()+1;
						c.setCont(cont);
						for (Frentista f : frentistas) {
							if(codFrentista == f.getCod()) {
								cont = f.getPontos() + 1;
								f.setPontos(cont);
							}
						}
					}
				}
			}
		}
	}
	
	public void exibirFrentistas() {
		Collections.sort(frentistas);
		for(Frentista f : frentistas) {
			System.out.println("Frentista: " + f.getName());
		}
		
	}
	
	public void exibirCombustivel() {
		List<Combustivel> combustiveis = new ArrayList<>();
		for(Bomba b : bombas) {
			for(Combustivel c : b.getCombustiveis()) {
				if (combustiveis.size() != 3) {
					combustiveis.add(c);
				} else {
					for(Combustivel c1 : combustiveis) {
						if(c1.getTipo() == c.getTipo()) {
							int cont = (c1.getCont() + c.getCont())/2;
							c1.setCont(cont);
						}
					}
				}
			}
		}
		Collections.sort(combustiveis);
		for(Combustivel c : combustiveis) {
			System.out.println("Combustivel " + c.getTipo() + ", numero de frequncia: " + c.getCont());
		}
		
	}
	
	
}
