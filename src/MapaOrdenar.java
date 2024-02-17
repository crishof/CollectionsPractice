import model.Persona;
import service.CollectionService;

import java.util.*;

public class MapaOrdenar {
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

        // El HashMap no permite ordenar los elementos

        // Ordenar el mapa usando TreeSet
        Set<String> claves = mapaHash.keySet();
        Set<String> clavesOrdenadas = new TreeSet<>(claves);

        // El mapa no está ordenado, accedemos al valor del mapa mediante la clave ordenada
        System.out.println("Mapa ordenado con TreeSet");
        for (String clave : clavesOrdenadas) {
            System.out.println("Clave: " + clave + " - Valor del mapa: " + mapaHash.get(clave));
        }


        // Ordenar el mapa usando Collections.sort()
        List<String> clavesLista = new ArrayList<>(claves);
        Collections.sort(clavesLista);
        // El mapa no está ordenado, accedemos al valor del mapa mediante la clave ordenada
        System.out.println("Mapa ordenado con Collections.sort");
        for (String clave : clavesLista) {
            System.out.println("Clave: " + clave + " - Valor del mapa: " + mapaHash.get(clave));
        }

        //Ordenar el mapa por atributo del objeto valor

        Set<Map.Entry<String, Persona>> entries = mapaHash.entrySet();
        List<Map.Entry<String, Persona>> entriesList = new ArrayList<>(entries);
        entriesList.sort(Comparator.comparing(entry -> entry.getValue().getAge()));

        Map<String, Persona> LinkedMapOrdenado = new LinkedHashMap<>();
        for (Map.Entry<String, Persona> entry : entriesList) {
            LinkedMapOrdenado.put(entry.getKey(), entry.getValue());
        }

        service.printMap("Mapa ordenado por edad: ", LinkedMapOrdenado);
    }
}