package edu.flavio.collections.map.basic;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Long>agendaContatoMap;
//métodos

    //construtores

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //manipuladores ou ações

//    adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
public void adicionarContato(String nome, long telefone){
        agendaContatoMap.put(nome,telefone);
}
//    removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
}
//    exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
public void exibirContatos(){
    System.out.println( "Agenda:" + agendaContatoMap);
}
//    pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
public Long pesquisarPorNome(String nome){
        Long numeroPorNome=null;
       if(!agendaContatoMap.isEmpty()){
      numeroPorNome=agendaContatoMap.get(nome);
       }
return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda=new AgendaContatos();

        agenda.adicionarContato("Milton",1199997777);
        agenda.adicionarContato("Milton",0);
        agenda.adicionarContato("Milton",1199997777);
        agenda.adicionarContato("Ana",1297756600);
        agenda.adicionarContato("Cirílo",1197979797);
        agenda.adicionarContato("Debora",1198887777);
        agenda.adicionarContato("Deborah",1198887777);
        System.out.println("");
        System.out.println("AGENDA");
        agenda.exibirContatos();
        System.out.println("Utilizando a interface 'MAP' a inclusão é feita através do método 'Put', esse método (diferentemente, do 'Add' usado nas interfaces do Collection) atualiza o valor da chave, sempre adicionando o último");

        System.out.println("Remover contato Debora");
        agenda.removerContato("Debora");
        agenda.exibirContatos();
        System.out.println("");
        String pesquisado="Cirílo";
        System.out.println("O número de "+pesquisado +" é: "+agenda.pesquisarPorNome(pesquisado));



    }
}
