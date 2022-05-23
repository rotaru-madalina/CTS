package teste;

import clase.CNPIncorect;
import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetSex {

    @Test
    public void testRightSexM() {
        Persoana persoana = new Persoana("Ion", "3000000000122");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testRightSexF() {
        Persoana persoana = new Persoana("Ionela", "6000000000122");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testBounderySexInferior() {
        Persoana persoana = new Persoana("Ion", "1000101212345");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBounderySexSuperior() {
        Persoana persoana = new Persoana("Ionela", "6220101212345");
        assertEquals("F", persoana.getSex());
    }

    // @Test
    // nu putem aplica inverse in acest caz -> plecam de la varsta si tb sa ajungem la cnp

    // cross-check
    @Test
    public void testCrossCheckSex() {
        Persoana persoana = new Persoana("Ionela", "5220101212345");
        assertEquals(persoana.CNP.charAt(0) % 2 == 0 ? "F" : "M", persoana.getSex()); // avantaj cross-check
    }

    // error condition pt junit4
    @Test(expected = CNPIncorect.class)
    public void testErrorSex() {
        Persoana persoana = new Persoana("Ionela", "0220101212345");

        persoana.getSex();
    }

    // performance
    @Test(timeout = 100)
    public void testPerformanceSex() {
        Persoana persoana = new Persoana("Ionela", "5220101212345");
        persoana.getSex();
    }

    // conformance
    @Test
    public void testConformanceSex() {
        Persoana persoana = new Persoana("Ionela", "5220101212345");
        assertEquals(1, persoana.getSex().length());
    }

    // order
    @Test
    public void testOrderingSex() {
//        Persoana persoana = new Persoana("Ionela", "5220101212345");
//        assertEquals(1, persoana.getSex().length());
        // nu avem
    }

    // range
//    @Test
//    public void testRangeSex() {
//        nu avem
//    }

    // reference -> nu avem

    // existence
    @Test(expected = NullPointerException.class)
    public void testExistenceSex() {
        Persoana persoana = new Persoana("Ion", null);
        persoana.getSex();
    }

    // cardinality -> sunt facute deja

    // time -> facut deja
}