package buclesdos;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.*/

        System.out.print("Porfavor introduce un número para invertiro: ");
        int numero = s.nextInt();

        while (numero <= 0);
        int falta = numero;
        int numeroInvertido = 0;
        int resto = 0;
        int numeroFinal;

        while (falta != 0) {
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }

        System.out.println("El número a invertir es el siguiente: " + numero);
        System.out.println("El número invertido queda de la siguiente forma: " + numeroInvertido);
    }
}
