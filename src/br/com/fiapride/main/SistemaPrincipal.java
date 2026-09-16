package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		// INSTANCIAÇÃO
		// Criando passageiro1 e método adicionarSaldo
		Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
		System.out.println("Recarga do passageiro 1.");
		passageiro1.adicionarSaldo(50.0);
		
		// Criando passageiro2 e método adicionarSaldo
		Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");
		System.out.println("Recarga do passageiro 2.");
		passageiro2.adicionarSaldo(12.5);
		
		// Printando dados dos passageiros
		System.out.println("\n- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + passageiro1.getNome() + " | CPF: " + passageiro1.getCpf() + " | Saldo: R$" + passageiro1.getSaldo() + " |");
		System.out.println("Passageiro : " + passageiro2.getNome() + " | CPF: " + passageiro2.getCpf() + " | Saldo: R$" + passageiro2.getSaldo() + " |");
		System.out.println();

		// Método de pagarViagem
		// Passageiro1
		System.out.println("Pagando viagem do passageiro 1.");
		passageiro1.pagarViagem(20);
		//Passageiro2
		System.out.println("Pagando viagem do passageiro 2.");
		passageiro2.pagarViagem(20);
		
		// Printando dados dos passageiros
		System.out.println("\n- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + passageiro1.getNome() + " | CPF: " + passageiro1.getCpf() + " | Saldo: R$" + passageiro1.getSaldo() + " |");
		System.out.println("Passageiro : " + passageiro2.getNome() + " | CPF: " + passageiro2.getCpf() + " | Saldo: R$" + passageiro2.getSaldo() + " |");
		System.out.println();
		
	}

}
