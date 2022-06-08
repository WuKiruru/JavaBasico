package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /* Adapta el ejercicio 2 de la práctica 2 para que en lugar de asignar 
        un nombre fijo a la variable nombre, lo solicite por pantalla asígnale 
        tu nombre completo. Muestra el valor leído por pantalla. */
        System.out.print("Introduce tu nombre a continuación: ");
        String nombre = teclado.next();

        System.out.println("Confirmado, tu nombre es: " + (nombre));
    }
}
