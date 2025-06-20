package persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import logic.model.JuradoMesa;

public class ArchivoJurado {
    private final String rutaArchivo = "data/jurados.txt";

    public ArrayList<JuradoMesa> getVotantes() {
        ArrayList<JuradoMesa> lista = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println(linea);
                JuradoMesa jurado = new JuradoMesa();
                jurado.setNombre(datos[0]);
                jurado.setApellidos(datos[1]);
                jurado.setCi(datos[2]);
                jurado.setCarrera(datos[3]);
                jurado.setMatricula(datos[4]);
                jurado.setHabilitado(Boolean.parseBoolean(datos[5]));
                jurado.setUsuario(datos[7]);
                jurado.setPassword(datos[8]);
                lista.add(jurado);
            }
        } catch (IOException e) {
            System.out.println("Error al leer jurados: " + e.getMessage());
        }
        return lista;
    }
    
    public int searchMesa(JuradoMesa jurado) {
        try (BufferedReader lector = new BufferedReader(new FileReader("data/jurado_mesa.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                if (jurado.getCi().equals(datos[0]) && jurado.getMatricula().equals(datos[1])) {
                    return Integer.parseInt(datos[2]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer jurados_mesas:" + e.getMessage());
        }
        return 0;
    }
}