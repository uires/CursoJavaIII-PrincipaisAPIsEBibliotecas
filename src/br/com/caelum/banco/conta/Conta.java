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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		System.out.println("Nome: " + this.nome);
		return nome;
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
	public String getSaldo(){
		return "Saldo é: " + this.saldo;
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
