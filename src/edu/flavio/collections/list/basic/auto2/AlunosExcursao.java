package edu.flavio.collections.list.basic.auto2;

import java.util.ArrayList;
import java.util.List;

public class AlunosExcursao {

    private List<Aluno>confirmados;

    public AlunosExcursao() {
        this.confirmados = new ArrayList<>();
    }

    public void adicionarConfirmado(String nomealuno, int idade, boolean confirmado ){
        confirmados.add(new Aluno(nomealuno,idade,confirmado));

    }
    public void removerAlunosNaoAutorizados(boolean confirmado){
        List<Aluno>alunosNaoAutorizados=new ArrayList<>();
        for (Aluno a: confirmados){
            if(!a.isAutorizado()){
                alunosNaoAutorizados.add(a);
            }
        }
        confirmados.removeAll(alunosNaoAutorizados);
    }
    public void removerAlunosMenores12(int idade){
        List<Aluno>alunosMenores12=new ArrayList<>();
        for(Aluno a: confirmados){
            if(a.getIdadeAluno()<=idade){
                alunosMenores12.add(a);
            }
        }
        confirmados.removeAll(alunosMenores12);
    }


    private void TotalAlunosConfirmados(){
        System.out.println("O total de alunos confirmados para excursão é "+confirmados.size());

    }
    public void ListaCompleta(){
        System.out.println("Alunos  Confirmados");
        System.out.println(confirmados);
    }

    public static void main(String[] args) {
        AlunosExcursao listaConfirmados= new AlunosExcursao();

        listaConfirmados.TotalAlunosConfirmados();
        listaConfirmados.ListaCompleta();


        listaConfirmados.adicionarConfirmado("Felipe",12,true);
        listaConfirmados.TotalAlunosConfirmados();
        //listaConfirmados.ListaCompleta();

        listaConfirmados.adicionarConfirmado("Aline",10,false);
        listaConfirmados.TotalAlunosConfirmados();
        //listaConfirmados.ListaCompleta();

        listaConfirmados.adicionarConfirmado("João",14,true);
        listaConfirmados.TotalAlunosConfirmados();
        //listaConfirmados.ListaCompleta();

        listaConfirmados.adicionarConfirmado("Manuela",14,true);
        listaConfirmados.TotalAlunosConfirmados();
        //listaConfirmados.ListaCompleta();

        listaConfirmados.adicionarConfirmado("Pedro",9,true);
        listaConfirmados.TotalAlunosConfirmados();
        System.out.println("nomeAluno, idadeAluno,  autorizado ");
        listaConfirmados.ListaCompleta();


        listaConfirmados.removerAlunosNaoAutorizados(false);
        listaConfirmados.TotalAlunosConfirmados();

        System.out.println("nomeAluno, idadeAluno,  autorizado ");
        listaConfirmados.ListaCompleta();

        listaConfirmados.removerAlunosMenores12(9);
        System.out.println("nomeAluno, idadeAluno,  autorizado ");
        listaConfirmados.ListaCompleta();
        listaConfirmados.TotalAlunosConfirmados();
    }

}
