package br.com.fiapride.model;

public class Veiculo {

	private String placa;
	private String modelo;
	
	public Veiculo(String placa, String modelo) {
		System.out.println("Registro Inicial ...");
		this.modelo=modelo;
		this.setPlaca(placa);
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void atualizarPlaca(String novaPlaca) {
		System.out.println("\nAtualização de placa | modelo: " + this.modelo + " | placa: " + this.placa);	
		this.setPlaca(novaPlaca);
		System.out.println("modelo: " + this.modelo + " | placa nova: " + this.placa);
	}
	
	private void setPlaca(String novaPlaca) {
		if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
			this.placa = novaPlaca;
		}else {
            System.out.println("\nErro de atualização: A placa informada é inválida!");
        }
	}
}
