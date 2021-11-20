package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Cerc());
        shapes.add(new Cerc());
        shapes.add(new Patrat());


        for(Shape s : shapes){
            System.out.println(s.getName());
        }

        Shape forma = new Cerc();
        System.out.println(forma.getName());


        //cast de la superclasa(interfata) la subclasa
        Cerc cerc = (Cerc) forma;

        System.out.println(cerc.getRadius());
        System.out.println(Shape.message());

        //clase abstracte
        DShapes Cub = new Cub(3);
        System.out.println(Cub.getVolume());
        System.out.println(Cub.getName());
    }
}
