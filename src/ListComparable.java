import model.Persona;
import service.CollectionService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparable {
    public static void main(String[] args) {

        CollectionService service = new CollectionService();
        String mensaje = "";

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


        List<Persona> listaArray = new ArrayList<>();
        service.addPersons(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, listaArray);


        // Comparator implementando Comparable
        Collections.sort(listaArray);

        // Comparator externo usando atributos de clase INT
        Comparator<Persona> compareAge = Comparator.comparingInt(Persona::getAge);
        Collections.sort(listaArray, compareAge);

        // Comparator usando atributos de clase STRING
        Comparator<Persona> compareName = Comparator.comparing(Persona::getName);
        Collections.sort(listaArray, compareName);

        // Comparator interno de la clase
        Collections.sort(listaArray, Persona.COMPARADOR_POR_DEPORTE);

        mensaje = "Ordenamos la lista: ";
        service.print(mensaje, listaArray);
    }
}
