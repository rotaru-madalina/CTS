package Main;

import FlyweightFactory.FlyweightFactory;
import clase.Autobuz;
import clase.Linie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("A1", 1995, 40);
        Autobuz autobuz2 = new Autobuz("A2", 1996, 45);
        Autobuz autobuz3 = new Autobuz("A3", 1997, 38);
        Autobuz autobuz4 = new Autobuz("A4", 1998, 42);
        Autobuz autobuz5 = new Autobuz("A5", 1999, 44);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        autobuz1.descriereAutobuz(flyweightFactory.getLinie(168));
        autobuz2.descriereAutobuz(flyweightFactory.getLinie(133));
        autobuz3.descriereAutobuz(flyweightFactory.getLinie(168));
        autobuz4.descriereAutobuz(flyweightFactory.getLinie(133));
        autobuz5.descriereAutobuz(flyweightFactory.getLinie(168));

    }
}
