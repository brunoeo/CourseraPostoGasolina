package application;

import entities.Bomba;
import entities.Cliente;
import entities.Combustivel;
import entities.Frentista;
import entities.Posto;

public class Program {

	public static void main(String[] args) {
		
		Combustivel combustivel1 = new Combustivel("tipo1");
		Combustivel combustivel2 = new Combustivel("tipo2");
		Combustivel combustivel3 = new Combustivel("tipo3");

		Bomba bomba1 = new Bomba(1);
		Bomba bomba2 = new Bomba(2);

		bomba1.addCombustiveis(combustivel1);
		bomba1.addCombustiveis(combustivel2);
		bomba1.addCombustiveis(combustivel3);
		bomba2.addCombustiveis(combustivel1);
		bomba2.addCombustiveis(combustivel2);
		bomba2.addCombustiveis(combustivel3);
		
		Cliente cliente = new Cliente("Afonso", "475.491.005-80");
		
		Frentista frentista1 = new Frentista("Cleiton", 1);
		Frentista frentista2 = new Frentista("Bruno", 2);
		
		Posto posto = new Posto();
		
		posto.addBomba(bomba1);
		posto.addBomba(bomba2);
		
		posto.addFrentista(frentista1);
		posto.addFrentista(frentista2);
		
		posto.abastecer(cliente, 1, "tipo1", 1);
		posto.abastecer(cliente, 1, "tipo2", 1);
		posto.abastecer(cliente, 1, "tipo3", 1);
		posto.abastecer(cliente, 1, "tipo1", 2);
		posto.abastecer(cliente, 2, "tipo2", 1);
		posto.abastecer(cliente, 1, "tipo3", 2);
		posto.abastecer(cliente, 2, "tipo2", 2);
		posto.abastecer(cliente, 1, "tipo2", 1);
		posto.abastecer(cliente, 2, "tipo3", 2);
		posto.abastecer(cliente, 2, "tipo2", 2);
		posto.abastecer(cliente, 2, "tipo2", 1);
		posto.abastecer(cliente, 1, "tipo3", 2);
		posto.abastecer(cliente, 1, "tipo2", 1);
		posto.abastecer(cliente, 2, "tipo2", 2);
		posto.abastecer(cliente, 2, "tipo1", 2);
		posto.abastecer(cliente, 2, "tipo1", 1);
		posto.abastecer(cliente, 1, "tipo1", 2);
		
		/*posto.exibirFrentistas();
		System.out.println("------------------------------");*/
		posto.exibirCombustivel();

		
		
		
	}

}
