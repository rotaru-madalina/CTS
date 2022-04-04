package clase;

public class Tramvai implements MijlocTransport {

    private String vatman;

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    public Tramvai(String vatman) {
        this.vatman = vatman;
    }

    @Override
    public String toString() {
        return "Tramvai{" +
                "vatman='" + vatman + '\'' +
                '}';
    }
}
