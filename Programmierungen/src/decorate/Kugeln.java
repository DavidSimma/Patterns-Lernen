package decorate;

public class Kugeln implements ChristbaumIF{
    ChristbaumIF basis;
    public Kugeln(ChristbaumIF cb){ this.basis = cb;}

    @Override
    public String getBezeichnung() {
        return basis.getBezeichnung() + " mit Kugeln";
    }

    @Override
    public double getPreis() {
        return basis.getPreis() + 5;
    }
}
