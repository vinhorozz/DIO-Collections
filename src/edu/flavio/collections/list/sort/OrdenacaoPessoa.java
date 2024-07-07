package edu.flavio.collections.list.sort;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa>pessoaList;


    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
                pessoaList.add(new Pessoa(nome,idade,altura));
    }

    // usar o Comparable: que muda a classe que manipulará o tipo do objeto
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa>pessoasPorIdade=new ArrayList<>(pessoaList); //criamos uma lista para ordenar que recebe de outra lista os valores para ordenação
        Collections.sort(pessoasPorIdade);/*Exatamente, aqui, será feita a ação de organizar do método "Colletions", usando a interface "Comparable"
                                            implementada na classe "Pessoa*/
        return pessoasPorIdade;
    }


    public List ordenarPorAltura(){
        List<Pessoa>pessoasPorAltura=new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa=new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("João",20,1.65);
        ordenacaoPessoa.adicionarPessoa("Marcela",23,1.60);
        ordenacaoPessoa.adicionarPessoa("Maicon",35,1.77);
        ordenacaoPessoa.adicionarPessoa("Maria",34,1.59);
        System.out.println("");
        System.out.println("Lista Pessoas");
        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println("");
        System.out.println("Por Idade crescente");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("");
        System.out.println("Por Altura crescente");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println("");
        System.out.println("Lista Pessoas");
        System.out.println(ordenacaoPessoa.pessoaList);
    }
}
