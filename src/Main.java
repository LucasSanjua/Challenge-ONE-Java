import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String cantidad;
        try (Scanner entradaEscanner = new Scanner(System.in)) {
            Divisas dolar = new Divisas(195.85, "dolar");
            
            /* No va la cantidad  en el constructor es algo redundante */
            System.out.println("Cuanto es el monto que desea comprar de " + dolar.getNombre()+ ".");
            /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
            
                cantidad = entradaEscanner.nextLine();
                ComprasDivisas compra1;
                
                    compra1 = new ComprasDivisas(cantidad);
                    try {
                        System.out.println( compra1.conversionArgDol(dolar));
                        System.out.println("Es el monto a pagar");
                    } catch (CantidadInvalidaException e) {
                    System.out.println(e);
                    System.out.println("No se pudo realizar la conversion.");
                    }
        }
    }
}

