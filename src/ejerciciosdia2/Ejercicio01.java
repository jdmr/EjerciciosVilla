package ejerciciosdia2;

import java.util.Scanner;

/**
 *
 * @author jdmr
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca primer  numero: ");
        Integer numero1 = scanner.nextInt();
        System.out.print("Introduzca segundo numero: ");
        Integer numero2 = scanner.nextInt();
        System.out.print("Introduzca tercer  numero: ");
        Integer numero3 = scanner.nextInt();
        System.out.print("Introduzca cuarto  numero: ");
        Integer numero4 = scanner.nextInt();
        
        Ejercicio01 ejercicio = new Ejercicio01();
        Integer mayor = ejercicio.obtieneMayor(numero1, numero2, numero3, numero4);
        
        StringBuilder sb = new StringBuilder();
        sb.append("El numero mayor de [");
        sb.append(numero1);
        sb.append(",").append(numero2);
        sb.append(",").append(numero3);
        sb.append(",").append(numero4);
        sb.append("] es ").append(mayor);
        
        System.out.println(sb.toString());
    }
    
    public Integer obtieneMayor(Integer numero1, Integer numero2, Integer numero3, Integer numero4) {
        Integer mayor = 0;
        if (numero1 != null) {
            mayor = numero1;
        }
        if (numero2 != null && numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 != null && numero3 > mayor) {
            mayor = numero3;
        }
        if (numero4 != null && numero4 > mayor) {
            mayor = numero4;
        }

        return mayor;
    }
}
