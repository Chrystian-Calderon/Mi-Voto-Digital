package logic.model;

import persistence.ArchivoAdministrador;
import persistence.ArchivoCandidato;

public class Administrador extends Usuario {
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
    
    public void registrarFrente(Frente frente) {
        ArchivoAdministrador fileAdmi = new ArchivoAdministrador();
        fileAdmi.add(frente);
    }
    
    public void verificarCandidato(Frente frente, Candidato cand) {
        ArchivoCandidato fileCandidato = new ArchivoCandidato();
        if (fileCandidato.searchMatricula(cand)) {
            frente.addCandidato(cand);
        }
    }
    
    public void cerrarMesa(MesaElectoral mesa) {
        mesa.jurado = null;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
