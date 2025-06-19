package logic.model;

public class Frente {
    private String nombre,foto;
    private Candidato candidatos[]=new Candidato[10];

    public String getNombre() {
        return nombre;
    }
    public String getFoto() {
        return foto;
    }
    public Candidato[] getCandidato() {
        return candidatos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public void setCandidato(Candidato[] candidato) {
        this.candidatos = candidato;
    }

    public void mostrarIntegrantes(){
        int i;
        for(i=0;i<candidatos.length;i++){
            
        }
    }
    public void agregarCandidato(Candidato x){
        int i;
        for(i=0;i<candidatos.length;i++){

        }
    }
}
