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
public class Ejercicio03Test {
    
    public Ejercicio03Test() {
    }

    /**
     * Test of esPrimo method, of class Ejercicio03.
     */
    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        Integer numero = 19;
        Ejercicio03 instance = new Ejercicio03();
        Boolean expResult = true;
        Boolean result = instance.esPrimo(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPrimo2() {
        System.out.println("esPrimo2");
        Integer numero = 16;
        Ejercicio03 instance = new Ejercicio03();
        Boolean expResult = false;
        Boolean result = instance.esPrimo(numero);
        assertEquals(expResult, result);
    }
}
