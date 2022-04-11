package clase;

public class Autobuz implements AutobuzLinie{

    private String model;
    private Integer an;
    private Integer nrLocuri;

    @Override
    public void descriereAutobuz(Linie linie) {
        System.out.println("Linie: " + linie.toString() +
                " Autobuz: " + this.toString());
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    public Autobuz(String model, Integer an, Integer nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }
}
