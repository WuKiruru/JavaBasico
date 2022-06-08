package cuadrosdedialogo;

import javax.swing.JOptionPane;

public class AdivinarNumero {

    public static void main(String[] args) {
        
        /* Escribe el código de un sencillo juego en el que el usuario deberá pensar un número y el 
        ordenador tratará de adivinarlo. Para ello hay que indicar al usuario que piense un número 
        del 0 al 10 (showMessageDialog), a continuación el programa generará un número aleatorio 
        entre 0 – 10, usando la función Math.random, y luego lo mostrará por pantalla preguntando si 
        se ha acertado o no (showConfirmDialog). */

        JOptionPane.showMessageDialog(null, "Piensa en un número del 0 al 10");

        int numero = (int) ((Math.random() * 10) + 1);

        JOptionPane.showConfirmDialog(null, "És el número " + numero + " ?");
    }
}
