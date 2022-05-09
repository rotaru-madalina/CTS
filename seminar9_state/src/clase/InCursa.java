package clase;

public class InCursa implements Stare{
    @Override
    public void doAction(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu nr: " + autobuz.getNrAutobuz() + " pleaca in cursa.");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul nu poate pleca inca in cursa.");
        }
    }
}
