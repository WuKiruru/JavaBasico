package arrayuno;

import java.util.Scanner;

public class EjercicioOcho {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Realiza un programa que pida 10 números por teclado y que los almacene en un array. A 
        continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello 
        una tabla. Seguidamente el programa pasará los primos a las primeras posiciones, desplazando 
        el resto de los números (los que no son primos) de tal forma que no se pierda ninguno. Al final 
        se debe mostrar el array resultante. */
        
        int[] num = new int[10];
        int[] resultado = new int[10];
        int contador = 0;
        int cuentaArray = 0;
        int prim = 0;
        int prueba = 0;

        System.out.println("Introduce los 10 números correspondientes: ");
        for (int i = 0; i < 10; i++) {
            num[i] = s.nextInt();
        }

        System.out.println("Indice correspondiente: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + num[i]);
        }

        for (int i = 0; i < 10; i++) {
            do {
                prim++;
                prueba = num[i] % prim;

                if (prueba == 0) {
                    contador++;
                } else {
                }
            } while (prim != num[i]);

            if (contador == 2) {
                resultado[cuentaArray] = num[i];
                cuentaArray++;
            } else {
            }

            contador = 0;
            prim = 0;
        }

        for (int i = 0; i < 10; i++) {
            do {
                prim++;
                prueba = num[i] % prim;

                if (prueba == 0) {
                    contador++;
                } else {
                }
            } while (prim != num[i]);

            if (contador != 2) {
                resultado[cuentaArray] = num[i];
                cuentaArray++;
            } else {
            }

            contador = 0;
            prim = 0;
        }

        System.out.println("Resultado Final Array: ");
        System.out.println("Resultado Indice: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + resultado[i]);
        }
    }
}
