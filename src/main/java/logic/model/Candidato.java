package logic.model;

public class Candidato extends Estudiante {
    private String cargo;
    
    public Candidato(String nombre, String apellidos, String ci, String carrera, String matricula, String cargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ci = ci;
        this.carrera = carrera;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
