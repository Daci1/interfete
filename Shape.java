package com.company;

// interfata e un contract cu o clasa
// poti avea metoda fara implementare
// poti avea metode cu implementare dar sa fie statice
// nu este instantiabila
public interface Shape {
    public String getName();

    public static String message(){
        return "This is a shape";
    }
}
