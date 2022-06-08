package estructurascondicionalesdos;

import java.util.Scanner;

public class EsCapicua3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa en que se pida un número de 3 cifras y a continuación 
        se muestre por pantalla un mensaje indicando si el número es capicúa o no. 
        Valida que el número introducido efectivamente tiene 3 cifras. En caso 
        contrario muestra un mensaje de error.(Un número capicúa es aquel que se lee 
        igual de izquierda a derecha, que de derecha a izquierda). */
        
        System.out.print("Porfavor introduce un número de tres cifras para ver si es capicua: ");
        int numero = s.nextInt();

        while (numero <= 0);
        int falta = numero;
        int numeroInvertido = 0;
        int resto = 0;
        int numeroFinal;

        while (falta != 0) {
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }

        if ((numero <= 999) && (numero >= 100)) {
            if (numeroInvertido == numero) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        } else {
            System.out.println("Error, el número no es de tres cifras.");
        }
    }
}
