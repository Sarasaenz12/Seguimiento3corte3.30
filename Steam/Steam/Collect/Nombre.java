package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nombre {

    public static void main(String[] args) {

        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Pedro", 20),
                new Persona("Maria", 35),
                new Persona("Luis", 40)
        );


        String nombresConcatenados = personas.stream()
                .map(Persona::getNombre) //
                .collect(Collectors.joining(", "));


        System.out.println("Nombres concatenados: " + nombresConcatenados);
    }
}
