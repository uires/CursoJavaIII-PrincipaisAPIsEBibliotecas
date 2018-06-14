package br.com.caelum.testeprincipais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;



public class exercicio {
	public static void main(String[] args) {
		List<Integer> conjunto = new ArrayList<>();
			for (int i = 1000; i >= 1; i--) {
			conjunto.add(i);
		}
		Collections.reverse(conjunto);	
		for (Integer i : conjunto) {
			System.out.print(i + " ");
		}
		
	}
}
