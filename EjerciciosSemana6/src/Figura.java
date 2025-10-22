public class Figura {

    //Atributos
    protected double lado;

    //Métodos
    //Constructor
    public Figura() {
        this.lado = 0.0;
    }

    //Getter
    public double getLado() {
        return lado;
    }

    //Setter
    public void setLado(double lado) {
        this.lado = lado;
    }

    //Funcionales
    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
