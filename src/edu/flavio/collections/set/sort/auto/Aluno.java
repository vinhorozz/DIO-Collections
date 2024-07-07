package edu.flavio.collections.set.sort.auto;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public int compareTo(Aluno a) { // Vai comparar um objeto "ALUNO" definido com "a"
        return this.nome.compareTo(a.nome); // A comparação será definida entre o "a" e o atributo "nome" dessa classe
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(),a2.getMedia());
    }
}
