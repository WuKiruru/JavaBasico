package arrayuno;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que pida 10 números por teclado y que luego muestre los números 
        introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo 
        respectivamente. */
        
        int[] numero;
        numero = new int[10];

        int nummax = 0;
        int nummin = 999999999;

        System.out.println("Introduce 10 numeros deseados: ");

        for (int i = 0; i < 10; i++) {
            numero[i] = s.nextInt();

            if (numero[i] > nummax) {
                nummax = numero[i];
            }
            if (numero[i] < nummin) {
                nummin = numero[i];
            }
        }

        System.out.println("Los numeros son: ");

        for (int i = 0; i < 10; i++) {
            if (numero[i] == nummax) {
                System.out.println(nummax + " maximo");
            } else if (numero[i] == nummin) {
                System.out.println(nummin + " minimo");
            }
        }
    }
}
