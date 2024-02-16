package model;

import lombok.Data;

@Data
public class Persona {

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
}