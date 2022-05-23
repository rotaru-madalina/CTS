package teste;

import clase.CNPIncorect;
import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetVarsta {

    @Test
    public void testRightGetVarsta() {
        Persoana persoana = new Persoana("Ion", "6001200000122");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void testBounderyVarstaInferior() {
        Persoana persoana = new Persoana("Ion", "3000101212345");
        assertEquals(222, persoana.getVarsta());
    }

    @Test
    public void testBounderyVarstaSuperior() {
        Persoana persoana = new Persoana("Ionela", "6220101212345");
        assertEquals(0, persoana.getVarsta());
    }

    // cross-check -> nu avem

    // error condition
    @Test(expected = CNPIncorect.class)
    public void testErrorVarsta() {
        Persoana persoana = new Persoana("Ionela", " 6230101212345");
        persoana.getVarsta();
    }

    // performance
    @Test(timeout = 100)
    public void testPerformanceVarsta() {
        Persoana persoana = new Persoana("Ion", "6201200000122");
        persoana.getVarsta();
    }

    // order
    @Test
    public void testOrderVarsta() {
        Persoana persoana1 = new Persoana("Ion", "6001200000122");
        Persoana persoana2 = new Persoana("Ionel", "1991012123456");

        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    // existence
    @Test(expected = NullPointerException.class)
    public void testExistenceVarsta() {
        Persoana persoana = new Persoana("Ion", null);
        persoana.getVarsta();
    }

    // cardinality

}