public class Pasaporte {

    //Atributos
    private String numero;
    private String nacionalidad;
    private String fechaEmision;
    private String fechaVencimiento;
    private boolean estaVigente;

    //Métodos
    //Constructor
    public Pasaporte(
            String numeroObjeto,
            String nacionalidadObjeto,
            String fechaEmisionObjeto,
            String fechaVencimientoObjeto,
            boolean estaVigenteObjeto
    ){
        numero = numeroObjeto;
        nacionalidad = nacionalidadObjeto;
        fechaEmision = fechaEmisionObjeto;
        fechaVencimiento = fechaVencimientoObjeto;
        estaVigente = estaVigenteObjeto;
    }

    public Pasaporte(){}

    //Getter
    public String getNumero(){
        return numero;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public String getFechaEmision(){
        return fechaEmision;
    }

    public String getFechaVencimiento(){
        return fechaVencimiento;
    }

    public boolean getEstaVigente(){
        return estaVigente;
    }
}
