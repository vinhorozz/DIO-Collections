package edu.flavio.collections.list.basic.auto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras2 {
    List<Item2> itemList2;

    public CarrinhoDeCompras2() {
        this.itemList2 = new ArrayList<>();
    }

    public void adicionarItem(String nome,double preco,int quantidade){
        itemList2.add(new Item2(nome,preco,quantidade));
    }


    public void removerItem (String nome) {
        List<Item2> itensParaRemover2 = new ArrayList<>();
        for (Item2 i : itemList2) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover2.add(i);
            }
        }
        itemList2.removeAll(itensParaRemover2);
    }

//NÃO LEMBREI COMO FINALIZAR COM O LIST
    public double calcularValorTotal (){
     double valorTotal=0d;
            if(!itemList2.isEmpty()){
                for(Item2 i: itemList2){
                    valorTotal+=i.getPreco()*i.getQuantidade();
                }
            }
        return valorTotal;
    }

    public void exibirItem (){
        System.out.println(itemList2);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras2 cart= new CarrinhoDeCompras2();

        System.out.println("");
        System.out.println("Itens adicionados ao carrinho");
        cart.adicionarItem("arroz",32,2);
        cart.adicionarItem("feijão",8.56,2);
        cart.adicionarItem("batata",8.90,2);
        cart.adicionarItem("sabonete",3.5,15);
        cart.adicionarItem("granola",25,1);

        System.out.println("");
        System.out.println("Exibir itens");
        cart.exibirItem();
        System.out.println("");
        System.out.println("Valor Total");
        System.out.println(cart.calcularValorTotal());;
        System.out.println("");
        String produto ="sabonete";
        System.out.println("Remover Item "+produto);
        cart.removerItem(produto);
        System.out.println("");
        System.out.println("Exibir itens");
        cart.exibirItem();
        System.out.println("");
        System.out.println("Valor Total");
        System.out.println(cart.calcularValorTotal());;
        System.out.println("");



    }
}
