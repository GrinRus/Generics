package com.epam.ryabov.generics.entity;

public class Phone extends Product<Phone> {

    private String model;

    @Override
    boolean subCompare(Phone p) {
        return this.model.equals(p.model);
    }
}
