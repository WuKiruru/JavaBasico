package estructurascondicionalesdos;

import java.util.Scanner;

public class ToFinde {

    //constantes
    static final int SEGUNDOS = 60;
    static final int HORAS = 23;
    static final int HORASVIERNES = 14;
    static final int HORASMINUTOS = 1440;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Codifica un programa que calcule los minutos que faltan para el fin de 
        semana. Ten en cuenta que consideramos que el fin de semana empieza el viernes 
        a las 3 p.m. El usuario deberá introducir un día de la semana (de lunes a viernes), 
        una hora y unos minutos. */
        
        System.out.println("¡Vamos a calcular cuanto falta hasta el fin de semana!");
        System.out.print("Porfavor introduce el día de la semana: ");
        String dia = s.next();
        System.out.print("Ahora introduce que hora es (Solo la hora *00-24*/Viernes solo hasta las 14 de la tarde): ");
        int hora = s.nextInt();
        System.out.print("Ahora introduce los minutos (0-60): ");
        int minuto = s.nextInt();

        switch (dia) {
            case ("Lunes"):
                int lunes = ((((HORAS - hora) * SEGUNDOS + (SEGUNDOS - minuto)) + HORASMINUTOS * 3) + 15 * SEGUNDOS);
                System.out.println("Faltan " + (lunes) + " minutos para el din de semana.");
                break;
            case ("Martes"):
                int martes = ((((HORAS - hora) * SEGUNDOS + (SEGUNDOS - minuto)) + HORASMINUTOS * 2) + 15 * SEGUNDOS);
                System.out.println("Faltan " + (martes) + " minutos para el din de semana.");
                break;
            case ("Miercoles"):
                int miercoles = ((((HORAS - hora) * SEGUNDOS + (SEGUNDOS - minuto)) + HORASMINUTOS) + 15 * SEGUNDOS);
                System.out.println("Faltan " + (miercoles) + " minutos para el din de semana.");
                break;
            case ("Jueves"):
                int jueves = (((HORAS - hora) * SEGUNDOS + (SEGUNDOS - minuto)) + 15 * SEGUNDOS);
                System.out.println("Faltan " + (jueves) + " minutos para el din de semana.");
                break;
            case ("Viernes"):
                int viernes = ((HORASVIERNES - hora) * SEGUNDOS + (SEGUNDOS - minuto));
                System.out.println("Faltan " + (viernes) + " minutos para el fin de semana.");
                break;
            default:
                System.out.println("Tonto! Ya es fin de semana, disfruta!");
                break;
        }
    }
}