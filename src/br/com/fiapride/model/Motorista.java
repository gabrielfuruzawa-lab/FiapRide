package br.com.fiapride.model;

public class Motorista {
	
	// Atributos da classe motorista
	private String nome;
	private String cpf;
	private double saldo;
	
	// Constructor de objetos da classe passageiro
	public Motorista(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.00;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	private void setSaldo(double valor) {
		if (valor >= 0) {
			this.saldo = valor;
		} else {
			System.out.println("Erro: O valor de saldo deve ser maior que zero.");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void receberPagamento(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: O valor de recebimento deve ser maior que zero.");
			return;
		}
		this.saldo += valor;
		System.out.println("Pagamento recebido com sucesso! Saldo atual: " + this.saldo);
		}
		
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
