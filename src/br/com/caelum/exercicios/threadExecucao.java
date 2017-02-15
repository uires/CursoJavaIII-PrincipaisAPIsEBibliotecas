package br.com.caelum.exercicios;

public class threadExecucao {
	public static void main (String[] args){
		
		thread runner = new thread();
		runner.run();
		Thread runnerex = new Thread(runner);
		runnerex.start();
		thread2 runner2 = new thread2();
		runner2.run();
		Thread ruunrex2 = new Thread(runner2);
		ruunrex2.start();
		
		
	}
}
