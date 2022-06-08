package buclestres;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /* Escribe un programa que:
            • Solicite que se introduzca una palabra o frase por teclado.
            • A continuación pida un determinado carácter.
            • Finalmente deberá contar cuántas veces aparece ese carácter dentro del texto introducido.
           Para hacerlo deberás usar bucles y los métodos length y charAt de la clase String.
        */

        System.out.print("Porfavor, introduce una palabra o una frase: ");
        String frase = s.next();
        frase = frase.replaceAll(" ", "");

        System.out.print("Porfavor, introduce el carácter, vamos a contarlo dentro de tu frase: ");
        char usuario = s.next().charAt(0);

        int contadorLetras = 0;
        char letra;

        for (int i = 0; i < frase.length(); i++) {

            letra = frase.charAt(i);
            if (letra == usuario) {
                contadorLetras++;
            }
        }

        System.out.println("La letra " + usuario + " se repite " + contadorLetras + " veces.");
    }
}
