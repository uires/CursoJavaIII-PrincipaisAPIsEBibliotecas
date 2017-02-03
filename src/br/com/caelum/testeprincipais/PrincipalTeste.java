package br.com.caelum.testeprincipais;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.conta.GuardaObjetos;

public class PrincipalTeste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		Conta cP = new ContaPoupanca();
		
		cP.setSaldo(3002.1);
		c1.setSaldo(332.1);
		c1.setSaldo(3321.2);
		
		GuardaObjetos armario = new GuardaObjetos();
		armario.adiciona(c1);
		armario.adiciona(c2);
		System.out.println(armario.pega(0));
		armario.adiciona(cP);
		System.out.println(armario.pega(2));
	}

}
