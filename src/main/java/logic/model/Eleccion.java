package logic.model;

public class Eleccion {
    private Frente [] frentes = new Frente[20];
    private MesaElectoral [] mesas= new MesaElectoral[100];
    private boolean activa;

    public Frente [] getFrentes() {
        return frentes;
    }
    public MesaElectoral [] getMesas() {
        return mesas;
    }
    public boolean isActiva() {
        return activa;
    }
    public void setFrentes(Frente[] frentes) {
        this.frentes = frentes;
    }
    public void setMesas(MesaElectoral[] mesas) {
        this.mesas = mesas;
    }
    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
}
