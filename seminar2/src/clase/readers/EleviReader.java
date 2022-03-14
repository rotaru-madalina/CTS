package clase.readers;

import clase.Aplicant;
import clase.Elev;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class EleviReader extends IReader {
    public EleviReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Elev elev = new Elev(); // incalcam dependecy inversion, dar este in regula
            super.citireAplicant(scanner, elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setTutore(tutore);
            elev.setClasa(clasa);
            elevi.add(elev);
        }
        scanner.close();
        return elevi;
    }
}
