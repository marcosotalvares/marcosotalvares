import java.util.ArrayList;

public class Auto extends Vehiculo implements Calculable{
    private TipoCambio tipoDeCambio;
    private String prestacions;

    /// Constructor

    public Auto(String patente, String marca, double modelo, ConsumoCombustible consumoDeCombustible, TipoCambio tipoDeCambio, String prestacions) {
        super(patente, marca, modelo, consumoDeCombustible);
        this.tipoDeCambio = tipoDeCambio;
        this.prestacions = prestacions;
        setCantidadRuedas(4);
        calcularPrecio();
    }

    public Auto() {
        tipoDeCambio = TipoCambio.MANUAL;
        prestacions = "";
        setCantidadRuedas(4);
    }
    /// Getters & Setters

    public TipoCambio getTipoDeCambio() {
        return tipoDeCambio;
    }

    public String getPrestacions() {
        return prestacions;
    }


    /// toString

    @Override
    public String toString() {
        return "Auto [listaPrestaciones=" + prestacions + ", modoPasarCambios=" + tipoDeCambio
                + ", getPatente()=" + getPatente() + ", getMarca()=" + getMarca()
                + ", getCantRuedas()=" + getCantidadRuedas() + ", getConsumo()=" + getConsumoDeCombustible() + ", getPrecio()="
                + getPrecio() + "]";
    }


    /// Metodos

    @Override
    public double calcularPrecio() {
        setPrecio(15);
        return getPrecio();
    }
}
