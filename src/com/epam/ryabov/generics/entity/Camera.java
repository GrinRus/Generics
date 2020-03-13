package com.epam.ryabov.generics.entity;

public class Camera extends Product<Camera> {

    private int pixel;

    public Camera() {
    }

    public Camera(int price, String name, int pixel) {
        super(price, name);
        this.pixel = pixel;
    }

    @Override
    boolean subCompare(Camera p) {
        return this.pixel > p.pixel;
    }
}
