package arrayuno;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con 
        la palabra “par” o “impar” según proceda. */
        
        int[] numero = new int[8];
        int i;

        System.out.println("Escribe 8 números para ver si son pares o impares: ");
        for (i = 0; i < 8; i++) {
            numero[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("Resultados: ");
        for (i = 0; i < 8; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i] + " par");
            } else {
                System.out.println(numero[i] + " impar");
            }
        }
    }
}
