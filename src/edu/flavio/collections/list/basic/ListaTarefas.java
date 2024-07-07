package edu.flavio.collections.list.basic;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
//CRIAR UM OBJETO "LIST"
    private List<Tarefa> tarefaList;//sempre que criar um objeto lista de tarefas o constrututor deve instânciar um arraylist vazio
                                    // isso é necessário para manipular as lista de tarefas;

// CRIAR UM MÉTODO CONSTRUSTOR
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();//criar uma nova instância na "arraylista" chamada "ListTarefa",
        // sendo que terafaLista passa a ter acesso à todds os métodos contidos no pacote
    }
    //a partir desse ponto, devemos criar os métodos que realizarão as operações desejadas: adicionar, remover, atualizar,
    public void adicionarTarefa(String descricao) {//visibilidade e nome do método, que tem como parâmetos o tipo e nome de um nova variável
        tarefaList.add(new Tarefa(descricao)); //utilizando a instância criada no construtor, acima, selecionamos o método "add"
        //e dentro dos parênteses, instânciamos a classe (do mesmo pacote) Tarefa e passamos com argumento a variável criada acima!
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // Como a "List" pode conter valores repetidos, vamos criar um nova instância para iterar e comparar antes de remover;
        for (Tarefa t : tarefaList) {// "t" representa um item dentro da lista
            if (t.getDescricao().equalsIgnoreCase(descricao)) { // Compara a descrição da tarefa com a string fornecida (ignora maiúsculas/minúsculas)
                tarefasParaRemover.add(t); // Adiciona a tarefa à lista, para posrterior remoção
            }
        }
        tarefaList.removeAll(tarefasParaRemover);//com base na lista preenchida préviamente, chamando o método "removeAll" de tarefaList
    }
    public int obterTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);//ao solicitar a impressão de "tarefaList" o endereço de memória será impresso,
        //Para que seja visualizadoa a lista com a descrição é preciso usarmos o método "toString()" na Classe originária.
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas=new ListaTarefas();

        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterTotalTarefas());



        listaTarefas.obterDescricoesTarefas();
    }
}

