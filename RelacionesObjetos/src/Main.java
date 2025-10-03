//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //La clase "Lector" tiene una dependencia de la clase "Libro", ya que para poder ejecutar el metodo leer()
        //requiere instanciar un "Libro" y aprovechar su metodo setPagina().
        Lector miLector = new Lector("Andrés");

        Libro libro1 = new Libro("The Secret Garden");
        Libro libro2 = new Libro("Alice in Wonderland");
        Libro libro3 = new Libro("The Odyssey");

        Biblioteca biblioteca1 = new Biblioteca();
        Biblioteca biblioteca2 = new Biblioteca();

        //La asociación múltiple se logra declarando el atributo "Libro" dentro de la clase "Biblioteca"
        biblioteca1.setNombre("Nuevos");
        biblioteca1.insertarLibro(libro1);
        biblioteca1.insertarLibro(libro2);

        biblioteca2.setNombre("Usados");
        biblioteca2.insertarLibro(libro3);

        miLector.sacarCarnet("0001", 'v');

        //Mostrar los datos asociados al carnet de la biblioteca
        System.out.println(miLector.getCarnet().toString());

        //El lector lee 10 páginas del libro "The Odyssey"
        miLector.leer(10, libro3);

        //Obtener la última página del libro "The Odyssey" que fue leída por el lector
        System.out.println(libro3.getPaginaActual());

        //El lector lee 10 páginas más del libro "The Odyssey"
        miLector.leer(10, libro3);

        //Obtener la última página del libro "The Odyssey" que fue leída por el lector
        System.out.println(libro3.getPaginaActual());
    }
}