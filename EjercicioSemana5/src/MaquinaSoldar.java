import java.util.ArrayList;

public class MaquinaSoldar {

    //Atributos
    private String marca;
    private String modelo;
    private byte potencia;
    private final ArrayList<String> metales;

    //Métodos
    //Constructor
    public MaquinaSoldar(
            String marcaObjeto,
            String modeloObjeto,
            byte potenciaObjeto
    ){
        marca = marcaObjeto;
        modelo = modeloObjeto;
        potencia = potenciaObjeto;
        metales = new ArrayList<>();
        metales.add("aluminio");
        metales.add("cobre");
    }

    //Getter
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public byte getPotencia(){
        return potencia;
    }

    public ArrayList<String> getMetales(){
        return metales;
    }

    //Setter
    public void setMarca(String nuevoMarca){
        marca = nuevoMarca;
    }

    public void setModelo(String nuevoModelo){
        modelo = nuevoModelo;
    }

    public void setPotencia(byte nuevoPotencia){
        potencia = nuevoPotencia;
    }

    public boolean esSoldable(String metal){
        return metales.contains(metal);
    }
}