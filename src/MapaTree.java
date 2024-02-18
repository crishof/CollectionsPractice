import model.Persona;
import service.CollectionService;

import java.util.TreeMap;

public class MapaTree {
    public static void main(String[] args) {

        CollectionService service = new CollectionService();

        TreeMap<String, Persona> mapaTree = new TreeMap<>();
        service.crearPersonasMapa(mapaTree);

        // Los valores se ordenan automáticamente por llave

        service.printMap("TreeMap de personas: ", mapaTree);
    }
}
