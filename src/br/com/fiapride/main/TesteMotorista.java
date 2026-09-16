package br.com.fiapride.main;

import br.com.fiapride.model.Motorista;

public class TesteMotorista {

	public static void main(String[] args) {
		
		Motorista motorista1 = new Motorista("João Santos", "444.444.444-44");
		System.out.println("Recebimento de pagamento do motorista 1.");
		motorista1.receberPagamento(20);
		
		Motorista motorista2 = new Motorista("Pedro Costa", "555.555.555-55");
		System.out.println("Recebimento de pagamento do motorista 2.");
		motorista2.receberPagamento(20);
		
		System.out.println("- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + motorista1.getNome() + " | CPF: " + motorista1.getCpf() + " | Saldo: R$" + motorista1.getSaldo() + " |");
		System.out.println("Passageiro: " + motorista2.getNome() + " | CPF: " + motorista2.getCpf() + " | Saldo: R$" + motorista2.getSaldo() + " |\n");

		System.out.println("Sacando saldo do motorista 1.");
		motorista1.sacarSaldo(10);

		System.out.println("Sacando saldo do motorista 2.");
		motorista2.sacarSaldo(30);
		
	}

}
