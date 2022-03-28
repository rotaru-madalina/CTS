package singleton.main;

import singleton.Repartitor;

public class Main {
    public static void main(String[] args) {
        // thread 1
        Repartitor r1 = Repartitor.getInstance();
        // thread 2
        Repartitor r2 = Repartitor.getInstance();

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
