package observer;

public class Prog2 implements Programme{
    Messstation mes = new MessstationAlpha();
    public Prog2(Messstation m){
        mes = m;
        m.addProgramme(this);

    }
    @Override
    public void aktualisieren() {
        System.out.println("Temp: " + mes.getTemperatur() +
                "Windgeschwindigkeit: " + mes.getWindgeschwindigkeit());
    }
}
