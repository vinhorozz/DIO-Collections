package edu.flavio.collections.exemploGenerics;
import java.util.HashSet;
import java.util.Set;
public class GenericsSet {
    public static void main(String[] args) {


        // Exemplo com Generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        // Iterando sobre o conjunto com Generics
        for (String elemento : conjuntoGenerics) {
            System.out.println("Elemento: " + elemento);
        }

        //------------------------------------------------------------
        // Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

        // Iterando sobre o conjunto sem Generics (necessário fazer cast)
        for (Object elemento : conjuntoSemGenerics) {

            if (elemento instanceof String) {
                String str = (String) elemento;
                System.out.println("Str: " + str);
            } else {
                System.out.println("Elemento não é uma String: " + elemento);
            }
        }
    }
}