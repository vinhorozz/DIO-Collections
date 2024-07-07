package edu.flavio.collections.map.sort;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate,Evento>eventosMap;

    //construtores
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    //manipuladores
  public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento=new Evento(nome,atracao);// primeiro: adicionamos um "nome" e "atração" à um "evento"
        //eventosMap.put(data,evento);//segundo: adicionamos o "evento"(criado acima) e "data" à variável "eventosMap"
      //ou, se preferir tudo na mesma linha
        eventosMap.put(data,new Evento(nome,atracao));

  }
    //exibirAgenda()
    public void exibirAgenda(){
        Map<LocalDate,Evento>eventosTreeMap=new TreeMap<>(eventosMap);//a ordenação será automática
    //pois o "LocalDate" implementa daChronoLocalDAte, que extende um "Comparable" e o Tree consegue ordenar
                System.out.println(eventosTreeMap);

    }

    //obterProximoEvento()
    public void  obterProximoEvento(){

    LocalDate dataAtual= LocalDate.now();
    Map<LocalDate,Evento>eventosTreeMap=new TreeMap<>(eventosMap);
   for(Map.Entry<LocalDate,Evento>entry:eventosTreeMap.entrySet()){ //O método "entrySet" retornará
       // uma lista de elementos únicos relacionados por chave e valor (Map.Entry)!
        if(entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){
            System.out.println("O próximo evento: "+entry.getValue()+" acontecerá em "+ entry.getKey());

        }
     }



    }


    public static void main(String[] args) {
        AgendaEventos agenda= new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2024,7,9),"Evento 1","atração 1");
        agenda.adicionarEvento(LocalDate.of(2024,5,15),"Evento 2","atração 2");
        agenda.adicionarEvento(LocalDate.of(2024,10,23),"Evento 3","atração 3");agenda.adicionarEvento(LocalDate.of(2024,7,9),"Evento 1","atração 1");
        agenda.adicionarEvento(LocalDate.of(2024,8,31),"Evento 4","atração 4");agenda.adicionarEvento(LocalDate.of(2024,7,9),"Evento 1","atração 1");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JUNE,17),"Evento 5","atração 5");agenda.adicionarEvento(LocalDate.of(2024,7,9),"Evento 1","atração 1");
        System.out.println("");
        System.out.println("Exibindo agenda");
        agenda.exibirAgenda();
        System.out.println("");
        System.out.println("Exibindo próximo evento");
        agenda.obterProximoEvento();

    }


}
