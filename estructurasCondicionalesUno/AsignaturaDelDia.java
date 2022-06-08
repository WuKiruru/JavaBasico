package estructurascondicionalesuno;

import java.util.Scanner;

public class AsignaturaDelDia {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Escribe un programa que pida por teclado un día de la semana y que 
        diga qué asignatura toca a primera hora ese día. */

        System.out.print("¿Qué día de la semana es? ");
        String dia = s.next();

        if ("Lunes".equals(dia) || ("Viernes".equals(dia))) {
            System.out.println("Tienes M13 a primera hora");
        } else if ("Martes".equals(dia)) {
            System.out.println("Tienes M2 a primera hora");
        } else if ("Miercoles".equals(dia) || ("Jueves".equals(dia))) {
            System.out.println("Tienes M1 a primera hora");
        } else {
            System.out.println("¡No tienes clase hoy!");
        }
        System.out.println("¡Hasta mañana!");
    }
}
