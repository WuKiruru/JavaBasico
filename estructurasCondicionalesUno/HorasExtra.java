package estructurascondicionalesuno;

import java.util.Scanner;

public class HorasExtra {
    
    //Constantes
    static final int HORAS_FIJAS = 12;
    static final int HORAS_EXTRAS = 16;
    static final int HORAS_MIN = 40;
    static final int HORAS_MAX = 480;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Vamos a ampliar uno de los ejercicios de la relación anterior para 
        considerar las horas extras. Escribe un programa que calcule el salario 
        semanal de un trabajador teniendo en cuenta que las horas ordinarias 
        (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de 
        la hora 41, se pagan a 16 euros la hora. */
        System.out.print("Por favor, introduce el número de horas trabajadas durante la semana: ");
        int horas = s.nextInt();

        if (horas > 0) {
            if (horas <= HORAS_MIN) {
                int total = horas * HORAS_FIJAS;
                System.out.println("El sueldo semanal que te corresponde es de " + (total) + " euros.");
            } else if (horas > HORAS_MIN) {
                int total = (horas - HORAS_MIN) * HORAS_EXTRAS + HORAS_MAX;
                System.out.println("El sueldo semanal que te corresponde es de " + (total) + " euros.");
            }
        } else {
            System.out.println("Error: el sueldo calculado es incorrecto.");
        }
    }
}
