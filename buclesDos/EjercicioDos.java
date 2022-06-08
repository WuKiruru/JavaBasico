package buclesdos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Realiza un programa que pinte una pirámide rellena por pantalla. 
        La altura y el carácter de relleno se deben pedir por teclado. */
        
        System.out.print("Escribe el número de lineas que quieres imprimir para construir la piramide: ");
        int numero = s.nextInt();
        System.out.print("Escribe el simbolo con el que quieres que se construya la piramide: ");
        String simbolo = s.next();

        int interlineado = 0;

        for (int i = 1; i <= numero; i++, interlineado = 0) {
            for (int espacio = 1; espacio <= numero - i; espacio++) {
                System.out.print("  ");
            }

            while (interlineado != 2 * i - 1) {
                System.out.print(simbolo + " ");
                interlineado++;
            }
            System.out.println();
        }
    }
}
