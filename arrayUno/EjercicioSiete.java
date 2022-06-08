package arrayuno;

public class EjercicioSiete {

    public static void main(String[] args) {

        /* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los 
        almacene en un array. El programa debe ser capaz de pasar todos los números pares a las 
        primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas 
        restantes. Utiliza arrays auxiliares si es necesario. */
        
        int[] n = new int[20];
        int i;
        int j;
        int k;
        int aux;

        System.out.println("Array original");
        for (i = 0; i < 20; i++) {
            n[i] = (int) (Math.random() * 101);
            System.out.print(n[i] + " ");
        }

        for (i = 0; i < 20; i++) {
            j = i;

            while ((n[j++] % 2 != 0) && (j < 20));
            if (j < 20) {
                for (k = j - 1; k > i; k--) {
                    aux = n[k];
                    n[k] = n[k - 1];
                    n[k - 1] = aux;
                }
            }
        }

        System.out.println();
        System.out.println("Array final: ");
        for (i = 0; i < 20; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}
