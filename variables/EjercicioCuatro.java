package variables;

public class EjercicioCuatro {

    public static void main(String[] args) {
        
        /* Realiza un conversor de euros a otra moneda. La cantidad en euros que 
        se quiere convertir deberá estar almacenada en una variable. */ 
        double euro = 100;
        double yuan = 7.5;
        double conversion = euro * yuan;

        System.out.println("CONVERSOR EUROS €/YUAN ¥");
        System.out.println("------------------------");
        System.out.println("100 € Euros son un total de " + (conversion) + "¥ Yuan");
    }
}
