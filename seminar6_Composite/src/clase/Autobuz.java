package clase;

public class Autobuz implements IItem{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void adaugaItem(IItem iItem) throws Exception {
        throw new Exception("Nepermis!");
    }

    @Override
    public void stergeItem(IItem iItem) throws Exception {
        throw new Exception("Nepermis!");
    }

    @Override
    public void descriereItem() {
        System.out.println(this.toString());
    }

    @Override
    public IItem getItem(int pozitie) throws Exception {
        throw new Exception("Nepermis!");
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        return pretPerLoc * nrLocuri + model.length();
    }

    @Override
    public String toString() {
        return "        Autobuz{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
