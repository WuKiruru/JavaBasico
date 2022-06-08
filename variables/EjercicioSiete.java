package variables;

public class EjercicioSiete {

    public static void main(String[] args) {
        
        /* Escribe un programa que declare 5 variables de tipo char. A continuación, crea
        otra variable como cadena de caracteres y asígnale como valor la concatenación
        de las anteriores 5 variables. Por último, muestra la cadena de caracteres
        por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado. */
        
        char letra1 = 's';
        char letra2 = 'p';
        char letra3 = 'a';
        char letra4 = 'i';
        char letra5 = 'n';
        String cadena = letra1 + "" + letra2 + letra3 + letra4 + letra5;

        System.out.println(cadena);
    }
}
