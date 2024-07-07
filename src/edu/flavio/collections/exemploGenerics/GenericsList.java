package edu.flavio.collections.exemploGenerics;
import java.util.ArrayList;
import java.util.List;


public class GenericsList {


    public static void main(String[] args) {


        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }
//------------------------------------------------------------------
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto


        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : listaSemGenerics) {
            if (elemento instanceof String) {
                String str = (String) elemento;
                System.out.println(str);
            } else {
                System.out.println("Elemento não é uma String: " + elemento);
            }
        }
    }
}