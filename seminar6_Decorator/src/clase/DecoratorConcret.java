package clase;

public class DecoratorConcret extends DecoratorAbstract {

    private String mesaj;

    public DecoratorConcret(IImprimanta iImprimanta, String mesaj) {
        super(iImprimanta);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaVerso() {
        System.out.println("Mesaj verso: " + mesaj);
    }
}
