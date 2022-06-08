package cuadrosdedialogo;

import javax.swing.JOptionPane;

public class Residuo {

    public static void main(String[] args) {
        
        /* 
        • Se solicite:
            o A través de un cuadro de diálogo (showInputDialog), el valor de un número1(entero). 
            o A través de un segundo cuadro de diálogo (showInputDialog), el valor de un número2 (entero). 
        • Se muestre:
            o A través de un cuadro de diálogo (showMessageDialog), el resto de x/y, o esa, 
            hay que realizar la operación % 
        */
        int datoUno = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la variable X:"));
        int datoDos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la variable Y:"));

        double resto = datoUno % datoDos;

        JOptionPane.showMessageDialog(null, "El resultado del resto es: " + (resto));
    }
}
