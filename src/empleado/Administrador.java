package empleado;

import java.util.Date;

/**
 *
 * @author jdmr
 */
public class Administrador extends Empleado {

    protected String departamento;
    
    
    public Administrador() {}
    
    public Administrador(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    
    public Administrador(String nombre, Date fechaNacimiento, String departamento) {
        super(nombre, fechaNacimiento);
        this.departamento = departamento;
    }
    
    public Administrador(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getDetails() {
        return "Nombre: " + nombre + "\n"
                + "Salario: " + salario + "\n"
                + "Departamento: " + departamento;
    }
}
