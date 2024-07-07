package edu.flavio.collections.set.sort;

import java.util.Comparator;
import java.util.Objects;


//para execução do código de ordenação com o Set é preciso implementar o "Comparable" na classe que origina o tipo
public class Produto implements Comparable <Produto>{
    //atributos
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;
    //métodos
//construturos

    public Produto( long cod,String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

//manipuladores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCod());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}
// criar uma nova classe para comparações, Isso porque já foi usado na classe acima o "Comparable"
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {//o método compare retorna um valor inteiro que indica a ordem relativa dos dois produtos,
        return Double.compare(p1.getPreco(), p2.getPreco());// retorno deve ser editado pra retornar um valor
    }
}