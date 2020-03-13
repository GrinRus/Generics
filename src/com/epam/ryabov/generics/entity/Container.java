package com.epam.ryabov.generics.entity;

public class Container <T extends Product> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
