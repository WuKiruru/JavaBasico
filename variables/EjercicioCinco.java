package variables;

public class EjercicioCinco {

    public static void main(String[] args) {
        
        /* Escribe un programa que calcule el total de una factura a partir de 
        la base imponible (precio sin IVA). La base imponible estará almacenada 
        en una variable.*/
        
        double bimponible = 100;
        double ivaresta = 0.21;
        double ivasuma = 1.21;

        System.out.println("Base imponible\t" + bimponible);
        System.out.println("IVA\t\t" + (bimponible * ivaresta));
        System.out.println("---------------------");
        System.out.println("Total\t\t" + (bimponible * ivasuma));
    }
}
