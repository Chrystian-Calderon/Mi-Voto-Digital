package logic.model;
import persistence.ArchivoAdministrador;

public class Administrador extends Usuario {
    public String getUsuario() {
        return usuario;
    }
    public String getPassword() {
        return password;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setPassword(String password) {
        this.password = password;
    }
      
    
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
