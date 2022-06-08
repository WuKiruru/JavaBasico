package estructurascondicionalesuno;

import java.util.Scanner;

public class Horoscopo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento. */
        
        System.out.println("¿Deseas saber tu horoscopo?");

        System.out.println("Selecciona en que rango de fechas es tu cumpleaños");
        System.out.println("[1] Entre el 20 de Enero y el 18 de Febrero");
        System.out.println("[2] Entre el 19 de Febrero y el 20 de Marzo");
        System.out.println("[3] Entre el 21 de Marzo y el 20 de Abril");
        System.out.println("[4] Entre el 21 de Abril y el 20 de Mayo");
        System.out.println("[5] Entre el 21 de Mayo y el 20 de Junio");
        System.out.println("[6] Entre el 21 de Junio y el 20 de Julio");
        System.out.println("[7] Entre el 21 de Julio y el 21 de Agosto");
        System.out.println("[8] Entre el 22 de Agosto y el 22 de Septiembre");
        System.out.println("[9] Entre el 23 de Septiembre y el 22 de Octubre");
        System.out.println("[10] Entre el 23 de Octubre y el 22 de Noviembre");
        System.out.println("[11] Entre el 23 de Noviembre y el 20 de Diciembre");
        System.out.println("[12] Entre el 21 de Diciembre y el 19 de Enero");
        System.out.print("Selecciona la opción indicando el número [1-12]: ");
        int opcion = s.nextInt();
        int resultado = 0;
        switch (opcion) {
            case 1:
                System.out.println("Has escogido la opción [1]...");
                resultado = 1;
                System.out.println("Eres simbolo ACUARIO");
                break;
            case 2:
                System.out.println("Has escogido la opción [1]...");
                resultado = 2;
                System.out.println("Eres simbolo PISCIS");
                break;
            case 3:
                System.out.println("Has escogido la opción [1]...");
                resultado = 3;
                System.out.println("Eres simbolo ARIES");
                break;
            case 4:
                System.out.println("Has escogido la opción [1]...");
                resultado = 4;
                System.out.println("Eres simbolo TAURO");
                break;
            case 5:
                System.out.println("Has escogido la opción [1]...");
                resultado = 5;
                System.out.println("Eres simbolo GÉMINIS");
                break;
            case 6:
                System.out.println("Has escogido la opción [1]...");
                resultado = 6;
                System.out.println("Eres simbolo CÁNCER");
                break;
            case 7:
                System.out.println("Has escogido la opción [1]...");
                resultado = 7;
                System.out.println("Eres simbolo LEO");
                break;
            case 8:
                System.out.println("Has escogido la opción [1]...");
                resultado = 8;
                System.out.println("Eres simbolo VIRGO");
                break;
            case 9:
                System.out.println("Has escogido la opción [1]...");
                resultado = 9;
                System.out.println("Eres simbolo LIBRA");
                break;
            case 10:
                System.out.println("Has escogido la opción [1]...");
                resultado = 10;
                System.out.println("Eres simbolo ESCORPIO");
                break;
            case 11:
                System.out.println("Has escogido la opción [1]...");
                resultado = 11;
                System.out.println("Eres simbolo SAGITARIO");
                break;
            case 12:
                System.out.println("Has escogido la opción [1]...");
                resultado = 12;
                System.out.println("Eres simbolo CAPRICORNIO");
                break;
            default:
                System.out.println("Opción no prevista.");
        }
    }
}
