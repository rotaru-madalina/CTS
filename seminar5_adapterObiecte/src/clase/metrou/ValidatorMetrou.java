package clase.metrou;

public class ValidatorMetrou implements ValidatorulMeu{
    @Override
    public void validareCalatorie() {
        System.out.println("Am validat calatoria de metrou");
    }

    @Override
    public void validareAbonament() {
        System.out.println("Am validat abonamentul de metrou");
    }
}
