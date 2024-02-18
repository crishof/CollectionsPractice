import model.Persona;
import service.CollectionService;

import java.util.Stack;

public class ListaStack {
    public static void main(String[] args) {


        String mensaje;
        CollectionService service = new CollectionService();

        // LISTA STACK (FILO)

        Stack<Persona> listaStack = new Stack<>();
        service.crearPersonas(listaStack);

        Persona p11 = new Persona("Antonio", 35, "Tenis");

        // Add an item
        listaStack.push(p11);

        mensaje = "Stack de personas: ";
        service.print(mensaje, listaStack);

        // Elimina el ultimo elemento de la lista
        listaStack.pop();

        // Peek, muestra el ultimo elemento de la lista sin eliminarlo.
        listaStack.peek();

        // Buscamos un elemento
        // busca el elemento en la pila, si lo encuentra devuelve su posicion, si no devuelve -1.
        System.out.println(listaStack.search(p11));

        // Boolean is Empty
        System.out.println("Esta vacía = " + listaStack.isEmpty());
    }
}
