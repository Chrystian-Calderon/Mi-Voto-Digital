package model;

public class Estudiante {
    private String nombre = "";
    private String apellidos = "";
    private String ci = "";
    private String carrera = "";
    private String matricula = "";
    private boolean habilitado = false;
    private boolean haVotado = false;
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getCI() {
        return ci;
    }
    
    public boolean isHabilitado() {
        return habilitado;
    }
    
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    public boolean isHaVotado() {
        return haVotado;
    }
    
    //public void setHaVotado(MesaElectoral mesa, Frente frente) {
    //    
    //}
}
