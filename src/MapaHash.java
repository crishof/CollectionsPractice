import model.Persona;
import service.CollectionService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapaHash {
    public static void main(String[] args) {


        String mensaje = "";
        CollectionService service = new CollectionService();

        Persona p1 = new Persona("Carlos", 23, "Futbol");
        Persona p2 = new Persona("Maria", 25, "Basket");
        Persona p3 = new Persona("Juan", 20, "Tenis");
        Persona p4 = new Persona("Pedro", 30, "Voley");
        Persona p5 = new Persona("Luis", 28, "Futbol");
        Persona p6 = new Persona("Ana", 22, "Basket");
        Persona p7 = new Persona("Marta", 27, "Tenis");
        Persona p8 = new Persona("Jorge", 21, "Voley");
        Persona p9 = new Persona("Laura", 24, "Futbol");
        Persona p10 = new Persona("Carla", 26, "Basket");
        // HASHMAP
        // No ordena los elementos

        Map<String, Persona> mapaHash = new HashMap<>();

        // Add an item
        mapaHash.put("Carlos", p1);
        mapaHash.put("Maria", p2);
        mapaHash.put("Juan", p3);
        mapaHash.put("Pedro", p4);
        mapaHash.put("Luis", p5);
        mapaHash.put("Ana", p6);
        mapaHash.put("Marta", p7);
        mapaHash.put("Jorge", p8);
        mapaHash.put("Laura", p9);
        mapaHash.put("Carla", p10);

        // No permite valores repetidos en las llaves
        mapaHash.put("Carla", p5);
        // No permite valores nulos
        mapaHash.put(null, p5);

        //buscar un valor en el mapa - Devuelve boolean
        System.out.println("Buscamos p3 por value: " + mapaHash.containsValue(p3));

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

        mensaje = "HashMap de personas: ";
        service.printMap(mensaje, mapaHash);
    }
}
