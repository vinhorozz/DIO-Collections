package edu.flavio.collections.map.search;

public class Produto {
//atributos
    private String nome;
    private int quantidade;
    private double preco;
//métodos
    //construtores

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
    //Como na interface MAP a "chave" já é o valor único, não há
    // necessidade de criarmos os métodos "Equals() and HashCode()"
}
