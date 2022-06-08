package buclesdos;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Realiza un programa que:
            • Pida números hasta que se introduzca un numero negativo
            • Tras introducir un número negativo el programa deberá mostrar:
                o Cuantos números se han introducido, 
                o la media de los impares 
                o y el mayor de los pares. 
            • El número negativo sólo se utiliza para indicar el final de la introducción de datos 
            pero no se incluye en los cálculos.
        */
        
        double dividendo = 0;
        double nopar = 0;
        int contadorimp = 0;
        double mayor = 0;
        int numeros = 0;
        double num;

        do {
            System.out.print("Introduce un número negativo: ");
            num = s.nextDouble();

            if (num % 2 != 0) {
                nopar = num;
                dividendo += num;
                contadorimp++;
            } else {
                if (num > mayor) {
                    mayor = num;
                }
            }
            numeros++;
        } while (num >= 0);

        double total = (dividendo - nopar) / (contadorimp - 1);
        System.out.println("Ha introducido " + numeros + " números.");
        System.out.println("La media de los impares es: " + total);
        System.out.println("El número par mas alto que has introducido a sido el: " + mayor);
    }
}
