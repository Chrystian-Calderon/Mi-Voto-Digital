package persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import logic.model.Candidato;

public class ArchivoCandidato {
    private final String rutaArchivo = "data/candidatos.txt";
    
    public boolean searchMatricula(Candidato candidato) {
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                if (candidato.getMatricula().equals(datos[5])) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer votantes: " + e.getMessage());
        }
        return false;
    }
}
