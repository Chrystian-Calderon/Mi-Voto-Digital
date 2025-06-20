package persistence;
import logic.model.MesaElectoral;
import logic.model.Estudiante;
import logic.model.Voto;
import logic.model.JuradoMesa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoMesaElectoral {
    private final String rutaArchivo = "data/MesaElectoral.txt";

    public ArrayList<MesaElectoral> llenarMesasElectorales() {
        ArrayList<MesaElectoral> listaMesas = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(";");                
                if (datos.length >= 4) {
                    MesaElectoral mesa = new MesaElectoral();
                    mesa.setNumeroMesa(datos[0]);

                    JuradoMesa jurado = new JuradoMesa();
                    jurado.setCi(datos[1]);
                     mesa.setJurado(jurado);

                    String[] idsEstudiantes = datos[2].split(",");
                    Estudiante[] estudiantes = new Estudiante[idsEstudiantes.length];
                    for (int i = 0; i < idsEstudiantes.length; i++) {
                        Estudiante est = new Estudiante();
                        est.setMatricula(idsEstudiantes[i]);
                        estudiantes[i] = est;
                    }
                    mesa.setEstudaintes(estudiantes);
                    
                    String[] idsVotos = datos[3].split(",");
                    Voto[] votos = new Voto[idsVotos.length];
                    for (int i = 0; i < idsVotos.length; i++) {
                        Voto voto = new Voto();
                        voto.setIdVoto(idsVotos[i]); 
                        votos[i] = voto;
                    }
                    mesa.setVotos(votos);
                    
                    listaMesas.add(mesa);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer mesas electorales: " + e.getMessage());
        }
        
        return listaMesas;
    }
}