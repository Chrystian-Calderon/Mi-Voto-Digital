package logic;

import logic.model.Administrador;

public class AdministradorService {
    public boolean login(String usuario, String password) {
        Administrador administrador = new Administrador();
        return administrador.iniciarSesion(usuario, password);
    }
}
