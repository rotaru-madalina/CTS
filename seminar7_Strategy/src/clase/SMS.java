package clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata prin SMS in valoare de: " + pret + "lei");
    }
}
