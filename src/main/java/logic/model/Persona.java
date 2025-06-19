package model;

public class Persona {
    private String nombreCompleto,ci;
    private boolean activo;

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getCi() { 
        return ci;
    }
    public boolean isActivo() {
        return activo;
    }
    
    public void setActivo(boolean x){
        activo = x;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
}
