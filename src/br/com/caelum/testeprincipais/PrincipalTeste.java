package br.com.caelum.testeprincipais;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.conta.GuardaObjetos;

public class PrincipalTeste {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaPoupanca();
		
		Conta cP = new ContaPoupanca();
		
				
		c1.setSaldo(332.1);
	
		
		GuardaObjetos armario = new GuardaObjetos();
		armario.adiciona(c1);
		armario.adiciona(c2);
		System.out.println(armario.pega(0));
		armario.adiciona(cP);
		System.out.println(armario.pega(2));
		cP.setSaldo(3021.1);
		System.out.println(cP.toString());
		
		
	}

}
