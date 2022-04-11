package clase;

public abstract class DecoratorAbstract implements IImprimanta{
    private IImprimanta iImprimanta;

    @Override
    public void printeazaBilet() {
        iImprimanta.printeazaBilet();
    }

    public abstract void printeazaVerso(); // functionalitatea noua

    public DecoratorAbstract(IImprimanta iImprimanta) {
        this.iImprimanta = iImprimanta;
    }
}
