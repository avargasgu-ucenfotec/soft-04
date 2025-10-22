public class Gato extends Animal {

    //Atributos
    private String raza;

    //Métodos
    //Constructor
    public Gato(String nombre, byte edad, String color, String raza) {
        super(nombre, edad, color);
        this.raza = raza;
    }

    //Getter
    public String getRaza() {
        return raza;
    }

    //Setter
    public void setRaza(String raza) {
        this.raza = raza;
    }

    //Funcionales
    public void hacerSonido() {
        System.out.println("El gato hace miau.");
        System.out.println(" (\\_____/) ");
        System.out.println("(= * . * =)");
        System.out.println("  -m---m-");
    }
}
