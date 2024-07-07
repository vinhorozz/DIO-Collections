package edu.flavio.collections.set.basic;

import java.util.Objects;
import java.util.Set;

public class Convidado {
    //atributos
    private String nome;
    private int codigoConvite;

    //construtores

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    // manipuladores
    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }
/*Para utilizarmos a funcionalidade de comparação na lista criada na Classe "ConjutoConvidados",
 faremos a "subscrição" dos métodos "equals() e HashCode()"*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
