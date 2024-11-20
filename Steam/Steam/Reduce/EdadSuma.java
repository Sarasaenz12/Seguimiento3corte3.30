package Reduce;

import java.util.*;
import java.util.stream.*;

public class EdadSuma {
    private String nombre;
    private int edad;

    public EdadSuma(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "EdadSuma{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {
        List<EdadSuma> personas = Arrays.asList(
                new EdadSuma("Juan", 25),
                new EdadSuma("Ana", 30),
                new EdadSuma("Pedro", 20),
                new EdadSuma("Maria", 35)
        );

        // Sumar todas las edades
        int sumaEdades = personas.stream()
                .map(EdadSuma::getEdad) // Extraemos las edades
                .reduce(0, (a, b) -> a + b); // Reducimos sumando las edades

        System.out.println("La suma de todas las edades es: " + sumaEdades);
    }
}