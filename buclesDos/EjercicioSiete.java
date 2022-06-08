package buclesdos;

import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Realiza un programa que pinte una pirámide rellena por pantalla. 
        La altura y el carácter de relleno se deben pedir por teclado. */

        System.out.print("Introduce la altura: ");
        int altura = s.nextInt();

        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < ((altura / 2) + 1); i++) {
            System.out.print("* ");
        }
    }
}
