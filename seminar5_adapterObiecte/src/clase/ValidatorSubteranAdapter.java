package clase;

import clase.autobuz.Validator;
import clase.metrou.ValidatorMetrou;

public class ValidatorSubteranAdapter implements Validator {
    private ValidatorMetrou validatorMetrou;

    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonament();
    }

    @Override
    public void v_bilet() {
        validatorMetrou.validareCalatorie();
    }

    public ValidatorSubteranAdapter(ValidatorMetrou validatorMetrou) {
        // super();
        this.validatorMetrou = validatorMetrou;
    }
}
