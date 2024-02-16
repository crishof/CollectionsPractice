package service;

import model.Persona;

import java.util.List;
import java.util.Map;

public class CollectionService {

    public void addPersons(Persona p1, Persona p2, Persona p3, Persona p4, Persona p5, Persona p6, Persona p7, Persona p8, Persona p9, Persona p10, List<Persona> lista) {
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);
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
