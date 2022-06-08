package estructurascondicionalestres;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* A partir del siguiente pseudocódigo implementa el código tal y como se indica. */
        
        System.out.println("Vamos a ver si escribes una consonante o una vocal.");
        System.out.print("Introduce una letra (char): ");

        String letra = s.next();
        String minuscula = letra.toLowerCase();

        if ((minuscula.equals("a")) || (minuscula.equals("e")) || (minuscula.equals("i")) || (minuscula.equals("o")) || (minuscula.equals("u"))) {
            System.out.println("¡Puedo confirmar que la letra es una vocal!");
        } else {
            System.out.println("Tu letra es una consonante de eso estoy seguro.");
        }
    }
}
