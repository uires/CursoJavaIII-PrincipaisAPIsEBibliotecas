package br.com.caelum.testeprincipais;

import br.com.caelum.banco.conta.Conta;

public class PrincipalTeste {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		c.setAgencia(312);
		c.setCpf("220.448.555-21");
		c.setNome("João Lima dos Santos");
		c.setSaldo(3322.1);
		
		

	}

}
