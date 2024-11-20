package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nombres {

    private String nombre;

    public Nombres(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombres{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Sara", "María", "Juan", "Lucas");

        // Transformar cada nombre a mayúsculas
        List<String> nombresMayusculas = nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Nombres en mayúsculas: " + nombresMayusculas);
    }
}
