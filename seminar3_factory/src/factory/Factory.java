package factory;

public class Factory {
    // FAMILIE DE CLASE; SIMPLE FACTORY; daca nu avem enum facem FACTORY METHOD
    public MijlocTransport getMijlocTransport(TipTransport tipTransport, int nrInmatriculare) {
        switch (tipTransport) {
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
