package state;

public abstract class Daten {
    Fahrzeug f = new Fahrzeug();
    public void jahrEingabe(int jahr){
        System.out.println("kein Zugriff möglich!");
    }
    public void jahrFalsch(){
        System.out.println("kein Zugriff möglich!");
    }
    public void monatEingabe(int monat){
        System.out.println("kein Zugriff möglich!");
    }
    public void monatFalsch(){
        System.out.println("kein Zugriff möglich!");
    }
    public void tagEingabe(int tag){
        System.out.println("kein Zugriff möglich!");
    }
    public void tagFalsch(){
        System.out.println("kein Zugriff möglich!");
    }
    public void ende(){
        System.out.println("Fertig");
    }
}
