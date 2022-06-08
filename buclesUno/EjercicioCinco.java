package buclesuno;

import java.util.Scanner;

public class EjercicioCinco {
    
    //Constantes
    static final int DIVISION = 10;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Crea un programa (usando bucles) que calcule el número de dígitos que tiene un número
        introducido desde el teclado. El número puede ser positivo o negativo. */
        
        System.out.print("Introduce el número para saber cuantos dígitos tiene: ");
        int numero = s.nextInt();
        int digito = 0;

        while (numero != 0) {
            numero /= DIVISION;
            digito++;
        }
        System.out.println("Este número tiene un total de " + (digito) + " dígito/s.");
    }
}
