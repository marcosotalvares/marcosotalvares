import java.util.ArrayList;

public class Consecionaria {
    private static ArrayList<Vehiculo> vehiculos;
    private static ArrayList<Yate> listaYates;
    /// Constructor

    public Consecionaria() {
        vehiculos = new ArrayList<>();
        listaYates = new ArrayList<>();
        /// Ver si esto esta bien
    }
    /// Metodos
    public void agregar(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public Vehiculo buscarPorPatente(String patente){
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getPatente().equals(patente)){
                return vehiculo;
            }
        }
        return null;
    }

    public int contar(){
        return vehiculos.size();
    }

    public ArrayList<Vehiculo> devolverListado(){
        return new ArrayList<>(vehiculos); /// VER ESTE METODO A QUE SE REFIERE
    }

    public Vehiculo eliminarPorPatente(String patente){
        for (Vehiculo vehiculo : vehiculos){
            if(vehiculo.getPatente().equals(patente)){
                vehiculos.remove(vehiculo);
                return vehiculo;
            }
        }
        return null;
    }

   public void agregarYate(Yate yate){
        listaYates.add(yate);
   }

    public void mostrarY(){
        for (Yate yate : listaYates){
            System.out.println(yate.toString());
        }
    }
   public void mostrarV(){
        for (Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.toString());
        }
   }
    public double calcularTotalInventario(){
        double total = 0;
        for (Vehiculo vehiculo : vehiculos){
            total += vehiculo.getPrecio();
        }
        for (Yate yate : listaYates){
            total += yate.calcularPrecio();
        }
        return total;
    }


}
