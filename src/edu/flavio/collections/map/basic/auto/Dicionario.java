package edu.flavio.collections.map.basic.auto;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }
    //adicionarPalavra(String palavra, String definicao)
    public void adicionarPalavra(String palavra, String definicao){
            dicionario.put(palavra,definicao);
    }
    //removerPalavra(String palavra)  //EU NÃO ME LEMBREI.
    public void removerPalavra(String palavra){
         if(!dicionario.isEmpty()) {
                dicionario.remove(palavra);
         }else{
             throw new RuntimeException("O dicionárico está vázio.");
         }
    }
    //exibirPalavras()
    public void exibirPalavras(){
        System.out.println(dicionario);
    }
    //pesquisarPorPalavra(String palavra)
    public String pesquisarPorPalavra(String palavra){
            String definicao =dicionario.get(palavra);

    return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario=new Dicionario();
        System.out.println("");
        System.out.println("Adicionando palavras");
        dicionario.adicionarPalavra("Word1","definition1");
        dicionario.adicionarPalavra("Word2","definition2");
        dicionario.adicionarPalavra("Word3","definition3");
        dicionario.adicionarPalavra("Word4","definition4");
        dicionario.adicionarPalavra("Word5","definition5");
        dicionario.adicionarPalavra("Word4","definition5");
        dicionario.adicionarPalavra("Word5","definition4");


        System.out.println("");
        System.out.println("Exibindo o dicionário");
        dicionario.exibirPalavras();

        System.out.println("");
        String palavra ="Word1";
        System.out.println("Remove a palavra "+ palavra);
        dicionario.removerPalavra(palavra);

        System.out.println("");
        System.out.println("Exibindo o dicionário");
        dicionario.exibirPalavras();

        String procura ="Word3";
        System.out.println("");
        System.out.println("Resultado de busca");
        System.out.println(dicionario.pesquisarPorPalavra(procura));



    }
}
