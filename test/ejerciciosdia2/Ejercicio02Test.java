package ejerciciosdia2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author jdmr
 */
public class Ejercicio02Test {
    
    public Ejercicio02Test() {
    }

    /**
     * Test of validaSuma method, of class Ejercicio02.
     */
    @Test
    public void testValidaSuma1() {
        System.out.println("validaSuma1");
        Integer numero1 = 200;
        Integer numero2 = 150;
        Integer numero3 = 50;
        Ejercicio02 instance = new Ejercicio02();
        Boolean expResult = true;
        Boolean result = instance.validaSuma(numero1, numero2, numero3);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidaSuma2() {
        System.out.println("validaSuma2");
        Integer numero1 = 200;
        Integer numero2 = 150;
        Integer numero3 = 50;
        Ejercicio02 instance = new Ejercicio02();
        Boolean expResult = false;
        Boolean result = instance.validaSuma(numero2, numero1, numero3);
        assertEquals(expResult, result);
    }
}
