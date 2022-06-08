package lecturadatosteclado;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Adapta el ejercicio 3 de la práctica 2 para asignar a las variables 
        nombre, direccion y telefono los valores que se introduzcan desde la 
        consola. Muestra los valores de esas variables por pantalla. */
        
        /* ¡¡Por defecto salta error en la compilación, introduce los datos 
        sin espacios!! */
        
        System.out.print("Porfavor introduce tu nombre completo: ");
        String nombre = s.next();
        System.out.print("Porfavor introduce tu dirección: ");
        String direccion = s.next();
        System.out.print("Porfavor introduce tu teléfono de contacto: ");
        int telefono = s.nextInt();

        System.out.println("Confirmada tu información:\t");
        System.out.println("Nombre: " + (nombre));
        System.out.println("Dirección: " + (direccion));
        System.out.println("Teléfono: " + (telefono));
    }
}
