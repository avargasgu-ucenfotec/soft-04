public class Lector {

    //Atributo
    private String nombre;
    private int paginasLeidas;
    private Carnet carnet;

    //Métodos
    //Constructor
    public Lector(
            String nombreObjeto,
            int paginasLeidasObjeto
    ){
        nombre = nombreObjeto;
        paginasLeidas = paginasLeidasObjeto;
    }

    public Lector(
            String nombreObjeto
    ){
        nombre = nombreObjeto;
    }

    public Lector(){}

    //Getter
    public int getPaginasLeidas(){
        return paginasLeidas;
    }

    public Carnet getCarnet(){
        return carnet;
    }

    //Actualiza las páginas que el lector leyó de un libro en particular
    public void leer(int paginas, Libro libro){
        libro.setPagina(paginas + libro.getPaginaActual());
        paginasLeidas = libro.getPaginaActual();
    }

    //Obtiene un carnet para retirar libros de la biblioteca
    public void sacarCarnet(String nuevoNumeroCarnet, char nuevoTipo){
        carnet = new Carnet(nuevoNumeroCarnet, nuevoTipo);
    }
}
