package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioNueve {

    // Constants
    static double pi = 3.1416;
    static int tercio = 3;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que calcule el volumen de un cono según la fórmula 
        𝑉 = 1/3𝜋𝑟2h */
        System.out.print("Introduce la altura en cm: ");
        double altura = s.nextDouble();
        System.out.print("Introduce el diámetro en cm: ");
        double diametro = s.nextDouble();

        double diametrototal = diametro / 2;
        double diametrofinal = diametrototal * diametrototal;
        double total = (altura * pi * diametrofinal) / tercio;

        System.out.println("El volumen total de tu cono es el siguiente: " + (total) + " cm3");
    }
}
