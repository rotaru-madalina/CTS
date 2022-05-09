package clase;

public class Autobuz {
    private String numeSofer;
    private float consumMediu;
    private String model;
    private int anFabricatie;

    public Autobuz(String numeSofer, float consumMediu, String model, int anFabricatie) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public MementoAutobuz creareMemento() {
        return new MementoAutobuz(this.numeSofer, this.consumMediu);
    }

    public void revenireStareAnterioara(MementoAutobuz mementoAutobuz) {
        this.numeSofer = mementoAutobuz.getNumeSofer();
        this.consumMediu = mementoAutobuz.getConsumMediu();
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
