package main;

import clase.DecoratorAbstract;
import clase.DecoratorConcret;
import clase.IImprimanta;
import clase.ImprimantaDeBilete;

public class Program {
    public static void main(String[] args) {
        IImprimanta iImprimanta = new ImprimantaDeBilete(15);
        iImprimanta.printeazaBilet();

        // decorare imprimanta
        DecoratorAbstract decorator = new DecoratorConcret(iImprimanta, "Paste fericit!");

        decorator.printeazaBilet();
        decorator.printeazaVerso();
    }
}
