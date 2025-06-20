package logic.model;

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
    public String getCarrera() {
        return carrera;
    }
    public String getMatricula(){
        return matricula;
    }
    public boolean isHabilitado() {
        return habilitado;
    }
    public boolean isHaVotado() {
        return haVotado;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setHaVotado(boolean haVotado) {
        this.haVotado = haVotado;
    } 
    public void setCi(String ci) {
        this.ci = ci;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }
    //public void setHaVotado(MesaElectoral mesa, Frente frente) {
    //    
    //}
}
