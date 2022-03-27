import strategie.*;
import decorate.*;
import observerScheiße.*;
import observer.*;
import state.*;

public class Programm {
    public static void main(String[] args) {


        state();

    }

    public static void strategie(){
        Trainer robert = new DickerTrainer();
        // David Seidl macht ein Faul
        robert.mundAufMachen();

        //Robert verliert Fett - runden lafft
        robert.setV(new KonstruktiverBeitrag());

        // David macht scho wieder a faul
        robert.mundAufMachen();
    }

    public static void decorate(){
        WeihnachtmannIF klaus = new Klaus();

        System.out.println(klaus.Christbaum().getBezeichnung());
        System.out.println(klaus.Christbaum().getPreis());
    }

    public static void observerScheiße(){
        Messdaten temperatur = new Temp();
        Messdaten luft = new Luftfeucht();
        WetterstationEinz w1 = new WetterstationEinz();
        w1.addMessdaten(temperatur);
        w1.addMessdaten(luft);
        luft.aktualisieren();
    }

    public static void observer(){
        Messstation m = new MessstationAlpha();
        Prog1 p1 = new Prog1(m);
        Prog2 p2 = new Prog2(m);
        m.ändertSichWas();

    }

    public static void state(){
        Fahrzeug f = new Fahrzeug();
        f.start();
    }
}
