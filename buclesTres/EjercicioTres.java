package buclestres;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Escribe un programa que imprima los caracteres de una variable String 
        de la siguiente forma:
            • Un carácter por línea
            • Que las líneas formen una diagonal
        */

        System.out.print("Porfavor, introduce una palabra: ");
        String palabra = s.next();

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("   ");
            }
            System.out.println(palabra.charAt(i));
        }
    }
}
