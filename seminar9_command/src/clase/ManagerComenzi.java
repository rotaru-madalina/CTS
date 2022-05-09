package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ComandaAbstracta> comenzi;

    public ManagerComenzi() {
        this.comenzi = new ArrayList<>();
    }

    public void invoca(ComandaAbstracta comanda) {
        comenzi.add(comanda);
    }
    public void executaComanda() {
        if (comenzi.isEmpty()) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
