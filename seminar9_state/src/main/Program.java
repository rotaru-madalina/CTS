package main;

import clase.Autobuz;
import clase.LaCapatDeLinie;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(29);

        autobuz.trimiteLaReparat();
        autobuz.pleacaInCursa();
        autobuz.iesireDinService();
        autobuz.pleacaInCursa();
        autobuz.trimiteLaReparat();
//        autobuz.setStare(new LaCapatDeLinie()); // la state nu trebuie sa avem voie sa facem asta
        autobuz.ajungeLaCapatDeLinie();
    }
}
