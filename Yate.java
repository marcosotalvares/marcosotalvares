public class Yate implements Calculable{
    private String cosasDeYate;
    private double precio;

    /// Constructor

    public Yate(String cosasDeYate) { /// VER ESTO, EN LOS CONSTRUCOTRES VA LA FUNCION CALCULAR
        this.cosasDeYate = cosasDeYate;
        calcularPrecio();
    }

    /// Getters & Setters

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "cosasDeYate='" + cosasDeYate + '\'' +
                ", precio=" + precio +
                '}';
    }
/// Metodos

    @Override
    public double calcularPrecio() {
        precio = 100;
        return precio;
    }
}
