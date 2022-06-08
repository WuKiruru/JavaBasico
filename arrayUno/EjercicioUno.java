package arrayuno;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Crea un programa que pida al usuario 10 números por teclado y que 
        luego los muestre en orden inverso, es decir, el primero que se introduce 
        es el último en mostrarse y viceversa. */
        
        int[] numero;
        numero = new int[10];

        System.out.println("Introduce 10 números para almacenarlos y te los mostraremos a la inversa: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numero[i] = s.nextInt();
        }

        System.out.println("");
        System.out.println("El orden quedara de la siguiente manera: ");
        System.out.println("");

        for (int i = 9; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }
}
