package br.com.caelum.exercicios;

public class thread2 implements Runnable {
		
		public void run(){
			for(int i = 10000;i >= 1;i--){
				System.out.println(i - 1000);
			}
		}
	}


