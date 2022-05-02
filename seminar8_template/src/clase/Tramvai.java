package clase;

public class Tramvai extends MijlocTransportPeSine{

    @Override
    protected void opresteInStatie1() {
        System.out.println("Tramvaiul a oprit in statia 1.");
    }

    @Override
    protected void opresteInStatie2() {
        System.out.println("Tramvaiul a oprit in statia 2.");
    }

    @Override
    protected void opresteInStatie3() {
        System.out.println("Tramvaiul a oprit in statia 3.");
    }
}
