package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Adapta el ejercicio 7 de la práctica 2 para que pida por pantalla 5 
        variables de tipo char. A continuación, crea otra variable como cadena 
        de caracteres y asígnale como valor la concatenación de las anteriores 5
        variables. Por último, muestra la cadena de caracteres por pantalla ¿Qué 
        problemas te encuentras? ¿cómo lo has solucionado? */
        System.out.print("Porfavor, introduce el primer valor char: ");
        char letrauno = (s.next()).charAt(0);
        System.out.print("Porfavor, introduce el segundo valor char: ");
        char letrados = (s.next()).charAt(0);
        System.out.print("Porfavor, introduce el tercer valor char: ");
        char letratres = (s.next()).charAt(0);
        System.out.print("Porfavor, introduce el cuarto valor char: ");
        char letracuatro = (s.next()).charAt(0);
        System.out.print("Porfavor, introduce el quinto valor char: ");
        char letracinco = (s.next()).charAt(0);

        String palabra = letrauno + "" + letrados + letratres + letracuatro + letracinco;

        System.out.println("La palabra completa de chars es: " + (palabra));
    }
}
