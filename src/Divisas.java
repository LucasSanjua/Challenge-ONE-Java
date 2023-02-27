public class Divisas {
    private double precio ;
    private String nombre;


    /* Constructor por defecto por ahora  sin modificacion     */
    public Divisas(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
    /* Genero getters y setters de atributos */
    
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    

}
