package br.com.caelum.testeprincipais;

import java.util.HashSet;
import java.util.List;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

public class TesteBanco {
	public static void main(String[] args) {
		HashSet<Conta> contas = new HashSet<Conta>();
		ContaCorrente c1 = new ContaCorrente(3323.1, "Jddery", 224, "224.447.887-44"); 
		ContaCorrente c2 = new ContaCorrente(3323.1, "Jddery", 224, "224.447.887-44");
		ContaCorrente c3 = new ContaCorrente(3675323.1, "Jddeeery", 224, "2264.447.887-44");
		ContaCorrente c4 = new ContaCorrente(33123.1, "Jdddery", 224, "2243.447.887-44");
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		
		
		System.out.println(contas.size());
	}

}
