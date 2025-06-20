package persistence;
import logic.model.Voto;
import logic.model.Estudiante;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoVoto {
    private final String rutaArchivo = "data/votos.txt";

     public ArrayList<Voto> llenarVotos() {
        ArrayList<Voto> listaVotos = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                
                if (datos.length >= 3) {
                    Voto voto = new Voto();
                    voto.setIdVoto(datos[0]);
                    voto.setFrenteSeleccionado(null);
                    voto.setMesa(null);
                    listaVotos.add(voto);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer votos: " + e.getMessage());
        } 
        return listaVotos;
    }

}