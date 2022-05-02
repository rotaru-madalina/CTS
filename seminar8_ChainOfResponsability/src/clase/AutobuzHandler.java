package clase;

public class AutobuzHandler extends Handler{

    public AutobuzHandler(Handler hasNextHandler, int prag) {
        super(hasNextHandler, prag);
    }

    @Override
    public void AfiseazaCuCeSaMearga(int distanta) {
        if (distanta < prag) {
            System.out.println("Te poti deplasa cu autobuzul.");
        } else {
            hasNextHandler.AfiseazaCuCeSaMearga(distanta);
        }
    }
}
