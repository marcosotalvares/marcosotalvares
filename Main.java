import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Consecionaria consecionaria = new Consecionaria();

        Auto auto1 = new Auto("ABC123", "PEUGEUOT", 2010,  ConsumoCombustible.MEDIO, TipoCambio.MANUAL, "");
        Auto auto2 = new Auto("BCD234", "TOYOTA", 2022, ConsumoCombustible.ALTO, TipoCambio.AUTOMATICO, "");
        Moto moto1 = new Moto("AB12", "HONDA", 2020, ConsumoCombustible.BAJO, 110, true);
        Moto moto2 = new Moto("CD34", "KAWASAKI", 2019, ConsumoCombustible.BAJO, 220, true);

        consecionaria.agregar(auto1);
        consecionaria.agregar(auto2);
        consecionaria.agregar(moto1);
        consecionaria.agregar(moto2);

        System.out.println("El vehiculo que se busca es: " + consecionaria.buscarPorPatente("AB12").toString());
        ArrayList<Vehiculo> viejaLista = consecionaria.devolverListado();
        System.out.println("El vehiculo eliminado es: " + consecionaria.eliminarPorPatente("ABC123").toString());
        System.out.println("La cantidad de vehiculos que hay en la nueva lista es: " + consecionaria.contar());
        System.out.println("La cantidad de vehiculos que hay en la vieja lista es: " + viejaLista.size());

        Yate yate = new Yate("Cositas de los yates");
        consecionaria.agregarYate(yate);
//        Calculable [] calculables = {moto1, moto2, auto2, auto1, yate};
        System.out.println("El resultado total del inventario es de: " + consecionaria.calcularTotalInventario());
        consecionaria.mostrarV();
        consecionaria.mostrarY();
//        System.out.println(auto1.calcularPrecio());
//        System.out.println(auto2.calcularPrecio());
//        System.out.println(moto1.calcularPrecio());
//        System.out.println(moto2.calcularPrecio());
//        System.out.println(yate.calcularPrecio());

    }
}