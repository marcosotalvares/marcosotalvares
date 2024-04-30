public abstract class Vehiculo { // Italica al ser abstracta
    private String patente;
    private String marca;
    private double modelo;
    private static int cantidadRuedas; // Deberia ser estatico?, si es asi, tiene que estar subraiado
    private double precio;
    private ConsumoCombustible consumoDeCombustible;

    /// Constructor

    public Vehiculo(String patente, String marca, double modelo, ConsumoCombustible consumoDeCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumoDeCombustible = consumoDeCombustible;
    }

    public Vehiculo() {
        patente = "AA00";
        marca = "MARCA";
        setCantidadRuedas(0);
        precio = 0;
        consumoDeCombustible = ConsumoCombustible.BAJO;
    }

    /// Getters & Setters

    public static void setCantidadRuedas(int cantidadRuedas) {
        Vehiculo.cantidadRuedas = cantidadRuedas;
    }

    public String getPatente() {
        return patente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getModelo() {
        return modelo;
    }

    public static int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public ConsumoCombustible getConsumoDeCombustible() {
        return consumoDeCombustible;
    }

    /// toString



    /// Metodo abstracto ?

}
