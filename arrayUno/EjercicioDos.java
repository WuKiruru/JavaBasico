package arrayuno;

public class EjercicioDos {

    public static void main(String[] args) {

        /* Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. 
        Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben 
        almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se deben 
        almacenar los cubos de los valores que hay en numero. A continuación, muestra el contenido 
        de los tres arrays dispuesto en tres columnas. */
        
        int[] numero;
        numero = new int[20];
        int[] cuadrado;
        cuadrado = new int[20];
        int[] cubo;
        cubo = new int[20];

        int i;

        for (i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
        }

        System.out.println("  x  |   x²  |   x³  ");
        System.out.println("---------------------");

        for (i = 0; i < 20; i++) {
            System.out.printf("%4d | %5d | %6d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
