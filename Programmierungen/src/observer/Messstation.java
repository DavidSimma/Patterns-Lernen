package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Messstation {
    public String getTemperatur() {
        return "";
    }

    public String getWindgeschwindigkeit() {
        return "";
    }
    List<Programme> progs = new ArrayList<>();
    public void addProgramme(Programme p){
        progs.add(p);
    }
    public void √§ndertSichWas(){
        for (Programme p: progs){
            p.aktualisieren();
        }
    }

}
