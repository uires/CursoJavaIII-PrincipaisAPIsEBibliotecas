package br.com.caelum.exercicios;

import java.io.*;
import java.util.Scanner;



public class testeIO {
	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		PrintStream saida = new PrintStream(new FileOutputStream("arquivo.txt"));
		
		while(entrada.hasNextLine()){			
			saida.println(entrada.nextLine());			
		}
		
		saida.close();
		entrada.close();

	}
}
