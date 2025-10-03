public class Carnet {

    //Atributo
    private String numeroCarnet;
    private char tipoCarnet;              //virtual (v) o físico (f)

    //Métodos
    //Constructor
    public Carnet(
            String numeroCarnetObjeto,
            char tipoCarnetObjeto
    ){
        numeroCarnet = numeroCarnetObjeto;
        tipoCarnet = tipoCarnetObjeto;
    }

    //Getter
    public String getNumeroCarnet(){
        return numeroCarnet;
    }

    public char getTipoCarnet(){
        return tipoCarnet;
    }

    //Setter
    public void setNumeroCarnet(String nuevoNumeroCarnet){
        numeroCarnet = nuevoNumeroCarnet;
    }

    public void setTipoCarnet(char nuevoTipoCarnet){
        tipoCarnet = nuevoTipoCarnet;
    }

    //toString()
    public String toString(){
        return "\nNúmero: " + numeroCarnet +
                "\nTipo: " + tipoCarnet;
    }
}
