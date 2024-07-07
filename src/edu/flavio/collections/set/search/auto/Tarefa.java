package edu.flavio.collections.set.search.auto;

public class Tarefa {
    private String nomeTarefa;
    private boolean concluida;

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.concluida = false; // como não é obrigatório para a instanciação, mudar para "false"
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "nomeTarefa='" + nomeTarefa + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
