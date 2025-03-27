package org.java.animals;

import org.java.animals.Interfaces.ICamminante;

public class Cane extends Animale implements ICamminante{

    @Override
    public void verso() {

        System.out.println("WOOF!");
    }

    @Override
    public void mangia() {
        System.out.println("Carne, pesce, crocchette, pasta, ecc.. ");
    }

    @Override
    public void Cammina() {
        System.out.println("Sto camminando!");
    }

}
