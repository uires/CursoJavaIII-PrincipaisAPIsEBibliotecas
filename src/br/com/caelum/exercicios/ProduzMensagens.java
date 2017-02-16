package br.com.caelum.exercicios;

import java.util.Collection;

public class ProduzMensagens implements Runnable {
	private int inicioDaThread;
	private int fimDaThread;
	private Collection<String> mensagemDaThread;
	
	public ProduzMensagens(int inicio, int fim, Collection<String> mensagem){
		this.inicioDaThread = inicio;
		this.fimDaThread = fim;
		this.mensagemDaThread = mensagem;
	
	}
	
	
	@Override
	public void run() {
		for(int i = inicioDaThread;i < fimDaThread; i++ ){
			synchronized (mensagemDaThread) {
				mensagemDaThread.add("Mensagem para teste da Thread: : " + i);
			}
			//System.out.println(mensagemDaThread);
		}
		
	}
}