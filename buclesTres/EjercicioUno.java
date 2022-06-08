package buclestres;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que pida un número por pantalla y devuelva la suma de sus dígitos. */
        
        int numero;
        int calculo = 0;

        System.out.print("Introduce un número y sumaremos sus digitos: ");
        numero = s.nextInt();

        while (numero > 0) {
            calculo += numero % 10;
            numero = numero / 10;
        }
        System.out.println("La suma es: " + calculo);
    }
}
