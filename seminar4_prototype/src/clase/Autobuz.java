package clase;

public class Autobuz implements MijlocTransport {

    private String numeSofer;

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    public Autobuz(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                '}';
    }
}
