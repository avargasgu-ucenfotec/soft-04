public class Cliente {
    String nombre;
    String apellidos;
    String cedula;
    char sexo;
    String ubicacion;

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

    public String suscribirse(Suscripcion suscripcion){
        return nombre + " " + apellidos + " adquirió una suscripción " + suscripcion.tipo + ".";
    }
}