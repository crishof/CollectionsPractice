import model.Persona;
import service.CollectionService;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaLinkedHash {
    public static void main(String[] args) {

        CollectionService service = new CollectionService();


        Map<String, Persona> mapaLinkedHash = new LinkedHashMap<>();
        service.crearPersonasMapa(mapaLinkedHash);


        // Los metodos son iguales para los mapas

        // LinkedHashMap mantiene el orden de inserción de las claves.
        // HashMap rendimiento rápido en la búsqueda sin importar el orden de las claves
        // TreeMap: Claves ordenadas naturalmente mediante comparador
    }

}