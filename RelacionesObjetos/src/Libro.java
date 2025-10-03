public class Libro {

    //Atributo
    private String titulo;
    private int paginaActual;

    //Métodos
    //Constructor
    public Libro(
            String tituloObjeto
    ){
        titulo = tituloObjeto;
        paginaActual = 0;
    }

    public Libro(){}

    //Getter
    public String getTitulo(){
        return titulo;
    }

    public int getPaginaActual(){
        return paginaActual;
    }

    //Setter
    public void setTitulo(String nuevoTitulo){
        titulo = nuevoTitulo;
    }

    //Actualizar número de página actual
    public void setPagina(int nuevoPagina){
        paginaActual = nuevoPagina;
    }
}
