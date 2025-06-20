package logic;

import java.util.ArrayList;
import logic.model.Frente;
import persistence.ArchivoFrente;

public class FrenteService {
    public ArrayList<Frente> getFrentes() {
        ArchivoFrente fileFrente = new ArchivoFrente();
        return fileFrente.getFrentes();
    }
}
