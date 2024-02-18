import model.Persona;
import service.CollectionService;

import java.util.LinkedList;

public class ListaLinked {

    public static void main(String[] args) {

        CollectionService service = new CollectionService();
        String mensaje;

        // Declaro LinkedList para poder acceder a metodos especificos de la implementacion de la interfaz List
        LinkedList<Persona> listaLinked = new LinkedList<>();

        service.crearPersonas(listaLinked);

        mensaje = "LinkedList de personas: ";
        service.print(mensaje, listaLinked);

        Persona p11 = new Persona("Antonio", 35, "Tenis");

        //Agrega un item a la primera posicion
        listaLinked.addFirst(p11);
        //Agrega un item a la ultima posicion
        listaLinked.addLast(p11);
        //Agrega un item a una posicion especifica
        listaLinked.add(0, p11);
        // Boolean is Empty
        System.out.println("Esta vacía = " + listaLinked.isEmpty());
    }
}
