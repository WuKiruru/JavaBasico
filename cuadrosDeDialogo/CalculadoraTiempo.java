package cuadrosdedialogo;

import javax.swing.JOptionPane;

public class CalculadoraTiempo {

    //constantes
    static final int DIASANO = 365;
    static final int MESESANO = 12;
    static final int HORASHORA = 24;
    static final int HORAMINUTOSEGUNDOS = 60;

    public static void main(String[] args) {
        
        /*
        Escribe un programa que calcule los años de vida de una persona, para ello:
        • Se solicitará:
            o El año actual 
            o El año de nacimiento 
        • Se mostrará en un cuadro de diálogo (showMessageDialog):
            o Los años transcurridos (año actual – año de nacimiento)
            o Los meses transcurridos (años * 12)
            o Los días transcurridos (años * 365)
            o Las horas transcurridas (días * 24)
            o Los minutos transcurridos (horas * 60)
            o Los segundos transcurridos (minutos * 60)
        */
        int actual = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año en el que estamos"));
        int nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año en el que naciste"));

        int anos = actual - nacimiento;
        int meses = anos * MESESANO;
        int dias = anos * DIASANO;
        int horas = dias * HORASHORA;
        int minutos = horas * HORAMINUTOSEGUNDOS;
        int segundos = minutos * HORAMINUTOSEGUNDOS;

        JOptionPane.showMessageDialog(null,
                "Han pasado " + (anos) + " años\n"
                + "Han pasado " + (meses) + " meses\n"
                + "Han pasado " + (dias) + " días\n"
                + "Han pasado " + (horas) + " horas\n"
                + "Han pasado " + (minutos) + " minutos\n"
                + "Han pasado " + (segundos) + " segundos");
    }
}
