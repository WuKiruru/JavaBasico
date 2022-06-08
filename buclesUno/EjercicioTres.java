package buclesuno;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Muestra la tabla de multiplicar de un número introducido por teclado. */
        
        System.out.print("Introduce el número para saber su tabla de multiplicar (hasta x10): ");
        int numero = s.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println((numero) + ("*") + (i) + ("=") + (resultado));
        }
    }
}
