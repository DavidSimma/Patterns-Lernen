package observer;

public class MessstationAlpha extends Messstation{
    @Override
    public String getTemperatur() {
        return "500000000°C";
    }

    @Override
    public String getWindgeschwindigkeit() {
        return "3km/h";
    }
}
