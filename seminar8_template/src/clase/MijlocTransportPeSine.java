package clase;

public abstract class MijlocTransportPeSine {
    protected abstract void opresteInStatie1();
    protected abstract void opresteInStatie2();
    protected abstract void opresteInStatie3();

    public final void parcurgeTraseuSensNormal() { // ATENTIE
        opresteInStatie1();
        opresteInStatie2();
        opresteInStatie3();
    }

    public final void parcurgeTraseuSensInvers() { // ATENTIE
        opresteInStatie3();
        opresteInStatie2();
        opresteInStatie1();
    }

}
