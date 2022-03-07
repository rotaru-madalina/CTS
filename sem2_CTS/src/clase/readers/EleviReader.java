package clase.readers;

import clase.Aplicant;
import clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends IReader {
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev elev = new Elev(); // incalcam dependecy inversion, dar este in regula
            super.citireAplicant(input2, elev);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setTutore(tutore);
            elev.setClasa(clasa);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
