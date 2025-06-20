package logic.model;
import java.util.HashMap;
import java.util.Map;
public class Conteo<T> {
    private Map<T, Integer> registros = new HashMap<>();

    public Map<T, Integer> getResultados() {
        return new HashMap<>(registros);
    }
}
