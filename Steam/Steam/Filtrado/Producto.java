package Filtrado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Cama", 150000));
        productos.add(new Producto("televisor", 250000));
        productos.add(new Producto("Lavadora", 300000));
        productos.add(new Producto("estufa", 350000));

        List<Producto> productosCaros = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .collect(Collectors.toList());

        System.out.println("Productos con precio mayor a $265000: " + productosCaros);
    }
}