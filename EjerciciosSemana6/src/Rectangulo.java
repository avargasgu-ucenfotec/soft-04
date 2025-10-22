public class Rectangulo extends Figura {

    //Atributos
    private double largo;
    private double ancho;

    //Métodos
    //Constructor
    public Rectangulo(double largo, double ancho) {
        super();
        this.largo = largo;
        this.ancho = ancho;
    }

    //Getter
    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    //Setter
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //Funcionales
    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return (2 * largo) + (2 * ancho);
    }
}
