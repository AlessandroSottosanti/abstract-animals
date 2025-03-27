package org.java.animals;

import org.java.animals.Interfaces.ICamminante;
import org.java.animals.Interfaces.INuotante;
import org.java.animals.Interfaces.IVolante;

public class App {
    public static void main(String[] args) throws Exception {

        // Cane
        Cane nuovoCane = new Cane();

        System.out.println();
    
        System.out.println("Il Cane");
        System.out.println("Dorme:");
        nuovoCane.dormi();

        System.out.println("fa il verso:");
        nuovoCane.verso();

        System.out.println("Mangia:");
        nuovoCane.mangia();

        System.out.println();


        // Passerotto
        Passerotto nuovoPasserotto = new Passerotto();

        System.out.println("Il Passerotto");
        System.out.println("Dorme:");
        nuovoPasserotto.dormi();

        System.out.println("fa il verso:");
        nuovoPasserotto.verso();

        System.out.println("Mangia: ");
        nuovoPasserotto.mangia();

        System.out.println();


        // Aquila
        Aquila nuovaAquila = new Aquila();

        System.out.println("L'Aquila");
        System.out.println("Dorme:");
        nuovaAquila.dormi();

        System.out.println("fa il verso:");
        nuovaAquila.verso();

        System.out.println("Mangia:");
        nuovaAquila.mangia();

        System.out.println();

        // Delfino
        Delfino nuovoDelfino = new Delfino();

        System.out.println("Il Delfino");
        System.out.println("Dorme:");
        nuovoDelfino.dormi();

        System.out.println("fa il verso:");
        nuovoDelfino.verso();

        System.out.println("Mangia:");
        nuovoDelfino.mangia();

        System.out.println();

        

        System.out.println("\n=== TEST METODI SPECIFICI ===");
        faiVolare(nuovoPasserotto);
        faiVolare(nuovaAquila);
        faiNuotare(nuovoDelfino);
        faiCamminare(nuovoCane);
    }

    public static void faiVolare(IVolante animaleVolante) {
        animaleVolante.vola();
    }

    public static void faiNuotare(INuotante animaleNuotante) {
        animaleNuotante.nuota();
    }

    public static void faiCamminare(ICamminante animalCamminante) {
        animalCamminante.Cammina();
    }
}
