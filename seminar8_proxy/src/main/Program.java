package main;

import clase.Autobuz;
import clase.MijlocTransportNoapte;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Autobuz1", 20);
        Autobuz autobuz2 = new Autobuz("Autobuz2", 0);
        Autobuz autobuz3 = new Autobuz("Autobuz3", 30);

        MijlocTransportNoapte mijlocTransportNoapte1 = new MijlocTransportNoapte(autobuz1);
        MijlocTransportNoapte mijlocTransportNoapte2 = new MijlocTransportNoapte(autobuz2);
        MijlocTransportNoapte mijlocTransportNoapte3 = new MijlocTransportNoapte(autobuz3);

        autobuz1.opresteInStatie();
        autobuz2.opresteInStatie();
        autobuz3.opresteInStatie();

        mijlocTransportNoapte1.opresteInStatie();
        mijlocTransportNoapte2.opresteInStatie();
        mijlocTransportNoapte3.opresteInStatie();
    }
}
