package clase.main;

import clase.ValidatorSubteranAdapter;
import clase.autobuz.Validator;
import clase.autobuz.ValidatorAutobuz;
import clase.metrou.ValidatorMetrou;
import clase.validatorClase.AdapterMetrou;

public class Program {
    public static void valideazaBilet(Validator validator) {
        validator.v_bilet();
    }
    public static void valideazaAbonament(Validator validator) {
        validator.validareAbonament();
    }
    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);

        ValidatorMetrou validatorMetrou = new ValidatorMetrou();

        ValidatorSubteranAdapter adapter = new ValidatorSubteranAdapter(validatorMetrou);
        valideazaBilet(adapter);

        valideazaAbonament(adapter);

        AdapterMetrou adapterMetrou = new AdapterMetrou();
        valideazaAbonament(adapterMetrou);
    }
}
