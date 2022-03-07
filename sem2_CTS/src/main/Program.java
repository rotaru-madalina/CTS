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
		IReader reader = new AngajatiReader(); // tema de gandire
		try {
			listaAngajati = reader.readAplicanti("angajati.txt");
			for(Aplicant angajat:listaAngajati) // principiul Liskov
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
