package main;

import clase.Angajat;
import clase.Aplicant;
import clase.readers.AngajatiReader;
import clase.readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        try {
            IReader reader = new AngajatiReader("angajati.txt"); // tema de gandire
            listaAngajati = reader.readAplicanti();
            Aplicant.setPragPunctaj(90);
            for (Aplicant angajat : listaAngajati) {// principiul Liskov
				System.out.println(angajat.toString());
				angajat.afisareRezultat();
				angajat.afisareSumaBani(3500);
			}
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
