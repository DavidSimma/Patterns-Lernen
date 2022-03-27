package decorate;

public class Baum implements ChristbaumIF{
    @Override
    public String getBezeichnung() {
        return "Tannenbaum";
    }

    @Override
    public double getPreis() {
        return 50;
    }
}
