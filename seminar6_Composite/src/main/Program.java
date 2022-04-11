package main;

import clase.Autobuz;
import clase.Flota;
// cerinta 6
public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Audi", "A1", 10);
        Autobuz autobuz2 = new Autobuz("Audi", "A1", 7);
        Autobuz autobuz3 = new Autobuz("Audi", "A1", 30);
        Autobuz autobuz4 = new Autobuz("Audi", "A1", 100);
        Autobuz autobuz5 = new Autobuz("Audi", "A1", 30);
        Autobuz autobuz6 = new Autobuz("Audi", "A1", 45);

        Flota flota1 = new Flota("Flota1");
        Flota flota2 = new Flota("Flota2");
        Flota flota3 = new Flota("Flota3");
        Flota flotaMare = new Flota("Flota Companie");

        try {
            flota1.adaugaItem(autobuz1);
            flota1.adaugaItem(autobuz2);

            flota2.adaugaItem(autobuz3);

            flota3.adaugaItem(autobuz4);
            flota3.adaugaItem(autobuz5);
            flota3.adaugaItem(autobuz6);

            flotaMare.adaugaItem(flota1);
            flotaMare.adaugaItem(flota2);
            flotaMare.adaugaItem(flota3);

            flotaMare.descriereItem();
            flotaMare.stergeItem(flota2);

            flota2.stergeItem(autobuz3);
            flotaMare.descriereItem();

            System.out.println("Suma totala garantata = " +
                    flotaMare.calculeazaSumaGarantata(3) +
                    " lei (pretul este de 3 lei per loc)");

            System.out.println("Suma totala garantata Flota 3= " +
                    flota3.calculeazaSumaGarantata(3) +
                    " lei (pretul este de 3 lei per loc)");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
