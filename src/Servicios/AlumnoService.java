package Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

import javax.swing.text.StyledEditorKit.BoldAction;

import java.util.Iterator;

import Entidades.Alumno;

public class AlumnoService {
    ///
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in).useDelimiter("\n");

    boolean condition = false;

    ///
    public void crearAlumno(ArrayList<Alumno> alumnos) {
        do {
            System.out.println("Ingrese nombre del Alumno a crear: ");
            String nombre = leer2.nextLine();
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese la nota 1: ");
            Integer nota1 = leer.nextInt();
            System.out.println("Ingrese la nota 2: ");
            Integer nota2 = leer.nextInt();
            System.out.println("Ingrese la nota 3: ");
            Integer nota3 = leer.nextInt();
            notas.add(nota1);
            notas.add(nota2);
            notas.add(nota3);
            Alumno creado = new Alumno(nombre, notas);
            alumnos.add(creado);
            String responde;
            System.out.println("Si desea crear otro Alumno ingrese 'S' Caso contrario ingrese 'N': ");
            responde = leer2.nextLine();
            if (responde.equalsIgnoreCase("s")) {
                condition = true;
            } else {
                condition = false;
            }
        } while (condition);
        System.out.println("La lista de alumnos quedo asi: " + alumnos.toString());
    }

    /// Metodo para notas
    public void notaFinal(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese el alumno cuya nota final quiere calcular: ");
        String respuestaNotaFinal = leer2.nextLine();
        Iterator<Alumno> it = alumnos.iterator();
        double promedio = 0;
        boolean encontrado = false;
        while (it.hasNext()) {
            Alumno aux = it.next();
            int suma = 0;
            if (aux.getNombre().equalsIgnoreCase(respuestaNotaFinal)) {
                for (Integer nota : aux.getListaNotas()) {
                    suma += nota;
                }
                promedio = suma / aux.getListaNotas().size();
                encontrado = true;
                if (encontrado) {
                    System.out.println("El promedio del alumno " + respuestaNotaFinal + " es: " + promedio);

                } else {
                    System.out.println("No se ha encontrado el alumno al que desea calcular su no ta final");
                }
            }

        }

    }
    ///
}
