package arrayuno;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los 
        elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de 
        la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. 
        Finalmente, muestra el contenido del array. */
        
        int[] numero = new int[15];
        int i;

        System.out.println("Introduce 15 números diferentes:");
        for (i = 0; i < 15; i++) {
            numero[i] = s.nextInt();
        }

        System.out.println();

        System.out.println("El siguiente es el Array introducido:");
        for (i = 0; i < 15; i++) {
            System.out.printf("/%3d ", numero[i]);
        }

        int aux = numero[14];

        for (i = 14; i > 0; i--) {
            numero[i] = numero[i - 1];
        }
        numero[0] = aux;

        System.out.println();

        System.out.println("El siguiente es el Array desplazando la posición:");
        for (i = 0; i < 15; i++) {
            System.out.printf("/%3d ", numero[i]);
        }
        System.out.println();
    }
}
