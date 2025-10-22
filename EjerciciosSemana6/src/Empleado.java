public class Empleado {

    //Atributos
    protected String nombre;
    protected String apellidos;
    protected String puesto;
    private static final int HORAS_TRABAJADAS_DIA = 8;
    private static final double PAGO_HORA = 1000.0;

    //Métodos
    //Constructor
    public Empleado(String nombre, String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    //Funcionales
    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }

    public double calcularSalario() {
        return HORAS_TRABAJADAS_DIA * PAGO_HORA * 7 * 4;
    }
}
