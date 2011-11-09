package empleado;

/**
 *
 * @author jdmr
 */
public class Director extends Administrador {
    protected double gastos = 0;
    
    protected void aumentaGastos(double gastos) {
        this.gastos += gastos;
    }
}
