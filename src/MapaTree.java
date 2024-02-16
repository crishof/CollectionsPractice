import model.Persona;
import service.CollectionService;

import java.util.TreeMap;

public class MapaTree {
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


        TreeMap<String, Persona> mapaTree = new TreeMap<>();

        // Los valores se ordenan automáticamente por llave

        mapaTree.put("Maria", p2);
        mapaTree.put("Juan", p3);
        mapaTree.put("Pedro", p4);
        mapaTree.put("Carlos", p1);
        mapaTree.put("Luis", p5);
        mapaTree.put("Marta", p7);
        mapaTree.put("Carla", p10);
        mapaTree.put("Laura", p9);
        mapaTree.put("Jorge", p8);
        mapaTree.put("Ana", p6);

        mensaje = "TreeMap de personas: ";
        service.printMap(mensaje, mapaTree);
    }
}
