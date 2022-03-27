package state;

public class Fahrzeug {
    Daten daten;
    public Fahrzeug(){
    }

    public void start(){
        this.daten = new Jahr();
    }

}
