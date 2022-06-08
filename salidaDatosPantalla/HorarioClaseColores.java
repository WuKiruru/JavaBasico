package salidadatospantalla;

public class HorarioClaseColores {

    public static void main(String[] args) {
        
        /* Modifica el programa anterior añadiendo colores. Puedes mostrar cada 
        asignatura de un color diferente */
        System.out.println("\033[33mLunes\tMartes\tMierc.\tJueves\tViernes");
        System.out.println("=====\t=====\t=====\t=====\t=====");
        System.out.println("\033[32mPROG\tPROG\tPROG\tPROG\t\033[31mSIN");
        System.out.println("\033[32mPROG\tPROG\tPROG\tPROG\t\033[31mSIN");
        System.out.println("\033[36mED\t\033[31mSIN\tSIN\t\033[37mLM\t\033[35mBDATO");
        System.out.println("\033[33mFOL\t\033[31mSIN\tSIN\t\033[37mLM\t\033[35mBDATO");
        System.out.println("\033[33mFOL\t\033[35mBDATO\t\033[36mED\t\033[35mBDATO\t\033[36mED");
        System.out.println("\033[33mFOL\t\033[35mBDATO\t\033[36mED\t\033[35mBDATO\t\033[36mED");

    }
}
