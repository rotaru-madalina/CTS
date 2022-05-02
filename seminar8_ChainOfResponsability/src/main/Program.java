package main;

import clase.*;

public class Program {
    public static void main(String[] args) {
        AutobuzHandler autobuzHandler = new AutobuzHandler(null, 5);
        TroleibuzHandler troleibuzHandler = new TroleibuzHandler(3);
        TramvaiHandler tramvaiHandler = new TramvaiHandler(10);
        MetrouHandler metrouHandler = new MetrouHandler();

        troleibuzHandler.setHasNextHandler(autobuzHandler); // troleibuz e prima veriga din lant
        autobuzHandler.setHasNextHandler(tramvaiHandler);
        tramvaiHandler.setHasNextHandler(metrouHandler);

        troleibuzHandler.AfiseazaCuCeSaMearga(4);
        troleibuzHandler.AfiseazaCuCeSaMearga(2);
        troleibuzHandler.AfiseazaCuCeSaMearga(7);
        troleibuzHandler.AfiseazaCuCeSaMearga(12);

        Handler autobuzHCluj = new AutobuzHandler(null, 3000); // punem autobuzul drept veriga finala si ii dam o val foarte mare
        Handler tramvaiHCluj = new TramvaiHandler( 8);
        Handler troleibuzHCluj = new TroleibuzHandler( 3);

        troleibuzHCluj.setHasNextHandler(tramvaiHCluj); // troleibuzul e prima veriga
        tramvaiHCluj.setHasNextHandler(autobuzHCluj);

    }
}
