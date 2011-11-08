package ejerciciosdia2;

import java.util.Scanner;

/**
 *
 * @author jdmr
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        Integer numero = scanner.nextInt();
        
        Ejercicio03 ejercicio = new Ejercicio03();
        Boolean esPrimo = ejercicio.esPrimo(numero);
        if (esPrimo) {
            System.out.println( numero + " es numero primo");
        } else {
            System.out.println( numero + " es numero par");
        }
    }

    public Boolean esPrimo(Integer numero) {
        if (numero % 2 == 0) {
            return false;
        }
        return true;
    }
}
