package estructurascondicionalestres;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Evoluciona el ejercicio anterior de forma que podamos jugar a Piedra, 
        Papel, Tijera, Lagarto y Spock. */
        
        boolean correcto = true;

        System.out.println("Bienvenido, vamos a jugar a PiedraPapelTijeraSpockLagarto.");

        //Definimos las respuestas de los jugadores:   
        System.out.print("Turno del jugador 01, introduzca piedra, papel, tijera, spock o lagarto: ");
        String opcionJugador1 = s.next();
        String opcion1 = opcionJugador1.toLowerCase();

        String jugada10k = null;

        if ((opcion1.equals("papel")) || (opcion1.equals("piedra")) || (opcion1.equals("tijera")) || (opcion1.equals("spock")) || (opcion1.equals("lagarto"))) {
            jugada10k = opcion1;
        } else {
            System.out.println("Te has equivocado, has escrito algo diferente a las opciones posibles, vuelve a intentarlo.");
            correcto = false;
        }

        System.out.print("Turno del jugador 02, introduzca piedra, papel, tijera, spock o lagarto: ");
        String opcionJugador2 = s.next();
        String opcion2 = opcionJugador2.toLowerCase();

        String jugada20k = null;

        if ((opcion2.equals("papel")) || (opcion2.equals("piedra")) || (opcion2.equals("tijera")) || (opcion2.equals("spock")) || (opcion2.equals("lagarto"))) {
            jugada20k = opcion2;
        } else {
            System.out.println("Te has equivocado, has escrito algo diferente a las opciones posibles, vuelve a intentarlo.");
            correcto = false;
        }

        //Calculamos el resultado del juego:
        int numJugador = 1;

        if (correcto == true) {
            if (jugada10k.equals(jugada20k)) {
                System.out.println("¡Tenemos un empate entre el jugador 01 y el jugador 02!");
            } else {
                switch (jugada10k) {
                    case "papel":
                        if ((!jugada20k.equals("piedra")) || (!jugada20k.equals("spock"))) {
                            numJugador = 2;
                        }
                        break;
                    case "piedra":
                        if ((!jugada20k.equals("tijera"))) {
                            numJugador = 2;
                        }
                        break;
                    case "tijera":
                        if ((!jugada20k.equals("papel"))) {
                            numJugador = 2;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (!jugada10k.equals(jugada20k)) {
                System.out.println("Ha ganado el jugador " + numJugador);
            }
        } else {
            System.out.println("Hay jugadas inválidas");
        }
    }
}
