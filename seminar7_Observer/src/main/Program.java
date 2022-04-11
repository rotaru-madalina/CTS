package main;

import clase.Autobuz;
import clase.Calator;
import clase.ICalator;
import clase.MijlocTransport;

public class Program {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(168); // dependency inversion
        ICalator calator1 = new Calator("Popescu");
        ICalator calator2 = new Calator("Georgescu");
        ICalator calator3 = new Calator("Dorel");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);

        autobuz.anuntaCalatori();

        autobuz.eliminaCalator(calator2);
        autobuz.adaugaCalator(calator3);

        autobuz.anuntaCalatori();
    }
}
