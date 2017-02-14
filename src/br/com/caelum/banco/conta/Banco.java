package br.com.caelum.banco.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco{
	private List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> index = new HashMap();
	
	

			
	public void adiciona(Conta conta){
		contas.add(conta);
		index.put(conta.getNome(), conta);
	}
	public Conta pega (int x){
		return contas.get(x);
	}
	public int PegaQuantidadeContas(){
		return contas.size();
	}
	
	public Conta buscaNome(String x){
		return index.get(x);
	}
			
			


}
