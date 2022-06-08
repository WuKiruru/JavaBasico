package buclesdos;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Realiza un programa que calcule las horas transcurridas entre dos horas de dos días de la 
        semana. No se tendrán en cuenta los minutos ni los segundos.
        El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “
        lunes” a “domingo”). 
        Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día
        es posterior al primero.
        */
        
        int primerDia = 0;
        int segundoDia = 0;

        int horaUno;
        int horaDos;
        String diadelaSemanaUno;
        String diadelaSemanaDos;

        boolean datosCorrectos = true;

        do {
            System.out.print("Por favor, introduzca el primer día de la semana: ");
            diadelaSemanaUno = s.next();

            System.out.print("Por favor, introduzca la hora del primer día: ");
            horaUno = s.nextInt();

            System.out.println("Día: " + diadelaSemanaUno);

            System.out.println("Hora: " + horaUno);

            switch (diadelaSemanaUno) {
                case "lunes", "1" -> {
                    primerDia = 1;
                    diadelaSemanaUno = "lunes";
                }
                case "martes", "2" -> {
                    primerDia = 2;
                    diadelaSemanaUno = "martes";
                }
                case "miércoles", "3" -> {
                    primerDia = 3;
                    diadelaSemanaUno = "miercoles";
                }
                case "jueves", "4" -> {
                    primerDia = 4;
                    diadelaSemanaUno = "jueves";
                }
                case "viernes", "5" -> {
                    primerDia = 5;
                    diadelaSemanaUno = "viernes";
                }
                case "sábado", "6" -> {
                    primerDia = 6;
                    diadelaSemanaUno = "sábado";
                }
                case "domingo", "7" -> {
                    primerDia = 7;
                    diadelaSemanaUno = "domingo";
                }
                default ->
                    primerDia = 0;
            }

            System.out.print("Por favor, introduzca el segundo día de la semana: ");
            diadelaSemanaDos = s.next();

            System.out.print("Por favor, introduzca la hora del segundo día: ");
            horaDos = s.nextInt();

            System.out.println("Día: " + diadelaSemanaDos);

            System.out.println("Hora: " + horaDos);

            switch (diadelaSemanaDos) {
                case "lunes", "1" -> {
                    segundoDia = 1;
                    diadelaSemanaDos = "lunes";
                }
                case "martes", "2" -> {
                    segundoDia = 2;
                    diadelaSemanaDos = "martes";
                }
                case "miércoles", "3" -> {
                    segundoDia = 3;
                    diadelaSemanaDos = "miércoles";
                }
                case "jueves", "4" -> {
                    segundoDia = 4;
                    diadelaSemanaDos = "jueves";
                }
                case "viernes", "5" -> {
                    segundoDia = 5;
                    diadelaSemanaDos = "viernes";
                }
                case "sábado", "6" -> {
                    segundoDia = 6;
                    diadelaSemanaDos = "sábado";
                }
                case "domingo", "7" -> {
                    segundoDia = 7;
                    diadelaSemanaDos = "domingo";
                }
                default ->
                    segundoDia = 0;
            }

            datosCorrectos = true;

            if (segundoDia <= primerDia) {
                System.out.println("El segundo día debe ser posterior al primero.");
                datosCorrectos = false;
            }

            if ((primerDia == 0) || (segundoDia == 0)) {
                System.out.println("No se ha introducido correctamente el día de la semana.");
                System.out.println("Los días válidos son: lunes, martes, miércoles, jueves y viernes.");
                datosCorrectos = false;
            }

            if ((horaUno < 0) || (horaUno > 23) || (horaUno < 0) || (horaUno > 23)) {
                System.out.println("No se ha introducido correctamente la hora del día.");
                System.out.println("Las horas válidas están entre 0 y 23.");
                datosCorrectos = false;
            }

        } while (!datosCorrectos);

        System.out.print("La diferencia entre las " + horaUno + ":00h del " + diadelaSemanaUno + " y las " + horaDos + ":00h del " + diadelaSemanaDos + " son ");
        System.out.println((((segundoDia * 24) + horaDos) - ((primerDia * 24) + horaUno)) + " horas.");

    }
}
