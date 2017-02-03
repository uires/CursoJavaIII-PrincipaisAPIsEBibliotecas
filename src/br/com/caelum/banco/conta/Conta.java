package br.com.caelum.banco.conta;

public class Conta {
	private int agencia;
	private String nome;
	private double saldo;
	private String cpf;

	// Getters e Setters: 
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void getNome() {
		System.out.println("Nome: " + this.nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
		getNome();
	}

	public void getSaldo() {
		System.out.println("Seu saldo é: R$" + this.saldo);
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
		getSaldo();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
