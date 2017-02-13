package br.com.caelum.banco.conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo, String nome, int agencia, String cpf) {
		super(saldo, nome, agencia, cpf);
		toString();
	}

	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.getNumero() == outraConta.getNumero()
				&& this.nome.equals(outraConta.nome);

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int compareTo(ContaCorrente outra) {
		return this.getNumero() - outra.getNumero();
	}

	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}

}
