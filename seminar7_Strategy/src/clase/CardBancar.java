package clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata prin card Bancar in valoare de: " + pret + "lei");
    }
}
