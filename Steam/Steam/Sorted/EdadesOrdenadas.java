package Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EdadesOrdenadas {
    private String nombre;
    private int edad;


    public EdadesOrdenadas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    public static void main(String[] args) {
        List<EdadesOrdenadas> personas = Arrays.asList(
                new EdadesOrdenadas("Juan", 38),
                new EdadesOrdenadas("Sara", 25),
                new EdadesOrdenadas("Alejandra", 45),
                new EdadesOrdenadas("Tatiana", 20)
        );


        List<EdadesOrdenadas> personasOrdenadasPorEdad = personas.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()))
                .collect(Collectors.toList());


        System.out.println("Personas ordenadas por edad de menor a mayor:");
        personasOrdenadasPorEdad.forEach(System.out::println);
    }
}
