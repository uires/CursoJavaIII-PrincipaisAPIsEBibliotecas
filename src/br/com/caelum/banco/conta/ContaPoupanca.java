package br.com.caelum.banco.conta;


public class ContaPoupanca extends Conta {
	

	public double getBonus() {
		
		return this.saldo += this.saldo * 0.2;
		
	}

	public void atualiza(double taxa) {
		
		this.saldo = this.saldo + (this.saldo * taxa);
		
	}

}
