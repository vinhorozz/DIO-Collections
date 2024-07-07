package edu.flavio.collections.set.sort.auto;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
//    adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula,media));
}
//    removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
public void removerAluno(long matricula){
    Aluno alunoParaRemover=null;
            if(!alunoSet.isEmpty()) {
                for (Aluno a : alunoSet) {
                    if (a.getMatricula().equals(matricula)) {
                        System.out.println("Matricula " + matricula + " encontrada");
                        alunoParaRemover = a;
                        break;
                    }
                }
                if (alunoParaRemover != null) {
                    System.out.println(alunoParaRemover);
                    alunoSet.remove(alunoParaRemover);
                } else {
                    System.out.println("Matricula " + matricula + " NÃO encontrada");
                }
            }else{
            System.out.println("A lista está vazia.");
        }

}

    public void removerAlunoComSet(long matricula){
        Set<Aluno> alunoParaRemover=new HashSet<>();
        if(!alunoSet.isEmpty()){
            for(Aluno a:alunoSet){
                if(a.getMatricula() ==matricula){
                    System.out.println("Matricula "+matricula +" encontrada" );
                    alunoParaRemover.add(a);
//   alunoParaRemover.add(new Aluno(a.getNome(), a.getMatricula(),a.getMedia())); ERRADO
                    break;
                }else{
                    System.out.println("O número de matrícula informado não está cadastrado");
                    break;
                }
            }
            System.out.println(alunoParaRemover);
            alunoSet.removeAll(alunoParaRemover);

        }else {
            System.out.println("A lista está vazia.");
        }

    }
//    exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.

public void exibirAlunosPorNome(){
//para ordena por nome é preciso implementa o "Comparable" para que os elementos sejam ordenados
// automaticamente em uma estrutura como TreeSet ou TreeMap.
        Set<Aluno>alunosPorNome=new TreeSet<>(alunoSet);
    if(!alunoSet.isEmpty()){
            System.out.println(alunosPorNome);
    }else{
        System.out.println("A lista está vazia");
    }
}

//    exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
public void exibirAlunosPorNota(){
    // Para ordenar de forma crescente é preciso criar a classe "COMPARATOR"
    // criar um novo objeto do mesmo tipo e instanciar um TreesSet que permite a ordenação!
        Set<Aluno>alunosPorNota=new TreeSet<>(new ComparatorPorNota());

    if(!alunoSet.isEmpty()){
        alunosPorNota.addAll(alunoSet);
        System.out.println(alunosPorNota);
    }else {
        System.out.println("Lista está vazia");
    }
}

    //    exibirAlunos(): Exibe todos os alunos do conjunto.
public void exibirAlunos(){
    System.out.println(alunoSet);
}

    public static void main(String[] args) {
            GerenciadorAlunos gerenciadorAlunos=new GerenciadorAlunos();
//    adicionarAluno()
        System.out.println("");
        System.out.println("Adicionando Aluno");
        gerenciadorAlunos.adicionarAluno("Caio",120L,8);
        gerenciadorAlunos.adicionarAluno("Carlos",121L,1);
        gerenciadorAlunos.adicionarAluno("Caique",122L,4);
        gerenciadorAlunos.adicionarAluno("Carla",123L,8);
        gerenciadorAlunos.adicionarAluno("Cássia",124L,8.10);
        gerenciadorAlunos.adicionarAluno("Célia",125L,9.5);
        gerenciadorAlunos.adicionarAluno("Csaia",125L,10);
        System.out.println("");
        System.out.println("Lista de alunos");
        gerenciadorAlunos.exibirAlunos();


        //    removerAluno()

        System.out.println("");
        long matricula= 125;
        System.out.println("Remover aluno "+ matricula);
        gerenciadorAlunos.removerAluno(matricula);


        System.out.println("");
        System.out.println("Lista de alunos");
        gerenciadorAlunos.exibirAlunos();
//    exibirAlunosPorNome()
        System.out.println("");
        System.out.println("Ordenar por nome");
        gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println("");
//    exibirAlunosPorNota()
        System.out.println("Ordenar por nota");
        gerenciadorAlunos.exibirAlunosPorNota();
//    exibirAlunos()

    }



}
