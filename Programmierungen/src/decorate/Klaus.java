package decorate;

public class Klaus implements WeihnachtmannIF{
    @Override
    public ChristbaumIF Christbaum() {
        ChristbaumIF cb = new Baum();
        cb = new Kugeln(cb);
        cb = new Stern(cb);
        return cb;
    }
}
