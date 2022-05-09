package clase;

public class ComandaPleacaInCursa implements ComandaAbstracta{
    private Autobuz autobuz;
    private int nrLinie;

    public ComandaPleacaInCursa(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    public void executa() {
        autobuz.pleacaInCursa(nrLinie);
    }
}
