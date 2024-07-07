package edu.flavio.collections.list.basic;

public class Tarefa {//criar a classe para que possamos manipular

    public String descricao; //criar a variável para receber valores na classe

    public Tarefa(String descricao) {//criar método construtor, que indica qual das variáveis da classe receberá os valores
        this.descricao = descricao;
    }

    public String getDescricao() {//criar métodos manipulador getter para que as alterações realizadas na classe "ListaTerefas sejam capturadas
        return descricao;
    }
// Realizamos, abaixo, a inserção do método "toString()" para que ele corrija a impressão da classe de "Tarefa",
//pois, ao ser solicitada, normalmente seria apresentadp o endereço de armazenamento da classe na memória;
    @Override
    public String toString() {
        return "Tarefa{" +// O método evidenciará, na impressão, o nome da Classe...
                "descricao='" + descricao + '\'' +  // seguido, de cada item da lista,
                '}';

        //** é possével manipular se for visualmente interessante*
    }
}
