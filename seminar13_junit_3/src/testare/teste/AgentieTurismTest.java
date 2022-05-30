package testare.teste;

import clase.agentie.AgentieTurism;
import clase.agentie.IPachetTuristic;
import org.junit.experimental.categories.Category;
import org.junit.Test;
import testare.categorii.TesteAdaugaPachet;
import testare.categorii.TesteCalculareSumaTotalaPachete;
import testare.categorii.TesteCuFake;
import testare.categorii.TestePoateRezerva;
import testare.dubluri.PachetFake;
import testare.dubluri.PachetTuristicDummy;
import testare.dubluri.PachetTuristicStub;

import static org.testng.AssertJUnit.assertEquals;

public class AgentieTurismTest {

    @Test
    @Category({TesteAdaugaPachet.class})
    public void testAdaugaPachet() {
        PachetTuristicDummy p1 = new PachetTuristicDummy();
        AgentieTurism agentieTurism = new AgentieTurism();

        agentieTurism.adaugaPachet(p1);

        assertEquals(1, agentieTurism.getNumarPachete());
    }

    @Test
    @Category({TesteCalculareSumaTotalaPachete.class, TesteAdaugaPachet.class})
    public void testCalculeazaSumaTotalaPachete() {
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetTuristicStub());
        agentieTurism.adaugaPachet(new PachetTuristicStub());

        assertEquals(200.0, agentieTurism.calculareSumaTotalaPachete());
    }

    @Test
    @Category({TesteCalculareSumaTotalaPachete.class, TesteCuFake.class})
    public void testCalculeazaSumaTotalaPachetFake() {
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetFake = new PachetFake(); // trebuie sa incalcam dependency inversion
        pachetFake.setValoareGetPret(100.0);

        PachetFake pachetFake2 = new PachetFake();
        pachetFake2.setValoareGetPret(200.0);

        agentieTurism.adaugaPachet(pachetFake);
        agentieTurism.adaugaPachet(pachetFake2);

        assertEquals(300.0, agentieTurism.calculareSumaTotalaPachete());
    }
}
