package estructurascondicionalestres;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* A partir del siguiente fichero, que contiene un diagrama de flujo, 
        implementa el código siguiendo las indicaciones. */
        
        boolean correcto = true;

        System.out.println("Bienvenido, vamos a jugar a PiedraPapelTijera.");

        //Definimos las respuestas de los jugadores:   
        System.out.print("Turno del jugador 01, introduzca piedra, papel o tijera: ");
        String opcionJugador1 = s.next();
        String opcion1 = opcionJugador1.toLowerCase();

        String jugada10k = null;

        if ((opcion1.equals("papel")) || (opcion1.equals("piedra")) || (opcion1.equals("tijera"))) {
            jugada10k = opcion1;
        } else {
            System.out.println("Te has equivocado, has escrito algo diferente a las opciones posibles, vuelve a intentarlo.");
            correcto = false;
        }

        System.out.print("Turno del jugador 02, introduzca piedra, papel o tijera: ");
        String opcionJugador2 = s.next();
        String opcion2 = opcionJugador2.toLowerCase();

        String jugada20k = null;

        if ((opcion2.equals("papel")) || (opcion2.equals("piedra")) || (opcion2.equals("tijera"))) {
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
                switch (opcion1) {
                    case "papel":
                        if ((!jugada20k.equals("piedra"))) {
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
