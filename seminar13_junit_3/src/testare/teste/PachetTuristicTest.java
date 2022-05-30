package testare.teste;

import clase.agentie.PachetTuristic;
import org.junit.experimental.categories.Category;
import org.junit.Test;
import testare.categorii.TesteAplicaDiscount;
import testare.categorii.TesteBoundary;
import testare.categorii.TesteCuFake;
import testare.categorii.TestePoateRezerva;
import testare.dubluri.PersoanaFake;

import static org.testng.Assert.*;


public class PachetTuristicTest {

    @Test
    @Category({TesteCuFake.class, TestePoateRezerva.class})
    public void testPoateRezerva() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(21);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucuresti", 100.0);

        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TestePoateRezerva.class})
    public void testNuPoateRezerva() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(16);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucuresti", 100.0);

        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TestePoateRezerva.class, TesteBoundary.class})
    public void testPoateRezervaBoundary() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucuresti", 100.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TesteAplicaDiscount.class})
    public void testRightAplicaDiscount() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(70);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Paris", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);

        assertEquals(250.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category({TesteCuFake.class, TesteAplicaDiscount.class})
    public void testRightAplicaDiscountTanar() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(21);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Paris", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);

        assertEquals(500.0, pachetTuristic.getPret(), 0.01);
    }
}
