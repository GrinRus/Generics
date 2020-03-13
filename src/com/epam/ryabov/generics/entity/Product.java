package com.epam.ryabov.generics.entity;

public abstract class Product<T extends Product<T>> implements Comparable<T> {

    private int price;
    private String name;

    public Product() {
    }

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(T o) {
        System.out.println(subCompare(o));
        return Integer.compare(this.price, o.getPrice());
    }

    abstract boolean subCompare(T p);
}
