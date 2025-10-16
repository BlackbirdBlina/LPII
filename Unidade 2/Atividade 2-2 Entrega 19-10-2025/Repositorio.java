import java.util.HashMap;
import java.util.Map;

public class Repositorio<T> {
    private HashMap<String, T> objetos;

    public Repositorio() {
        objetos = new HashMap<>();
    }

    public void adicionar(String chave, T obj) {
        objetos.put(chave, obj);
    }

    public void remover(String chave) {
        objetos.remove(chave);
    }

    public T buscar(String chave) {
        return objetos.get(chave);
    }

    public void listar() {
         for (Map.Entry<String, T> entry : objetos.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
