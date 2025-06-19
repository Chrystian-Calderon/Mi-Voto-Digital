package model;

public class TEE {
    private MesaElectoral [] mesas = new MesaElectoral[100];

    public MesaElectoral getMesaElectoral(int index) {
        return mesas[index];
    }
    public void setMesaElectoral(MesaElectoral mesaElectoral) {
        for (int i = 0; i<mesas.length;i++){
            if (mesas[i] == null) {
                mesas[i] = mesaElectoral;
            }
        }
    }
}
