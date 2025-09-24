public class Suscripcion {
    private String tipo;
    private float costo;
    private byte periocidad;

    Suscripcion(String tipoObjeto,
                float costoObjeto,
                byte periocidadObjeto){
        tipo = tipoObjeto;
        costo = costoObjeto;
        periocidad = periocidadObjeto;
    }

    //Getters
    public String getTipo() {
        return tipo;
    }

    public float getCosto() {
        return costo;
    }

    public byte getPeriocidad() {
        return periocidad;
    }

    //Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setPeriocidad(byte periocidad) {
        this.periocidad = periocidad;
    }

    //equals()
    public boolean equals(Suscripcion otraSuscripcion) {
        return(tipo.equals(otraSuscripcion.tipo) && periocidad == otraSuscripcion.periocidad);
    }

    //toString()
    public String toString(){
        return "\nTipo: " + tipo +
                "\nCosto: " + costo +
                "\nPeriocidad: " + periocidad;
    }
}