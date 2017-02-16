package br.com.caelum.exercicios;

import java.util.Collection;

public class ProduzMensagem implements Runnable {
	private int inicioDaThread;
	private int fimDaThread;
	private Collection<String> mensagemParaThread;
	
	
	public ProduzMensagem(int inico, int fim, Collection<String> mensagem){
		this.inicioDaThread = inicioDaThread;
		this.fimDaThread = fimDaThread;
		this.mensagemParaThread = mensagem;		
		
	}
	public void run(){
		for(int i = inicioDaThread ;i < fimDaThread; i++){
			mensagemParaThread.add("Mensagem - " + i);
		}
	}
}
