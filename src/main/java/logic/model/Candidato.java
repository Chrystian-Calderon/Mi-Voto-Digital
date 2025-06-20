package logic.model;

public class Candidato extends Estudiante {
    private String cargo;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void verDetalle(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cargo: " + getCargo());
    }
}
