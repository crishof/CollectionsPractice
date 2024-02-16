import model.Persona;
import service.CollectionService;

import java.util.ArrayList;
import java.util.List;

public class ListaArray {
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

        mensaje = "ArrayList de personas: ";
        service.print(mensaje, listaArray);

        // Add an item
        listaArray.add(5, p10);
        mensaje = "Agregamos p10 al indice 5: ";
        service.print(mensaje, listaArray);

        // Access an item
        System.out.println();
        System.out.println("Obtenemos elemento de la posicion 5: ");
        System.out.println(listaArray.get(5));

        // Change an item
        listaArray.set(5, p10);
        mensaje = "Cambiamos el elemento en la posicion 5 por p10: ";
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
