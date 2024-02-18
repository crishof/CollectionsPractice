import model.Persona;
import service.CollectionService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapaHash {
    public static void main(String[] args) {

        CollectionService service = new CollectionService();

        // HASHMAP No ordena los elementos

        Map<String, Persona> mapaHash = new HashMap<>();

        service.crearPersonasMapa(mapaHash);
        Persona p11 = new Persona("Antonio", 35, "Tenis");

        // Add an item
        mapaHash.put("Antonio", p11);

        // No permite valores repetidos en las llaves
        mapaHash.put("Antonio", p11);
        // No permite valores nulos
        mapaHash.put(null, p11);

        //buscar un valor en el mapa - Devuelve boolean
        System.out.println("Buscamos p3 por value: " + mapaHash.containsValue(p11));

        //buscar una llave en el mapa - Devuelve boolean
        System.out.println("Buscamos Carla por key: " + mapaHash.containsKey("Carla"));

        // obtenemos una lista de values
        System.out.println(mapaHash.values());

        // obtenemos una lista de keys
        System.out.println(mapaHash.keySet());

        // Obtenemos el valor de una llave
        Persona p = mapaHash.get("Carla");
        System.out.println("p = " + p);

        // Elimina un elemento del mapa
        mapaHash.remove("Carla");

        // Obtener las claves
        Set<String> keys = mapaHash.keySet();
        System.out.println("Claves: " + keys);
        service.printMap("HashMap de personas: ", mapaHash);
    }
}
