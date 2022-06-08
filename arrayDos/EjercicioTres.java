package arraydos;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        /* Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan 
        en la pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda 
        “pensando” antes de mostrar los números. (usa la función sleep) */
        
        int[][] num = new int[4][5];

        int fila;
        int columna;

        System.out.println("Introduce los números correspondientes: ");

        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                num[fila][columna] = s.nextInt();
            }
        }

        System.out.println("");
        System.out.println("La tabla es la siguiente: ");

        int sumFil;
        for (fila = 0; fila < 4; fila++) {
            sumFil = 0;
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%7d   ", num[fila][columna]);
                sumFil += num[fila][columna];
            }
            Thread.sleep(5000);
            System.out.printf("|%7d\n", sumFil);
        }

        for (columna = 0; columna < 5; columna++) {
            System.out.print("___________");
        }
        System.out.println("____________");

        int sumColum;
        int sumTot = 0;
        for (columna = 0; columna < 5; columna++) {
            sumColum = 0;
            for (fila = 0; fila < 4; fila++) {
                sumColum += num[fila][columna];
            }

            sumTot += sumColum;
            System.out.printf("%7d   ", sumColum);
        }
        System.out.printf("|%7d   ", sumTot);
        System.out.println("");
        System.out.println("");
    }
}
