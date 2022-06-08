package buclestres;

import java.util.Scanner;

public class EjercicioSeis {

    static final int MAXIMO = 5;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Sigue las indicaciones del diagrama de flujo para implementar el programa. */

        int numAlumno = 1;
        int sumaNotas = 0;

        do {
            System.out.print("Introduce la nota del alumno " + numAlumno + ": ");
            int nota = s.nextInt();

            sumaNotas = sumaNotas + nota;
            numAlumno = numAlumno + 1;

        } while (numAlumno <= MAXIMO);

        int media = sumaNotas / (numAlumno - 1);

        System.out.println("La nota media de los alumnos es " + media);
    }
}
