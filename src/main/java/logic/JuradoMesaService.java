package logic;

import java.util.ArrayList;
import logic.model.JuradoMesa;
import persistence.ArchivoJurado;

public class JuradoMesaService {
    public ArrayList<JuradoMesa> getJurados() {
        ArchivoJurado fileJurado = new ArchivoJurado();
        return fileJurado.getVotantes();
    }
    
    public int getMesa(JuradoMesa jurado) {
        ArchivoJurado fileJurado = new ArchivoJurado();
        return fileJurado.searchMesa(jurado);
    }
}
