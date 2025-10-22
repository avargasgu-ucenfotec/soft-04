import java.lang.classfile.attribute.RecordAttribute;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicios de la semana 6");

        Empleado miEmpleado = new Empleado("Andrés", "Vargas Guevara", "Software Engineer");
        miEmpleado.trabajar();
        System.out.println(miEmpleado.calcularSalario());

        Rectangulo miRectangulo = new Rectangulo(10.0, 5.0);
        System.out.println(miRectangulo.calcularArea());
        System.out.println(miRectangulo.calcularPerimetro());

        Circulo miCirculo = new Circulo(3.0);
        System.out.println(miCirculo.calcularArea());
        System.out.println(miCirculo.calcularPerimetro());

        CuentaAhorros miCuentaAhorros = new CuentaAhorros("A0001");
        System.out.println(miCuentaAhorros.getSaldo());
        miCuentaAhorros.retirar(100.0);
        miCuentaAhorros.depositar(1000.0);
        miCuentaAhorros.retirar(100.0);
        System.out.println(miCuentaAhorros.getSaldo());
    }
}