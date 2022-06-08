package cuadrosdedialogo;

import javax.swing.JOptionPane;

public class Promedio {

    //constantes
    static final double NUMERO = 3;

    public static void main(String[] args) {
        
        /* 
        Escribe un programa en el que:
        
        • Se solicite:
            o A través de un cuadro de diálogo (showInputDialog), el nombre 
            completo de un alumno. 
            o 3 notas (pueden tener decimales, ESCRÍBELOS CON PUNTO), a través de 3 
            cuadros de diálogo (showInputDialog).
        • Se muestre:
            o a través de un cuadro de diálogo (showMessageDialog), la nota promedio del 
            alumno. En el mensaje debe aparecer el nombre del alumno.
        */
        String Nombre = JOptionPane.showInputDialog("Escribe el nombre del alumno");
        double notaUno = Double.parseDouble(JOptionPane.showInputDialog("Escribe la primera nota del alumno"));
        double notaDos = Double.parseDouble(JOptionPane.showInputDialog("Escribe la segunda nota del alumno"));
        double notaTres = Double.parseDouble(JOptionPane.showInputDialog("Escribe la tercera nota del alumno"));

        double promedio = (notaUno + notaDos + notaTres) / NUMERO;

        JOptionPane.showMessageDialog(null, "La nota promedio de " + (Nombre) + "es " + (promedio));
    }

}
