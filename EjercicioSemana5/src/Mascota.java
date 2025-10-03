public class Mascota {

    //Atributos
    private String nombreMascota;
    private String especie;
    private byte edad;

    //Métodos
    //Constructor
    public Mascota(
            String nombreMascotaObjeto,
            String especieObjeto,
            byte edadObjeto
    ){
        nombreMascota = nombreMascotaObjeto;
        especie = especieObjeto;
        edad = edadObjeto;
    }

    public Mascota(){}

    //Getter
    public String getNombreMascota(){
        return nombreMascota;
    }

    public String getEspecie(){
        return especie;
    }

    public byte getEdad(){
        return edad;
    }
}
