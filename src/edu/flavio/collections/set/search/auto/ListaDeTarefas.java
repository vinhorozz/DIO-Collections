package edu.flavio.collections.set.search.auto;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {
        Set<Tarefa>tarefasSet;

    public ListaDeTarefas() {
        this.tarefasSet = new HashSet<>();
    }

   public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover= null;//Não posso atribuir o argumento,diretamente,
        //pois, ele é do tipo String, e o item a ser removido é um "generics"
        if (!tarefasSet.isEmpty()){
            for(Tarefa t:tarefasSet) {
                if (t.getNomeTarefa().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            if(tarefaParaRemover==null){
                System.out.println("A tarefa '" + descricao + "' não foi encontrada!");
            }else {
                tarefasSet.remove(tarefaParaRemover);
                System.out.println("Tarefa '" + descricao + "' foi removida!");
            }

        }else{
            System.out.println("A Lista está vazia");
        }

    }

    //----------------------------------------

    //obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
    public Set<Tarefa> obterTarefasConcluidas(){
            Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.isConcluida() == true) {
                    tarefasConcluidas.add(new Tarefa(t.getNomeTarefa()));
                }
            }
        }else{
            System.out.println("A lista está vazia");
            throw new RuntimeException("Não há Valores de tarefas");
        }
        return tarefasConcluidas;
    }

    //obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa>tarefasPendentes=new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa t:tarefasSet){
                if(t.isConcluida()==false){
                    tarefasPendentes.add(new Tarefa(t.getNomeTarefa()));
                }
            }
        }else {
            System.out.println("A lista está vazia");
            throw new RuntimeException("Não há Valores de tarefas");
        }
        return tarefasPendentes;

    }
    //marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.*/
    public void marcarTarefaConcluida(String descricao){

        if (!tarefasSet.isEmpty()){
            for (Tarefa t:tarefasSet){
                if(t.getNomeTarefa().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                }
            }
        }else{
            System.out.println("A lista está vazia");
            throw new RuntimeException("Não há Valores de tarefas");
        }
    }

    //-----------------------------------------------------
    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public void limparListaTarefas(){
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas=new ListaDeTarefas();
        System.out.println("");
        System.out.println("Adicionando tarefas");
        listaDeTarefas.adicionarTarefa("limpar a casa");
        listaDeTarefas.adicionarTarefa("ir ao mercado");
        listaDeTarefas.adicionarTarefa("lavar a louça");
        listaDeTarefas.adicionarTarefa("passear com o cachorro");

        System.out.println("");
        System.out.println("Lista de tarefas");
        listaDeTarefas.exibirTarefas();

        System.out.println("");
        System.out.println("Quantidade de tarefas");
        System.out.println(listaDeTarefas.contarTarefas());

        System.out.println("");
        String remover= "passear com  cachorro";
        System.out.println("Remoção da tarefa '" +remover+"'");
        listaDeTarefas.removerTarefa(remover);

        System.out.println("");
        System.out.println("Quantidade de tarefas");
        System.out.println(listaDeTarefas.contarTarefas());

        System.out.println("");
        System.out.println("Lista de tarefa");
        listaDeTarefas.exibirTarefas();

        System.out.println("");
        System.out.println("Quantidade de tarefas");
        System.out.println(listaDeTarefas.contarTarefas());

        System.out.println("Tarefas concluídas");
        System.out.println(listaDeTarefas.obterTarefasConcluidas());
        System.out.println("");

        System.out.println("Tarefas pendentes");
        System.out.println(listaDeTarefas.obterTarefasPendentes());
        System.out.println("");

        System.out.println("");
        String concluida="limpar casa";
        System.out.println("Marcar conclusão de tarefa '"+ concluida+"'");
        listaDeTarefas.marcarTarefaConcluida(concluida);

        System.out.println("");
        System.out.println("Quantidade de tarefas");
        System.out.println(listaDeTarefas.contarTarefas());

        System.out.println("Tarefas concluídas");
        System.out.println(listaDeTarefas.obterTarefasConcluidas());
        System.out.println("");

        System.out.println("Tarefas pendentes");
        System.out.println(listaDeTarefas.obterTarefasPendentes());
        System.out.println("");

        System.out.println("Remover tudo");
        listaDeTarefas.limparListaTarefas();
        System.out.println("");


        System.out.println("Quantidade de tarefas");
        System.out.println(listaDeTarefas.contarTarefas());
        System.out.println("");

    }
}
