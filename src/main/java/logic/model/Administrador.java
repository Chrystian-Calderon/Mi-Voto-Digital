package logic.model;

import persistence.ArchivoAdministrador;

public class Administrador extends Estudiante {
    private String usuario = "";
    private String password = "";
    
    public boolean iniciarSesion(String usuario, String password) {
        ArchivoAdministrador fileAdmi = new ArchivoAdministrador();
        String[] administrador = fileAdmi.searchUsuario(usuario);
        if (administrador[0] != null && administrador[1] != null) {
            if (administrador[1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
