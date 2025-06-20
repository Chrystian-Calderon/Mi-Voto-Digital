package logic.model;

public class JuradoMesa extends Persona{
    
    
    public String getNombreCompleto() {
        return super.getNombreCompleto();
    }
    public String getCi() { 
        return super.getCi();
    }
    public boolean isActivo() {
        return super.isActivo();
    }
    
    public void setActivo(boolean x){
        super.setActivo(x);
    }
    public void setNombreCompleto(String nombreCompleto) {
        super.setNombreCompleto(nombreCompleto);
    }
    public void setCi(String ci) {
        super.setCi(ci);
    }
    
}