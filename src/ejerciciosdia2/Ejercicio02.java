package ejerciciosdia2;

import java.util.Scanner;

/**
 *
 * @author jdmr
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca primer  numero: ");
        Integer numero1 = scanner.nextInt();
        System.out.print("Introduzca segundo numero: ");
        Integer numero2 = scanner.nextInt();
        System.out.print("Introduzca tercer  numero: ");
        Integer numero3 = scanner.nextInt();

        Ejercicio02 ejercicio = new Ejercicio02();
        Boolean esSuma1 = ejercicio.validaSuma(numero1, numero2, numero3);
        Boolean esSuma2 = ejercicio.validaSuma(numero2, numero1, numero3);
        Boolean esSuma3 = ejercicio.validaSuma(numero3, numero2, numero1);
        if (esSuma1) {
            System.out.println(numero1 + " es la suma de " + numero2 + " + " + numero3);
        } else if (esSuma2) {
            System.out.println(numero2 + " es la suma de " + numero1 + " + " + numero3);
        } else {
            System.out.println(numero3 + " es la suma de " + numero2 + " + " + numero1);
        }

    }

    public Boolean validaSuma(Integer numero1, Integer numero2, Integer numero3) {
        if (numero1 == (numero2 + numero3)) {
            return true;
        }
        return false;
    }
}
