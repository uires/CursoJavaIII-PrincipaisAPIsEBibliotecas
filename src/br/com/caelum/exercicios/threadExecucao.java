package br.com.caelum.exercicios;

import java.util.*;


public class threadExecucao {
	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagemParaThread = new ArrayList<String>();
		
		Thread thread1 = new Thread(new ProduzMensagem(0, 3000, mensagemParaThread));
		Thread thread2 = new Thread(new ProduzMensagem(0, 10003, mensagemParaThread));
		Thread thread3 = new Thread(new ProduzMensagem(0, 10000, mensagemParaThread));
		
		thread1.start();
			thread2.start();
				thread3.start();
		// botando join para maior controle da thread::
		thread1.join();
		thread2.join();
		thread3.join();
		
		System.out.println("Produzindo Mensagens :: ");
		
		
		

	}
}
