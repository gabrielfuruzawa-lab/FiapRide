package br.com.fiapride.model;

public class Motorista {
	
	// Atributos da classe motorista
	public String nome;
	public String cpf;
	public double saldo;
	
	// Constructor de objetos da classe passageiro
	public Motorista(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.00;
	}
	// Método 1: Receber pagamento pela viagem
	public void receberPagamento(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: O valor de recebimento deve ser maior que zero.");
			return;
		}
		this.saldo += valor;
		System.out.println("Pagamento recebido com sucesso! Saldo atual: " + this.saldo);
		System.out.println();
		}
		
	// Método 2: Sacar saldo acumulado
	public void sacarSaldo(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: O valor de saque é inválido.");
			return;
		}
		if (this.saldo < valor) {
			System.out.println("Erro: Saldo insuficiente para relizar saque.");
			return;
		}
		this.saldo -= valor;
		System.out.println("Saque realizado com sucesso! Saldo atual: " + this.saldo);
		System.out.println();
	}
}
