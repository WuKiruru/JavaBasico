package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioOcho {
    
    // Constantes
    static double euroshora = 12;
    static double dias = 5;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Escribe un programa que calcule el salario semanal de un empleado en 
        base a las horas trabajadas, a razón de 12 euros la hora. */

        System.out.print("Porfavor, introduce las horas trabajadas cada día: ");
        double horas = s.nextDouble();

        double horastotales = dias * horas;
        double total = horastotales * euroshora;

        System.out.println("El trabajador cobra por semana un total de " + (total) + " euros");
    }
}
