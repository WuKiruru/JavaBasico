package estructurascondicionalesdos;

import java.util.Scanner;

public class Cuestionario {
    
    //Constantes
    static final int BASE_CERO = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Recupera alguno de los cuestionarios que has hecho en clase y crea un 
        programa que plantee 5 preguntas al usuario (en el enunciado deberás incluir 
        las posibles respuestas). Finalmente se deberá mostrar por pantalla la nota 
        obtenida (cada respuesta acertada sumará 1 punto). */
        
        int puntos = 0;

        System.out.println("Vamos a hacer un examen, lo puntuaremos sobre 5, contesta las siguientes preguntas:");

        System.out.println("¿Cuáles de los siguientes tipos de archivo contienen típicamente código fuente?");
        System.out.println("[A] .class");
        System.out.println("[B] .exe");
        System.out.println("[C] .java");
        System.out.println("[D] .obj");
        System.out.print("Respuesta (Escribelo con el punto): ");
        String preguntaUno = s.next();

        if (preguntaUno.equals(".java")) {
            puntos++;
            System.out.println("Correcto! Tus puntos: " + (puntos));
        } else if ((preguntaUno.equals(".class")) || (preguntaUno.equals(".exe")) || (preguntaUno.equals(".obj"))) {
            System.out.println("Incorrecto! Tus puntos: " + (puntos));
        } else {
            System.out.println("Error, no te inventes respuestas...");
        }

        System.out.println("¿Cuáles de los siguientes tipos de archivo contienen típicamente código máquina?");
        System.out.println("[A] .class");
        System.out.println("[B] .cpp");
        System.out.println("[C] .java");
        System.out.println("[D] .obj");
        System.out.print("Respuesta (Escribelo con el punto): ");
        String preguntaDos = s.next();

        if (preguntaDos.equals(".obj")) {
            puntos++;
            System.out.println("Correcto! Tus puntos: " + (puntos));
        } else if ((preguntaDos.equals(".class")) || (preguntaDos.equals(".cpp")) || (preguntaDos.equals(".java"))) {
            System.out.println("Incorrecto! Tus puntos: " + (puntos));
        } else {
            System.out.println("Error, no te inventes respuestas...");
        }

        System.out.println("Equivale a la Capa de presentación de la arquitectura de Desarrollo en tres capas");
        System.out.println("[A] Main");
        System.out.println("[B] Compilador");
        System.out.println("[C] Vista");
        System.out.println("[D] Modelo");
        System.out.print("Respuesta (Escribelo con el punto): ");
        String preguntaTres = s.next();

        if (preguntaTres.equals("Vista")) {
            puntos++;
            System.out.println("Correcto! Tus puntos: " + (puntos));
        } else if ((preguntaTres.equals("Main")) || (preguntaTres.equals("Compilador")) || (preguntaTres.equals("Modelo"))) {
            System.out.println("Incorrecto! Tus puntos: " + (puntos));
        } else {
            System.out.println("Error, no te inventes respuestas...");
        }

        System.out.println("Los programas en lenguaje Java son multiplataforma porque una vez compilados generan");
        System.out.println("[A] Intrucciones");
        System.out.println("[B] Codigo");
        System.out.println("[C] Bytecode");
        System.out.println("[D] Normas");
        System.out.print("Respuesta: ");
        String preguntaCuatro = s.next();

        if (preguntaCuatro.equals("Bytecode")) {
            puntos++;
            System.out.println("Correcto! Tus puntos: " + (puntos));
        } else if ((preguntaCuatro.equals("Instrucciones")) || (preguntaCuatro.equals("Codigo")) || (preguntaCuatro.equals("Normas"))) {
            System.out.println("Incorrecto! Tus puntos: " + (puntos));
        } else {
            System.out.println("Error, no te inventes respuestas...");
        }

        System.out.println("A que capa corresponde la definición: ¿Comunica la aplicación con el usuario?");
        System.out.println("[A] Negocio");
        System.out.println("[B] Persistencia");
        System.out.println("[C] Interfaz de usuario");
        System.out.print("Respuesta: ");
        String preguntaCinco = s.next();

        if (preguntaCinco.equals("Interfaz de usuario")) {
            puntos++;
            System.out.println("Correcto! Tus puntos: " + (puntos));
        } else if ((preguntaCinco.equals("Negocio")) || (preguntaCinco.equals("Persistencia"))) {
            System.out.println("Incorrecto! Tus puntos: " + (puntos));
        } else {
            System.out.println("Error, no te inventes respuestas...");
        }

        System.out.println("Has sacado un total de " + (puntos) + " punto/s.");
    }
}
