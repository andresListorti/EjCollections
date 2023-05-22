/* Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas. */

import java.util.HashMap;
import java.util.Scanner;

import Entidades.Producto;
import Servicios.TiendaProductoService;

public class Ej06 {
    public static void main(String[] args) throws Exception {
        TiendaProductoService ps = new TiendaProductoService();
        HashMap<String, Double> productos = new HashMap<>();
        Scanner leer = new Scanner(System.in); // este mejor para numeros

        productos.put("Leche", 2.3);

        int respuesta = 0;
        do {

            System.out.println("Comienzo menu - los productos son: ");
            ps.mostrarProductos(productos);
            System.out.println("Que desea hacer: ");
            System.out.println("Presione 1 para Agregar Producto: ");
            System.out.println("Presione 2 para cambiar precio: ");
            System.out.println("Presione 3 para Eliminar Producto: ");
            System.out.println("Presione 4 para Mostrar los Productos: ");
            System.out.println("Presione 5 Para salir: ");
            respuesta = leer.nextInt();
            switch (respuesta) {
                case 1:
                    ps.agregarProducto(productos);
                    System.out.println(productos.toString());

                    break;
                case 2:

                    ps.modificarPrecio(productos);

                    break;
                case 3:

                    ps.eliminarProducto(productos);

                    break;
                case 4:
                    ps.mostrarProductos(productos);

                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Respuesta incorrecta");
                    break;
            }

        } while (respuesta != 5);

    }

}
