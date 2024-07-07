package edu.flavio.collections.map.search;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueProdutosMap;

    //métodos
    //construtores
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    //manipuladores

    public void adiocionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double exibirValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto exibirProdutoMaisCaro() {//toda vez, que for preciso "buscar" item dentro de uma lista, o método precisa ter um tipo e retorno
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;//Método estático
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco=p.getPreco();
                    produtoMaisCaro = p;

                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos= new EstoqueProdutos();


        estoqueProdutos.adiocionarProduto(190,"Sapato",200,205.3);
        estoqueProdutos.adiocionarProduto(191,"Bolsa",40,159.2);
        estoqueProdutos.adiocionarProduto(192,"Carteira",50,50.99);
        estoqueProdutos.adiocionarProduto(193,"Cinto",100,35.6);
        estoqueProdutos.adiocionarProduto(194,"Maleta",100,259.83);
        System.out.println("");
        System.out.println("Lista de produtos");
        System.out.println("O conjunto Map não apresenta os itens na mesma orde em que foram inseridos");
        estoqueProdutos.exibirProdutos();
        System.out.println("");

        System.out.println("Valor Total do estoque:");
        System.out.println( "R$ "+estoqueProdutos.exibirValorTotalEstoque());
        System.out.println("");
        System.out.println("Exibir o produto mais caro: ");
        System.out.println(estoqueProdutos.exibirProdutoMaisCaro());
    }

}


