package Destinic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;

public class Materia {
    private String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre='" + nombre + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(nombre, materia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public static void main(String[] args) {

        List<Materia> materias = Arrays.asList(
                new Materia("Matemáticas"),
                new Materia("Historia"),
                new Materia("Física"),
                new Materia("Matemáticas"),
                new Materia("Química"),
                new Materia("Historia"),
                new Materia("Biología")
        );


        List<Materia> materiasUnicas = materias.stream()
                .distinct()
                .collect(Collectors.toList());


        System.out.println("Materias únicas: " + materiasUnicas);
    }
}

