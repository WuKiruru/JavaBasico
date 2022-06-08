package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Adapta el código del ejercicio 1 de la práctica 2 para que en lugar de 
        asignar a las variables enteras x e y los valores 144 y 999 respectivamente, 
        los solicite por pantalla al usuario, que podrá introducir cualquier valor. 
        A continuación, se mostrará por pantalla los valores leídos, la suma, la resta, 
        la división y la multiplicación.*/
        
        System.out.print("Introduce la variable x con la que quiere operar: ");
        int x = s.nextInt();
        System.out.print("Introduce la variable y con la que quiere operar: ");
        int y = s.nextInt();

        int suma = x + y;
        int resta = x - y;
        double division = x / y;
        double multiplicacion = x * y;

        System.out.println("El resultado de la suma es:\t\t" + (suma));
        System.out.println("El resultado de la resta es:\t\t" + (resta));
        System.out.println("El resultado de la división es:\t\t" + (division));
        System.out.println("El resultado de la multiplicación es:\t" + (multiplicacion));
    }
}
