package edu.flavio.collections.list.search.auto;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SomaNumeros {
    List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public int calcularSoma() {
        List<Integer> calcular = new ArrayList<>();
        int soma = 0;
        if (!integerList.isEmpty()) {
            for (Integer i : integerList) {
                soma += i;
            }
        } else {
            throw new RuntimeException("Não foi possível calcular.A lista está vazia");
        }
        return soma;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE; //  não me lembrei
        if (!integerList.isEmpty()) {
            for (Integer i : integerList) {
                if (i <= menorNumero) {
                    menorNumero = i;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("Não foi possível encontrar o menor número. A lista está vazia");
        }
    }


    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!integerList.isEmpty()) {
            for (Integer i : integerList) {
                if (i >= maiorNumero) {
                    maiorNumero = i;
                }
            }
                    return maiorNumero;
        } else {
            throw new RuntimeException("Não foi possível encontrar o menor número. A lista está vazia");
        }
    }

        public void exibirNumeros(){
            System.out.println(integerList);
        }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        System.out.println("");
        System.out.println("Adicionando números à lista");
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(13);
        numeros.adicionarNumero(15);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(102);
        System.out.println("");
        System.out.println("Somando os números da lista");

        System.out.println(numeros.calcularSoma());
        System.out.println("");
        System.out.println("Lista dos números");
        numeros.exibirNumeros();

        System.out.println("");
        System.out.println("Exibir o menor dos números");
        System.out.println(numeros.encontrarMenorNumero());
        System.out.println("");
        System.out.println("Exibir o maior dos números");
        System.out.println(numeros.encontrarMaiorNumero());
    }
}