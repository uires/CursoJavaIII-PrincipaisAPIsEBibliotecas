package br.com.caelum.testeprincipais;

import java.util.ArrayList;

//; Aula 5 -ArrayList, Collections Framework

public class testeElementos {
	public static void main(String[] args) {
		ArrayList nomes = new ArrayList();
		nomes.add("LOle");
		nomes.add("Russians");
		System.out.println(nomes.get(1));
		System.out.println(nomes.contains("LOle"));
	}
}
