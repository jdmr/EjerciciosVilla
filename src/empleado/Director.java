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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Director)) {
            return false;
        }
        final Director other = (Director) obj;
        if (!this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }
}
