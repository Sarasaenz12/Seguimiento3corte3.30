package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numeros {

    private int numeros;

    public Numeros(int numeros) {
        this.numeros = numeros;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        List<Numeros> numeros = Arrays.asList(
                new Numeros(1),
                new Numeros(2),
                new Numeros(3),
                new Numeros(4),
                new Numeros(5)
        );

        List<Integer> por5 = numeros.stream()
                .map(n -> n.getNumeros() * 5)
                .collect(Collectors.toList());

        System.out.println("Quintuple de los números: " + por5);
    }
}
