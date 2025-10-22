public class EmpleadoRH extends Empleado {

    //Atributos

    //Métodos
    //Constructor
    public EmpleadoRH(String nombre, String apellidos, String puesto) {
        super(nombre, apellidos, puesto);

    }

    //Funcionales
    public void trabajar() {
        System.out.println("El empleado de RRHH está trabajando.");
    }

    public void contratarEmpleado() {
        System.out.println("El empleado de RRHH está contratando un empleado.");
    }
}
