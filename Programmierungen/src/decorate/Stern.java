package decorate;

public class Stern implements ChristbaumIF{
    ChristbaumIF basis;
    public Stern(ChristbaumIF cb){this.basis = cb;}

    @Override
    public String getBezeichnung() {
        return basis.getBezeichnung() + " mit Stern";
    }

    @Override
    public double getPreis() {
        return basis.getPreis() + 10;
    }
}
