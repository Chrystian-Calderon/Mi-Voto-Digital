package logic.model;

import java.awt.List;
import java.util.ArrayList;

public class Frente {
    private String nombre;
    public Candidato[] candidatos = new Candidato[10];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addCandidato(Candidato candidato){
        for(int i = 0; i < candidatos.length; i++) {
            if (candidatos[i] == null) {
                candidatos[i] = candidato;
                break;
            }
        }
    }
    
    public ArrayList<String> toFila() {
        ArrayList<String> lista = new ArrayList<>();
        
        for (Candidato candidato : candidatos) {
            if (candidato != null) {
                String fila = nombre + "," +
                        candidato.getNombre() + "," +
                        candidato.getApellidos() + "," +
                        candidato.getCi() + "," +
                        candidato.getCarrera() + "," +
                        candidato.getMatricula() + "," +
                        candidato.getCargo() + ",";
                lista.add(fila);
            }
        }
        return lista;
    }
}
