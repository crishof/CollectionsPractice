import model.Persona;
import service.CollectionService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparable {
    public static void main(String[] args) {

        CollectionService service = new CollectionService();
        String mensaje;

        List<Persona> listaArray = new ArrayList<>();
        service.crearPersonas(listaArray);

        mensaje = "ArrayList de personas: ";
        service.print(mensaje, listaArray);


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
