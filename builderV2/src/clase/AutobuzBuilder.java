package clase;

public class AutobuzBuilder implements Builder{

    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textRulat;

    public AutobuzBuilder() {
        this.numeSofer = "sofer";
        this.nrLinie = 2;
        this.pauzaSofer = true;
        this.deschideUsile = false;
        this.oraIncepereProgram = 10;
        this.textRulat = "Buna ziua";
    }

    @Override
    public Autobuz build() {
        return new Autobuz(this.numeSofer, this.nrLinie, this.pauzaSofer, this.deschideUsile, this.oraIncepereProgram, this.textRulat);
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram = oraIncepereProgram;
        return this;
    }

    public AutobuzBuilder setTextRulat(String textRulat) {
        this.textRulat = textRulat;
        return this;
    }
}
