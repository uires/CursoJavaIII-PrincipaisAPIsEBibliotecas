package br.com.caelum.banco.conta;

public class ContaCorrente extends Conta{
	


	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.getNumero() == outraConta.getNumero() &&
				this.nome.equals(outraConta.nome);

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
