package estructurascondicionalesdos;

import java.util.Scanner;

public class NumDigitos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Crea un programa que calcule el número de dígitos que tiene un número. 
        Se aceptarán números de como máximo 5 cifras. El número puede ser positivo 
        o negativo. */
        
        System.out.print("Este programa calculara cuantos digitos tiene tú número, escribe un número de como maximo 5 cifras: ");
        int numero = s.nextInt();

        if ((numero >= -9) && (numero <= 9)) {
            System.out.println("El numero " + (numero) + " es de un digito.");
        } else if ((numero >= -99) && (numero <= 99)) {
            System.out.println("El numero " + (numero) + " es de dos digitos.");
        } else if ((numero >= -999) && (numero <= 999)) {
            System.out.println("El numero " + (numero) + " es de tres digitos.");
        } else if ((numero >= -9999) && (numero <= 9999)) {
            System.out.println("El numero " + (numero) + " es de cuatro digitos.");
        } else if ((numero >= -99999) && (numero <= 99999)) {
            System.out.println("El numero " + (numero) + " es de cinco digitos.");
        } else {
            System.out.println("Ese número supera los esperados.");
        }
    }
}
