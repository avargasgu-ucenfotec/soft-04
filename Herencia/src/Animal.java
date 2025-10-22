public class Animal {

    //Atributos
    protected String nombre;
    protected byte edad;
    protected String color;

    //Métodos
    //Constructor
    public Animal(String nombre, byte edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Funcionales
    public void hacerSonido() {
        System.out.println("El animal hace su sonido.");
    }
}
