/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package ejerciciosdia2;

/**
 *
 * @author jdmr
 */
public class PruebaLongitudVariable {

    public static void main(String... args) {
        PruebaLongitudVariable demo = new PruebaLongitudVariable();
        demo.prueba ("hola"
                ,new String[] {"PRUEBA","DEMO"}, 1,2,3,4,5);
        
    }
    
    public void prueba(String hola, String[] demo1, int... demo2) {
        System.out.println(hola);
        
        for(String x : demo1) {
            System.out.println(x);
        }
        
        for(int y : demo2) {
            System.out.println(y);
        }
    }
}
