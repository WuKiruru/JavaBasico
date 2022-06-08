package estructurascondicionalestres;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Codifica el siguiente programa:
            • Pide al usuario que introduzca 3 números (en la misma línea)
            • Muestra los números ordenados ascendentemente (de menor a mayor)
            • Muestra los números ordenados descendentemente (de mayor a menor)
        */
        
        System.out.print("Porfavor, introduce los tres numero a ordenar: ");
        int uno = s.nextInt();
        int dos = s.nextInt();
        int tres = s.nextInt();

        int variable;

        if (uno - dos > 0) {
            variable = uno;
            uno = dos;
            dos = variable;
        }
        if (uno - tres > 0) {
            variable = uno;
            uno = tres;
            tres = variable;
        }
        if (dos - tres > 0) {
            variable = dos;
            dos = tres;
            tres = variable;
        }
        System.out.println("En orden acendente quedaria de la siguiente manera: \t" + uno + " " + dos + " " + tres);
        System.out.println("En orden descendente quedaria de la siguiente manera: \t" + tres + " " + dos + " " + uno);
    }
}
