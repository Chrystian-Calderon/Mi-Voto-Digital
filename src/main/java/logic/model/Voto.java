package logic.model;

import java.util.ArrayList;

public class Voto {
    private Frente frenteSeleccionado = new Frente();
    public MesaElectoral mesa;
    public Estudiante estudiante = new Estudiante();
    
   public Voto(MesaElectoral mesa) {
       this.mesa = mesa;
   }

    public Frente getFrenteSeleccionado() {
        return frenteSeleccionado;
    }
    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setFrenteSeleccionado(Frente frenteSeleccionado) {
        this.frenteSeleccionado = frenteSeleccionado;
    }
    
    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public void verificarUnicidadVoto(ArrayList<Voto> votos) {
        for (Voto v : votos) {
            if (v.estudiante.isHaVotado() != true && v.estudiante.getMatricula().equals(estudiante.getMatricula())) {
                estudiante.setHaVotado(votos);
            }
        }
    }
}
