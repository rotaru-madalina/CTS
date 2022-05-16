package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {
    // pt a genera testul junit click dreapta pe numele clasei si dam generate
    private Matematica mate;
    // adnotare pt a initializa <<mate>> pt fiecare functie
    @Before
    public void setUp() {
        mate = Matematica.getInstance();
       // System.out.println("I was here");
    }

    @Test
    public void testSumaCorecta() {
        int rezultatObtinut = mate.suma(7,5);
//        fail("test");
        assertEquals(12, rezultatObtinut);
    }

    @Test
    public void testRaportCorect() {
        double rezultat = mate.raport(24,6);
        assertEquals(4, rezultat,0.001);
    }

    @Test
    public void testRaportCorect2() {
        double rezultat = mate.raport(24,11);
        assertEquals(2.18, rezultat,0.005);
    }

    @Test
    public void testRaportCorect3() {
        double rezultat = mate.raport(24,-2);
        assertEquals(-12, rezultat,0.005);
    }

    @Test
    public void testRaportShouldThrowException() {
        try {
            mate.raport(57, 0);
            fail("I  shouldn't be here");
        } catch (IllegalArgumentException e) {

        }
    }

    // asta e specific junit4; .class pt ca se foloseste de reflection
    @Test(expected = IllegalArgumentException.class)
    public void testRaportShouldThrowException2() {
        mate.raport(23,0);
    }

    @Test
    public void testParitate() {
        boolean rezultat = mate.estePar(5);
        assertFalse(rezultat); // ne asteptam sa dea False
        assertTrue(mate.estePar(4));
        assertTrue(mate.estePar(6));
        assertTrue(mate.estePar(10));
        assertFalse(mate.estePar(7));
    }

    @Test
    public void testListaNumere() {
        assertEquals(4, mate.nNumerePare(4).size());
        assertEquals(5, mate.nNumerePare(5).size());
        //assertEquals(0, mate.nNumerePare(0).size());
        assertEquals(1, mate.nNumerePare(1).size());
    }

    @Test
    public void testListaNumereNull() {
        assertNull(mate.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListaNumereArgNegativ() {
        mate.nNumerePare(-3);
    }

    @Test
    public void testSingleton() {
        assertSame(Matematica.getInstance(), mate);
    }

    @Test
    public void testRaportCorect4() {
        double rezultat = mate.raport(24,24);
        assertEquals(1, rezultat,0.005);
        // assertEquals(1, mate.raport(24,24),0.005);

    }
}