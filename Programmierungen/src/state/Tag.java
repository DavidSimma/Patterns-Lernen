package state;

import java.util.Scanner;

public class Tag extends Daten{
    private Scanner reader = new Scanner(System.in);
    private int tag;
    public Tag(){
        System.out.println("Tag eingeben: ");
        tag = reader.nextInt();
        tagEingabe(tag);
    }
    @Override
    public void tagEingabe(int tag) {
        if(tag > 0){
            System.out.println("Tag: " + tag);
            super.ende();
        }
        jahrFalsch();
    }

    @Override
    public void tagFalsch() {
        System.out.println("Falsches Tag!");
        this.f.daten = new Tag();
    }
}
