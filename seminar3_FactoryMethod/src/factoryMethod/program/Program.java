package factoryMethod.program;

import factoryMethod.*;

public class Program {
    private static void afisareMijlocTransport(FactoryMijlocTransport fabrica, int nrInmatriculare) {
        MijlocTransport mijlocTransport = fabrica.getMijlocTransport(nrInmatriculare);
        System.out.println(mijlocTransport.toString());
    }
    public static void main(String[] args) {
//        MijlocTransport autobuz = new FactoryAutobuz().getMijlocTransport(111);
//        MijlocTransport tramvai = new FactoryTramvai().getMijlocTransport(222);
//        MijlocTransport troleibuz = new FactoryTroleibuz().getMijlocTransport(333);
//
//        System.out.println(autobuz.toString());
//        System.out.println(tramvai.toString());
//        System.out.println(troleibuz.toString());
        afisareMijlocTransport(new FactoryAutobuz(), 101);
        afisareMijlocTransport(new FactoryTramvai(), 102);
        afisareMijlocTransport(new FactoryTroleibuz(), 103);

    }
}
