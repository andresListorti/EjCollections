package Servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class PaisesService {
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
    boolean condition = false;
    ///

    public void agregarPaises(HashSet<String> paises) {
        do {
            System.out.println("Ingrese el nombre del Pais: ");
            String nombre = leer2.nextLine();
            paises.add(nombre);
            String responde;
            System.out.println("Si desea crear otra Pelicula ingrese 'S' Caso contrario ingrese 'N': ");
            responde = leer2.nextLine();
            if (responde.equalsIgnoreCase("s")) {
                condition = true;
            } else {
                condition = false;
            }
        } while (condition);
        System.out.println("La lista de Paises quedo asi: " + paises.toString());
    }

    public void ordenarAlfabeticamente(HashSet<String> paises) {
        ArrayList<String> paisesA = new ArrayList<>(paises);

        Collections.sort(paisesA);
        System.out.println("La lista de Paises ordenada alfabeticamente quedo asi: " + paisesA.toString());

    }

    ///
    //
    public void eliminarPais(HashSet<String> paises) {
        System.out.println("Ingrese el nombre del Pais que desea eliminar: ");
        String nombre = leer2.nextLine();
        Iterator<String> it = paises.iterator();
        boolean loTiene = false;
        while (it.hasNext()) {
            String otra = it.next();
            if (otra.equalsIgnoreCase(nombre)) {
                loTiene = true;
            }
        }
        if (loTiene) {
            paises.remove(nombre);
            System.out.println("La lista de Paises sin el eliminado quedo asi: " + paises.toString());
        } else {
            System.out.println("El pais ingresado no se encuentra en la lista");
        }

    }

}
