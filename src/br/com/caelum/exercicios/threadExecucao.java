package br.com.caelum.exercicios;


import java.util.Collection;
import java.util.Vector;

public class threadExecucao {

	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagemDaThread = new Vector<String>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagemDaThread));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagemDaThread));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagemDaThread));
		System.out.println("Inico Thread Teste> > ");
		t1.run();
		t2.run();
		t3.run();
		// Thread Join para um maior controle::
		t1.join();
		t2.join();
		t3.join();
		
				for(int i= 0; i < 15000;i++){
			if(!mensagemDaThread.contains("Mensagem para teste da Thread: : " + i)){				
				throw new IllegalStateException("Mensagem errada !!!" + i);			
			}		
		}
		if(mensagemDaThread.contains(null)){
			throw new IllegalStateException("Mensagem null>>");
		}
		
		System.out.println(" Fim Teste das Threads:  :: ");
	
	}
}
