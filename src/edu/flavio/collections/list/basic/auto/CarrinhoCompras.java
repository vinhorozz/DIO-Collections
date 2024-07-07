package edu.flavio.collections.list.basic.auto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    //DECLARAR ATRIBUTOS DA CLASSE
    //Atributo e tipo;
    //Atributo do tipo LIST<*>;
    // o "*" é referente à outra classe do pacote;
    private List<Item>itensList;

//CRIAR UM MÉTODO CONSTRUSTOR (Para atribuir valor ao atributo)
    //Se for atributo normal: não alterar;
    // Se para collections: limpar o argumento e atribuir um array vazio
    public CarrinhoCompras(){
        this.itensList = new ArrayList<>();
    }
//CRIAR MÉTODOS DE AÇÃO (métodos void para criar, alterar, deletar)
//para manipular as variáveis advindas da classe principal
    //adicionarItem (com parâmetro)
    public void adicionarItem(String produto){
        itensList.add(new Item(produto));
    }

    //removerItens(com parâmetro)
    public void removerItens(String produto){
    //criar outra LIST para guardar os itens da romoção
        List <Item> itensParaRemover= new ArrayList<>();
        for (Item i: itensList){
            if (i.getProduto().equalsIgnoreCase(produto)){
                itensParaRemover.add(i);
            }
        }
        itensList.removeAll(itensParaRemover);
    }
    //totalItens(sem parâmetro)
    public void totalItens(){
        System.out.println("Total de produtos "+ itensList.size());
    }
    //imprimirItens(sem parâmetro)
    public void imprimirItens(){
        System.out.println(itensList);
    }

//CRIAR toString (se for a classe principal);
public static void main(String[] args) {
    CarrinhoCompras cart=new CarrinhoCompras();
    cart.totalItens();
    cart.adicionarItem("Arroz");
    cart.imprimirItens();
    cart.totalItens();
    cart.adicionarItem("feião");
    cart.imprimirItens();
    cart.totalItens();
    cart.adicionarItem("feijão");
    cart.imprimirItens();
    cart.totalItens();
    cart.removerItens("feião");
    cart.imprimirItens();
    cart.totalItens();
}

}
