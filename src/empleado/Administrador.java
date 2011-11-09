package empleado;

/**
 *
 * @author jdmr
 */
public class Administrador extends Empleado {

    protected String departamento;

    @Override
    public String getDetails() {
        return "Nombre: " + nombre + "\n"
                + "Salario: " + salario + "\n"
                + "Departamento: " + departamento;
    }
}
