package org.java.animals;
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
        Passerotto nuovaPasserotto = new Passerotto();

        System.out.println("Il Passerotto");
        System.out.println("Dorme:");
        nuovaPasserotto.dormi();

        System.out.println("fa il verso:");
        nuovaPasserotto.verso();

        System.out.println("Mangia: ");
        nuovaPasserotto.mangia();

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
        Delfino nuovDelfino = new Delfino();

        System.out.println("Il Delfino");
        System.out.println("Dorme:");
        nuovDelfino.dormi();

        System.out.println("fa il verso:");
        nuovDelfino.verso();

        System.out.println("Mangia:");
        nuovDelfino.mangia();

        System.out.println();

    }
}
