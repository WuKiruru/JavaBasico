package buclestres;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Implementa un juego en el que las reglas son las siguientes: 
            • Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar. 
            • Se muestra la tirada aleatoria de dos dados. 
            • Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó
            y termina la partida. Por ej. si apostó 1000 €, gana otros 1000 € y acaba con 2000 €.
            • Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. 
            • Si no se da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el 
            juego entra en una segunda etapa. En esta etapa, el jugador buscará volver a 
            obtener ese número en los dados. Si consigue repetir ese número, gana. Si sale un 
            7, pierde. Si sale otro número, tiene que seguir tirando
        */
        
        System.out.print("Introduce la cantidad de dinero que quiera apostar: ");
        int euros = s.nextInt();

        boolean juegoFinalizado = false;

        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);
        int suma = dado1 + dado2;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma: " + suma);

        switch (suma) {
            case 7:
            case 11:
                System.out.println("Has ganado " + euros + " € más!");
                System.out.println("Tienes " + euros * 2 + " € más!");
                break;
            case 2:
            case 3:
            case 12:
                System.out.println("BANCAROTA");
                break;
            default:
                System.out.print("Tiene que seguir tirando, debe conseguir el " + suma + " para poder optar a ganar.");
                System.out.println("Si obtienes un 7 pierdes");
                System.out.println("Pulse para tirar los dados.");
                s.nextLine();

                boolean partidaTerminada = false;

                do {
                    dado1 = (int) (Math.random() * 6 + 1);
                    dado2 = (int) (Math.random() * 6 + 1);

                    System.out.println("Dado 1: " + dado1);
                    System.out.println("Dado 2: " + dado2);
                    System.out.println("Suma: " + (dado1 + dado2));

                    if ((dado1 + dado2) == suma) {
                        System.out.println("Has ganado " + euros + " € más!");
                        System.out.println("Tienes " + euros * 2 + " € más!");
                        partidaTerminada = true;
                    } else if ((dado1 + dado2) == 7) {
                        System.out.println("BANCAROTA");
                        partidaTerminada = true;
                    } else {
                        System.out.println("Continua.");
                        System.out.println("Pulse para tirar los dados.");
                        s.nextLine();
                    }
                } while (!partidaTerminada);
        }
    }
}
