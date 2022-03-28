package singleton;

public class Repartitor {
//    private static Repartitor repartitor = new Repartitor(); // eagle lazy
    private static Repartitor repartitor = null;

    // !! constructorul privat; altfel pune constructorul default public
    private Repartitor() {

    }

    public static synchronized Repartitor getInstance() { // thread safe
//        return repartitor; // constructorul e apelat o singura data; pe aceasta linie ar trebui sa apelam constructorul
        if (repartitor == null) {
            repartitor = new Repartitor();
        }
        return repartitor;
    }
}
