package logic.model;

public class Administrador extends Estudiante {
    private String usuario = "";
    private String password = "";
    
    public boolean validarPassword(String password) {
        return this.password.equals(password);
    }
}
