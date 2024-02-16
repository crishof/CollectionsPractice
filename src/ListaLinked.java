import model.Persona;
import service.CollectionService;

import java.util.LinkedList;

public class ListaLinked {

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


        // Declaro LinkedList para poder acceder a metodos especificos de la implementacion de la interfaz List
        LinkedList<Persona> listaLinked = new LinkedList<>();
        service.addPersons(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, listaLinked);

        mensaje = "LinkedList de personas: ";
        service.print(mensaje, listaLinked);

        //Agrega un item a la primera posicion
        listaLinked.addFirst(p10);
        //Agrega un item a la ultima posicion
        listaLinked.addLast(p10);
        //Agrega un item a una posicion especifica
        listaLinked.add(0, p10);
        // Boolean is Empty
        System.out.println("Esta vacía = " + listaLinked.isEmpty());
    }
}
