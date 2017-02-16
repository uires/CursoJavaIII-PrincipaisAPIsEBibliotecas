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
		
		
		 asd p1 = new asd();    
         p1.setId(1);

         Thread t1 = new Thread(p1);
         t1.start();

         asd p2 = new asd();    
         p2.setId(2);

         Thread t2 = new Thread(p2);
         t2.start();                

		
	}
}
