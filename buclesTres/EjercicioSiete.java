package buclestres;

import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Realiza un programa siguiendo las instrucciones del diagrama de flujo. */
        
        System.out.print("Ingresa un número entero: ");
        int num = s.nextInt();

        boolean es_primo = true;

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                es_primo = false;
                System.out.println("El numero " + num + " es divisible entre " + i);
            }
        }

        if (es_primo == true) {
            System.out.println("El numero " + num + " es primo");

        } else if (es_primo == false) {
            System.out.println("El numero " + num + " no es primo");
        }
    }
}
