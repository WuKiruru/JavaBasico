package buclesdos;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que calcule el factorial de un número entero leído por teclado. */
        
        System.out.print("Porfavor, introduzca un número entero: ");
        int numero = s.nextInt();

        int calculo = 1;

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {

                calculo = calculo * i;

            }
        }
        System.out.println(numero + ("! = ") + calculo);
    }
}
