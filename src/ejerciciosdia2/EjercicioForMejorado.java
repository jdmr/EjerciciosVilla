package ejerciciosdia2;

/**
 *
 * @author jdmr
 */
public class EjercicioForMejorado {
    
    public static void main(String[] args) {
        
        int[][] arreglo = new int[5][5];
        for(int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                arreglo[i][j] = i+j;
            }
        }
        
        for(int[] renglon : arreglo) {
            for(int elemento : renglon) {
                System.out.println("Valor: "+elemento);
            }
        }
    } 
    
}
