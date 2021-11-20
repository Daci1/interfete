package com.company;

// e o combinatie intre clasa si interfata
// poate sa aibe metode cu sau fara implementare
// poate sa aibe atribute
// nu este instantiabila
public abstract class DShapes implements Shape{ // clasa asociata figurilor 3D

    protected String name = "DShape";

    @Override
    public  String getName(){
        return this.name;
    }

    public abstract Double getVolume();

}
