public class ComprasDivisas{
    private double cantidad;
    
    public ComprasDivisas (String cantidad) {
        /* Convierto en valor ingresado por teclado a double */
        /* Verifico  que solamente ingresen numeros */

        try{
            this.cantidad= Double.parseDouble(cantidad);/* Convierto la divisa en un double */

        }catch(NumberFormatException exception){
            System.out.println("ERROR solamente ingresar valores numeros.");
        }
    }

    public double conversionArgDol(Divisas divisas)throws CantidadInvalidaException{
        /* Verifico  la que la cantidad sea mayor a 0  */

        if(this.cantidad <= 0){
            throw new CantidadInvalidaException("La cantidad no puede ser igual o menor a 0.");
        }
        double montoPagar = divisas.getPrecio() * this.cantidad;
        return montoPagar;
    }
}