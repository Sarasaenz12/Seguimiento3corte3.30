package ForEach;

import java.util.*;
import java.util.stream.*;

public class CalificacionMayor {
    private String nombre;
    private double calificacion;

    public CalificacionMayor(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return "CalificacionMayor{" +
                "nombre='" + nombre + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }

    public static void main(String[] args) {
        // Crear una lista de estudiantes
        List<CalificacionMayor> estudiantes = Arrays.asList(
                new CalificacionMayor("Juan", 8.5),
                new CalificacionMayor("Ana", 6.3),
                new CalificacionMayor("Pedro", 7.9),
                new CalificacionMayor("Maria", 5.2)
        );

        // Usar Stream y forEach para imprimir solo los estudiantes con calificación mayor a 7
        estudiantes.stream()
                .filter(estudiante -> estudiante.getCalificacion() > 7)  // Filtramos los estudiantes con calificación mayor a 7
                .forEach(estudiante -> System.out.println(estudiante.getNombre()));  // Imprimimos el nombre de los estudiantes
    }
}
