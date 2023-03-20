import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        

            Divisas Dolar = new Dolar();
            Divisas Euro = new Euros();
            Divisas GBP = new GBP();
            Divisas JYP = new JPY();
            Divisas KRW = new KRW();
            int opcion = 0;
            String cantidad;
            Temperatura temperatura = new Temperatura();
            do{

                String operacion =  (JOptionPane.showInputDialog(null,"Seleccione la operacion que desea realizar","Operacion",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Seleccionar","Conversion de monedas","Conversor de temperatura"},"Selecciona")).toString();

                switch(operacion){
                    case "Conversion de monedas":
                        String conversion =  (JOptionPane.showInputDialog(null,"Seleccione la conversion que desea realizar","Operacion",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Seleccionar","Convertir de Peso Argentino a Dolar","Convertir de Peso Argentino a Euro","Convertir de Peso Argentino a Libras","Convertir de Peso Argentino a Yen","Convertir de Peso Argentino a Won Coreano","Convertir de Dolar a Peso Argentino","Convertir de Euro a Peso Argentino","Convertir de Libras a Peso Argentino","Convertir de Yen a Peso Argentino","Convertir de Won Coreano a Peso Argentino"},"Selecciona")).toString();
                
                        switch (conversion){

                            case "Convertir de Peso Argentino a Dolar":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+Dolar.getNombre()+"");
                                Dolar.IngresarCantidad(cantidad);
                                try {
                                /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                JOptionPane.showMessageDialog(null,"Tiene $"+Dolar.ConversionARGaDivisa(Dolar)+" Dolares ");
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                                }
                            break;

                            case "Convertir de Peso Argentino a Euro":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+Euro.getNombre()+"");
                                Euro.IngresarCantidad(cantidad);
                                try {
                                /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+Euro.ConversionARGaDivisa(Euro)+" Dolares ");
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                                }
                            break;

                            case "Convertir de Peso Argentino a Libras":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+GBP.getNombre()+"");
                                GBP.IngresarCantidad(cantidad);
                                try {
                                /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+GBP.ConversionARGaDivisa(GBP)+" Dolares ");
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");                            
                                }
                            break;

                            case "Convertir de Peso Argentino a Yen":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+JYP.getNombre()+"");
                                JYP.IngresarCantidad(cantidad);
                                try {
                                /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+JYP.ConversionARGaDivisa(JYP)+" Dolares ");                            
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                                }
                            break;

                            case "Convertir de Peso Argentino a Won Coreano":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+KRW.getNombre()+"");
                                KRW.IngresarCantidad(cantidad);
                                try {
                                /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+KRW.ConversionARGaDivisa(KRW)+" Dolares ");                            
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                                }   
                            break;

                                            /* Convierto de la divisa seleccionada a Peso Argentino */

                            case "Convertir de Dolar a Peso Argentino":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de "+Dolar.getNombre()+" a   ");
                                Dolar.IngresarCantidad(cantidad);
                                try {
                                    /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+Dolar.ConversionDisivisaaARG(Dolar)+" peso ARG ");
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                                }
                            break;

                            case "Convertir de Euro a Peso Argentino":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+Euro.getNombre()+"");
                                Euro.IngresarCantidad(cantidad);
                                try {
                                    /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+Euro.ConversionDisivisaaARG(Euro)+" Dolares ");
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                                }
                            break;

                            case "Convertir de Libras a Peso Argentino":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+GBP.getNombre()+"");
                                GBP.IngresarCantidad(cantidad);
                                try {
                                    /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+GBP.ConversionDisivisaaARG(GBP)+" Dolares ");
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");                            
                                }
                            break;

                            case "Convertir de Yen a Peso Argentino":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+JYP.getNombre()+"");
                                JYP.IngresarCantidad(cantidad);
                                try {
                                /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+JYP.ConversionDisivisaaARG(JYP)+" Dolares ");                            
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                                }
                            break;

                            case "Convertir de Won Coreano a Peso Argentino":
                                cantidad=JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir de peso ARG a  "+KRW.getNombre()+"");
                                KRW.IngresarCantidad(cantidad);
                                try {
                                /* Capturo error para que no ingresen valore Alfabeticos o menores a 0  */
                                    JOptionPane.showMessageDialog(null,"Tiene $"+KRW.ConversionDisivisaaARG(KRW)+" Dolares ");                            
                                } catch (CantidadInvalidaException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                    JOptionPane.showMessageDialog(null,"No se pudo realizar la conversion.");
                                }
                            break;

                        
                        }

                    case "Conversor de temperatura":
                        /* Agregar  la opcion para  seleccionar las temperaturas a convertir */
                }

                
                String [] respuesta = { "Si", "No"};
                opcion = JOptionPane.showOptionDialog(null, "Elija una opcion", "Desea realizar otra convercion", 0, JOptionPane.QUESTION_MESSAGE, null, respuesta, respuesta);        
            }while (opcion == 0);       
            
            JOptionPane.showMessageDialog(null, "Programa finalizado", "Mensaje", opcion);
            
        }

}

