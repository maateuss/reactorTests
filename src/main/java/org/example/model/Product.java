package org.example.model;

public class Product {
    private Integer id;

    public Product(Integer id) {
        this.id = id;Ma
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Novo item no carrinho id: %d", id);
    }

}
