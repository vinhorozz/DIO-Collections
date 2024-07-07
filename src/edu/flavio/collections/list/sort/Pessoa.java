package edu.flavio.collections.list.sort;

import java.util.Comparator;

//Usaremos a interface comparable, pois recebe o "generics" <> e assim ele pode alterar o tipo do objeto
public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());//a idade é do tipo "int", devemos usar um "WRAPPER", o INTEGER
        // pois, ele possui métodos de comparação
    }
}

//Foi necessário inserirmos  um classe fora do scopo para adicionarmos o comparator,
// isso porque o comparable já foi implementado na classe acima
    class ComparatorPorAltura implements Comparator<Pessoa>{

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }




