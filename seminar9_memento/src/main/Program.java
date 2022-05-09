package main;

import clase.Autobuz;
import clase.ManagerAutobuze;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Gigel", 25, "Alfa", 2005);
        ManagerAutobuze managerAutobuze = new ManagerAutobuze();

        managerAutobuze.adaugareMemento(autobuz.creareMemento());
        autobuz.setNumeSofer("Mircea");
        managerAutobuze.adaugareMemento(autobuz.creareMemento());

        autobuz.setConsumMediu(20);
        managerAutobuze.adaugareMemento(autobuz.creareMemento());
        System.out.println(autobuz.toString());

        autobuz.revenireStareAnterioara(managerAutobuze.getMementoAutobuz(0));
        System.out.println(autobuz.toString());
    }
}
