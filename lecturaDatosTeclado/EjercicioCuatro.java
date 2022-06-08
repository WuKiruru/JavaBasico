package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Adapta el ejercicio 4 de la práctica 2 para que el conversor de euros 
        a otra moneda solicite la divisa a la que se va a cambiar, la cantidad 
        en euros que se quiere convertir y el cambio aplicado. */
        System.out.print("Introduce la divisia que quieres recibir: ");
        String divisa = s.next();
        System.out.print("Introduce la cantidad de euros a cambiar: ");
        double euros = s.nextDouble();
        System.out.print("Introduce el tipo de cambio actual: ");
        double tipo = s.nextDouble();

        double total = euros * tipo;

        System.out.println("Recibira un total de: " + (total) + (" ") + (divisa));
    }
}
