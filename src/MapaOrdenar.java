import model.Persona;
import service.CollectionService;

import java.util.*;

public class MapaOrdenar {
    public static void main(String[] args) {

        CollectionService service = new CollectionService();

        Map<String, Persona> mapaHash = new HashMap<>();
        service.crearPersonasMapa(mapaHash);

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