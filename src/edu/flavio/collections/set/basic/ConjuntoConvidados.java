package edu.flavio.collections.set.basic;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado>convidadoSet;

    //métodos
    //construtores
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    //manipulação
    //adicionarConvidado()
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    //removerConvidadoPorCodigoConvite()
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover=null;
        for (Convidado c: convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
      convidadoSet.remove(convidadoParaRemover);
}

    //contarConvidados()
    public int contarConvidados(){
       return convidadoSet.size();
    }
    //exibirConvidados()

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados=new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Flávio",123);
        conjuntoConvidados.adicionarConvidado("Otávio",124);
        conjuntoConvidados.adicionarConvidado("Márcio",126);
        conjuntoConvidados.adicionarConvidado("Filadelfo",128);
        conjuntoConvidados.adicionarConvidado("André",128);

        System.out.println("Lista de convidados");
        conjuntoConvidados.exibirConvidados();//método sem retorno (void=Procedure)(já tem "Sout" incluído)
        System.out.println("");
        System.out.println("Total de convidados: ");
        System.out.println(conjuntoConvidados.contarConvidados());//método com retorno (tipado = function) (deve ser inserido em um "Sout")


        System.out.println("Remoção do duplicado");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(126);//procedure
        System.out.println("Lista de convidados");
        conjuntoConvidados.exibirConvidados();//método sem retorno (void=Procedure)(já tem "Sout" incluído)
        System.out.println("");
        System.out.println("Total de convidados: ");
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
