package Servicios;

import Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    boolean condition = false;

    ///
    public void crearPelicula() {
        do {
            System.out.println("Ingrese titulo de la Pelicula a crear: ");
            String titulo = leer2.nextLine();
            System.out.println("Ingrese el director de la pelicula a crear: ");
            String director = leer2.nextLine();
            System.out.println("Ingrese la duracion en horas: ");
            double duracion = leer.nextDouble();
            Pelicula creada = new Pelicula(titulo, director, duracion);
            peliculas.add(creada);
            String responde;
            System.out.println("Si desea crear otra Pelicula ingrese 'S' Caso contrario ingrese 'N': ");
            responde = leer2.nextLine();
            if (responde.equalsIgnoreCase("s")) {
                condition = true;
            } else {
                condition = false;
            }
        } while (condition);
        System.out.println("La lista de peliculas quedo asi: " + peliculas.toString());
    }

    public void mostrarTodaPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarTodaPeliculasMayorDe1Hora() {
        System.out.println("Las peliculas con duracion mayor a 1 hora son: ");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void mostrarPeliculasOrdenLargasPrimero() {
        System.out.println("Las peliculas ordenadas desde la mas larga a la mas corta: ");
        peliculas.sort(Pelicula.compararDuracionMayorAMenor);
        mostrarTodaPeliculas();
    }

    public void mostrarPeliculasOrdenCortasPrimero() {
        System.out.println("Las peliculas ordenadas desde la mas corta a la mas larga: ");
        peliculas.sort(Pelicula.compararDuracionMenorAMayor);
        mostrarTodaPeliculas();
    }

    public void mostrarPeliculasOrdenTitulo() {
        System.out.println("Las peliculas ordenadas por titulo: ");
        peliculas.sort(Pelicula.ordenarTitulo);
        mostrarTodaPeliculas();
    }

    public void mostrarPeliculasOrdenDirector() {
        System.out.println("Las peliculas ordenadas por director: ");
        peliculas.sort(Pelicula.ordenarDirector);
        mostrarTodaPeliculas();
    }

}
