package estructurascondicionalesuno;

import java.util.Scanner;

public class Ecuacion2 {
    
    //Constantes
    static final int VALOR_CERO = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0). */
        
        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0");

        System.out.print("Por favor introdusca el valor de a: ");
        double valora = s.nextDouble();

        System.out.print("Por favor introdusca el valor de b: ");
        double valorb = s.nextDouble();

        System.out.print("Por favor introdusca el valor de c: ");
        double valorc = s.nextDouble();

        double discriminante = (Math.pow(valorb, 2) - (4 * valora * valorc));

        if (discriminante >= VALOR_CERO) {
            //Si el discriminante es igual a 0, solo hay una solución posible.
            if (discriminante == VALOR_CERO) {
                double resultado = (-valorb) / (2.0 * valora);
                System.out.println("El resultado de la ecuación es: " + (resultado));
            } //Si el discriminante es mayor que 0, hay dos soluciones posibles.
            else if (discriminante > VALOR_CERO) {

                System.out.println("Esta ecuación tiene dos resultados posibles:");

                double resultado = ((-valorb) + Math.sqrt(Math.pow(valorb, 2) - (4 * valora * valorc))) / (2 * valora);
                System.out.println("El resultado de la ecuación es: " + (resultado));

                double resultadodos = ((-valorb) - Math.sqrt(Math.pow(valorb, 2) - (4 * valora * valorc))) / (2 * valora);
                System.out.println("El segundo resultado de la ecuación es: " + (resultadodos));
            } //Si el discriminante es menor que 0, no hay solución posible.
            else {
                System.out.println("Error, si el discriminante es menor que 0 nop hay solución posible.");
            }
        }
    }
}
