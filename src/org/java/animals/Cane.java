package org.java.animals;

public class Cane extends Animale {

    @Override
    public void verso() {
        System.out.println("WOOF!");
    }

    @Override
    public void mangia() {
        System.out.println("Carne, pesce, crocchette, pasta, ecc.. ");
    }

}
