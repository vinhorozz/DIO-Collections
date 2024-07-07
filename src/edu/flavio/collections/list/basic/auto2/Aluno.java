package edu.flavio.collections.list.basic.auto2;

public class Aluno {

    public String nomeAluno;
    public int idadeAluno;
    public boolean autorizado;

    public Aluno(String nomeAluno, int idadeAluno, boolean autorizado) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.autorizado = autorizado;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    @Override
    public String toString() {
        System.out.println( nomeAluno +", " + idadeAluno +", " + autorizado);
    return ".";
    }
}
