package model;

public class MesaElectoral {
    private String numeroMesa;
    private JuradoMesa jurado;
    private Estudiante []estudaintes = new Estudiante[500];
    private Voto []votos = new Voto[500];

    public String getNumeroMesa() {
        return numeroMesa;
    }
    public JuradoMesa getJurado() {
        return jurado;
    }
    public Estudiante [] getEstudaintes() {
        return estudaintes;
    }
    public Voto [] getVotos() {
        return votos;
    } 

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    public void setJurado(JuradoMesa jurado) {
        this.jurado = jurado;
    }
    public void setEstudaintes(Estudiante []estudaintes) {
        this.estudaintes = estudaintes;
    }
    public void setVotos(Voto []votos) {
        this.votos = votos;
    }
}
