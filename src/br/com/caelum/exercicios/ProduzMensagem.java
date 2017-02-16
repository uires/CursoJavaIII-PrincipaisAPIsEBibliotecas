package br.com.caelum.exercicios;

import java.util.Collection;

public class ProduzMensagem {
	public int inicio;
	public int fim;
	public Collection<String> mensagem;
	
	
	public ProduzMensagem(int inico, int fim, Collection<String> mensagem){
		this.inicio = inicio;
		this.fim = fim;
		this.mensagem = mensagem;		
		
	}
	public void run(){
		for(int i = inicio ;i < fim; i++){
			System.out.println("Mensagem - " + i);
		}
	}
}
