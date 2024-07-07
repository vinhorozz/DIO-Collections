package edu.flavio.collections.set.sort;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    //métodos
    //construtores

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    //manipuladores

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){

        produtoSet.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto>exibirProdutosPorNome(){
        /*o TreeSet é a classe que permitirá a ordenação do conjunto HashSet, criado acima,
         Pois, HashSet não tem essa capacidade, e o "Collection.sort" só funciona com o "List"
         */
        Set<Produto> produtosPorNome=new TreeSet<>(produtoSet);

        return produtosPorNome;
    }
  public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto>produtosPorPreco=new TreeSet<>(new ComparatorPorPreco());
            produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
  }

    //
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos= new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1,"sapato",13,100);
        cadastroProdutos.adicionarProduto(2,"bolsa",50,40);
        cadastroProdutos.adicionarProduto(3,"cinto",35,40);
        System.out.println("");
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("");
        System.out.println("Para execução do código de ordenação por nome com o Set é preciso implementar o 'Comparable' na classe  de origem do tipo");
        System.out.println("Produtos ordenados por nome");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("");
        System.out.println("Para execução do código de ordenação por preço com o Set, foi preciso implementar o 'Comparator' abaixo da classe de origem, pois já existia um 'comparable' implertado");
        System.out.println("Produtos ordenados por preço");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }

}
