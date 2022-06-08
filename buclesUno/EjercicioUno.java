package buclesuno;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Crea un programa que haga lo siguiente:
            • Solicitarás un número entero por pantalla
            • Mostrarás un menú con 3 opciones:
                [1] Usando for
                [2] Usando while
                [3] Usando do-while
            • En función de la opción escogida deberás resolver el ejerciciousando la estructura seleccionada
            • Se deben mostrar únicamente los múltiplos del número introducido por el usuario comprendidos entre el 0 y el 100
        */
        
        System.out.print("Introduce el número del que quieras saber los multiplos: ");
        int numero = s.nextInt();

        System.out.println("[1] Bucle for");
        System.out.println("[2] Bucle while");
        System.out.println("[3] Bucle do-while");
        System.out.print("Selecciona la forma a realizar las operaciones: ");
        int operacion = s.nextInt();

        if (operacion == 1) {
            for (int i = numero; i <= 100; i += numero) {
                System.out.println("Estos son los multiplos de " + (numero) + (": ") + (i));
            }
        } else if (operacion == 2) {
            int i = numero;
            while (i <= 100) {
                System.out.println("Estos son los multiplos de " + (numero) + (": ") + (i));
                i += numero;
            }
        } else if (operacion == 3) {
            int i = numero;
            do {
                System.out.println("Estos son los multiplos de " + (numero) + (": ") + (i));
                i += numero;
            } while (i <= 100);
        } else {
            System.out.println("Has introducido un número de operacion que no corresponde.");
        }
    }
}
