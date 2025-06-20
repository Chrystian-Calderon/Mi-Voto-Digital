package persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import logic.model.Estudiante;

public class ArchivoEstudiante {
    private final String rutaArchivo = "data/estudiantes.txt";
    
    public ArrayList<Estudiante> getVotantes() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                Estudiante estudiante = new Estudiante();
                estudiante.setHabilitado(Boolean.parseBoolean(datos[5]));
                lista.add(estudiante);
            }
        } catch (IOException e) {
            System.out.println("Error al leer votantes: " + e.getMessage());
        }
        return lista;
    }
}
