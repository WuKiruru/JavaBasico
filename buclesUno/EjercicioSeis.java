package buclesuno;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Vamos a realizar una nueva versión con bucles del ejercicio de adivinar un número aleatorio 
        visto anteriormente. Escoge la estructura de iteración que consideres más apropiada.
        El programa deberá generar automáticamente un número aleatorio entre 0 – 10, usando la
        función Math.random, y luego el usuario deberá tratar de adivinarlo.
            a) El programa continuará solicitando un número hasta que el usuario lo acierte.
            b) Se establecerá un número máximo de 3 intentos para adivinarlo
        */
        
        System.out.println("Vamos a ver si puedes adivinar el número: ");

        int min = 1;
        int max = 11;

        for (int i = 1; i < 2; i++) {
            int numero = (int) Math.floor(Math.random() * (min - (max + 1)) + (max));

            for (int e = 0; e < 3; e++) {

                System.out.print("Teclea el número que crees correcto 0-10: ");
                int respuesta = s.nextInt();

                if (respuesta == numero) {
                    System.out.println("¡Felicidades! Has acertado el número.");
                    System.out.println("El número secreto era el " + (numero));
                    System.out.println("Tú número ha sido el " + (respuesta));
                } else if (respuesta != numero) {
                    if ((e == 0) || (e == 1)) {
                        System.out.println("¡Incorrecto! Te has equivocado en el número.");
                        System.out.println("Tú número ha sido el " + (respuesta));
                        System.out.println("Vuelve a repetirlo, este es el intento " + (e + 1) + " ,tienes hasta 3 intentos.");
                        System.out.println(" ");
                    } else if (e == 2) {
                        System.out.println("¡Incorrecto! Te has equivocado en el número.");
                        System.out.println("Tú número ha sido el " + (respuesta));
                        System.out.println("Vuelve a repetirlo, este es el intento " + (e + 1) + " , GAME OVER.");
                    } else {
                        System.out.println("Error de formato, reinicie el programa.");
                    }
                }
            }
        }
    }
}
