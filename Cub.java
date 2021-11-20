package com.company;

public class Cub extends DShapes{

    private double lungime;

    public Cub(double lungime){
        this.lungime = lungime;
        this.name = "Cub";
    }

    @Override
    public String getName() {
        return "Cub";
    }

    @Override
    public Double getVolume() {
        return lungime*lungime*lungime;
    }
}
