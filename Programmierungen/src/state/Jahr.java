package state;

import java.util.Scanner;

public class Jahr extends Daten{
    private Scanner reader = new Scanner(System.in);
    private int jahr;
    public Jahr(){
        System.out.println("Jahr eingeben: ");
        jahr = reader.nextInt();
        jahrEingabe(jahr);
    }
    @Override
    public void jahrEingabe(int jahr) {
        if(jahr > 2000){
            System.out.println("Jahr: " + jahr);
            this.f.daten = new Monat();
        }
        jahrFalsch();
    }

    @Override
    public void jahrFalsch() {
        System.out.println("Falsches Jahr!");
        this.f.daten = new Jahr();
    }
}
