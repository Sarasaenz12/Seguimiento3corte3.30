package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Edad {

    public static void main(String[] args) {

        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Pedro", 20),
                new Persona("Maria", 35),
                new Persona("Luis", 40)
        );

        List<Integer> edadesMayores = personas.stream()
                .filter(persona -> persona.getEdad() > 30) // Filtrar edades mayores a 30
                .map(Persona::getEdad) // Extraer edades
                .collect(Collectors.toList()); // Recoger en una lista


        System.out.println("Edades mayores a 30: " + edadesMayores);
}}
