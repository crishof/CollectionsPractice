package model;

import lombok.Data;

import java.util.Comparator;

@Data
public class Persona implements Comparable<Persona> {

    // Comparator sin implementación Comparable
    public static final Comparator<Persona> COMPARADOR_POR_DEPORTE = Comparator.comparing(Persona::getDeporteFavorito);
    private String name;
    private int age;
    private String deporteFavorito;

    public Persona() {
    }

    public Persona(String name, int age, String deporteFavorito) {
        this.name = name;
        this.age = age;
        this.deporteFavorito = deporteFavorito;
    }

    @Override
    public String toString() {
        return "{ " + "name='" + name + '\'' + ", age=" + age + ", deporteFavorito='" + deporteFavorito + '\'' + '}';
    }

    // Implementacion de comparable
    @Override
    public int compareTo(Persona persona2) {
        return this.getName().compareTo(persona2.getName());
    }
}