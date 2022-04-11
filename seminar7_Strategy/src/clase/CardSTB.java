package clase;

public class CardSTB implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata prin card STB in valoare de: " + pret + "lei");
    }
}
