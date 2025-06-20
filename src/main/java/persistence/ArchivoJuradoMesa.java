package persistence;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import logic.model.JuradoMesa;

public class ArchivoJuradoMesa {
    private final String rutaArchivo = "data/Jurado.txt";

    public ArrayList<JuradoMesa> cargarJurados() {
        ArrayList<JuradoMesa> listaJurados = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
                if (datos.length >= 3) {
                    JuradoMesa jurado = new JuradoMesa();
                    jurado.setCi(datos[0].trim());
                    jurado.setNombreCompleto(datos[1].trim());
                    jurado.setActivo(Boolean.parseBoolean(datos[2].trim()));
                    
                    listaJurados.add(jurado);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar jurados: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error en formato de datos: " + e.getMessage());
        }
        
        return listaJurados;
    }

}