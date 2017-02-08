package br.com.caelum.banco.conta;

public class ContaCorrente extends Conta {
	


	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero &&
				this.nome.equals(outraConta.nome);

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
