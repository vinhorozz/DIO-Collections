package edu.flavio.collections.map.search.auto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    //    adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavras(String palavra){
        if(!palavra.isEmpty()){
            palavras.remove(palavra);}
        else{
            System.out.println("Lista está vázio");
            throw new RuntimeException("Lista está vázio");
        }
    }

    //    exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
    public void exibirContagemPalavras() {
        if (!palavras.isEmpty()){
            System.out.println(palavras);
        }else{
            System.out.println("Lista está vázio");
            throw new RuntimeException("Lista está vázio");
        }

    }

    public String encontrarPalavraMaisFrequente(){
        String frequente=null;
        int contagem=0;
        for (Map.Entry<String,Integer> entry: palavras.entrySet()){
           if(entry.getValue()>contagem){

               contagem= entry.getValue();
               frequente=entry.getKey();
               System.out.println(contagem +" "+ frequente);
           }
        }
return frequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        System.out.println("Adicionando palavras");
        contagemPalavras.adicionarPalavra("a", 100);
        contagemPalavras.adicionarPalavra("b", 2);
        contagemPalavras.adicionarPalavra("c", 5);
        contagemPalavras.adicionarPalavra("d", 2);
        contagemPalavras.adicionarPalavra("e", 31);
        contagemPalavras.exibirContagemPalavras();

        System.out.println("");
        System.out.println("Removendo palavra");
        contagemPalavras.removerPalavras("c");

        System.out.println("");
        System.out.println("Exibindo lista");
        contagemPalavras.exibirContagemPalavras();


        System.out.println("");
        System.out.println("Palavra mais usada");
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

        System.out.println("Conclusão MAP Estrutura usada para adição de informções em pares 'chave' e 'valor', que não permite chaves duplicadas");
        System.out.println("Métodos muito úteis: .getKey() .get.Value(),MAP.Entry<K,V>.entrySet() ");


    }
}
