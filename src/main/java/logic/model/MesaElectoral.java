package logic.model;

import java.awt.List;
import java.util.ArrayList;

public class MesaElectoral {
    private int numeroMesa;
    public JuradoMesa jurado;
    private Voto[] votos = new Voto[500];
    private ArrayList<Character> iniciales;
    
    
    public MesaElectoral(JuradoMesa jurado, ArrayList<Character> iniciales) {
        this.jurado = jurado;
        this.iniciales = iniciales;
    }

    public ArrayList<Estudiante> listarVotantes(ArrayList<Estudiante> estudiantes) {
        ArrayList<Estudiante> list = new ArrayList<Estudiante>();
        for(char inicial : iniciales) {
            for (Estudiante e : estudiantes) {
                if (e.getApellidos().toUpperCase().charAt(0) == Character.toUpperCase(inicial)) {
                    list.add(e);
                }
            }
        }
        return list;
    }
    
    public void registrarVoto(Voto voto) {
        
    }
    
    public void mostrarGanadorMesa() {
        
    }
    
    public Voto getVotosRegistrador() {
        return null;
    }
}
