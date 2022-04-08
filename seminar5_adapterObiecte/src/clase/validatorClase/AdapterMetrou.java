package clase.validatorClase;

import clase.autobuz.Validator;
import clase.metrou.ValidatorMetrou;

public class AdapterMetrou extends ValidatorMetrou implements Validator {
    @Override
    public void v_bilet() {
        super.validareCalatorie();
    }
}
