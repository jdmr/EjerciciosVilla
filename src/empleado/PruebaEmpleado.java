package empleado;

/**
 *
 * @author jdmr
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado = new Administrador("David Mendoza", 100D, "sistemas");
        
        System.out.println(empleado.getDetails());
        
        Director director = new Director();
        director.aumentaGastos(1000);
        
        Secretaria secretaria = new Secretaria();
        
        System.out.println(empleado.obtenerBeneficios(director));
        System.out.println(empleado.obtenerBeneficios(secretaria));
        
    }
    
}
