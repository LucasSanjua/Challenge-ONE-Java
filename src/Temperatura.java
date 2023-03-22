import javax.swing.JOptionPane;

public class Temperatura {
    private double medicion;

    public Temperatura (){} 

    public void  MedirTemperatura (String medicion){
        try{
            this.medicion= Double.parseDouble(medicion);/* Convierto la temperatura en un double */

        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null,"ERROR solamente ingresar valores numeros.");
        }
        

    }

    public void FahrenheitaCelsius(){
        
        double celsius =  (this.medicion - 32) * 5/9 ;
        JOptionPane.showMessageDialog(null,"El la temperatura en Celsius  es de "+celsius);
    }   
    
    public void CelsiusaFahrenheit(){
        double fahrenheit =  (this.medicion * 9/5) + 32;
        JOptionPane.showMessageDialog(null,"El la temperatura en Fahrenheit  es de "+fahrenheit);
    }   

    public void CelsiusaKelvin(){
        double kelvin =  (this.medicion + 273.15);
        JOptionPane.showMessageDialog(null,"El la temperatura en Kelvin  es de "+kelvin);
    }   
    public void KelvinaCelsius(){
        double celsius =  (this.medicion - 273.15);
        JOptionPane.showMessageDialog(null,"El la temperatura en Celsius  es de "+celsius);
    }   

    public void KelvinaFahrenheit(){
        double fahrenheit =  (this.medicion - 273.15)* 9/5 + 32;
        JOptionPane.showMessageDialog(null,"El la temperatura en Celsius  es de "+fahrenheit);
    }   

    public void FahrenheitaKelvin(){
        double kelvin =  (this.medicion - 32)* 5/9 + 273.15;
        JOptionPane.showMessageDialog(null,"El la temperatura en Celsius  es de "+kelvin);
    }   
}
