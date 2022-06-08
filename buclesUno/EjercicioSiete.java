package buclesuno;

import java.util.Scanner;

public class EjercicioSiete {
    
    /* Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la 
    potencia.NO USAR java.lang.Math .pow ()

    REGLAS:
        • Si un número tiene exponente CERO, el resultado es UNO.(Ej.𝑎0=1). 
        • Si un número tiene exponente POSITIVO, el resultado es la base multiplicada por si 
        misma tantasvecescomo indique el exponente. (Ej.𝑎2=𝑎∗𝑎,𝑎3=𝑎∗𝑎∗𝑎,...)
        • Si el número estáelevado a un exponente NEGATIVO, la expresión de este tipo se
        convierte en una FRACCIÓN, donde en el NUMERADOR se escribe un  UNO y en el
        denominador se escribe la misma potencia, pero con exponente POSITIVO.
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Vamos a calcular un número elevado.");

        System.out.print("Introduce un número BASE: ");
        int base = s.nextInt();

        System.out.print("Introduce un número EXPONENTE: ");
        int exponente = s.nextInt();

        double elevado = 1;

        if (exponente == 0) {
            elevado = 1;
        } else if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                elevado *= base;
            }
        } else if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                elevado *= base;
            }
            elevado = 1 / (elevado *= base);
        }

        System.out.println("El resultado de " + (base) + " elevado a " + (exponente) + " es " + (elevado));

    }
}
