package persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import logic.model.Administrador;

public class ArchivoAdministrador {
    private final String rutaArchivo = "data/administradores.txt";
    
    public String[] searchUsuario(String usuario) {
        String[] administrador = new String[2];
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                if (usuario.equals(datos[7])) {
                    administrador[0] = datos[7];
                    administrador[1] = datos[8];
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer votantes: " + e.getMessage());
        }
        return administrador;
    }
}
