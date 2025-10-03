import java.util.ArrayList;

public class Biblioteca {

    //Atributo
    private String nombre;
    private final ArrayList<Libro> coleccionLibro;

    //Métodos
    //Constructor
    public Biblioteca(
            String nombreObjeto
    ){
        nombre = nombreObjeto;
        coleccionLibro = new ArrayList<>();
    }

    public Biblioteca(){
        coleccionLibro = new ArrayList<>();
    }

    //Getter
    public String getNombre(){
        return nombre;
    }

    //Setter
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    //Agrega un libro a una colección de libros
    public void insertarLibro(Libro nuevoLibro){
        coleccionLibro.add(nuevoLibro);
    }
}
