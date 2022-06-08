package variables;

public class EjercicioUno {

    public static void main(String[] args) {

        /* Escribe un programa en el que se declaren las variables enteras x e y. 
        Asígnales los valores 144 y 999 respectivamente. A continuación, muestra 
        por pantalla el valor de cada variable, la suma, la resta, la división y 
        la multiplicación. */
        
        int x = 10;
        int y = 2;
        int suma = x + y;
        int resta = x - y;
        double division = x / y;
        double multiplicacion = x * y;

        System.out.println("El resultado de la suma es:\t\t" + (suma));
        System.out.println("El resultado de la resta es:\t\t" + (resta));
        System.out.println("El resultado de la división es:\t\t" + (division));
        System.out.println("El resultado de la multiplicación es:\t" + (multiplicacion));
    }
}
