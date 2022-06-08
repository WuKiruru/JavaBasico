package estructurascondicionalesuno;

import java.util.Scanner;

public class Ecuacion {
    
    //Constantes
    static final double VALOR_CERO = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0). */

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        System.out.print("Por favor, introduzca el valor de a: ");
        double valora = s.nextInt();

        System.out.print("Por favor, ahora introduczca el valor de b: ");
        double valorb = s.nextInt();

        double equacion = (VALOR_CERO - valorb) / valora;

        if ((valora != 0) && (valorb != 0)) {
            System.out.println("x = " + (equacion));
        } else {
            System.out.println("Esta equación no tiene solución real.");
        }
    }
}
