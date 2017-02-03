 package br.com.caelum.banco.conta;

public class GuardaObjetos {

		public int posicaoLivre;
		private Object[] contas;
		
		
		public GuardaObjetos(){
			contas = new Object[10];
			posicaoLivre = 0;
			
		}
		
		public void adiciona(Object nova){
			contas[posicaoLivre] = nova;
			posicaoLivre++;
			
		}
		
		public Object pega(int posicao){
			return contas[posicao];
			
		}
		
		
}
