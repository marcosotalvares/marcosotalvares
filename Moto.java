public class Moto extends Vehiculo implements Calculable{

    private  double cilindrada;
    private boolean disponeBaul;
    /// Constructor

    public Moto(String patente, String marca, double modelo, ConsumoCombustible consumoDeCombustible, double cilindrada, boolean disponeBaul) {
        super(patente, marca, modelo, consumoDeCombustible);
        this.cilindrada = cilindrada;
        this.disponeBaul = disponeBaul;
        setCantidadRuedas(2);
        calcularPrecio();
    }

    public Moto() {
        cilindrada = 110;
        disponeBaul = false;
        setCantidadRuedas(2);
    }


    /// Getters & Setters

    public double getCilindrada() {
        return cilindrada;
    }

    public boolean isDisponeBaul() {
        return disponeBaul;
    }


    /// toString

    @Override
    public String toString() {
        return "Moto [cilindrada=" + cilindrada + ", tieneBaul=" + disponeBaul + ", getPatente()=" + getPatente() + ", getMarca()=" + getMarca()
                + ", getCantRuedas()=" + getCantidadRuedas() + ", getConsumo()=" + getConsumoDeCombustible() + ", getPrecio()="
                + getPrecio() + "]";
    }


    /// Metodo

    @Override
    public double calcularPrecio() {
        setPrecio(7);
        return getPrecio();
    }
}

