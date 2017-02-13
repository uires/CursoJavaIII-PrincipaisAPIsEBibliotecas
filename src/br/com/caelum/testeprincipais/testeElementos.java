package br.com.caelum.testeprincipais;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.lang.model.element.Name;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;

//; Aula 5 -ArrayList, Collections Framework

public class testeElementos {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Uires");
		nomes.add("Bela");
		nomes.add("Laisa");
		nomes.add("Nilzete");
		Collections.sort(nomes);
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("......................-");
		List<Conta> contas = new ArrayList<>();

		Conta c1 = new ContaPoupanca(123.1, "João", 123, "224.227.441-42");
		Conta c2 = new ContaPoupanca(33212, "Poliana", 332, "223.041.331-22");
		Conta c3 = new ContaCorrente(2223.1, "Lima", 321, "041.227.221-01");

		contas.add(c1);
		contas.add(c2);
		contas.add(c3);

		// System.out.println(contas.get(0));
		// System.out.println(contas.get(1));
		// System.out.println(contas.get(2));

		Collections.sort(contas);
		for (Conta c : contas) {
			System.out.println(c);
			c.espaco();
		}

	}
}
