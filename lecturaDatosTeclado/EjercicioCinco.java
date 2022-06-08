package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioCinco {
    
    //Constantes
    static double ivasuma = 1.21;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Adapta el ejercicio 5 de la práctica 2 para que el programa que calcule 
        el total de una factura solicite al usuario la base imponible (precio sin IVA). 
        El valor del IVA deberás declararlo una constante. */
        
        System.out.print("Porfavor, introduce la base imponible: ");
        double bimponible = s.nextDouble();

        double total = bimponible * ivasuma;

        System.out.println("El total de la factura es: " + (total) + " euros");
    }
}
