package observerScheiße;

public class Temp extends Messdaten{
    public String getEig(){
        return "Temperatur";
    }

    WetterstationEinz w = new WetterstationEinz();

    @Override
    public void setW(WetterstationEinz w) {
        this.w = w;
    }

    @Override
    public void aktualisieren() {
        w.aktualisieren();
    }
}
