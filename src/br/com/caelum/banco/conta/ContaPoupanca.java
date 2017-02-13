package br.com.caelum.banco.conta;

public class ContaPoupanca extends Conta {



	public ContaPoupanca(double saldo, String nome, int agencia, String cpf) {
		super(saldo, nome, agencia, cpf);
		toString();

	}

	public double getBonus() {

		return this.saldo += this.saldo * 0.2;

	}

	public void atualiza(double taxa) {

		this.saldo = this.saldo + (this.saldo * taxa);

	}

	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo)return -1;
		if(this.saldo < outra.saldo)return 1;
		return 0;
	}
	

	
}
