package arraydos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un 
        array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas 
        igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina 
        inferior derecha. */
        
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
