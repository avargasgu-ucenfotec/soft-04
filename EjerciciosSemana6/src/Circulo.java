public class Circulo extends Figura {

    //Atributos
    private double radio;

    //Métodos
    //Constructor
    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    //Getter
    public double getRadio() {
        return radio;
    }

    //Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Funcionales
    public double calcularArea() {
        return radio * radio * Math.PI;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
