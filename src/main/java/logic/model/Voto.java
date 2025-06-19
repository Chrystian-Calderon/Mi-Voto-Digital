package logic.model;

public class Voto {
    private String idVoto;
    private Frente frenteSeleccionado;
    private MesaElectoral mesa;

    public String getIdVoto() {
        return idVoto;
    }
    public Frente getFrenteSeleccionado() {
        return frenteSeleccionado;
    }
    public MesaElectoral getMesa() {
        return mesa;
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
}
