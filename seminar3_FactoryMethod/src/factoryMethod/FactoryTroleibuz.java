package factoryMethod;

public class FactoryTroleibuz implements FactoryMijlocTransport{
    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
