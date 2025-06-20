package logic.model;

import java.util.ArrayList;

public class Estudiante {
    protected String nombre = "";
    protected String apellidos = "";
    protected String ci = "";
    protected String carrera = "";
    protected String matricula = "";
    protected boolean habilitado = false;
    protected boolean haVotado = false;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setHaVotado(ArrayList<Voto> votos) {
        for (Voto v : votos) {
            if (v.estudiante.getMatricula().equals(matricula)) {
                haVotado = true;
                break;
            }
        }
    }
}
