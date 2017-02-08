package br.com.caelum.exercicios;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class testeIO {
	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Digite seu texto: ");
		
		String linha = br.readLine();
		while(linha != null){
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();

	}
}

