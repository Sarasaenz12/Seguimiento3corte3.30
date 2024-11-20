package ForEach;

import java.util.*;
import java.util.stream.*;

public class NombreDeLibros {
    private String nombre;

    public NombreDeLibros(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "NombreDeLibros{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<NombreDeLibros> libros = Arrays.asList(
                new NombreDeLibros("Cien años de soledad"),
                new NombreDeLibros("Don Quijote de la Mancha"),
                new NombreDeLibros("1984"),
                new NombreDeLibros("La sombra del viento")
        );

        libros.stream()
                .map(NombreDeLibros::getNombre)
                .forEach(System.out::println);
    }
}
