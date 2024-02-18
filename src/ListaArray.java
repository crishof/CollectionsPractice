import model.Persona;
import service.CollectionService;

import java.util.ArrayList;

public class ListaArray {
    public static void main(String[] args) {

        CollectionService service = new CollectionService();
        String mensaje;

        ArrayList<Persona> listaArray = new ArrayList<>();

        service.crearPersonas(listaArray);

        mensaje = "ArrayList de personas: ";
        service.print(mensaje, listaArray);

        Persona p11 = new Persona("Antonio", 35, "Tenis");
        // Add an item
        listaArray.add(5, p11);
        mensaje = "Agregamos p11 al indice 5: ";
        service.print(mensaje, listaArray);

        // Access an item
        System.out.println();
        System.out.println("Obtenemos elemento de la posicion 5: ");
        System.out.println(listaArray.get(5));

        // Change an item
        listaArray.set(5, p11);
        mensaje = "Cambiamos el elemento en la posicion 5 por p11: ";
        service.print(mensaje, listaArray);

        // Remove an item
        listaArray.remove(5);
        mensaje = "Removemos el elemento de la posicion 5: ";
        service.print(mensaje, listaArray);

        // Remove all elements
        listaArray.clear();
        mensaje = "Removemos todos los elementos: ";
        service.print(mensaje, listaArray);

        // Boolean is Empty
        System.out.println("Esta vacía = " + listaArray.isEmpty());

    }
}
