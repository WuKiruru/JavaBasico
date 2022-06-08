package buclesdos;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* La serie de Fibonacci la forman una serie de números tales que:
            • El primer término de la serie es el número 0
            • El segundo término de la serie es el número 1
            • Los siguientes términos de la serie de Fibonacci se obtienen de la suma de los 
            dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…
            
        Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
            El número n se debe introducir por teclado.
        */
        
        System.out.print("Escribe un número *n* y calcularemos los número de la serie Fibonacci: ");
        int numero = s.nextInt();

        int valorcero = 0;
        int valoruno = 1;
        int calculo;

        if (numero == 0) {
            System.out.println("OK, no te imprimo nada entonces.");
        } else if (numero == 1) {
            System.out.println("0");
        } else if (numero > 1) {
            for (int i = 1; i <= numero; i++) {

                calculo = valorcero;
                valorcero = valoruno + valorcero;
                valoruno = calculo;

                System.out.println(valoruno);
            }
        } else {
            System.out.println("Has escrito 0 o un número negativo, no se imprimira ninguna serie de Fibonacci.");
        }
    }
}
