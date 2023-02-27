import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String cantidad;

            Divisas dolar = new Divisas(195.85, "dolar");

                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir a "+dolar.getNombre());

                ComprasDivisas compra1 = new ComprasDivisas(cantidad);
                    try {
                        /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                        JOptionPane.showMessageDialog(null,"El precio es de: $"+compra1.conversionArgDol(dolar)+" pesos Arg");
                    } catch (CantidadInvalidaException e) {
                        JOptionPane.showMessageDialog(null,e);
                        JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                    }
    }
}

