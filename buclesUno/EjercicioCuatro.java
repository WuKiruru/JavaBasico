package buclesuno;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que muestre en tres columnas, el cuadrado(base*base) y el cubo 
        (base*base*base) de los 5 primeros números enteros a partir de uno que seintroduce por 
        teclado(usa printf).*/
        
        System.out.print("Introduce el número para saber su resultado al cuadrado y al cubo de sus 5 siguientes números: ");
        int numero = s.nextInt();

        for (int i = 1; i <= 5; i++) {
            int resultado = numero + i;
            int calculo = resultado;
            int cuadrado = calculo *= calculo;
            int cubo = resultado * resultado * resultado;
            System.out.println("El número " + (i) + " es el siguiente: " + (resultado));
            System.out.println("Al cuadrado: " + (cuadrado));
            System.out.println("Al cubo: " + (cubo));
        }
    }
}
