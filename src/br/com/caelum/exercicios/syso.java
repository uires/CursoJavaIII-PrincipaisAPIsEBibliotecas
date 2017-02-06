package br.com.caelum.exercicios;

import java.io.IOException;
import java.io.PrintStream;

public class syso {
	public static void main(String[] args) {
		
		PrintStream saida= System.out;
		saida.println("oLÁ : ");
		
		try {
			int i = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
