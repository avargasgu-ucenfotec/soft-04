public class CuentaAhorros extends Cuenta {

    //Atributos

    //Métodos
    //Constructor
    public CuentaAhorros(String id) {
        super(id);
        this.saldo = 100.0;
    }

    //Funcionales
    public void retirar(double monto) {
        if (saldo < 100 || (saldo - monto) < 100) {
            System.out.println("\nTransacción no válida.");
            System.out.println("Una cuenta de ahorros no puede tener un saldo menor a $100.");
            return;
        } else {
            this.saldo -= monto;
        }
    }
}
