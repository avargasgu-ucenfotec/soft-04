public class Cuenta {

    //Atributos
    protected String id;
    protected double saldo;

    //Métodos
    //Constructor
    public Cuenta(String id) {
        this.id = id;
        this.saldo = 0.0;
    }

    //Getter
    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Funcionales
    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) {
        this.saldo -= monto;
    }
}
