package br.com.caelum.exercicios;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;




public class testeIO {
	public static void main(String[] args) throws IOException {
	         
		
		InputStream is = new FileInputStream("leitura.txt");
		Scanner entrada = new Scanner(is);
		
		System.out.println("Digite a mensagem que você quer apresentar: ");
		
		
		
		
		
		
		while(entrada.hasNextLine()){
			System.out.println(entrada.nextLine());
			
			
		}
		
		entrada.close();		
		
  }
}


