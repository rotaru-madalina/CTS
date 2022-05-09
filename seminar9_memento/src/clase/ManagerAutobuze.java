package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuze {
    private List<MementoAutobuz> listaMemento;

    public ManagerAutobuze() {
        super();
        this.listaMemento = new ArrayList<>();
    }

    public MementoAutobuz getMementoAutobuz(int index) {
        return listaMemento.get(index);
    }

    public void adaugareMemento(MementoAutobuz mementoAutobuz) {
        listaMemento.add(mementoAutobuz);
    }
}
