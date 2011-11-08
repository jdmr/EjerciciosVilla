/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package ejerciciosdia2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author jdmr
 */
public class Ejercicio01Test {
    
    public Ejercicio01Test() {
    }

    /**
     * Test of main method, of class Ejercicio01.
     */
    @Test
    public void testObtieneMayor() {
        System.out.println("Probando Obtiene Mayor");
        Ejercicio01 ejercicio = new Ejercicio01();
        Integer mayor = ejercicio.obtieneMayor(300, 2000, null, 1);
        assertNotNull(mayor);
        assertEquals(2000, mayor.intValue());
        
        mayor = ejercicio.obtieneMayor(null, null, null, null);
        assertNotNull(mayor);
        assertEquals(0, mayor.intValue());
    }

    @Test
    public void testObtieneMayorConNulos() {
        System.out.println("Probando Obtiene Mayor con nulos");
        Ejercicio01 ejercicio = new Ejercicio01();
        Integer mayor = ejercicio.obtieneMayor(null, null, null, null);
        assertNotNull(mayor);
        assertEquals(0, mayor.intValue());
    }
}
