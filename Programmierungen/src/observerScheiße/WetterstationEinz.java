package observerScheiße;

import java.util.ArrayList;
import java.util.List;

public class WetterstationEinz{
    List<Messdaten> ms = new ArrayList<>();
    public void addMessdaten(Messdaten m){
        ms.add(m);
        m.setW(this);
    }

    public void aktualisieren() {
        for (Messdaten m : ms){
            System.out.println(m.getEig());
        }
    }
}
