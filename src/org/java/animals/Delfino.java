package org.java.animals;

import org.java.animals.Interfaces.INuotante;

public class Delfino extends Animale implements INuotante {

    @Override
    public void verso() {
        System.out.println(" *Frigge* ");
    }

    @Override
    public void mangia() {
        System.out.println("pesci di taglia medio/piccola ");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!");
    }

}
