package ejerciciosdia2;

/**
 *
 * @author jdmr
 */
public class EjercicioCiclo {

    public static void main(String[] args) {
        primerFor:
        for (int i = 1; i <= 4; i++) {
            System.out.println("I:"+i);
            if (i == 2) {
                continue;
            }
            for(int j = 1; j <= 3 ; j++) {
                System.out.println("J:"+j);
                if (i == 3 && j == 2) {
                    continue primerFor;
                }
            }
        }
    }
}
