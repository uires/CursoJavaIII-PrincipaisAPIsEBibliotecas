package br.com.caelum.testeprincipais;

import java.util.ArrayList;
import java.util.Collections;

//; Aula 5 -ArrayList, Collections Framework

public class testeElementos {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		
		nomes.add("Uires");
		nomes.add("Bela");
		nomes.add("Laisa");
		nomes.add("Nilzete");

		Collections.sort(nomes);
		
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println(nomes.get(3));
		
	}
}
