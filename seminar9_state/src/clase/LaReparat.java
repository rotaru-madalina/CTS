package clase;

public class LaReparat implements Stare{
    @Override
    public void doAction(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu nr: " + autobuz.getNrAutobuz() + " intra in service");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul cu nr: " + autobuz.getNrAutobuz() + " trebuie sa ajunga intai la capat de linie");
        }
    }
}
