package clase.readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AngajatiReader extends IReader {
    public AngajatiReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() {
        super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat(); // incalcam dependecy inversion, dar este in regula
            super.citireAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
