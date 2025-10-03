public class Persona {

    //Atributos
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;

    //Métodos
    //Constructor
    public Persona(
            String nombreObjeto,
            String apellidosObjeto
    ){
        nombre = nombreObjeto;
        apellidos = apellidosObjeto;
    }

    public Persona(){}

    //Getter
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void sacarPasaporte(
            String nuevoNumero,
            String nuevoNacionalidad,
            String fechaEmision,
            String fechaVencimiento,
            boolean estaVigente
    ){
        pasaporte = new Pasaporte(
                nuevoNumero,
                nuevoNacionalidad,
                fechaEmision,
                fechaVencimiento,
                estaVigente);
    }

    public void tomarVuelo(String pais){
        if(!pasaporte.getEstaVigente()){
            System.out.println(
                    getNombre() +
                    " " +
                    getApellidos() +
                    " no puede tomar el vuelo, ya que su pasaporte no está vigente.");
            return;
        }
        System.out.println(
                getNombre() +
                " " +
                getApellidos() +
                " puede tomar el vuelo a " +
                pais +
                ".");
    }

    /*
    public void adoptarMascota(
            String nuevoNombreMascota,
            String nuevoEspecie,
            byte nuevoEdad
    ){
        mascota = new Mascota(
                nuevoNombreMascota,
                nuevoEspecie,
                nuevoEdad);
    }*/

    public void adoptarMascota(Mascota nuevoMascota){
        mascota = nuevoMascota;
    }

    public void jugar(){
        System.out.println(
                getNombre() +
                " " +
                "juega con su mascota " +
                mascota.getNombreMascota() +
                ".");
    }

    public void soldar(MaquinaSoldar maquina, String metal){
        if(!maquina.esSoldable(metal)){
            System.out.println(
                    "La máquina de soldar " +
                    maquina.getMarca() +
                    " " +
                    maquina.getModelo() +
                    " no puede soldar " +
                    metal +
                    ".");
            return;
        }
        System.out.println(
                "La máquina de soldar " +
                maquina.getMarca() +
                " " +
                maquina.getModelo() +
                " solda el " +
                metal +
                ".");
    }
}
