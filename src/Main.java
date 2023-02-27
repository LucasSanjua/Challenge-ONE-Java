import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        

            Divisas Dolar = new Dolar();
            Divisas Euro = new Euros();
            Divisas GBP = new GBP();
            Divisas JYP = new JPY();
            Divisas KRW = new KRW();

             
             String cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de eso ARG a  "+Dolar.getNombre()+"");
                
                ConversionDivisa conversion = new ConversionDivisa(cantidad);
                    try {
                        /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                        JOptionPane.showMessageDialog(null,"Tiene $"+conversion.ConversionARGaDivisa(Dolar)+" Dolares ");
                    } catch (CantidadInvalidaException e) {
                        JOptionPane.showMessageDialog(null,e);
                        JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                    }

                    cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de "+Dolar.getNombre()+" a   ");
                    try {
                        /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                        JOptionPane.showMessageDialog(null,"Tiene $"+conversion.ConversionDisivisaaARG(Dolar)+" peso ARG ");
                    } catch (CantidadInvalidaException e) {
                        JOptionPane.showMessageDialog(null,e);
                        JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                    }
                    
    }
}

