package clase;

public interface IItem {
    void adaugaItem(IItem iItem) throws Exception;
    void stergeItem(IItem iItem) throws Exception;
    void descriereItem();
    IItem getItem(int pozitie) throws Exception;
    float calculeazaSumaGarantata(float pretPerLoc);
}
