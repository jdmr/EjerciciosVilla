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
    
    public String getDetails() {
        return "Nombre: "+nombre+"\n"
                + "Salario: "+salario;
    }
}
