import javax.swing.JOptionPane;

public class ConversionDivisa{
    private double cantidad;
    
    public ConversionDivisa (String cantidad) {
        /* Convierto en valor ingresado por teclado a double */
        /* Verifico  que solamente ingresen numeros */

        try{
            this.cantidad= Double.parseDouble(cantidad);/* Convierto la divisa en un double */

        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null,"ERROR solamente ingresar valores numeros.");
        }
    }

    public double ConversionARGaDivisa(Divisas divisas)throws CantidadInvalidaException{
        /* Verifico  la que la cantidad sea mayor a 0  */

        if(this.cantidad <= 0){
            throw new CantidadInvalidaException("La cantidad no puede ser igual o menor a 0.");
        }
        double montoConvertido = this.cantidad/ divisas.getPrecio() ;
        return montoConvertido;
    }
    public double ConversionDisivisaaARG(Divisas divisas)throws CantidadInvalidaException{
        /* Verifico  la que la cantidad sea mayor a 0  */

        if(this.cantidad <= 0){
            throw new CantidadInvalidaException("La cantidad no puede ser igual o menor a 0.");
        }
        double montoConvertido = divisas.getPrecio()*this.cantidad;
        return montoConvertido;
    }
}