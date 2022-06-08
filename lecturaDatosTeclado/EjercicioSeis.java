package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Adapta el ejercicio 6 de la práctica 2 para solicitar el valor de las 
        variables de tipo char y el valor de la variable de tipo String. Muéstralas 
        por pantalla todas juntas en la misma línea y con una sola sentencia de Java
        (con un solo println. */
        System.out.print("Porfavor, introduce tú nombre completo: ");
        String nombre = s.next();
        System.out.print("Porfavor, introduce la primera letra de tu nombre: ");
        char letra = (s.next()).charAt(0);

        System.out.println("Tú nombre completo es " + (nombre) + " y comienza con la letra " + (letra));
    }
}
