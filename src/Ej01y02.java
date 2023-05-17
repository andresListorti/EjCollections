/* 1-----
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.  */
/* 2 ---- 
/* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada. */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Ej01y02 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> razasPerros = new ArrayList<>();
    boolean condition = false;do
    {
        String responde;
        System.out.println("Agregue raza de perro a la lista: ");
        razasPerros.add(leer.nextLine());
        System.out.println("Si desea agregar otra ingrese 'S' Caso contrario ingrese 'N': ");
        responde = leer.nextLine();
        if (responde.equalsIgnoreCase("s")) {
            condition = true;
        } else {
            condition = false;
        }
    }while(condition);

    System.out.println("Las razas ingresadas son: "+razasPerros.toString());

    Iterator<String> it = razasPerros.iterator();

    System.out.println("Ingrese raza de perro a buscar y eliminar: ");
    String aBuscarRaza = leer.nextLine();while(it.hasNext())
    {
        String aux = it.next();
        if (aux.equalsIgnoreCase(aBuscarRaza)) {
            it.remove();
        }
    }System.out.println("Las razas restantes son: "+razasPerros.toString());

}
