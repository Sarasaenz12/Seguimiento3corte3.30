package Sorted;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NombresOrdenados {

        private String nombre;

        public NombresOrdenados(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return nombre;
        }

        public static void main(String[] args) {
            List<NombresOrdenados> nombres = Arrays.asList(
                    new NombresOrdenados("Juan"),
                    new NombresOrdenados("Sara"),
                    new NombresOrdenados("Alejandra"),
                    new NombresOrdenados("")
            );


            List<String> nombresOrdenados = nombres.stream()
                    .map(NombresOrdenados::getNombre)
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Nombres ordenados alfabéticamente: " + nombresOrdenados);
        }
    }
