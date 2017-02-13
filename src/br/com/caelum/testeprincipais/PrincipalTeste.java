package br.com.caelum.testeprincipais;

import java.util.ArrayList;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.conta.GuardaObjetos;

public class PrincipalTeste {

	public static void main(String[] args) {
		
		Integer total = 30000;
		System.out.println("Iniciando processo :::::::::- ");
		ArrayList<Integer> numero = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i <= total;i++){
			numero.add(i);
			System.out.println(numero.get(i));
		}
		
		for(int i = 0; i <= total;i++){
			
			System.out.println(numero.contains(i));
			
		}	
		
		long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
	}

}
