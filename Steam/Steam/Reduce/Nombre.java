package Reduce;

import java.util.*;
import java.util.stream.*;

public class Nombre {
    private String nombre;
    private int edad;

    public Nombre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {
        List<Nombre> personas = Arrays.asList(
                new Nombre("Juan", 25),
                new Nombre("Ana", 30),
                new Nombre("Pedro", 20),
                new Nombre("Maria", 35)
        );

        // Concatenar todos los nombres en un solo String
        String nombresConcatenados = personas.stream()
                .map(Nombre::getNombre) // Extraemos los nombres
                .reduce("", (a, b) -> a + " " + b); // Reducimos concatenando los nombres

        System.out.println("Nombres concatenados: " + nombresConcatenados);
    }
}
