import model.Persona;
import service.CollectionService;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaLinkedHash {
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


        Map<String, Persona> mapaLinkedHash = new LinkedHashMap<>();

        // Add an item
        mapaLinkedHash.put("Carlos", p1);
        mapaLinkedHash.put("Maria", p2);
        mapaLinkedHash.put("Juan", p3);
        mapaLinkedHash.put("Pedro", p4);
        mapaLinkedHash.put("Luis", p5);
        mapaLinkedHash.put("Ana", p6);
        mapaLinkedHash.put("Marta", p7);
        mapaLinkedHash.put("Jorge", p8);
        mapaLinkedHash.put("Laura", p9);
        mapaLinkedHash.put("Carla", p10);

        // El resto de metodos son iguales para los mapas

        // LinkedHashMap mantiene el orden de inserción de las claves.
        // HashMap rendimiento rápido en la búsqueda sin importar el orden de las claves
        // TreeMap: Claves ordenadas naturalmente mediante comparador
    }

}