package observerScheiße;

public class Luftfeucht extends Messdaten{
    public String getEig(){
        return "Luftfeuchtigkeit";
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
