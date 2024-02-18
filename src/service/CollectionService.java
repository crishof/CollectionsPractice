package service;

import model.Persona;

import java.util.List;
import java.util.Map;

public class CollectionService {

    public void crearPersonasMapa(Map<String, Persona> mapa) {

        mapa.put("Carlos", new Persona("Carlos", 23, "Futbol"));
        mapa.put("Maria", new Persona("Maria", 25, "Basket"));
        mapa.put("Juan", new Persona("Juan", 20, "Tenis"));
        mapa.put("Pedro", new Persona("Pedro", 30, "Voley"));
        mapa.put("Luis", new Persona("Luis", 28, "Futbol"));
        mapa.put("Ana", new Persona("Ana", 22, "Basket"));
        mapa.put("Marta", new Persona("Marta", 27, "Tenis"));
        mapa.put("Jorge", new Persona("Jorge", 21, "Voley"));
        mapa.put("Laura", new Persona("Laura", 24, "Futbol"));
        mapa.put("Carla", new Persona("Carla", 26, "Basket"));
    }

    public void crearPersonas(List<Persona> lista) {

        lista.add(new Persona("Carlos", 23, "Futbol"));
        lista.add(new Persona("Maria", 25, "Basket"));
        lista.add(new Persona("Juan", 20, "Tenis"));
        lista.add(new Persona("Pedro", 30, "Voley"));
        lista.add(new Persona("Luis", 28, "Futbol"));
        lista.add(new Persona("Ana", 22, "Basket"));
        lista.add(new Persona("Marta", 27, "Tenis"));
        lista.add(new Persona("Jorge", 21, "Voley"));
        lista.add(new Persona("Laura", 24, "Futbol"));
        lista.add(new Persona("Carla", 26, "Basket"));
    }

    public void print(String mensaje, List<Persona> lista) {

        System.out.println("""
                                
                                
                  
                //// /// /// ///
                """ + mensaje + '\n' + """
                Tamaño de la lista:\s""" + lista.size() + '\n' + """
                //// /// /// ///
                """);

        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Elemento en la posicion " + i + ": " + lista.get(i));
        }
    }

    public void printMap(String mensaje, Map<String, Persona> mapa) {

        System.out.println("""
                                
                                
                //// /// /// ///
                """ + mensaje + '\n' + """
                Tamaño del mapa:\s""" + mapa.size() + '\n' + """
                //// /// /// ///
                """);

        for (Map.Entry<String, Persona> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
