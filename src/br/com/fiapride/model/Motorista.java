package br.com.fiapride.model;

public class Motorista {

	private String nome;
	private String cpf;
	private double saldo;

	public Motorista(String nome, String cpf) {
		if (cpf == null || cpf.trim().isempty()) {
			throw new IllegalArgumentException("Erro: CPF obrigatório.");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.00;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSaldo() {
		return this.saldo;
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
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	private void setSaldo(double valor) {
		if (valor >= 0) {
			this.saldo = valor;
		} else {
			System.out.println("Erro: O valor de saldo deve ser maior que zero.");
		}
	}

	
}
