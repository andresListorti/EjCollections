package Servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Entidades.Producto;

public class TiendaProductoService {
    Scanner leer = new Scanner(System.in); //// numeros
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n"); // letras

    boolean condition = false;

    public void agregarProducto(HashMap<String, Double> productos) {
        do {
            System.out.println("Ingrese nombre del Producto a crear: ");
            String nombre = leer2.nextLine();
            System.out.println("Ingrese el precio del Producto a crear: ");
            Double precio = leer.nextDouble();
            productos.put(nombre, precio);
            String responde;
            System.out.println("Si desea crear otra Pelicula ingrese 'S' Caso contrario ingrese 'N': ");
            responde = leer2.nextLine();
            if (responde.equalsIgnoreCase("s")) {
                condition = true;
            } else {
                condition = false;
            }
        } while (condition);
        System.out.println("LA lista MAPA de productos quedo asi: " + productos.toString());

    }

    public void modificarPrecio(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto a modificar su precio");

        String respuesta2 = leer2.nextLine();
        if (productos.containsKey(respuesta2)) {
            System.out.println("Ingrese el nuevo precio de " + respuesta2);
            Double precio = leer.nextDouble();
            productos.put(respuesta2, precio);
        } else {
            System.out.println("El producto " + respuesta2 + " No existe");
        }
    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String respuesta3 = leer2.nextLine();
        if (productos.containsKey(respuesta3)) {
            System.out.println("Eliminamos " + respuesta3);
            productos.remove(respuesta3);
        } else {
            System.out.println("El producto " + respuesta3 + " No existe");
        }
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        System.out.println("Los productos son: ");
        ArrayList<String> lista = new ArrayList<>(productos.keySet());
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void promedioProductos(HashMap<String, Double> productos) {

    }

}
