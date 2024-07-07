package edu.flavio.collections.set.basic.auto;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosDePalavrasUnicas {
    Set<String> palavrasSet;

    public ConjuntosDePalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    //adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra){
       palavrasSet.add(palavra);
    }
    //removerPalavra(String palavra): Remove uma palavra do conjunto.
    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()) {
            if (verificarPalavra(palavra)) {
                palavrasSet.remove(palavra);
                System.out.println("A palavra "+ palavra+" foi removida!");
            }else{
                System.out.println("ATENÇÃO: A palavra não está na lista");
            }
        }else{
            System.out.println("A lista está vazia");
        }
    }

    //verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }

    //exibirpalavrasSetUnicas(): Exibe todas as palavrasSet únicas do conjunto.
    public void exibirpalavrasSetUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntosDePalavrasUnicas palvrasUnicas= new ConjuntosDePalavrasUnicas();
        System.out.println("");
        System.out.println("Adicionando palavrasSet");

        palvrasUnicas.adicionarPalavra("correr");
        palvrasUnicas.adicionarPalavra("correr");
        palvrasUnicas.adicionarPalavra("correr");
        palvrasUnicas.adicionarPalavra("correr");
        palvrasUnicas.adicionarPalavra("correr");
        palvrasUnicas.adicionarPalavra("surfar");
        System.out.println("");
        System.out.println("palavrasSet únicas");
        palvrasUnicas.exibirpalavrasSetUnicas();
        System.out.println("");
        String eliminada="surfar";
        System.out.println("Removendo palavra '"+eliminada+"'");
        palvrasUnicas.removerPalavra(eliminada);
        System.out.println("");
        System.out.println("palavrasSet únicas");
        palvrasUnicas.exibirpalavrasSetUnicas();


    }
}
