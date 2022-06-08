package arrayuno;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por 
        pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a 
        continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista 
        generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
        Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por 
        pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a 
        continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista 
        generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
        */
        
        int[] numero = new int[100];
        int i;

        for (i = 0; i < 100; i++) {
            numero[i] = (int) (Math.random() * 21);
            System.out.print(numero[i] + "  ");
        }

        System.out.println();
        System.out.println();
        System.out.print("Escribe un número de los aleatorios mostrados para intercambiarlo: ");
        int numerouno = s.nextInt();
        System.out.print("Escribe el número por el que lo quieres cambiar: ");
        int numerodos = s.nextInt();

        System.out.println();

        for (i = 0; i < 100; i++) {
            if (numero[i] == numerouno) {
                numero[i] = numerodos;
                System.out.print("\"" + numero[i] + "\"  ");
            } else {
                System.out.print(numero[i] + "  ");
            }
        }

        System.out.println();
    }
}
