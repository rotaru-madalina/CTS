package clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements IItem{
    private String nume;
    private List<IItem> items;

    public Flota(String nume) {
        this.nume = nume;
        items = new ArrayList<>();
    }

    @Override
    public void adaugaItem(IItem iItem) throws Exception {
        items.add(iItem);
    }

    @Override
    public void stergeItem(IItem iItem) throws Exception {
        items.remove(iItem);
    }

    @Override
    public void descriereItem() {
        System.out.println(nume); // afisare info pt nodul curent
        for (IItem item : items) {
            item.descriereItem(); // afisare copii
        }
    }

    @Override
    public IItem getItem(int pozitie) throws Exception {
        return items.get(pozitie);
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        float suma = 0;
        for (IItem item : items) {
            suma += item.calculeazaSumaGarantata(pretPerLoc);
        }
        return suma;
    }
}
