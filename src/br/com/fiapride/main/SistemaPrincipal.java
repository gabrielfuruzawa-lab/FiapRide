package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
		System.out.println("Recarga do passageiro 1.");
		passageiro1.adicionarSaldo(50.0);
		
		Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");
		System.out.println("Recarga do passageiro 2.");
		passageiro2.adicionarSaldo(12.5);
		
		System.out.println("\n- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + passageiro1.getNome() + " | CPF: " + passageiro1.getCpf() + " | Saldo: R$" + passageiro1.getSaldo() + " |");
		System.out.println("Passageiro : " + passageiro2.getNome() + " | CPF: " + passageiro2.getCpf() + " | Saldo: R$" + passageiro2.getSaldo() + " |");
		System.out.println();

		System.out.println("Pagando viagem do passageiro 1.");
		passageiro1.pagarViagem(20);
		//Passageiro2
		System.out.println("Pagando viagem do passageiro 2.");
		passageiro2.pagarViagem(20);
		
		System.out.println("\n- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + passageiro1.getNome() + " | CPF: " + passageiro1.getCpf() + " | Saldo: R$" + passageiro1.getSaldo() + " |");
		System.out.println("Passageiro : " + passageiro2.getNome() + " | CPF: " + passageiro2.getCpf() + " | Saldo: R$" + passageiro2.getSaldo() + " |");
		System.out.println();
		
		Veiculo carro1 = new Veiculo("ABC-1234", "Toyota Corolla");
		carro1.atualizarPlaca("XYZ-9999");
	}

}
