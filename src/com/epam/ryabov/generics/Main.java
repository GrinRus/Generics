package com.epam.ryabov.generics;

import com.epam.ryabov.generics.entity.Camera;
import com.epam.ryabov.generics.entity.Container;
import com.epam.ryabov.generics.entity.Phone;
import com.epam.ryabov.generics.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        System.out.println(container.getItem());
        container.setItem(new Camera());
        System.out.println(container.getItem());
        container.setItem(new Phone());
        System.out.println(container.getItem());
        List list = new ArrayList();
        list.add(new Camera());
        System.out.println(find(list, new Camera()));
        System.out.println(find(list, new Phone()));

        System.out.println(new Camera(100, "",100).compareTo(new Camera(1000, "", 10)));
    }

    static boolean find(List<? extends Product> all, Product p){
        return all.stream().anyMatch(i -> i.getClass().equals(p.getClass()));
    }

    static void copy(List<? extends Product> scr, List<? super Product> dest){
        scr.forEach(dest::add);
    }
}
