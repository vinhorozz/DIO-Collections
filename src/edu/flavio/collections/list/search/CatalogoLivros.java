package edu.flavio.collections.list.search;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }


    public void adicionarLivro(String titulo, String autor, int paginas, float valor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, paginas, valor, anoPublicacao));
    }
    //PesquisaPorAutor
    public List<Livro> pesquisaPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //pesquisarPorLivro
    public List<Livro> pequisarPorIntervaloAno(int anoInicial, int anoFinal) {

    List<Livro> livrosPorAnoPublicacao=new ArrayList<>();
    if(!livrosList.isEmpty()){
        for (Livro l: livrosList){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                livrosPorAnoPublicacao.add(l);
            }
        }
    }
return livrosPorAnoPublicacao;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


 public void listaDeLivros(){
     System.out.println(livrosList);
 }

 public void TotalDeLivros(){
     System.out.println( "O total de livros é "+ livrosList.size());
 }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros= new CatalogoLivros();

        System.out.println("-----------LIVRARIA-------------------");
        catalogoLivros.TotalDeLivros();

    catalogoLivros.adicionarLivro("A casa na colina","Albert Colins",128, 20, 2000);
    catalogoLivros.adicionarLivro("O mistério do lago", "Sandra Alves", 256, 35, 2015);
    catalogoLivros.adicionarLivro("A jornada secreta", "Carlos Martins", 312, 28, 2018);
    catalogoLivros.adicionarLivro("Noite sem fim", "Luciana Ribeiro", 198, 22, 2020);
    catalogoLivros.adicionarLivro("Os segredos da floresta", "Fernando Gomes", 344, 30, 2012);
    catalogoLivros.adicionarLivro("Aventura nas montanhas", "Patrícia Lima", 275, 27, 2016);
    catalogoLivros.adicionarLivro("O enigma da caverna", "Rafael Costa", 223, 24, 2019);
    catalogoLivros.adicionarLivro("O guardião do tempo", "Mariana Lopes", 290, 32, 2017);
    catalogoLivros.adicionarLivro("A lenda do vale", "Roberto Silva", 315, 29, 2013);
    catalogoLivros.adicionarLivro("O tesouro perdido", "Ana Paula Souza", 280, 26, 2021);
    catalogoLivros.adicionarLivro("Os fantasmas da noite", "Eduardo Rocha", 240, 23, 2014);
    catalogoLivros.adicionarLivro("Os fantasmas da noite", "Eduardo Rocha", 240, 23, 2014);


    catalogoLivros.TotalDeLivros();
       System.out.println("Livros por autor:");
       System.out.println("|------Titulo------|------autor------|--paginas--|--valor--|--anoPublicacao_|");
       System.out.println( catalogoLivros.pesquisaPorAutor("Eduardo Rocha"));




        System.out.println( "Livros no intervalo de datas: ");
        System.out.println("|------Titulo------|------autor------|--paginas--|--valor--|--anoPublicacao_|");
        System.out.println(catalogoLivros.pequisarPorIntervaloAno(2010,2015));


        System.out.println("Pesquisar por título:");
        System.out.println("|------Titulo------|------autor------|--paginas--|--valor--|--anoPublicacao_|");
        System.out.println(catalogoLivros.pesquisarPorTitulo("os segredos da floresta"));
}
}
