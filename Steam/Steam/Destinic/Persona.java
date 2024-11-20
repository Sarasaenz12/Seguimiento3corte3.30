package Destinic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;


public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    public static void main(String[] args) {

        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Juan", 25),
                new Persona("Luis", 40),
                new Persona("Ana", 30),
                new Persona("Maria", 35),
                new Persona("Luis", 40)
        );

        List<Persona> personasUnicas = personas.stream()
                .distinct()
                .collect(Collectors.toList());


        System.out.println("Personas únicas: " + personasUnicas);
    }
}
