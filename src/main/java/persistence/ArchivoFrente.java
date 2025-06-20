package persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import logic.model.Candidato;
import logic.model.Frente;

public class ArchivoFrente {
    private final String rutaArchivo = "data/frentes.txt";
    
    public ArrayList<Frente> getFrentes() {
        ArrayList<Frente> lista = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            Map<String, ArrayList<Candidato>> mapaFrentes = new HashMap<>();
            ArrayList<Candidato> candidatos = new ArrayList<>();
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombreFrente = datos[0];
                String nombre = datos[1];
                String apellidos = datos[2];
                String ci = datos[3];
                String carrera = datos[4];
                String matricula = datos[5];
                String cargo = datos[6];

                Candidato candidato = new Candidato(nombre, apellidos, ci, carrera, matricula, cargo);

                if (!mapaFrentes.containsKey(nombreFrente)) {
                    mapaFrentes.put(nombreFrente, new ArrayList<>());
                }
                System.out.println(mapaFrentes.keySet());

                mapaFrentes.get(nombreFrente).add(candidato);
            }
            for (String clave : mapaFrentes.keySet()) {
                Frente f = new Frente();
                f.setNombre(clave);
                f.candidatos = mapaFrentes.get(clave);
                lista.add(f);
            }
        } catch (IOException e) {
            System.out.println("Error al leer votantes: " + e.getMessage());
        }
        return lista;
    }
}
