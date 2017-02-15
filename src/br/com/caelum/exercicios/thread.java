package br.com.caelum.exercicios;

public class thread implements Runnable {
	
	public void run(){
		for(int i = 0;i <= 10000;i++){
			System.out.println(i);
		}
		
	}
}
