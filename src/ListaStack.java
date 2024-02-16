import model.Persona;
import service.CollectionService;

import java.util.Stack;

public class ListaStack {
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

        // LISTA STACK (FILO)

        Stack<Persona> listaStack = new Stack<>();

        // Add an item
        listaStack.push(p1);
        listaStack.push(p2);
        listaStack.push(p3);
        listaStack.push(p4);
        listaStack.push(p5);
        listaStack.push(p6);
        listaStack.push(p7);
        listaStack.push(p8);
        listaStack.push(p9);
        listaStack.push(p10);

        mensaje = "Stack de personas: ";
        service.print(mensaje, listaStack);

        // Elimina el ultimo elemento de la lista
        listaStack.pop();

        // Peek, muestra el ultimo elemento de la lista sin eliminarlo.
        listaStack.peek();

        // Buscamos un elemento
        // busca el elemento en la pila, si lo encuentra devuelve su posicion, si no devuelve -1.
        System.out.println(listaStack.search(p1));

        // Boolean is Empty
        System.out.println("Esta vacía = " + listaStack.isEmpty());
    }
}
