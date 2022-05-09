package clase;

public class Autobuz {
    private int nrAutobuz;
    private Stare stare;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare = new LaCapatDeLinie();
    }

    public void pleacaInCursa() {
        new InCursa().doAction(this);
    }
    public void ajungeLaCapatDeLinie() {
        new LaCapatDeLinie().doAction(this);
    }
    public void trimiteLaReparat() {
        new LaReparat().doAction(this);
    }
    public void iesireDinService() {
        new LaCapatDeLinie().doAction(this);
    }

    public Stare getStare() {
        return stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }
}
