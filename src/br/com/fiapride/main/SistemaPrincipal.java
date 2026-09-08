package br.com.fiapride.main;

import br.com.fiapride.model.Motorista;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// INSTANCIAÇÃO

		// Criando passageiro1 e método adicionarSaldo
		Passageiro passageiro1 = new Passageiro("Ana Silva", "111.111.111-11");
		System.out.println("Recarga do passageiro " + passageiro1.nome + ".");
		passageiro1.adicionarSaldo(100.0);
		
		// Criando passageiro2 e método adicionarSaldo
		Passageiro passageiro2 = new Passageiro("Carlos Souza", "222.222.222-22");
		System.out.println("Recarga do passageiro " + passageiro2.nome + ".");
		passageiro2.adicionarSaldo(50.0);
		
		// Printando dados dos passageiros
		System.out.println("- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + passageiro1.nome + " | CPF: " + passageiro1.cpf + " | Saldo: R$" + passageiro1.saldo + " |");
		System.out.println("Passageiro : " + passageiro2.nome + " | CPF: " + passageiro2.cpf + " | Saldo: R$" + passageiro2.saldo + " |");
		System.out.println();

		// Método de pagarViagem
		// Passageiro1
		System.out.println("Pagando viagem do passageiro " + passageiro1.nome + "...");
		passageiro1.pagarViagem(20);
		//Passageiro2
		System.out.println("Pagando viagem do passageiro " + passageiro2.nome + "...");
		passageiro2.pagarViagem(30);
		
		// Criando motorista1 e método receberPagamento
		Motorista motorista1 = new Motorista("João Costa", "333.333.333-33");
		System.out.println("Recebimento de pagamento do motorista " + motorista1.nome + ".");
		motorista1.receberPagamento(20);
		
		// Criando motorista2 e método receberPagamento
		Motorista motorista2 = new Motorista("Pedro Souza", "444.444.444-44");
		System.out.println("Recebimento de pagamento do motorista " + motorista1.nome + ".");
		motorista2.receberPagamento(30);
		
		// Printando dados dos motoristas
		System.out.println("- - - Sistema FiapRide - - -");
		System.out.println("Motorista: " + motorista1.nome + " | CPF: " + motorista1.cpf + " | Saldo: R$" + motorista1.saldo + " |");
		System.out.println("Motorista : " + motorista2.nome + " | CPF: " + motorista2.cpf + " | Saldo: R$" + motorista2.saldo + " |");
		System.out.println();
		
		// Método sacarSaldo
		// Motorista1
		System.out.println("Sacando saldo motorista " + motorista1.nome + "...");
		motorista1.sacarSaldo(20);
		
		// Motorista2
		System.out.println("Sacando saldo motorista " + motorista2.nome + "...");
		motorista2.sacarSaldo(30);
		
		// Printando dados dos passageiros atualizados pós pagamento de viagem 
		System.out.println("- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + passageiro1.nome + " | CPF: " + passageiro1.cpf + " | Saldo: R$" + passageiro1.saldo + " |");
		System.out.println("Passageiro : " + passageiro2.nome + " | CPF: " + passageiro2.cpf + " | Saldo: R$" + passageiro2.saldo + " |");
		System.out.println();
		
		// Printando dados dos motoristas atualizados pós pagamento de viagem e saque
		System.out.println("- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + motorista1.nome + " | CPF: " + motorista1.cpf + " | Saldo: R$" + motorista1.saldo + " |");
		System.out.println("Passageiro : " + motorista2.nome + " | CPF: " + motorista2.cpf + " | Saldo: R$" + motorista2.saldo + " |");
		System.out.println();
		
	}

}
