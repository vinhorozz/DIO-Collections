package edu.flavio.collections.map.sort.auto;

import java.util.*;

public class LivrariaOnline {
Map<String,Livro>livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }
    public void adicionarLivro(String string, Livro livro){//Argumentos para o método derivama da necessidade de
        // preencher o atributo "livros" que é composto uma uma chave "String" e um valor "Livro"
        livros.put(string,livro);
    }

    public void removerLivro (String titulo) {//argumento será o dado que quero analisar
        if (!livros.isEmpty()) {
            List<String> chavePraRemocao = new ArrayList<>(); //criar um "List" com o tipo do dado que quer analisar
            //adicionar um conjunto vazio, que será preenchido no próximo passo

            for (Map.Entry<String, Livro> entry : livros.entrySet()) {//iteração em MAP adicionando informações na variável "entry"
                //as variável "entry" é do tipo "MAP.ENTRY<>" capaz de iterar sobre os valores do objeto a frente dos ":"
                //o Método .entrySet() é capaz de pagar cada acessar o Map. e visualizar as entradas K,V., premitindo e sejam usadas
                // atrav´s dos metodos .getKey() e .getValue(), além de dar acesso aos métodos de manipulação do objeto, contido no "valor"!
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) { //
                    chavePraRemocao.add(entry.getKey());
                }
            }//Agora, que a variável "ChavePraRemover" está com as informações a serem removidas
            for (String chave : chavePraRemocao) {
                livros.remove(chave);
            }
        } else {

            System.out.println("Lista está vazia");
             throw new RuntimeException("Lista está vazia");
        }
    }
 //Daqui pra frente, será necessário adicionar o "comparator" para analisar os dados MAP, além criar
 // "LIST" e "SET" para manipular ses cvalores

    public Map<String,Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String,Livro>>livrosDoMap= new ArrayList<>(livros.entrySet());//livros.entrySet() retorna um
        // conjunto (Set) de todas as entradas (Map.Entry<K, V>) no mapa livros.
        // Esse conjunto é então convertido em uma lista (ArrayList), armazenada na variável livrosParaOrdenarPorPreco

        //livrosDoMap.sort(new ComparatorPorPreco());
        Collections.sort(livrosDoMap, new ComparatorPorPreco());// usado para ordenar a lista livrosParaOrdenarPorPreco.
//new ComparatorPorPreco() é um comparador personalizado que define a lógica de ordenação com base no preço dos livros

        Map<String,Livro>livrosOrdenadosPorPreco=new LinkedHashMap<>();//LinkedHashMap é usado para manter a ordem de
        // inserção dos elementos, garantindo que os livros permaneçam ordenados por preço.
        //LinkMap permite que os elementos sejam iterados na ordem em que foram inseridos.
        // Além disso, o LinkedHashMap também permite chaves ou valores nulos.
        for(Map.Entry<String,Livro> entry:livrosDoMap){ //Cada entrada é adicionada ao LinkedHashMap livrosOrdenadosPorPreco,
            // preservando a ordem de preço.
            livrosOrdenadosPorPreco.put(entry.getKey(),entry.getValue());
        }
                return livrosOrdenadosPorPreco;
    }

    public Map<String,Livro>exibirLivrosOrdenadosPorAutor() {

        List<Map.Entry<String, Livro>> livrosdoMap = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosdoMap,new ComparatorPorAutor());

        Map<String,Livro>livrosOrdenadosPorAutor= new LinkedHashMap<>();

    for (Map.Entry<String,Livro>entry:livrosdoMap){
        livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
    }
        return livrosOrdenadosPorAutor;
}
//-----------------------------------------------------------

    public List<Livro> obterLivroMaisCaro(){
        List<Livro>livroMaisCaro=new ArrayList<>();
        double maiorValor=Double.MIN_VALUE;

        if (!livros.isEmpty()) {
            for (Livro l : livros.values()) {
                if (l.getPreco() > maiorValor) {
                    maiorValor = l.getPreco();
                }
            }
        } else {
            System.out.println("lista vazia");
            throw new NoSuchElementException("A livraria está vazia");
        }
                for (Map.Entry<String, Livro> entry : livros.entrySet()) {
                    if (entry.getValue().getPreco() == maiorValor) {
                        livroMaisCaro.add(livros.get(entry.getKey()));
                    }
                }
        return livroMaisCaro;
    }
//-----------------------------------------*/

 public List<Livro> exibirLivroMaisBarato(){
        List<Livro>livrosMaisBaratos=new ArrayList<>();
        double menorValor=Double.MAX_VALUE;

     if (!livros.isEmpty()) {
         for(Livro l:livros.values()){
             if(l.getPreco()<menorValor){
                 menorValor=l.getPreco();
             }
         }
     }else {
         System.out.println("lista vazia");
         throw new NoSuchElementException("Não foi possivel");
     }
     for(Map.Entry<String,Livro>entry: livros.entrySet()){
         if(entry.getValue().getPreco()==menorValor){
             livrosMaisBaratos.add(livros.get(entry.getKey()));
         }
     }
             return livrosMaisBaratos;
 }
    public void exibirLivros(){
        System.out.println(livros);
    }

    public static void main(String[] args) {
        LivrariaOnline online= new LivrariaOnline();
        System.out.println("");
        System.out.println("Adicionando Livros");
        online.adicionarLivro("sssssfs",new Livro("Título1","zAutor51",145.00));
        online.adicionarLivro("sssdss",new Livro("Título2","cAutor2",145.00));
        online.adicionarLivro("ssdssss",new Livro("Título3","gAutor3",150.00));
        online.adicionarLivro("ssssvgs",new Livro("Título4","vAutor1",245.00));
        online.adicionarLivro("ssszxcz",new Livro("Título1","xAutor1",245.00));
        online.adicionarLivro("ssssssczs",new Livro("Título2","Autor2",15.00));
        System.out.println("");
        System.out.println("Lista Livros");
        online.exibirLivros();

        System.out.println("");
        System.out.println("Remover Titulo2");
        online.removerLivro("Título2");


        System.out.println("");
        System.out.println("Lista Livros");
        online.exibirLivros();


        System.out.println("");
        System.out.println("Orden por preço");
        System.out.println(online.exibirLivrosOrdenadosPorPreco());


        System.out.println("");
        System.out.println("Orden por Autor");
        System.out.println(online.exibirLivrosOrdenadosPorAutor());

        System.out.println("");
        System.out.println("Livro Mais Caro");
        System.out.println(online.obterLivroMaisCaro());


        System.out.println("");
        System.out.println("Livro Mais barato");
        System.out.println(online.exibirLivroMaisBarato());



    }
}
