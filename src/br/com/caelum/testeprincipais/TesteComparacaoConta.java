package br.com.caelum.testeprincipais;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

public class TesteComparacaoConta {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente(1);
		Conta c2 = new ContaCorrente(1);
		
		
		
		if(c1 == c2){
			System.out.println("Iguallllllllll !");
		}else{
			System.out.println("Diferente");
		}
		
		if(c1.equals(c2)){
			System.out.println("Objeto equivalente");
			
		}else{
			System.out.println("Objetos não equivalentes");
		}
		
		
		
		
		
	}

}
