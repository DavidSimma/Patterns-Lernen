package strategie;

public abstract class Trainer {
    private Verhalten v;
    public Trainer(Verhalten _v){
        v = _v;
    }
    public void mundAufMachen(){
        v.machtMundAuf();
    }

    public Verhalten getV(){
        return this.v;
    }

    public void setV(Verhalten _v){
        this.v = _v;
    }

}
