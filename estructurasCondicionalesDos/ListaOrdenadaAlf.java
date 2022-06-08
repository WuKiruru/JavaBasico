package estructurascondicionalesdos;

import java.util.Scanner;

public class ListaOrdenadaAlf {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Realiza un programa que pida el nombre completo de 3 alumnos y los 
        muestre ordenados alfabéticamente. 
        El formato de los nombres introducidos deberá ser: apellido1 apellido2, 
        nombre. Para comparar usa el método compareTo de la clase String. */
        
        System.out.println("¡Escribeme los nombres de los alumnos y yo te los ordenare!");

        System.out.println("Escribe el nombre del primer alumno (Formato apellido1_apellido2_nombre)");
        String alumnoUno = s.next();
        System.out.println("Escribe el nombre del segundo alumno (Formato apellido1_apellido2_nombre)");
        String alumnoDos = s.next();
        System.out.println("Escribe el nombre del tercer alumno (Formato apellido1_apellido2_nombre)");
        String alumnoTres = s.next();

        String nombre1 = alumnoUno;
        String nombre2 = alumnoDos;
        String nombre3 = alumnoTres;

        int resultadoUno = nombre1.compareTo(nombre2);
        int resultadoDos = nombre1.compareTo(nombre3);
        int resultadoTres = nombre2.compareTo(nombre3);

        if ((resultadoUno < 0) && (resultadoDos < 0) && (resultadoTres < 0)) {
            System.out.println(nombre1);
            System.out.println(nombre2);
            System.out.println(nombre3);
        } else if ((resultadoUno < 0) && (resultadoDos < 0) && (resultadoTres > 0)) {
            System.out.println(nombre1);
            System.out.println(nombre3);
            System.out.println(nombre2);
        } else if ((resultadoUno < 0) && (resultadoDos > 0) && (resultadoTres < 0)) {
            System.out.println(nombre3);
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else if ((resultadoUno > 0) && (resultadoDos < 0) && (resultadoTres < 0)) {
            System.out.println(nombre2);
            System.out.println(nombre1);
            System.out.println(nombre3);
        } else if ((resultadoUno > 0) && (resultadoDos > 0) && (resultadoTres > 0)) {
            System.out.println(nombre3);
            System.out.println(nombre2);
            System.out.println(nombre1);
        } else if ((resultadoUno > 0) && (resultadoDos > 0) && (resultadoTres < 0)) {
            System.out.println(nombre2);
            System.out.println(nombre3);
            System.out.println(nombre1);
        } else if ((resultadoUno < 0) && (resultadoDos > 0) && (resultadoTres > 0)) {
            System.out.println(nombre3);
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else {
            System.out.println("Error de sintaxis");
        }
    }
}
