package org.java.animals;

import org.java.animals.Interfaces.IVolante;

public class Passerotto extends Animale implements IVolante{

    @Override
    public void verso() {
        System.out.println("Pio Pio!");
    }

    @Override
    public void mangia() {
        System.out.println("semini, molliche, vermi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

}
