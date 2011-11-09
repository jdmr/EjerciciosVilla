package empleado;

/**
 *
 * @author jdmr
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado = new Administrador();
        empleado.nombre = "David Mendoza";
        empleado.salario = 100D;
        
        System.out.println(empleado.getDetails());
    }
}
