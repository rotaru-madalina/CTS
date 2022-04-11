package FlyweightFactory;

import clase.Linie;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<Integer, Linie> linieMap;
    // putem avea metoda sau functie
    public Linie getLinie(Integer nrLinie) {
        Linie linieDeReturnat = linieMap.get(nrLinie);

        if (linieDeReturnat != null) {
            return linieDeReturnat;
        } else {
            // statiile pot fi preluate din fisier sau baze de date
            linieDeReturnat = new Linie(nrLinie, "Prima statie",
                    "Ultima statie"); // nu e recomandat sa hardcodam
            linieMap.put(linieDeReturnat.getNrLinie(), linieDeReturnat);
            return linieDeReturnat;
        }
    }

    public FlyweightFactory() {
        linieMap = new HashMap<>(); // e un vector in spate
    }
}
