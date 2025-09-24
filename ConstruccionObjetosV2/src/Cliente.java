public class Cliente {
    private String nombre;
    private String apellidos;
    private String cedula;
    private char sexo;
    private String ubicacion;

    Cliente(String nombreObjeto,
            String apellidosObjeto,
            String cedulaObjeto,
            char sexoObjeto,
            String ubicacionObjeto){
        nombre = nombreObjeto;
        apellidos = apellidosObjeto;
        cedula = cedulaObjeto;
        sexo = sexoObjeto;
        ubicacion = ubicacionObjeto;
    }

    Cliente(String nombreObjeto,
            String apellidosObjeto,
            String cedulaObjeto,
            String ubicacionObjeto){
        nombre = nombreObjeto;
        apellidos = apellidosObjeto;
        cedula = cedulaObjeto;
        ubicacion = ubicacionObjeto;
    }

    Cliente(){}

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    //equals()
    public boolean equals(Cliente otroCliente) {
        return(cedula.equals(otroCliente.cedula));
    }

    //toString()
    public String toString(){
        return "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nCédula: " + cedula +
                "\nSexo: " + sexo +
                "\nUbicación: " + ubicacion;
    }

    public String suscribirse(Suscripcion suscripcion){
        return nombre + " " + apellidos + " adquirió una suscripción " + suscripcion.getTipo() + ".";
    }
}