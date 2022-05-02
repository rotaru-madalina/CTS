package clase;

public class TroleibuzHandler extends Handler{
    public TroleibuzHandler(int prag) {
        super(prag);
    }

    @Override
    public void AfiseazaCuCeSaMearga(int distanta) {
        if (distanta < prag) {
            System.out.println("Te poti deplasa cu troleibuzul");
        } else {
            hasNextHandler.AfiseazaCuCeSaMearga(distanta);
        }
    }
}
