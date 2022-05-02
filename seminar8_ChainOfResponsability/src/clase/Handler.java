package clase;

public abstract class Handler {
    protected Handler hasNextHandler;
    protected int prag;

    public Handler(Handler hasNextHandler, int prag) {
        this.hasNextHandler = hasNextHandler;
        this.prag = prag;
    }

    public Handler(int prag) {
        this.prag = prag;
        hasNextHandler = null;
    }

    public void setHasNextHandler(Handler hasNextHandler) {
        this.hasNextHandler = hasNextHandler;
    }

    public void setPrag(int prag) {
        this.prag = prag;
    }
    public abstract void AfiseazaCuCeSaMearga(int distanta);
}
