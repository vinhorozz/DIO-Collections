package edu.flavio.collections.list.search;

public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private float valor;
    private int anoPublicacao;


    public Livro(String titulo, String autor, int paginas, float valor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.valor = valor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public float getValor() {
        return valor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        System.out.println( titulo +" - "+ autor +" - "+ paginas +" - "+ valor +" - "+ anoPublicacao);

        return "";/*"Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", valor=" + valor +
                ", anoPublicacao=" + anoPublicacao +
                '}';*/
    }
}

