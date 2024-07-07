package edu.flavio.collections.list.sort.auto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
        List<Integer>integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumeoros(int numero){
        integerList.add(numero);
    }

    public List<Integer> OrdenarAscendente(){
        List<Integer>OrdemAscendente=new ArrayList<>(integerList);
            if(!integerList.isEmpty()){
                Collections.sort(OrdemAscendente);
            }else{
                throw new RuntimeException("Lista Vazio");
            }
        return OrdemAscendente;
    }

    public List<Integer> OrderTesting(){
        List<Integer>ordemDesc=new ArrayList<>(OrdenarAscendente());
        ordemDesc.sort(Collections.reverseOrder());
        ordemDesc.sort(Comparator.reverseOrder());
        return ordemDesc;
    }






    public List<Integer> OrdenarDescendente(){
        List<Integer>OrdemDescendente=new ArrayList<>(integerList);
        if(!integerList.isEmpty()){
            OrdemDescendente.sort(Collections.reverseOrder());
        }else {
            throw new RuntimeException("A lista está vazia");
        }
        return OrdemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros lista= new OrdenacaoNumeros();

        System.out.println("");
        System.out.println("Adicionando números");
        lista.adicionarNumeoros(12);
        lista.adicionarNumeoros(15);
        lista.adicionarNumeoros(12);
        lista.adicionarNumeoros(13);
        lista.adicionarNumeoros(11);
        lista.adicionarNumeoros(22);
        lista.adicionarNumeoros(11);
        lista.adicionarNumeoros(145);
        lista.adicionarNumeoros(113);
        lista.adicionarNumeoros(11);
        System.out.println("");
        System.out.println("Ordenação Ascendente");
        System.out.println(lista.OrdenarAscendente());

        System.out.println("");
        System.out.println("Ordenação Descendente");
        System.out.println(lista.OrdenarDescendente());

        System.out.println("");
        System.out.println("Ordenação Descendente teste");
        System.out.println(lista.OrderTesting());


    }
}
