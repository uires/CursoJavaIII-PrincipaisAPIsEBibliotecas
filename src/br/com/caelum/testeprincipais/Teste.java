package br.com.caelum.testeprincipais;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

public class Teste {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(0, null, 0, null);
        c1.deposita(10000);

        Conta c2 = new ContaCorrente(0, null, 0, null);
        c2.deposita(3000);

        // cria o mapa
        Map mapaDeContas = new HashMap();

        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor?
        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}