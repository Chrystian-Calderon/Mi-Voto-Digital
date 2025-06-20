package logic.model;

public class Voto {
    private String idVoto;
    private Frente frenteSeleccionado;
    private MesaElectoral mesa;
    private Estudiante estudiante;

    public String getIdVoto() {
        return idVoto;
    }
    public Frente getFrenteSeleccionado() {
        return frenteSeleccionado;
    }
    public MesaElectoral getMesa() {
        return mesa;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    public void setIdVoto(String idVoto) {
        this.idVoto = idVoto;
    }
    public void setFrenteSeleccionado(Frente frenteSeleccionado) {
        this.frenteSeleccionado = frenteSeleccionado;
    }
    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
}
