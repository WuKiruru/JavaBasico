package buclestres;

public class EjercicioCuatro {

    public static void main(String[] args) {

        /* Crea un programa que construya el siguiente cuadro donde:
            • La primera fila contendrá los valores del 1 al 10
            • La primera columna contendrá los valores del 1 al 10
            • El resto de las celdas tendrán el resultado de multiplicar el número de la fila a la 
            que pertenece por el número de la columna
        */
        
        for (int i = 1; i <= 10; i++) {
            for (int c = 1; c <= 10; c++) {
                System.out.printf("%4d", i * c);
            }

            System.out.println("\n");
        }
    }
}
