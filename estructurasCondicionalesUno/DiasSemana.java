package estructurascondicionalesuno;

import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa en que dado un número del 1 a 7 escriba el 
        correspondiente nombre del día de la semana. */
        System.out.print("Escribe el número correspondiente al día de la semana: ");
        int dia = s.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sabado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("No eres de este universo, eso no es un día de la semana");
                break;
        }
    }
}
