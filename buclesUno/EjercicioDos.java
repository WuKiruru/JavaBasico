package buclesuno;

import java.util.Scanner;

public class EjercicioDos {
    
    //Constantes
    static final int RESTA = 10;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Crea un programa que haga lo siguiente:
            • Muestra el mensaje: “Introduce un número entero > 10: “
            • Muestra el mensaje: “Vamos a contar números de 10 en 10 entre N (el número introducido) y 0”
            • Muestra el siguiente menú:
                [1] Usando for
                [2] Usando while
                [3] Usando do-while
            • La estructura de repetición que uses deberá contar hacia atrás, es decir, se empezarán a mostrar 
            los números a partir de N (Ej.; Si N=100 → 100, 90, ... , 10, 0).
        */
        
        System.out.print("Introduce un número entero > 10: ");
        int numero = s.nextInt();

        System.out.println("Vamos a contar números de 10 en 10 entre N (el número introducido) y 0");

        System.out.println("[1] Bucle for");
        System.out.println("[2] Bucle while");
        System.out.println("[3] Bucle do-while");
        System.out.print("Selecciona la forma a realizar las operaciones: ");
        int operacion = s.nextInt();

        if (operacion == 1) {
            for (int i = numero; i >= 0; i -= RESTA) {
                System.out.println("Estos son los multiplos de " + (numero) + (": ") + (i));
            }
        } else if (operacion == 2) {
            int i = numero;
            while (i >= 0) {
                System.out.println("Estos son los multiplos de " + (numero) + (": ") + (i));
                i -= RESTA;
            }
        } else if (operacion == 3) {
            int i = numero;
            do {
                System.out.println("Estos son los multiplos de " + (numero) + (": ") + (i));
                i -= RESTA;
            } while (i >= 0);
        } else {
            System.out.println("Has introducido un número de operacion que no corresponde.");
        }
    }
}
