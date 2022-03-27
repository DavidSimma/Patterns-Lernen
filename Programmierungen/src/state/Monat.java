package state;

import java.util.Scanner;

public class Monat extends Daten{
    private Scanner reader = new Scanner(System.in);
    private int monat;
    public Monat(){
        System.out.println("Monat eingeben: ");
        monat = reader.nextInt();
        monatEingabe(monat);
    }
    @Override
    public void monatEingabe(int monat) {
        if(monat > 0){
            System.out.println("Monat: " + monat);
            this.f.daten = new Tag();
        }
        monatFalsch();
    }

    @Override
    public void monatFalsch() {
        System.out.println("Falsches Monat!");
        this.f.daten = new Monat();
    }
}
