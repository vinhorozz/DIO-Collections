package edu.flavio.collections.map.sort.auto;

import java.util.Comparator;
import java.util.Map;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;


    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }

}

class ComparatorPorPreco implements Comparator<Map.Entry<String,Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        //o retono deve ter um "Wrapper" de acordo como os valores a serem comparado.
        //adicione ".compare()" e inclua as variáveis "1 e 2" que representam os itens de comparação
        //adicione ".getValue()" para ter acesso às informações da classe que é o "valor" no MAP.Entry
        //utilize os métodos da classe para comparar
        return Double.compare(l1.getValue().getPreco(),l2.getValue().getPreco());
    }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {

        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());

    }
}