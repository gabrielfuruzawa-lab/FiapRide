package br.com.fiapride.model;

public class Passageiro {

	// public static void main(String[] args) {
		// TODO Auto-generated method stub

	public String nome;
	public String cpf;
	public double saldo;
	
	//Cosntrutor
	public Passageiro(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.00;
	}
	
	// Método 1: Adicionar saldo com validação
	public void adicionarSaldo(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: O valor de recarga deve ser maior que zero.");
			return;
		}
		this.saldo += valor;
		System.out.println("Recarga realizada. Saldo atual: " + this.saldo);
		System.out.println();
	}
	
	// Método 2: Pagar viagem com validão
	public void pagarViagem(double custo) {
		if (custo <= 0) {
			System.out.println("Erro: O custo da viagem é inválido.");
			return;
		}
		if (this.saldo < custo) {
			System.out.println("Erro: Saldo insuficiente para relizar a viagem.");
			return;
		}
		this.saldo -= custo;
		System.out.println("Viagem paga com sucesso! Saldo atual: " + this.saldo);
		System.out.println();
	}
	
}
