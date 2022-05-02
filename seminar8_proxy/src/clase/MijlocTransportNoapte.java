package clase;

public class MijlocTransportNoapte implements MijlocTransport {
    // asta e clasa proxy
    // private Autobuz autobuz; // e aplicabil doar pt autobuz
    private MijlocTransport mijlocTransport; // pt toata familia de clase

    @Override
    public void opresteInStatie() {
        if (mijlocTransport.getNrCalatori() > 0) {
            mijlocTransport.opresteInStatie();
        } else {
            System.out.println("Autobuzul de noapte nu opreste.");
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }

    public MijlocTransportNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }
}
