package org.java.animals;

import org.java.animals.Interfaces.IVolante;

public class Aquila extends Animale implements IVolante {

    @Override
    public void verso() {
        System.out.println(" *Stridìo* ");
    }

    @Override
    public void mangia() {
        System.out.println(" Carne, in genere Lepri, Marmotte, Conigli selvatici, Faine ecc..");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }
}
