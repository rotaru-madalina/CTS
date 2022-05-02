package main;

import clase.MijlocTransportPeSine;
import clase.Tramvai;

public class Program {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai();

        tramvai.parcurgeTraseuSensNormal();
        System.out.println("***********");
        tramvai.parcurgeTraseuSensInvers();

        // tramvai.opresteInStatie2();
    }
}
