package empleado;

import java.util.Date;

/**
 *
 * @author jdmr
 */
public class Empleado {
    protected String nombre;
    protected double salario;
    protected Date fechaNacimiento;
    private static final double SALARIO_BASE = 15000;
    
    public Empleado() {}
    
    public Empleado(String nombre, double salario, Date fechaNacimiento) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaNacimiento = null;
    }
    
    public Empleado(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.salario = SALARIO_BASE;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getDetails() {
        return "Nombre: "+nombre+"\n"
                + "Salario: "+salario;
    }
    
    public double obtenerBeneficios(Empleado e) {
        if (e instanceof Director) {
            Director director = (Director)e;
            return director.gastos;
        } else {
            return 0D;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }
}
