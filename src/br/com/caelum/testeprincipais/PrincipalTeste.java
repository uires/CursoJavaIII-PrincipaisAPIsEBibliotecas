package br.com.caelum.testeprincipais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.conta.GuardaObjetos;

public class PrincipalTeste {

	public static void main(String[] args) {
		System.out.println("Digite o valor que quer Calcular: ");
		Scanner ler = new Scanner(System.in);
		long total;
		total = ler.nextInt();
		
		
		
		System.out.println("Iniciando processo :::::::::- ");
		Collection<Integer> numero = new HashSet<>();
		long inicio = System.currentTimeMillis();

		for(int i = 0; i <= total;i++){
			numero.add(i);
		 }

		for (int i = 0; i <= total; i++) {
			numero.contains(i);

		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
