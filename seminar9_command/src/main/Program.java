package main;

import clase.Autobuz;
import clase.ComandaAbstracta;
import clase.ComandaPleacaInCursa;
import clase.ManagerComenzi;

public class Program {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("Model1");
        Autobuz a2 = new Autobuz("Model2");
        Autobuz a3 = new Autobuz("Model3");

        ComandaAbstracta c1 = new ComandaPleacaInCursa(a1, 331);
        ManagerComenzi mc = new ManagerComenzi();

        mc.invoca(new ComandaPleacaInCursa(a1, 341));
        mc.invoca(new ComandaPleacaInCursa(a2, 351));
        mc.invoca(new ComandaPleacaInCursa(a1, 41));
        mc.invoca(new ComandaPleacaInCursa(a3, 31));
        mc.invoca(new ComandaPleacaInCursa(a2, 301));
        mc.invoca(new ComandaPleacaInCursa(a1, 241));

        mc.executaComanda();
        mc.executaComanda();
        mc.executaComanda();
        mc.executaComanda();

    }
}
