package edu.flavio.collections.list.basic.auto;

public class Item {
    public String produto;

    public Item(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return produto ;
    }
}