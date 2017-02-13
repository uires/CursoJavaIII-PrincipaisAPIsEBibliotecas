package br.com.caelum.banco.conta;

public abstract class Conta implements Comparable<Conta> {
	protected int agencia;
	protected String nome;
	protected double saldo;
	protected String cpf;
	protected int numero;

	// Construtor:

	public Conta(double saldo, String nome, int agencia, String cpf) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.nome = nome;
		this.cpf = cpf;
		toString();
	}

	// Getters e Setters:

	public int getAgencia() {
		return this.agencia;
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

	public String toString() {
		return "Seu saldo é: R$" + this.saldo + "\nNome: " + this.nome + "\nAgencia: " +  this.agencia + "\nCPF: " + this.cpf;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// --
	public void deposita(double valorADepositar) {
		this.saldo += valorADepositar;
	}
	public void espaco(){
		System.out.println("-----------------------------------");
	}

}
